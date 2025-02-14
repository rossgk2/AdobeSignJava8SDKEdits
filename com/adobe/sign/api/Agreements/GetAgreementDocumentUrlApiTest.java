/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.DocumentUrl;
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
/*     */ public class GetAgreementDocumentUrlApiTest
/*     */ {
/*  37 */   private static AgreementsApi agreementsApi = null;
/*  38 */   private static String agreementId = null;
/*  39 */   private static String documentId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  43 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  47 */     ApiUtils.configureProperty();
/*  48 */     agreementsApi = AgreementsUtils.getAgreementsApi();
/*  49 */     agreementId = AgreementsUtils.getResourceId(TestData.AGREEMENT_NAME);
/*  50 */     documentId = AgreementsUtils.getDocumentId();
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
/*  63 */       agreementsApi.getDocumentUrl(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  64 */           agreementId, 
/*  65 */           documentId, 
/*  66 */           TestData.VERSION_ID, 
/*  67 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/*  69 */     catch (ApiException e) {
/*  70 */       Assert.assertTrue(e.getMessage(), 
/*  71 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  75 */       agreementsApi.getDocumentUrl(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  76 */           agreementId, 
/*  77 */           documentId, 
/*  78 */           TestData.VERSION_ID, 
/*  79 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/*  81 */     catch (ApiException e) {
/*  82 */       Assert.assertTrue(e.getMessage(), 
/*  83 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  96 */       agreementsApi.getDocumentUrl(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  97 */           agreementId, 
/*  98 */           documentId, 
/*  99 */           TestData.VERSION_ID, 
/* 100 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/* 102 */     catch (ApiException e) {
/* 103 */       Assert.assertTrue(e.getMessage(), 
/* 104 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 117 */       agreementsApi.getDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 118 */           TestData.EMPTY_PARAM, 
/* 119 */           documentId, 
/* 120 */           TestData.VERSION_ID, 
/* 121 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/* 123 */     catch (ApiException e) {
/* 124 */       Assert.assertTrue(e.getMessage(), 
/* 125 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 129 */       agreementsApi.getDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 130 */           TestData.NULL_PARAM, 
/* 131 */           documentId, 
/* 132 */           TestData.VERSION_ID, 
/* 133 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/* 135 */     catch (ApiException e) {
/* 136 */       Assert.assertTrue(e.getMessage(), 
/* 137 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
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
/* 150 */       agreementsApi.getDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 151 */           agreementId, 
/* 152 */           TestData.EMPTY_PARAM, 
/* 153 */           TestData.VERSION_ID, 
/* 154 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/* 156 */     catch (ApiException e) {
/* 157 */       Assert.assertTrue(e.getMessage(), 
/* 158 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 162 */       agreementsApi.getDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 163 */           agreementId, 
/* 164 */           TestData.NULL_PARAM, 
/* 165 */           TestData.VERSION_ID, 
/* 166 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/* 168 */     catch (ApiException e) {
/* 169 */       Assert.assertTrue(e.getMessage(), 
/* 170 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
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
/* 183 */       agreementsApi.getDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 184 */           agreementId, 
/* 185 */           documentId, 
/* 186 */           TestData.EMPTY_PARAM, 
/* 187 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/* 189 */     catch (ApiException e) {
/* 190 */       Assert.assertTrue(e.getMessage(), 
/* 191 */           SdkErrorCodes.INVALID_VERSION_ID.getApiCode().equals(e.getApiCode()));
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
/* 204 */       agreementsApi.getDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 205 */           agreementId, 
/* 206 */           documentId, 
/* 207 */           TestData.VERSION_ID, 
/* 208 */           TestData.EMPTY_PARAM);
/*     */     }
/* 210 */     catch (ApiException e) {
/* 211 */       Assert.assertTrue(e.getMessage(), 
/* 212 */           SdkErrorCodes.INVALID_PARTICIPANT.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testDocumentUrl() throws ApiException {
/*     */     try {
/* 225 */       DocumentUrl documentUrl = agreementsApi.getDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 226 */           agreementId, 
/* 227 */           documentId, 
/* 228 */           TestData.VERSION_ID, 
/* 229 */           TestData.PARTICIPANT_EMAIL);
/* 230 */       Assert.assertNotNull(documentUrl);
/*     */     }
/* 232 */     catch (ApiException e) {
/* 233 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementDocumentUrlApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */