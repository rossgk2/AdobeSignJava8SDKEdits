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
/*     */ public class GetAgreementFormDataApiTest
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
/*  47 */     agreementId = AgreementsUtils.getResourceId(TestData.AGREEMENT_NAME);
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
/*  60 */       agreementsApi.getFormData(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  61 */           agreementId);
/*     */     }
/*  63 */     catch (ApiException e) {
/*  64 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  68 */       agreementsApi.getFormData(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  69 */           agreementId);
/*     */     }
/*  71 */     catch (ApiException e) {
/*  72 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  85 */       agreementsApi.getFormData(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  86 */           agreementId);
/*     */     }
/*  88 */     catch (ApiException e) {
/*  89 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 102 */       agreementsApi.getFormData(ApiUtils.getValidHeaderParams(), 
/* 103 */           TestData.EMPTY_PARAM);
/*     */     }
/* 105 */     catch (ApiException e) {
/* 106 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 110 */       agreementsApi.getFormData(ApiUtils.getValidHeaderParams(), 
/* 111 */           TestData.NULL_PARAM);
/*     */     }
/* 113 */     catch (ApiException e) {
/* 114 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testFormData() throws ApiException {
/*     */     try {
/* 124 */       byte[] formData = agreementsApi.getFormData(ApiUtils.getValidHeaderParams(), 
/* 125 */           agreementId);
/* 126 */       Assert.assertNotNull(formData);
/*     */     }
/* 128 */     catch (ApiException e) {
/* 129 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementFormDataApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */