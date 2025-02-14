/*     */ package com.adobe.sign.utils;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.api.WorkflowsApi;
/*     */ import com.adobe.sign.model.workflows.CustomWorkflowAgreementCreationRequest;
/*     */ import com.adobe.sign.model.workflows.CustomWorkflowFileInfo;
/*     */ import com.adobe.sign.model.workflows.DocumentCreationInfo;
/*     */ import com.adobe.sign.model.workflows.PostSignOptions;
/*     */ import com.adobe.sign.model.workflows.RecipientInfo;
/*     */ import com.adobe.sign.model.workflows.RecipientsInfo;
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
/*     */ public class WorkFlowUtils
/*     */   extends ApiUtils
/*     */ {
/*  28 */   private static WorkflowsApi workflowsApi = new WorkflowsApi();
/*     */   
/*     */   public static String getResourceId() throws ApiException {
/*  31 */     return TestData.WORKFLOW_ID;
/*     */   }
/*     */ 
/*     */   
/*     */   public static CustomWorkflowAgreementCreationRequest getCustomWorkflowAgreementCreationRequest(String documentName) throws ApiException {
/*  36 */     return getCustomWorkflowAgreementCreationRequest(TestData.POST_EMAIL, 
/*  37 */         TestData.NULL_PARAM, 
/*  38 */         TestData.NULL_PARAM, 
/*  39 */         TestData.TRANSIENT_DOCUMENT_NAME, 
/*  40 */         getTransientDocumentId(), 
/*  41 */         documentName, 
/*  42 */         null);
/*     */   }
/*     */ 
/*     */   
/*     */   public static CustomWorkflowAgreementCreationRequest getCustomWorkflowAgreementCreationRequest(String documentName, PostSignOptions options) throws ApiException {
/*  47 */     return getCustomWorkflowAgreementCreationRequest(TestData.POST_EMAIL, 
/*  48 */         TestData.NULL_PARAM, 
/*  49 */         TestData.NULL_PARAM, 
/*  50 */         TestData.TRANSIENT_DOCUMENT_NAME, 
/*  51 */         getTransientDocumentId(), 
/*  52 */         documentName, 
/*  53 */         options);
/*     */   }
/*     */ 
/*     */   
/*     */   public static CustomWorkflowAgreementCreationRequest getCustomWorkflowAgreementCreationRequest(CustomWorkflowFileInfo fileInfo, String documentName) {
/*  58 */     return getCustomWorkflowAgreementCreationRequest(TestData.POST_EMAIL, 
/*  59 */         TestData.NULL_PARAM, 
/*  60 */         fileInfo.getWorkflowLibraryDocumentId(), 
/*  61 */         fileInfo.getName(), 
/*  62 */         fileInfo.getTransientDocumentId(), 
/*  63 */         documentName, 
/*  64 */         null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static CustomWorkflowAgreementCreationRequest getCustomWorkflowAgreementCreationRequest(String documentName, String recipientEmail, String recipientFax) throws ApiException {
/*  70 */     return getCustomWorkflowAgreementCreationRequest(recipientEmail, 
/*  71 */         recipientFax, 
/*  72 */         TestData.NULL_PARAM, 
/*  73 */         TestData.TRANSIENT_DOCUMENT_NAME, 
/*  74 */         getTransientDocumentId(), 
/*  75 */         documentName, 
/*  76 */         null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CustomWorkflowAgreementCreationRequest getCustomWorkflowAgreementCreationRequest(String recipientEmail, String recipientFax, String fileInfoLibraryDocumentId, String fileInfoName, String fileInfoTransientDocumentId, String documentName, PostSignOptions options) {
/*  87 */     CustomWorkflowAgreementCreationRequest customWorkflowAgreementCreationRequest = new CustomWorkflowAgreementCreationRequest();
/*  88 */     DocumentCreationInfo documentCreationInfo = new DocumentCreationInfo();
/*     */     
/*  90 */     RecipientInfo recipientInfo = new RecipientInfo();
/*  91 */     recipientInfo.setEmail(recipientEmail);
/*  92 */     recipientInfo.setFax(recipientFax);
/*     */     
/*  94 */     List<RecipientInfo> recipientInfoList = new ArrayList<>();
/*  95 */     recipientInfoList.add(recipientInfo);
/*     */     
/*  97 */     RecipientsInfo recipientsInfo = new RecipientsInfo();
/*  98 */     recipientsInfo.setRecipients(recipientInfoList);
/*  99 */     recipientsInfo.setName(TestData.WORKFLOW_RECIPIENT_INFO_NAME);
/*     */     
/* 101 */     ArrayList<RecipientsInfo> recipientsInfoList = new ArrayList<>();
/* 102 */     recipientsInfoList.add(recipientsInfo);
/*     */     
/* 104 */     CustomWorkflowFileInfo fileInfo = new CustomWorkflowFileInfo();
/* 105 */     fileInfo.setWorkflowLibraryDocumentId(fileInfoLibraryDocumentId);
/* 106 */     fileInfo.setName(fileInfoName);
/* 107 */     fileInfo.setTransientDocumentId(fileInfoTransientDocumentId);
/*     */     
/* 109 */     ArrayList<CustomWorkflowFileInfo> fileInfoList = new ArrayList<>();
/* 110 */     fileInfoList.add(fileInfo);
/*     */     
/* 112 */     documentCreationInfo.setName(documentName);
/* 113 */     documentCreationInfo.setRecipientsListInfo(recipientsInfoList);
/*     */     
/* 115 */     documentCreationInfo.setFileInfos(fileInfoList);
/* 116 */     documentCreationInfo.setPostSignOptions(options);
/*     */     
/* 118 */     customWorkflowAgreementCreationRequest.setDocumentCreationInfo(documentCreationInfo);
/*     */     
/* 120 */     return customWorkflowAgreementCreationRequest;
/*     */   }
/*     */   
/*     */   public static WorkflowsApi getWorkflowsApi() {
/* 124 */     return workflowsApi;
/*     */   }
/*     */   
/*     */   private static String getTransientDocumentId() throws ApiException {
/* 128 */     return TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\WorkFlowUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */