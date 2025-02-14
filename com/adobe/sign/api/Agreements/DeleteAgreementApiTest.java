/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.utils.AgreementsUtils;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
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
/*     */ public class DeleteAgreementApiTest
/*     */ {
/*  36 */   private static AgreementsApi agreementsApi = null;
/*  37 */   private static String agreementId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  41 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  45 */     ApiUtils.configureProperty();
/*  46 */     agreementsApi = AgreementsUtils.getAgreementsApi();
/*  47 */     agreementId = AgreementsUtils.createAgreement(ApiUtils.getAgreementName());
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
/*     */     try {
/*  60 */       agreementsApi.deleteAgreement(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  61 */           agreementId);
/*     */     }
/*  63 */     catch (ApiException e) {
/*  64 */       Assert.assertTrue(e.getMessage(), 
/*  65 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  69 */       agreementsApi.deleteAgreement(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  70 */           agreementId);
/*     */     }
/*  72 */     catch (ApiException e) {
/*  73 */       Assert.assertTrue(e.getMessage(), 
/*  74 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*     */     try {
/*  87 */       agreementsApi.deleteAgreement(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  88 */           agreementId);
/*     */     }
/*  90 */     catch (ApiException e) {
/*  91 */       Assert.assertTrue(e.getMessage(), 
/*  92 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidAgreementId() throws ApiException {
/*     */     try {
/* 105 */       agreementsApi.deleteAgreement(ApiUtils.getValidHeaderParams(), 
/* 106 */           TestData.EMPTY_PARAM);
/*     */     }
/* 108 */     catch (ApiException e) {
/* 109 */       Assert.assertTrue(e.getMessage(), 
/* 110 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 114 */       agreementsApi.deleteAgreement(ApiUtils.getValidHeaderParams(), 
/* 115 */           TestData.NULL_PARAM);
/*     */     }
/* 117 */     catch (ApiException e) {
/* 118 */       Assert.assertTrue(e.getMessage(), 
/* 119 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testDeleteAgreement() throws ApiException {
/*     */     try {
/* 132 */       agreementsApi.deleteAgreement(ApiUtils.getValidHeaderParams(), 
/* 133 */           agreementId);
/*     */     }
/* 135 */     catch (ApiException e) {
/* 136 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\DeleteAgreementApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */