/*     */ package com.adobe.sign.api.Widgets;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.WidgetsApi;
/*     */ import com.adobe.sign.model.widgets.WidgetCreationRequest;
/*     */ import com.adobe.sign.model.widgets.WidgetCreationResponse;
/*     */ import com.adobe.sign.model.widgets.WidgetFileInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetURLFileInfo;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.LibraryDocumentsUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
/*     */ import com.adobe.sign.utils.TransientDocumentsUtils;
/*     */ import com.adobe.sign.utils.WidgetUtils;
/*     */ import com.adobe.sign.utils.validator.SdkErrorCodes;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PostWidgetsApiTest
/*     */ {
/*  43 */   private static WidgetsApi widgetsApi = null;
/*  44 */   private static String libraryDocumentId = null;
/*  45 */   private static String transientDocumentId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  49 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  53 */     ApiUtils.configureProperty();
/*  54 */     widgetsApi = WidgetUtils.getWidgetsApi();
/*     */     
/*  56 */     libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
/*  57 */     transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testNullAndEmptyAccessToken() throws ApiException {
/*  69 */     WidgetCreationRequest widgetCreationRequest = new WidgetCreationRequest();
/*     */     
/*     */     try {
/*  72 */       widgetsApi.createWidget(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  73 */           widgetCreationRequest);
/*     */     }
/*  75 */     catch (ApiException e) {
/*  76 */       Assert.assertTrue(e.getMessage(), 
/*  77 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  81 */       widgetsApi.createWidget(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  82 */           widgetCreationRequest);
/*     */     }
/*  84 */     catch (ApiException e) {
/*  85 */       Assert.assertTrue(e.getMessage(), 
/*  86 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testInvalidWidgetCreationInfo() throws ApiException {
/*     */     try {
/* 101 */       widgetsApi.createWidget(ApiUtils.getValidHeaderParams(), 
/* 102 */           null);
/*     */     }
/* 104 */     catch (ApiException e) {
/* 105 */       Assert.assertTrue(e.getMessage(), 
/* 106 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 109 */     WidgetCreationRequest widgetCreationRequest = WidgetUtils.getWidgetCreationRequest(TestData.NULL_PARAM);
/*     */     
/*     */     try {
/* 112 */       widgetsApi.createWidget(ApiUtils.getValidHeaderParams(), 
/* 113 */           widgetCreationRequest);
/*     */     }
/* 115 */     catch (ApiException e) {
/* 116 */       Assert.assertTrue(e.getMessage(), 
/* 117 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 120 */     WidgetFileInfo fileInfo = new WidgetFileInfo();
/* 121 */     widgetCreationRequest = WidgetUtils.getWidgetCreationRequest(TestData.WIDGET_NAME, 
/* 122 */         fileInfo);
/*     */     
/*     */     try {
/* 125 */       widgetsApi.createWidget(ApiUtils.getValidHeaderParams(), 
/* 126 */           widgetCreationRequest);
/*     */     }
/* 128 */     catch (ApiException e) {
/* 129 */       Assert.assertTrue(e.getMessage(), 
/* 130 */           SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 133 */     WidgetURLFileInfo url = new WidgetURLFileInfo();
/* 134 */     url.setUrl(TestData.INVALID_URL);
/* 135 */     fileInfo.setDocumentURL(url);
/*     */     
/* 137 */     widgetCreationRequest = WidgetUtils.getWidgetCreationRequest(TestData.WIDGET_NAME, 
/* 138 */         fileInfo);
/*     */     
/*     */     try {
/* 141 */       widgetsApi.createWidget(ApiUtils.getValidHeaderParams(), 
/* 142 */           widgetCreationRequest);
/*     */     }
/* 144 */     catch (ApiException e) {
/* 145 */       Assert.assertTrue(e.getMessage(), 
/* 146 */           SdkErrorCodes.URL_INVALID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 149 */     fileInfo.setLibraryDocumentId(libraryDocumentId);
/* 150 */     fileInfo.setTransientDocumentId(transientDocumentId);
/* 151 */     fileInfo.setDocumentURL(null);
/*     */     
/* 153 */     widgetCreationRequest = WidgetUtils.getWidgetCreationRequest(TestData.WIDGET_NAME, 
/* 154 */         fileInfo);
/*     */     
/*     */     try {
/* 157 */       widgetsApi.createWidget(ApiUtils.getValidHeaderParams(), 
/* 158 */           widgetCreationRequest);
/*     */     }
/* 160 */     catch (ApiException e) {
/* 161 */       Assert.assertTrue(e.getMessage(), 
/* 162 */           SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testInvalidXApiUser() throws ApiException {
/* 174 */     WidgetCreationRequest widgetCreationRequest = new WidgetCreationRequest();
/*     */     
/*     */     try {
/* 177 */       widgetsApi.createWidget(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 178 */           widgetCreationRequest);
/*     */     }
/* 180 */     catch (ApiException e) {
/* 181 */       Assert.assertTrue(e.getMessage(), 
/* 182 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testCreateWidget() throws ApiException {
/* 194 */     WidgetCreationRequest widgetCreationRequest = WidgetUtils.getWidgetCreationRequest(ApiUtils.getWidgetName());
/*     */     
/*     */     try {
/* 197 */       WidgetCreationResponse widgetCreationResponse = widgetsApi.createWidget(ApiUtils.getValidHeaderParams(), 
/* 198 */           widgetCreationRequest);
/* 199 */       Assert.assertNotNull(widgetCreationResponse);
/* 200 */       Assert.assertNotNull(widgetCreationResponse.getWidgetId());
/*     */     }
/* 202 */     catch (ApiException e) {
/* 203 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Widgets\PostWidgetsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */