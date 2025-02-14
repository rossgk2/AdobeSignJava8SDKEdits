/*    */ package com.adobe.sign.utils.validator;
/*    */ 
/*    */ import com.adobe.sign.model.search.AgreementAssetEventRequest;
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
/*    */ public class SearchApiValidator
/*    */ {
/*    */   public static void createAssetEventValidator(AgreementAssetEventRequest agreementAssetEventRequest) throws ApiException {
/* 31 */     ApiValidatorHelper.validateParameter(agreementAssetEventRequest);
/*    */     
/* 33 */     ApiValidatorHelper.validateStartAndEndDatesParameter(agreementAssetEventRequest.getStartDate(), 
/* 34 */         agreementAssetEventRequest.getEndDate());
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
/*    */ 
/*    */   
/*    */   public static void getAssetEventValidator(String searchId, String pageCursor, Integer pageSize) throws ApiException {
/* 48 */     ApiValidatorHelper.validateId(searchId, 
/* 49 */         SdkErrorCodes.INVALID_SEARCH_ID);
/*    */     
/* 51 */     ApiValidatorHelper.validateParameter(pageCursor, 
/* 52 */         SdkErrorCodes.INVALID_PAGE_CURSOR);
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\SearchApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */