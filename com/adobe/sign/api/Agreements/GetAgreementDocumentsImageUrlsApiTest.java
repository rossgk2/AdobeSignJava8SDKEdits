/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.DocumentImageUrls;
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
/*     */ public class GetAgreementDocumentsImageUrlsApiTest
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
/*  61 */       agreementsApi.getCombinedDocumentImageUrls(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  62 */           agreementId, 
/*  63 */           TestData.VERSION_ID, 
/*  64 */           TestData.PARTICIPANT_EMAIL, 
/*  65 */           TestData.IMAGE_SIZE, 
/*  66 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENT_IMAGE_URLS), 
/*  67 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY));
/*     */     }
/*  69 */     catch (ApiException e) {
/*  70 */       Assert.assertTrue(e.getMessage(), 
/*  71 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  75 */       agreementsApi.getCombinedDocumentImageUrls(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  76 */           agreementId, 
/*  77 */           TestData.VERSION_ID, 
/*  78 */           TestData.PARTICIPANT_EMAIL, 
/*  79 */           TestData.IMAGE_SIZE, 
/*  80 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENT_IMAGE_URLS), 
/*  81 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY));
/*     */     }
/*  83 */     catch (ApiException e) {
/*  84 */       Assert.assertTrue(e.getMessage(), 
/*  85 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  99 */       agreementsApi.getCombinedDocumentImageUrls(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 100 */           agreementId, 
/* 101 */           TestData.VERSION_ID, 
/* 102 */           TestData.PARTICIPANT_EMAIL, 
/* 103 */           TestData.IMAGE_SIZE, 
/* 104 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENT_IMAGE_URLS), 
/* 105 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY));
/*     */     }
/* 107 */     catch (ApiException e) {
/* 108 */       Assert.assertTrue(e.getMessage(), 
/* 109 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidAgreementId() throws ApiException {
/*     */     try {
/* 123 */       agreementsApi.getCombinedDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 124 */           TestData.EMPTY_PARAM, 
/* 125 */           TestData.VERSION_ID, 
/* 126 */           TestData.PARTICIPANT_EMAIL, 
/* 127 */           TestData.IMAGE_SIZE, 
/* 128 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENT_IMAGE_URLS), 
/* 129 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY));
/*     */     }
/* 131 */     catch (ApiException e) {
/* 132 */       Assert.assertTrue(e.getMessage(), 
/* 133 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 137 */       agreementsApi.getCombinedDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 138 */           TestData.NULL_PARAM, 
/* 139 */           TestData.VERSION_ID, 
/* 140 */           TestData.PARTICIPANT_EMAIL, 
/* 141 */           TestData.IMAGE_SIZE, 
/* 142 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENT_IMAGE_URLS), 
/* 143 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY));
/*     */     }
/* 145 */     catch (ApiException e) {
/* 146 */       Assert.assertTrue(e.getMessage(), 
/* 147 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   
/*     */   @Test
/*     */   public void testInvalidVersionId() throws ApiException {
/*     */     try {
/* 162 */       agreementsApi.getCombinedDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 163 */           agreementId, 
/* 164 */           TestData.EMPTY_PARAM, 
/* 165 */           TestData.PARTICIPANT_EMAIL, 
/* 166 */           TestData.IMAGE_SIZE, 
/* 167 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENT_IMAGE_URLS), 
/* 168 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY));
/*     */     }
/* 170 */     catch (ApiException e) {
/* 171 */       Assert.assertTrue(e.getMessage(), 
/* 172 */           SdkErrorCodes.INVALID_VERSION_ID.getApiCode().equals(e.getApiCode()));
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
/* 185 */       agreementsApi.getCombinedDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 186 */           agreementId, 
/* 187 */           TestData.VERSION_ID, 
/* 188 */           TestData.EMPTY_PARAM, 
/* 189 */           TestData.IMAGE_SIZE, 
/* 190 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENT_IMAGE_URLS), 
/* 191 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY));
/*     */     }
/* 193 */     catch (ApiException e) {
/* 194 */       Assert.assertTrue(e.getMessage(), 
/* 195 */           SdkErrorCodes.INVALID_PARTICIPANT.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testCombinedDocumentImageUrls() throws ApiException {
/*     */     try {
/* 208 */       DocumentImageUrls documentImageUrls = agreementsApi.getCombinedDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 209 */           agreementId, 
/* 210 */           TestData.VERSION_ID, 
/* 211 */           TestData.PARTICIPANT_EMAIL, 
/* 212 */           TestData.IMAGE_SIZE, 
/* 213 */           Boolean.valueOf(TestData.INCLUDE_SUPPORTING_DOCUMENT_IMAGE_URLS), 
/* 214 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY));
/* 215 */       Assert.assertNotNull(documentImageUrls);
/*     */     }
/* 217 */     catch (ApiException e) {
/* 218 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementDocumentsImageUrlsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */