/*     */ package com.adobe.sign.utils;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.api.WidgetsApi;
/*     */ import com.adobe.sign.model.widgets.UserWidget;
/*     */ import com.adobe.sign.model.widgets.UserWidgets;
/*     */ import com.adobe.sign.model.widgets.WidgetCreationInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetCreationRequest;
/*     */ import com.adobe.sign.model.widgets.WidgetCreationResponse;
/*     */ import com.adobe.sign.model.widgets.WidgetDocuments;
/*     */ import com.adobe.sign.model.widgets.WidgetFileInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetOriginalDocument;
/*     */ import com.adobe.sign.model.widgets.WidgetURLFileInfo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WidgetUtils
/*     */   extends ApiUtils
/*     */ {
/*  31 */   private static WidgetsApi widgetsApi = new WidgetsApi();
/*  32 */   private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();
/*     */   
/*  34 */   private static String documentId = null;
/*  35 */   private static String widgetId = null;
/*     */ 
/*     */   
/*     */   public static String getResourceId(String widgetName) throws ApiException {
/*  39 */     if (!isExistingWidget(widgetName)) {
/*  40 */       widgetId = createWidget(widgetName);
/*     */     }
/*  42 */     setDocumentId(widgetId);
/*  43 */     return widgetId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String createWidget(String name) throws ApiException {
/*  49 */     WidgetCreationRequest widgetCreationRequest = getWidgetCreationRequest(name);
/*     */     
/*  51 */     WidgetCreationResponse widgetCreationResponse = widgetsApi.createWidget(headers, 
/*  52 */         widgetCreationRequest);
/*  53 */     widgetId = widgetCreationResponse.getWidgetId();
/*     */     
/*  55 */     return widgetId;
/*     */   }
/*     */   
/*     */   public static WidgetCreationRequest getWidgetCreationRequest(String documentName) throws ApiException {
/*  59 */     String transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
/*  60 */     return getWidgetCreationRequest(TestData.NULL_PARAM, 
/*  61 */         TestData.NULL_PARAM, 
/*  62 */         transientDocumentId, 
/*  63 */         TestData.NULL_PARAM, 
/*  64 */         documentName, 
/*  65 */         WidgetCreationInfo.SignatureFlowEnum.SENDER_SIGNATURE_NOT_REQUIRED);
/*     */   }
/*     */   
/*     */   public static WidgetCreationRequest getWidgetCreationRequest(String documentName, WidgetFileInfo fileInfo) {
/*  69 */     return getWidgetCreationRequest(fileInfo.getLibraryDocumentId(), 
/*  70 */         fileInfo.getLibraryDocumentName(), 
/*  71 */         fileInfo.getTransientDocumentId(), 
/*  72 */         (fileInfo.getDocumentURL() != null) ? fileInfo.getDocumentURL().getUrl() : TestData.NULL_PARAM, 
/*  73 */         documentName, 
/*  74 */         WidgetCreationInfo.SignatureFlowEnum.SENDER_SIGNATURE_NOT_REQUIRED);
/*     */   }
/*     */ 
/*     */   
/*     */   public static WidgetCreationRequest getWidgetCreationRequest(String documentName, WidgetCreationInfo.SignatureFlowEnum signatureFlowEnum) throws ApiException {
/*  79 */     String transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
/*     */     
/*  81 */     return getWidgetCreationRequest(TestData.NULL_PARAM, 
/*  82 */         TestData.NULL_PARAM, 
/*  83 */         transientDocumentId, 
/*  84 */         TestData.NULL_PARAM, 
/*  85 */         documentName, 
/*  86 */         signatureFlowEnum);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static WidgetCreationRequest getWidgetCreationRequest(String fileInfoLibraryDocumentId, String fileInfoLibraryDocumentName, String fileInfoTransientDocumentId, String fileInfoDocumentUrl, String documentName, WidgetCreationInfo.SignatureFlowEnum signatureFlowEnum) {
/*  96 */     WidgetCreationRequest widgetCreationRequest = new WidgetCreationRequest();
/*  97 */     WidgetCreationInfo widgetCreationInfo = new WidgetCreationInfo();
/*     */     
/*  99 */     WidgetFileInfo fileInfo = new WidgetFileInfo();
/*     */     
/* 101 */     fileInfo.setLibraryDocumentId(fileInfoLibraryDocumentId);
/* 102 */     fileInfo.setLibraryDocumentName(fileInfoLibraryDocumentName);
/* 103 */     fileInfo.setTransientDocumentId(fileInfoTransientDocumentId);
/*     */     
/* 105 */     if (fileInfoDocumentUrl != null) {
/* 106 */       WidgetURLFileInfo url = new WidgetURLFileInfo();
/* 107 */       url.setUrl(fileInfoDocumentUrl);
/* 108 */       fileInfo.setDocumentURL(url);
/*     */     } 
/*     */     
/* 111 */     ArrayList<WidgetFileInfo> fileInfoList = new ArrayList<>();
/* 112 */     fileInfoList.add(fileInfo);
/*     */     
/* 114 */     widgetCreationInfo.setName(documentName);
/* 115 */     widgetCreationInfo.setFileInfos(fileInfoList);
/* 116 */     widgetCreationInfo.setSignatureFlow(signatureFlowEnum);
/*     */     
/* 118 */     widgetCreationRequest.setWidgetCreationInfo(widgetCreationInfo);
/* 119 */     return widgetCreationRequest;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isExistingWidget(String staticWidgetName) throws ApiException {
/* 124 */     UserWidgets userWidgets = widgetsApi.getWidgets(headers);
/*     */     
/* 126 */     for (UserWidget widget : userWidgets.getUserWidgetList()) {
/* 127 */       if (widget.getName().equals(staticWidgetName) && widget.getStatus().equals(UserWidget.StatusEnum.ENABLED)) {
/* 128 */         widgetId = widget.getWidgetId();
/* 129 */         return true;
/*     */       } 
/*     */     } 
/* 132 */     return false;
/*     */   }
/*     */   
/*     */   private static void setDocumentId(String widgetId) throws ApiException {
/* 136 */     WidgetDocuments documentsSubResource = null;
/*     */     
/* 138 */     documentsSubResource = widgetsApi.getWidgetDocuments(headers, 
/* 139 */         widgetId, 
/* 140 */         TestData.VERSION_ID, 
/* 141 */         TestData.PARTICIPANT_EMAIL);
/* 142 */     List<WidgetOriginalDocument> widgetsDocumentsList = documentsSubResource.getDocuments();
/* 143 */     documentId = ((WidgetOriginalDocument)widgetsDocumentsList.get(0)).getDocumentId();
/*     */   }
/*     */   
/*     */   public static WidgetsApi getWidgetsApi() {
/* 147 */     return widgetsApi;
/*     */   }
/*     */   
/*     */   public static String getDocumentId() {
/* 151 */     return documentId;
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\WidgetUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */