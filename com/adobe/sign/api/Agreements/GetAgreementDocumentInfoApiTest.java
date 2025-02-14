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
/*     */ public class GetAgreementDocumentInfoApiTest
/*     */ {
/*  36 */   private static AgreementsApi agreementsApi = null;
/*  37 */   private static String agreementId = null;
/*  38 */   private static String documentId = null;
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
/*  49 */     documentId = AgreementsUtils.getDocumentId();
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
/*  62 */       agreementsApi.getDocument(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  63 */           agreementId, 
/*  64 */           documentId);
/*     */     }
/*  66 */     catch (ApiException e) {
/*  67 */       Assert.assertTrue(e.getMessage(), 
/*  68 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  72 */       agreementsApi.getDocument(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  73 */           agreementId, 
/*  74 */           documentId);
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
/*     */   @Test
/*     */   public void testInvalidXApiUser() throws ApiException {
/*     */     try {
/*  91 */       agreementsApi.getDocument(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  92 */           agreementId, 
/*  93 */           documentId);
/*     */     }
/*  95 */     catch (ApiException e) {
/*  96 */       Assert.assertTrue(e.getMessage(), 
/*  97 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 110 */       agreementsApi.getDocument(ApiUtils.getValidHeaderParams(), 
/* 111 */           TestData.EMPTY_PARAM, 
/* 112 */           documentId);
/*     */     }
/* 114 */     catch (ApiException e) {
/* 115 */       Assert.assertTrue(e.getMessage(), 
/* 116 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 120 */       agreementsApi.getDocument(ApiUtils.getValidHeaderParams(), 
/* 121 */           TestData.NULL_PARAM, 
/* 122 */           documentId);
/*     */     }
/* 124 */     catch (ApiException e) {
/* 125 */       Assert.assertTrue(e.getMessage(), 
/* 126 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
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
/* 139 */       agreementsApi.getDocument(ApiUtils.getValidHeaderParams(), 
/* 140 */           agreementId, 
/* 141 */           TestData.EMPTY_PARAM);
/*     */     }
/* 143 */     catch (ApiException e) {
/* 144 */       Assert.assertTrue(e.getMessage(), 
/* 145 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 149 */       agreementsApi.getDocument(ApiUtils.getValidHeaderParams(), 
/* 150 */           agreementId, 
/* 151 */           TestData.NULL_PARAM);
/*     */     }
/* 153 */     catch (ApiException e) {
/* 154 */       Assert.assertTrue(e.getMessage(), 
/* 155 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testDocument() throws ApiException {
/*     */     try {
/* 168 */       byte[] document = agreementsApi.getDocument(ApiUtils.getValidHeaderParams(), 
/* 169 */           agreementId, 
/* 170 */           documentId);
/* 171 */       Assert.assertNotNull(document);
/*     */     }
/* 173 */     catch (ApiException e) {
/* 174 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementDocumentInfoApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */