/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.SigningUrlResponse;
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
/*     */ public class GetAgreementSigningUrlsApiTest
/*     */ {
/*  37 */   private static AgreementsApi agreementsApi = null;
/*  38 */   private static String agreementId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  42 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  46 */     ApiUtils.configureProperty();
/*  47 */     agreementsApi = AgreementsUtils.getAgreementsApi();
/*  48 */     agreementId = AgreementsUtils.getResourceId(TestData.AGREEMENT_NAME);
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
/*  61 */       agreementsApi.getSigningUrl(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  62 */           agreementId);
/*     */     }
/*  64 */     catch (ApiException e) {
/*  65 */       Assert.assertTrue(e.getMessage(), 
/*  66 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  70 */       agreementsApi.getSigningUrl(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  71 */           agreementId);
/*     */     }
/*  73 */     catch (ApiException e) {
/*  74 */       Assert.assertTrue(e.getMessage(), 
/*  75 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  88 */       agreementsApi.getSigningUrl(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  89 */           agreementId);
/*     */     }
/*  91 */     catch (ApiException e) {
/*  92 */       Assert.assertTrue(e.getMessage(), 
/*  93 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 106 */       agreementsApi.getSigningUrl(ApiUtils.getValidHeaderParams(), 
/* 107 */           TestData.EMPTY_PARAM);
/*     */     }
/* 109 */     catch (ApiException e) {
/* 110 */       Assert.assertTrue(e.getMessage(), 
/* 111 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 115 */       agreementsApi.getSigningUrl(ApiUtils.getValidHeaderParams(), 
/* 116 */           TestData.NULL_PARAM);
/*     */     }
/* 118 */     catch (ApiException e) {
/* 119 */       Assert.assertTrue(e.getMessage(), 
/* 120 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testSigningUrl() throws ApiException {
/*     */     try {
/* 130 */       SigningUrlResponse signingUrlResponse = agreementsApi.getSigningUrl(ApiUtils.getValidHeaderParams(), 
/* 131 */           agreementId);
/* 132 */       Assert.assertNotNull(signingUrlResponse);
/*     */     }
/* 134 */     catch (ApiException e) {
/* 135 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementSigningUrlsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */