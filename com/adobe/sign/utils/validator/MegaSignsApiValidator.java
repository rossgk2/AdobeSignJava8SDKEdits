/*     */ package com.adobe.sign.utils.validator;
/*     */ import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.model.megaSigns.FileInfo;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignCreationInfo;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignCreationRequest;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateInfo;
/*     */ import com.adobe.sign.model.megaSigns.PostSignOptions;
/*     */ import com.adobe.sign.model.megaSigns.RecipientInfo;
/*     */ import com.adobe.sign.model.megaSigns.RecipientSetInfo;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MegaSignsApiValidator
/*     */ {
/*     */   public static void getMegaSignsValidator(String query) throws ApiException {}
/*     */   
/*     */   public static void createMegaSignValidator(MegaSignCreationRequest megaSignCreationRequest) throws ApiException {
/*  52 */     ApiValidatorHelper.validateParameter(megaSignCreationRequest);
/*     */     
/*  54 */     MegaSignCreationInfo megasignCreationInfo = megaSignCreationRequest.getMegaSignCreationInfo();
/*  55 */     ApiValidatorHelper.validateParameter(megasignCreationInfo);
/*     */     
/*  57 */     List<FileInfo> fileInfos = megasignCreationInfo.getFileInfos();
/*  58 */     validateFileInfo(fileInfos);
/*     */     
/*  60 */     ApiValidatorHelper.validateParameter(megasignCreationInfo.getName());
/*     */     
/*  62 */     validatePostSignOptions(megasignCreationInfo.getPostSignOptions());
/*     */     
/*  64 */     List<RecipientSetInfo> recipientSetInfos = megasignCreationInfo.getRecipientSetInfos();
/*  65 */     if (recipientSetInfos != null) {
/*  66 */       validateRecipientSetInfos(recipientSetInfos);
/*     */     }
/*  68 */     ApiValidatorHelper.validateParameter(megasignCreationInfo.getSignatureType());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getMegaSignInfoValidator(String megaSignId) throws ApiException {
/*  78 */     ApiValidatorHelper.validateId(megaSignId, 
/*  79 */         SdkErrorCodes.INVALID_MEGASIGN_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getMegaSignChildAgreementsValidator(String megaSignId) throws ApiException {
/*  89 */     ApiValidatorHelper.validateId(megaSignId, 
/*  90 */         SdkErrorCodes.INVALID_MEGASIGN_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getMegaSignFormDataValidator(String megaSignId) throws ApiException {
/* 101 */     ApiValidatorHelper.validateId(megaSignId, 
/* 102 */         SdkErrorCodes.INVALID_MEGASIGN_ID);
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
/*     */   public static void updateMegaSignStatusValidator(String megaSignId, MegaSignStatusUpdateInfo megaSignStatusUpdateInfo) throws ApiException {
/* 114 */     ApiValidatorHelper.validateId(megaSignId, 
/* 115 */         SdkErrorCodes.INVALID_MEGASIGN_ID);
/* 116 */     ApiValidatorHelper.validateParameter(megaSignStatusUpdateInfo);
/* 117 */     String updateValue = (megaSignStatusUpdateInfo.getValue() == null) ? "" : megaSignStatusUpdateInfo.getValue().toString();
/* 118 */     ApiValidatorHelper.validateParameter(updateValue, 
/* 119 */         SdkErrorCodes.INVALID_MEGASIGN_STATUS);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validateFileInfo(List<FileInfo> fileInfos) throws ApiException {
/* 126 */     if (fileInfos == null) {
/* 127 */       throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */     }
/* 129 */     for (FileInfo fileInfo : fileInfos) {
/*     */       
/* 131 */       if (fileInfo == null) {
/* 132 */         throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */       }
/* 134 */       String url = (fileInfo.getDocumentURL() == null) ? null : fileInfo.getDocumentURL().getUrl();
/* 135 */       ApiValidatorHelper.validateFileInfo(fileInfo.getDocumentURL(), 
/* 136 */           fileInfo.getLibraryDocumentId(), 
/* 137 */           fileInfo.getLibraryDocumentName(), 
/* 138 */           fileInfo.getTransientDocumentId(), 
/* 139 */           url);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validateRecipientSetInfos(List<RecipientSetInfo> recipientSetInfos) throws ApiException {
/* 148 */     for (RecipientSetInfo recipientSetInfo : recipientSetInfos) {
/*     */       
/* 150 */       ApiValidatorHelper.validateParameter(recipientSetInfo.getRecipientSetMemberInfos());
/* 151 */       List<RecipientInfo> recipientInfos = recipientSetInfo.getRecipientSetMemberInfos();
/* 152 */       int numberOfRecipients = recipientInfos.size();
/*     */       
/* 154 */       if (recipientSetInfo.getRecipientSetMemberInfos().size() > 1) {
/* 155 */         throw new ApiException(SdkErrorCodes.RECIPIENT_SET_NOT_SUPPORTED);
/*     */       }
/* 157 */       for (RecipientInfo recipientInfo : recipientInfos) {
/* 158 */         ApiValidatorHelper.validateRecipientSetInfos(recipientInfo.getEmail(), recipientInfo.getFax(), numberOfRecipients);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validatePostSignOptions(PostSignOptions postSignOptions) throws ApiException {
/* 166 */     if (postSignOptions == null)
/*     */       return; 
/* 168 */     ApiValidatorHelper.validatePostSignOptions(postSignOptions.getRedirectUrl(), postSignOptions.getRedirectDelay());
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\MegaSignsApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */