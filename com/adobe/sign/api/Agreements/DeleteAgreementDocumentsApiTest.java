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
/*     */ public class DeleteAgreementDocumentsApiTest
/*     */ {
/*  35 */   private static AgreementsApi agreementsApi = null;
/*  36 */   private static String agreementId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  40 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  44 */     ApiUtils.configureProperty();
/*  45 */     agreementsApi = AgreementsUtils.getAgreementsApi();
/*  46 */     agreementId = AgreementsUtils.createAgreement(ApiUtils.getAgreementName());
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
/*  59 */       agreementsApi.deleteDocuments(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  60 */           agreementId);
/*     */     }
/*  62 */     catch (ApiException e) {
/*  63 */       Assert.assertTrue(e.getMessage(), 
/*  64 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  68 */       agreementsApi.deleteDocuments(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  69 */           agreementId);
/*     */     }
/*  71 */     catch (ApiException e) {
/*  72 */       Assert.assertTrue(e.getMessage(), 
/*  73 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  87 */       agreementsApi.deleteDocuments(ApiUtils.getEmptyXApiUserHeaderParams(), 
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
/* 105 */       agreementsApi.deleteDocuments(ApiUtils.getValidHeaderParams(), 
/* 106 */           TestData.EMPTY_PARAM);
/*     */     }
/* 108 */     catch (ApiException e) {
/* 109 */       Assert.assertTrue(e.getMessage(), 
/* 110 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 114 */       agreementsApi.deleteDocuments(ApiUtils.getValidHeaderParams(), 
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
/*     */   public void testDeleteDocuments() throws ApiException {
/*     */     try {
/* 132 */       agreementsApi.deleteDocuments(ApiUtils.getValidHeaderParams(), 
/* 133 */           agreementId);
/*     */     }
/* 135 */     catch (ApiException e) {
/* 136 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\DeleteAgreementDocumentsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */