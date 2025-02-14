/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.UserAgreements;
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
/*     */ public class GetAgreementsApiTest
/*     */ {
/*  37 */   private static AgreementsApi agreementsApi = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  41 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  45 */     ApiUtils.configureProperty();
/*  46 */     agreementsApi = AgreementsUtils.getAgreementsApi();
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
/*  59 */       agreementsApi.getAgreements(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  60 */           TestData.AGREEMENT_QUERY, 
/*  61 */           TestData.AGREEMENT_EXTERNAL_ID, 
/*  62 */           TestData.AGREEMENT_EXTERNAL_GROUP, 
/*  63 */           TestData.AGREEMENT_EXTERNAL_NAMESPACE);
/*     */     }
/*  65 */     catch (ApiException e) {
/*  66 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  70 */       agreementsApi.getAgreements(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  71 */           TestData.AGREEMENT_QUERY, 
/*  72 */           TestData.AGREEMENT_EXTERNAL_ID, 
/*  73 */           TestData.AGREEMENT_EXTERNAL_GROUP, 
/*  74 */           TestData.AGREEMENT_EXTERNAL_NAMESPACE);
/*     */     }
/*  76 */     catch (ApiException e) {
/*  77 */       Assert.assertTrue(e.getMessage(), 
/*  78 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*     */   @Test
/*     */   public void testInvalidXApiUser() throws ApiException {
/*     */     try {
/*  92 */       agreementsApi.getAgreements(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  93 */           TestData.AGREEMENT_QUERY, 
/*  94 */           TestData.AGREEMENT_EXTERNAL_ID, 
/*  95 */           TestData.AGREEMENT_EXTERNAL_GROUP, 
/*  96 */           TestData.AGREEMENT_EXTERNAL_NAMESPACE);
/*     */     }
/*  98 */     catch (ApiException e) {
/*  99 */       Assert.assertTrue(e.getMessage(), 
/* 100 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testEmptyExternalId() throws ApiException {
/*     */     try {
/* 113 */       agreementsApi.getAgreements(ApiUtils.getValidHeaderParams(), 
/* 114 */           TestData.AGREEMENT_QUERY, 
/* 115 */           TestData.EMPTY_PARAM, 
/* 116 */           TestData.GROUP_NAME, 
/* 117 */           TestData.AGREEMENT_EXTERNAL_NAMESPACE);
/*     */     }
/* 119 */     catch (ApiException e) {
/* 120 */       Assert.assertTrue(e.getMessage(), 
/* 121 */           SdkErrorCodes.EMPTY_EXTERNALID_PARAMETER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testAgreements() throws ApiException {
/*     */     try {
/* 132 */       UserAgreements userAgreements = agreementsApi.getAgreements(ApiUtils.getValidHeaderParams(), 
/* 133 */           TestData.AGREEMENT_QUERY, 
/* 134 */           TestData.AGREEMENT_EXTERNAL_ID, 
/* 135 */           TestData.AGREEMENT_EXTERNAL_GROUP, 
/* 136 */           TestData.AGREEMENT_EXTERNAL_NAMESPACE);
/* 137 */       Assert.assertNotNull(userAgreements);
/*     */     }
/* 139 */     catch (ApiException e) {
/* 140 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */