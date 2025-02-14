/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.AgreementDocuments;
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
/*     */ public class GetAgreementDocumentsApiTest
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
/*  61 */       agreementsApi.getAllDocuments(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  62 */           agreementId, 
/*  63 */           TestData.VERSION_ID, 
/*  64 */           TestData.PARTICIPANT_EMAIL, 
/*  65 */           TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
/*     */     }
/*  67 */     catch (ApiException e) {
/*  68 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/*  73 */       agreementsApi.getAllDocuments(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  74 */           agreementId, 
/*  75 */           TestData.VERSION_ID, 
/*  76 */           TestData.PARTICIPANT_EMAIL, 
/*  77 */           TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
/*     */     }
/*  79 */     catch (ApiException e) {
/*  80 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  94 */       agreementsApi.getAllDocuments(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  95 */           agreementId, 
/*  96 */           TestData.VERSION_ID, 
/*  97 */           TestData.PARTICIPANT_EMAIL, 
/*  98 */           TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
/*     */     }
/* 100 */     catch (ApiException e) {
/* 101 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 114 */       agreementsApi.getAllDocuments(ApiUtils.getValidHeaderParams(), 
/* 115 */           TestData.EMPTY_PARAM, 
/* 116 */           TestData.VERSION_ID, 
/* 117 */           TestData.PARTICIPANT_EMAIL, 
/* 118 */           TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
/*     */     }
/* 120 */     catch (ApiException e) {
/* 121 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 125 */       agreementsApi.getAllDocuments(ApiUtils.getValidHeaderParams(), 
/* 126 */           TestData.NULL_PARAM, 
/* 127 */           TestData.VERSION_ID, 
/* 128 */           TestData.PARTICIPANT_EMAIL, 
/* 129 */           TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
/*     */     }
/* 131 */     catch (ApiException e) {
/* 132 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidVersionId() throws ApiException {
/*     */     try {
/* 145 */       agreementsApi.getAllDocuments(ApiUtils.getValidHeaderParams(), 
/* 146 */           agreementId, 
/* 147 */           TestData.EMPTY_PARAM, 
/* 148 */           TestData.PARTICIPANT_EMAIL, 
/* 149 */           TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
/*     */     }
/* 151 */     catch (ApiException e) {
/* 152 */       Assert.assertTrue(e.getMessage(), 
/* 153 */           SdkErrorCodes.INVALID_VERSION_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidParticipantEmail() throws ApiException {
/*     */     try {
/* 166 */       agreementsApi.getAllDocuments(ApiUtils.getValidHeaderParams(), 
/* 167 */           agreementId, 
/* 168 */           TestData.VERSION_ID, 
/* 169 */           TestData.EMPTY_PARAM, 
/* 170 */           TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
/*     */     }
/* 172 */     catch (ApiException e) {
/* 173 */       Assert.assertTrue(e.getMessage(), 
/* 174 */           SdkErrorCodes.INVALID_PARTICIPANT.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetAllDocuments() throws ApiException {
/*     */     try {
/* 187 */       AgreementDocuments agreementDocuments = agreementsApi.getAllDocuments(ApiUtils.getValidHeaderParams(), 
/* 188 */           agreementId, 
/* 189 */           TestData.VERSION_ID, 
/* 190 */           TestData.PARTICIPANT_EMAIL, 
/* 191 */           TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
/* 192 */       Assert.assertNotNull(agreementDocuments);
/*     */     
/*     */     }
/* 195 */     catch (ApiException e) {
/* 196 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementDocumentsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */