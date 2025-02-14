/*     */ package com.adobe.sign.utils.validator;
/*     */ import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.model.workflows.CustomWorkflowAgreementCreationRequest;
/*     */ import com.adobe.sign.model.workflows.CustomWorkflowFileInfo;
/*     */ import com.adobe.sign.model.workflows.DocumentCreationInfo;
/*     */ import com.adobe.sign.model.workflows.PostSignOptions;
/*     */ import com.adobe.sign.model.workflows.RecipientInfo;
/*     */ import com.adobe.sign.model.workflows.RecipientsInfo;
/*     */ import com.adobe.sign.utils.ApiException;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WorkflowsApiValidator
/*     */ {
/*     */   public static void getWorkflowsValidator(Boolean includeDraftWorkflows, String groupId) throws ApiException {
/*  41 */     if (groupId != null) {
/*  42 */       ApiValidatorHelper.validateId(groupId, 
/*  43 */           SdkErrorCodes.INVALID_GROUP_ID);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getWorkflowInfoValidator(String workflowId) throws ApiException {
/*  53 */     ApiValidatorHelper.validateId(workflowId, 
/*  54 */         SdkErrorCodes.INVALID_WORKFLOW_ID);
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
/*     */ 
/*     */   
/*     */   public static void createWorkflowAgreementValidator(String workflowId, CustomWorkflowAgreementCreationRequest customWorkflowAgreementCreationRequest) throws ApiException {
/*  68 */     ApiValidatorHelper.validateId(workflowId, 
/*  69 */         SdkErrorCodes.INVALID_WORKFLOW_ID);
/*     */     
/*  71 */     ApiValidatorHelper.validateParameter(customWorkflowAgreementCreationRequest);
/*     */     
/*  73 */     DocumentCreationInfo documentCreationInfo = customWorkflowAgreementCreationRequest.getDocumentCreationInfo();
/*  74 */     ApiValidatorHelper.validateParameter(documentCreationInfo);
/*  75 */     ApiValidatorHelper.validateParameter(documentCreationInfo.getName());
/*     */     
/*  77 */     List<CustomWorkflowFileInfo> fileInfos = documentCreationInfo.getFileInfos();
/*  78 */     if (fileInfos == null) {
/*  79 */       throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */     }
/*  81 */     for (CustomWorkflowFileInfo fileInfo : fileInfos) {
/*     */       
/*  83 */       if (fileInfo == null) {
/*  84 */         throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */       }
/*  86 */       ApiValidatorHelper.validateParameter(fileInfo.getName(), 
/*  87 */           SdkErrorCodes.FILE_INFO_NAME_MISSING);
/*     */       
/*  89 */       if (fileInfo.getTransientDocumentId() != null) {
/*  90 */         ApiValidatorHelper.validateId(fileInfo.getTransientDocumentId(), 
/*  91 */             SdkErrorCodes.INVALID_TRANSIENTDOCUMENT_ID);
/*     */       }
/*  93 */       if (fileInfo.getWorkflowLibraryDocumentId() != null)
/*  94 */         ApiValidatorHelper.validateId(fileInfo.getWorkflowLibraryDocumentId(), 
/*  95 */             SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID); 
/*     */     } 
/*  97 */     validatePostSignOptions(documentCreationInfo.getPostSignOptions());
/*     */     
/*  99 */     List<RecipientsInfo> recipientSetInfos = documentCreationInfo.getRecipientsListInfo();
/* 100 */     validateRecipientSetInfos(recipientSetInfos);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validateRecipientSetInfos(List<RecipientsInfo> recipientSetInfos) throws ApiException {
/* 109 */     for (RecipientsInfo recipientSetInfo : recipientSetInfos) {
/* 110 */       ApiValidatorHelper.validateParameter(recipientSetInfo.getRecipients());
/* 111 */       List<RecipientInfo> recipientInfos = recipientSetInfo.getRecipients();
/* 112 */       int numberOfRecipients = recipientInfos.size();
/*     */       
/* 114 */       for (RecipientInfo recipientInfo : recipientInfos) {
/* 115 */         ApiValidatorHelper.validateWorkflowRecipientSetInfos(recipientInfo.getEmail(), recipientInfo.getFax(), numberOfRecipients);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validatePostSignOptions(PostSignOptions postSignOptions) throws ApiException {
/* 123 */     if (postSignOptions == null)
/*     */       return; 
/* 125 */     ApiValidatorHelper.validatePostSignOptions(postSignOptions.getRedirectUrl(), postSignOptions.getRedirectDelay());
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\WorkflowsApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */