/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.CombinedDocumentPagesInfo;
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
/*     */ public class GetAgreementCombinedDocPagesInfoApiTest
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
/*  61 */       agreementsApi.getCombinedDocumentPagesInfo(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  62 */           agreementId, 
/*  63 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO));
/*     */     }
/*  65 */     catch (ApiException e) {
/*  66 */       Assert.assertTrue(e.getMessage(), 
/*  67 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  71 */       agreementsApi.getCombinedDocumentPagesInfo(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  72 */           agreementId, 
/*  73 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO));
/*     */     }
/*  75 */     catch (ApiException e) {
/*  76 */       Assert.assertTrue(e.getMessage(), 
/*  77 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  90 */       agreementsApi.getCombinedDocumentPagesInfo(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  91 */           agreementId, 
/*  92 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO));
/*     */     }
/*  94 */     catch (ApiException e) {
/*  95 */       Assert.assertTrue(e.getMessage(), 
/*  96 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 109 */       agreementsApi.getCombinedDocumentPagesInfo(ApiUtils.getValidHeaderParams(), 
/* 110 */           TestData.EMPTY_PARAM, 
/* 111 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO));
/*     */     }
/* 113 */     catch (ApiException e) {
/* 114 */       Assert.assertTrue(e.getMessage(), 
/* 115 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 119 */       agreementsApi.getCombinedDocumentPagesInfo(ApiUtils.getValidHeaderParams(), 
/* 120 */           TestData.NULL_PARAM, 
/* 121 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO));
/*     */     }
/* 123 */     catch (ApiException e) {
/* 124 */       Assert.assertTrue(e.getMessage(), 
/* 125 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidDocumentId() throws ApiException {
/*     */     try {
/* 138 */       agreementsApi.getCombinedDocumentPagesInfo(ApiUtils.getValidHeaderParams(), 
/* 139 */           agreementId, 
/* 140 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO));
/*     */     }
/* 142 */     catch (ApiException e) {
/* 143 */       Assert.assertTrue(e.getMessage(), 
/* 144 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 148 */       agreementsApi.getCombinedDocumentPagesInfo(ApiUtils.getValidHeaderParams(), 
/* 149 */           agreementId, 
/* 150 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO));
/*     */     }
/* 152 */     catch (ApiException e) {
/* 153 */       Assert.assertTrue(e.getMessage(), 
/* 154 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetCombinedDocumentPagesInfo() throws ApiException {
/*     */     try {
/* 167 */       CombinedDocumentPagesInfo combinedDocumentPagesInfo = agreementsApi.getCombinedDocumentPagesInfo(ApiUtils.getValidHeaderParams(), 
/* 168 */           agreementId, 
/* 169 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO));
/* 170 */       Assert.assertNotNull(combinedDocumentPagesInfo);
/*     */     }
/* 172 */     catch (ApiException e) {
/* 173 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementCombinedDocPagesInfoApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */