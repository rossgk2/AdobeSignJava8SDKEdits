/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.DocumentImageUrl;
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
/*     */ public class GetAgreementDocumentImageUrlsApiTest
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
/*  63 */       agreementsApi.getDocumentImageUrls(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  64 */           agreementId, 
/*  65 */           documentId, 
/*  66 */           TestData.VERSION_ID, 
/*  67 */           TestData.PARTICIPANT_EMAIL, 
/*  68 */           TestData.IMAGE_SIZE, 
/*  69 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY), 
/*  70 */           Integer.valueOf(TestData.START_PAGE), 
/*  71 */           Integer.valueOf(TestData.END_PAGE));
/*     */     }
/*  73 */     catch (ApiException e) {
/*  74 */       Assert.assertTrue(e.getMessage(), 
/*  75 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  79 */       agreementsApi.getDocumentImageUrls(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  80 */           agreementId, 
/*  81 */           documentId, 
/*  82 */           TestData.VERSION_ID, 
/*  83 */           TestData.PARTICIPANT_EMAIL, 
/*  84 */           TestData.IMAGE_SIZE, 
/*  85 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY), 
/*  86 */           Integer.valueOf(TestData.START_PAGE), 
/*  87 */           Integer.valueOf(TestData.END_PAGE));
/*     */     }
/*  89 */     catch (ApiException e) {
/*  90 */       Assert.assertTrue(e.getMessage(), 
/*  91 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/* 104 */       agreementsApi.getDocumentImageUrls(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 105 */           agreementId, 
/* 106 */           documentId, 
/* 107 */           TestData.VERSION_ID, 
/* 108 */           TestData.PARTICIPANT_EMAIL, 
/* 109 */           TestData.IMAGE_SIZE, 
/* 110 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY), 
/* 111 */           Integer.valueOf(TestData.START_PAGE), 
/* 112 */           Integer.valueOf(TestData.END_PAGE));
/*     */     }
/* 114 */     catch (ApiException e) {
/* 115 */       Assert.assertTrue(e.getMessage(), 
/* 116 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 130 */       agreementsApi.getDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 131 */           TestData.EMPTY_PARAM, 
/* 132 */           documentId, 
/* 133 */           TestData.VERSION_ID, 
/* 134 */           TestData.PARTICIPANT_EMAIL, 
/* 135 */           TestData.IMAGE_SIZE, 
/* 136 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY), 
/* 137 */           Integer.valueOf(TestData.START_PAGE), 
/* 138 */           Integer.valueOf(TestData.END_PAGE));
/*     */     }
/* 140 */     catch (ApiException e) {
/* 141 */       Assert.assertTrue(e.getMessage(), 
/* 142 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 146 */       agreementsApi.getDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 147 */           TestData.NULL_PARAM, 
/* 148 */           documentId, 
/* 149 */           TestData.VERSION_ID, 
/* 150 */           TestData.PARTICIPANT_EMAIL, 
/* 151 */           TestData.IMAGE_SIZE, 
/* 152 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY), 
/* 153 */           Integer.valueOf(TestData.START_PAGE), 
/* 154 */           Integer.valueOf(TestData.END_PAGE));
/*     */     }
/* 156 */     catch (ApiException e) {
/* 157 */       Assert.assertTrue(e.getMessage(), 
/* 158 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidDocumentId() throws ApiException {
/*     */     try {
/* 172 */       agreementsApi.getDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 173 */           agreementId, 
/* 174 */           TestData.EMPTY_PARAM, 
/* 175 */           TestData.VERSION_ID, 
/* 176 */           TestData.PARTICIPANT_EMAIL, 
/* 177 */           TestData.IMAGE_SIZE, 
/* 178 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY), 
/* 179 */           Integer.valueOf(TestData.START_PAGE), 
/* 180 */           Integer.valueOf(TestData.END_PAGE));
/*     */     }
/* 182 */     catch (ApiException e) {
/* 183 */       Assert.assertTrue(e.getMessage(), 
/* 184 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 188 */       agreementsApi.getDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 189 */           agreementId, 
/* 190 */           TestData.NULL_PARAM, 
/* 191 */           TestData.VERSION_ID, 
/* 192 */           TestData.PARTICIPANT_EMAIL, 
/* 193 */           TestData.IMAGE_SIZE, 
/* 194 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY), 
/* 195 */           Integer.valueOf(TestData.START_PAGE), 
/* 196 */           Integer.valueOf(TestData.END_PAGE));
/*     */     }
/* 198 */     catch (ApiException e) {
/* 199 */       Assert.assertTrue(e.getMessage(), 
/* 200 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidVersionId() throws ApiException {
/*     */     try {
/* 214 */       agreementsApi.getDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 215 */           agreementId, 
/* 216 */           documentId, 
/* 217 */           TestData.EMPTY_PARAM, 
/* 218 */           TestData.PARTICIPANT_EMAIL, 
/* 219 */           TestData.IMAGE_SIZE, 
/* 220 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY), 
/* 221 */           Integer.valueOf(TestData.START_PAGE), 
/* 222 */           Integer.valueOf(TestData.END_PAGE));
/*     */     }
/* 224 */     catch (ApiException e) {
/* 225 */       Assert.assertTrue(e.getMessage(), 
/* 226 */           SdkErrorCodes.INVALID_VERSION_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidParticipantEmail() throws ApiException {
/*     */     try {
/* 240 */       agreementsApi.getDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 241 */           agreementId, 
/* 242 */           documentId, 
/* 243 */           TestData.VERSION_ID, 
/* 244 */           TestData.EMPTY_PARAM, 
/* 245 */           TestData.IMAGE_SIZE, 
/* 246 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY), 
/* 247 */           Integer.valueOf(TestData.START_PAGE), 
/* 248 */           Integer.valueOf(TestData.END_PAGE));
/*     */     }
/* 250 */     catch (ApiException e) {
/* 251 */       Assert.assertTrue(e.getMessage(), 
/* 252 */           SdkErrorCodes.INVALID_PARTICIPANT.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testDocumentImageUrls() throws ApiException {
/*     */     try {
/* 266 */       DocumentImageUrl documentImageUrl = agreementsApi.getDocumentImageUrls(ApiUtils.getValidHeaderParams(), 
/* 267 */           agreementId, 
/* 268 */           documentId, 
/* 269 */           TestData.VERSION_ID, 
/* 270 */           TestData.PARTICIPANT_EMAIL, 
/* 271 */           TestData.IMAGE_SIZE, 
/* 272 */           Boolean.valueOf(TestData.SHOW_IMAGE_AVAILIBILITY), 
/* 273 */           Integer.valueOf(TestData.START_PAGE), 
/* 274 */           Integer.valueOf(TestData.END_PAGE));
/* 275 */       Assert.assertNotNull(documentImageUrl);
/*     */     }
/* 277 */     catch (ApiException e) {
/* 278 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementDocumentImageUrlsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */