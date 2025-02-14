/*    */ package com.adobe.sign.utils.validator;
/*    */ 
/*    */ import com.adobe.sign.model.views.AgreementAssetListRequest;
/*    */ import com.adobe.sign.model.views.AgreementAssetRequest;
/*    */ import com.adobe.sign.model.views.TargetViewRequest;
/*    */ import com.adobe.sign.utils.ApiException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ViewsApiValidator
/*    */ {
/*    */   public static void createAgreementAssetListUrlValidator(AgreementAssetListRequest agreementAssetListRequest) throws ApiException {
/* 33 */     if (agreementAssetListRequest != null && agreementAssetListRequest.getAgreementAssetId() != null) {
/* 34 */       ApiValidatorHelper.validateId(agreementAssetListRequest.getAgreementAssetId(), 
/* 35 */           SdkErrorCodes.INVALID_AGREEMENT_ASSET_ID);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void createAgreementAssetUrlValidator(AgreementAssetRequest agreementAssetRequest) throws ApiException {
/* 46 */     ApiValidatorHelper.validateParameter(agreementAssetRequest);
/* 47 */     ApiValidatorHelper.validateId(agreementAssetRequest.getAgreementAssetId(), 
/* 48 */         SdkErrorCodes.INVALID_AGREEMENT_ASSET_ID);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void createSettingsUrlValidator(TargetViewRequest targetViewRequest) throws ApiException {
/* 60 */     ApiValidatorHelper.validateParameter(targetViewRequest);
/* 61 */     ApiValidatorHelper.validateParameter(targetViewRequest.getTargetView(), 
/* 62 */         SdkErrorCodes.INVALID_TARGET_VIEW);
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\ViewsApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */