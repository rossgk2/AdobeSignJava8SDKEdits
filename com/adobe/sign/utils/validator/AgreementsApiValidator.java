/*     */ package com.adobe.sign.utils.validator;
/*     */ import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.model.agreements.AgreementCreationInfo;
/*     */ import com.adobe.sign.model.agreements.AgreementStatusUpdateInfo;
/*     */ import com.adobe.sign.model.agreements.AlternateParticipantInfo;
/*     */ import com.adobe.sign.model.agreements.DocumentCreationInfo;
/*     */ import com.adobe.sign.model.agreements.FileInfo;
/*     */ import com.adobe.sign.model.agreements.InteractiveOptions;
/*     */ import com.adobe.sign.model.agreements.PostSignOptions;
/*     */ import com.adobe.sign.model.agreements.RecipientInfo;
/*     */ import com.adobe.sign.model.agreements.RecipientSetInfo;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.StringUtil;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AgreementsApiValidator
/*     */ {
/*     */   public static void getAgreementsValidator(String query, String externalId, String externalGroup, String externalNamespace) throws ApiException {
/*  48 */     if (!StringUtil.isEmpty(externalNamespace) || !StringUtil.isEmpty(externalGroup) || !StringUtil.isEmpty(externalId)) {
/*  49 */       ApiValidatorHelper.validateId(externalId, 
/*  50 */           SdkErrorCodes.EMPTY_EXTERNALID_PARAMETER);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void createAgreementValidator(AgreementCreationInfo agreementCreationInfo) throws ApiException {
/*  61 */     ApiValidatorHelper.validateParameter(agreementCreationInfo);
/*     */     
/*  63 */     DocumentCreationInfo documentCreationInfo = agreementCreationInfo.getDocumentCreationInfo();
/*  64 */     ApiValidatorHelper.validateParameter(documentCreationInfo);
/*     */     
/*  66 */     List<FileInfo> fileInfos = documentCreationInfo.getFileInfos();
/*  67 */     validateFileInfo(fileInfos);
/*     */     
/*  69 */     ApiValidatorHelper.validateParameter(documentCreationInfo.getName());
/*     */     
/*  71 */     validatePostSignOptions(documentCreationInfo.getPostSignOptions());
/*     */     
/*  73 */     ApiValidatorHelper.validateParameter(documentCreationInfo.getRecipientSetInfos());
/*     */     
/*  75 */     List<RecipientSetInfo> recipientSetInfos = documentCreationInfo.getRecipientSetInfos();
/*  76 */     validateRecipientSetInfos(recipientSetInfos);
/*     */     
/*  78 */     validateInteractiveOptions(agreementCreationInfo);
/*     */     
/*  80 */     ApiValidatorHelper.validateParameter(documentCreationInfo.getSignatureType());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getAgreementInfoValidator(String agreementId) throws ApiException {
/*  90 */     ApiValidatorHelper.validateId(agreementId, 
/*  91 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void deleteAgreementValidator(String agreementId) throws ApiException {
/* 101 */     ApiValidatorHelper.validateId(agreementId, 
/* 102 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getAuditTrailValidator(String agreementId) throws ApiException {
/* 113 */     ApiValidatorHelper.validateId(agreementId, 
/* 114 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getCombinedDocumentValidator(String agreementId, String versionId, String participantEmail, boolean attachSupportingDocuments, boolean auditReport) throws ApiException {
/* 133 */     ApiValidatorHelper.validateId(agreementId, 
/* 134 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/* 135 */     ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
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
/*     */   public static void getCombinedDocumentPagesInfoValidator(String agreementId, boolean includeSupportingDocumentsPagesInfo) throws ApiException {
/* 148 */     ApiValidatorHelper.validateId(agreementId, 
/* 149 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getCombinedDocumentUrlValidator(String agreementId, String versionId, String participantEmail, boolean attachSupportingDocuments, boolean auditReport) throws ApiException {
/* 167 */     ApiValidatorHelper.validateId(agreementId, 
/* 168 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/* 169 */     ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
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
/*     */ 
/*     */   
/*     */   public static void getAllDocumentsValidator(String agreementId, String versionId, String participantEmail, String supportingDocumentContentFormat) throws ApiException {
/* 185 */     ApiValidatorHelper.validateId(agreementId, 
/* 186 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/* 187 */     ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void deleteDocumentsValidator(String agreementId) throws ApiException {
/* 197 */     ApiValidatorHelper.validateId(agreementId, 
/* 198 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getCombinedDocumentImageUrlsValidator(String agreementId, String versionId, String participantEmail, String imageSizes, boolean includeSupportingDocumentsImageUrls, boolean showImageAvailabilityOnly) throws ApiException {
/* 218 */     ApiValidatorHelper.validateId(agreementId, 
/* 219 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/* 220 */     ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
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
/*     */   public static void getDocumentValidator(String agreementId, String documentId) throws ApiException {
/* 232 */     ApiValidatorHelper.validateId(agreementId, 
/* 233 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/* 234 */     ApiValidatorHelper.validateId(documentId, 
/* 235 */         SdkErrorCodes.INVALID_DOCUMENT_ID);
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
/*     */   public static void getDocumentImageUrlsValidator(String agreementId, String documentId, String versionId, String participantEmail, String imageSizes, boolean showImageAvailabilityOnly, Integer startPage, Integer endPage) throws ApiException {
/* 259 */     ApiValidatorHelper.validateId(agreementId, 
/* 260 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/* 261 */     ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
/* 262 */     ApiValidatorHelper.validateId(documentId, 
/* 263 */         SdkErrorCodes.INVALID_DOCUMENT_ID);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getDocumentUrlValidator(String agreementId, String documentId, String versionId, String participantEmail) throws ApiException {
/* 280 */     ApiValidatorHelper.validateId(agreementId, 
/* 281 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/* 282 */     ApiValidatorHelper.validateId(documentId, 
/* 283 */         SdkErrorCodes.INVALID_DOCUMENT_ID);
/* 284 */     ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getFormDataValidator(String agreementId) throws ApiException {
/* 294 */     ApiValidatorHelper.validateId(agreementId, 
/* 295 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
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
/*     */ 
/*     */   
/*     */   public static void createAlternateParticipantValidator(String agreementId, String participantSetId, String participantId, AlternateParticipantInfo alternateParticipantInfo) throws ApiException {
/* 311 */     ApiValidatorHelper.validateId(agreementId, 
/* 312 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/*     */     
/* 314 */     ApiValidatorHelper.validateId(participantId, 
/* 315 */         SdkErrorCodes.INVALID_PARTICIPANT_ID);
/* 316 */     ApiValidatorHelper.validateId(participantSetId, 
/* 317 */         SdkErrorCodes.INVALID_PARTICIPANT_SET_ID);
/*     */     
/* 319 */     ApiValidatorHelper.validateParameter(alternateParticipantInfo);
/*     */     
/* 321 */     ApiValidatorHelper.validateParameter(alternateParticipantInfo.getEmail());
/* 322 */     ApiValidatorHelper.validateEmailParamater(alternateParticipantInfo.getEmail());
/*     */     
/* 324 */     ApiValidatorHelper.validateParameter(alternateParticipantInfo.getPrivateMessage(), 
/* 325 */         SdkErrorCodes.EMPTY_PRIVATE_MESSAGE);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getSigningUrlValidator(String agreementId) throws ApiException {
/* 335 */     ApiValidatorHelper.validateId(agreementId, 
/* 336 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
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
/*     */   public static void updateStatusValidator(String agreementId, AgreementStatusUpdateInfo agreementStatusUpdateInfo) throws ApiException {
/* 349 */     ApiValidatorHelper.validateId(agreementId, 
/* 350 */         SdkErrorCodes.INVALID_AGREEMENT_ID);
/* 351 */     ApiValidatorHelper.validateParameter(agreementStatusUpdateInfo);
/* 352 */     ApiValidatorHelper.validateParameter(agreementStatusUpdateInfo.getValue(), 
/* 353 */         SdkErrorCodes.MUST_PROVIDE_VALID_AGREEMENT_STATUS);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validateInteractiveOptions(AgreementCreationInfo agreementCreationInfo) throws ApiException {
/* 360 */     List<RecipientSetInfo> recipientSetInfos = agreementCreationInfo.getDocumentCreationInfo().getRecipientSetInfos();
/* 361 */     InteractiveOptions interactiveOptions = agreementCreationInfo.getOptions();
/*     */     
/* 363 */     if (interactiveOptions == null) {
/*     */       return;
/*     */     }
/* 366 */     for (RecipientSetInfo recipientSetInfo : recipientSetInfos) {
/*     */       
/* 368 */       ApiValidatorHelper.validateParameter(recipientSetInfo.getRecipientSetMemberInfos());
/* 369 */       int numberOfRecipients = recipientSetInfo.getRecipientSetMemberInfos().size();
/*     */       
/* 371 */       if ((interactiveOptions.getAuthoringRequested().booleanValue() || interactiveOptions.getSendThroughWeb().booleanValue()) && numberOfRecipients > 1) {
/* 372 */         throw new ApiException(SdkErrorCodes.INVALID_ARGUMENTS);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validateFileInfo(List<FileInfo> fileInfos) throws ApiException {
/* 380 */     if (fileInfos == null) {
/* 381 */       throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */     }
/* 383 */     for (FileInfo fileInfo : fileInfos) {
/*     */       
/* 385 */       if (fileInfo == null) {
/* 386 */         throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */       }
/* 388 */       String url = (fileInfo.getDocumentURL() == null) ? null : fileInfo.getDocumentURL().getUrl();
/* 389 */       ApiValidatorHelper.validateFileInfo(fileInfo.getDocumentURL(), 
/* 390 */           fileInfo.getLibraryDocumentId(), 
/* 391 */           fileInfo.getLibraryDocumentName(), 
/* 392 */           fileInfo.getTransientDocumentId(), 
/* 393 */           url);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validateRecipientSetInfos(List<RecipientSetInfo> recipientSetInfos) throws ApiException {
/* 402 */     for (RecipientSetInfo recipientSetInfo : recipientSetInfos) {
/*     */       
/* 404 */       ApiValidatorHelper.validateParameter(recipientSetInfo.getRecipientSetMemberInfos());
/* 405 */       List<RecipientInfo> recipientInfos = recipientSetInfo.getRecipientSetMemberInfos();
/* 406 */       int numberOfRecipients = recipientInfos.size();
/*     */       
/* 408 */       for (RecipientInfo recipientInfo : recipientInfos) {
/* 409 */         ApiValidatorHelper.validateRecipientSetInfos(recipientInfo.getEmail(), recipientInfo.getFax(), numberOfRecipients);
/*     */       }
/* 411 */       ApiValidatorHelper.validateParameter(recipientSetInfo.getRecipientSetRole());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validatePostSignOptions(PostSignOptions postSignOptions) throws ApiException {
/* 419 */     if (postSignOptions == null)
/*     */       return; 
/* 421 */     ApiValidatorHelper.validatePostSignOptions(postSignOptions.getRedirectUrl(), postSignOptions.getRedirectDelay());
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\AgreementsApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */