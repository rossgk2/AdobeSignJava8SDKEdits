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
/*     */ public class GetAgreementCombinedDocUrlApiTest
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
/*  61 */       agreementsApi.getCombinedDocumentUrl(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  62 */           agreementId, 
/*  63 */           TestData.VERSION_ID, 
/*  64 */           TestData.PARTICIPANT_EMAIL, 
/*  65 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/*  66 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/*  68 */     catch (ApiException e) {
/*  69 */       Assert.assertTrue(e.getMessage(), 
/*  70 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  74 */       agreementsApi.getCombinedDocumentUrl(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  75 */           agreementId, 
/*  76 */           TestData.VERSION_ID, 
/*  77 */           TestData.PARTICIPANT_EMAIL, 
/*  78 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/*  79 */           Boolean.valueOf(TestData.AUDIT_REPORT));
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
/*     */   
/*     */   @Test
/*     */   public void testInvalidXApiUser() throws ApiException {
/*     */     try {
/*  97 */       agreementsApi.getCombinedDocumentUrl(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  98 */           agreementId, 
/*  99 */           TestData.VERSION_ID, 
/* 100 */           TestData.PARTICIPANT_EMAIL, 
/* 101 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/* 102 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 104 */     catch (ApiException e) {
/* 105 */       Assert.assertTrue(e.getMessage(), 
/* 106 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 119 */       agreementsApi.getCombinedDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 120 */           TestData.EMPTY_PARAM, 
/* 121 */           TestData.VERSION_ID, 
/* 122 */           TestData.PARTICIPANT_EMAIL, 
/* 123 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/* 124 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 126 */     catch (ApiException e) {
/* 127 */       Assert.assertTrue(e.getMessage(), 
/* 128 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 132 */       agreementsApi.getCombinedDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 133 */           TestData.NULL_PARAM, 
/* 134 */           TestData.VERSION_ID, 
/* 135 */           TestData.PARTICIPANT_EMAIL, 
/* 136 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/* 137 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 139 */     catch (ApiException e) {
/* 140 */       Assert.assertTrue(e.getMessage(), 
/* 141 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
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
/* 154 */       agreementsApi.getCombinedDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 155 */           agreementId, 
/* 156 */           TestData.EMPTY_PARAM, 
/* 157 */           TestData.PARTICIPANT_EMAIL, 
/* 158 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/* 159 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 161 */     catch (ApiException e) {
/* 162 */       Assert.assertTrue(e.getMessage(), 
/* 163 */           SdkErrorCodes.INVALID_VERSION_ID.getApiCode().equals(e.getApiCode()));
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
/* 176 */       agreementsApi.getCombinedDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 177 */           agreementId, 
/* 178 */           TestData.NULL_PARAM, 
/* 179 */           TestData.VERSION_ID, 
/* 180 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/* 181 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 183 */     catch (ApiException e) {
/* 184 */       Assert.assertTrue(e.getMessage(), 
/* 185 */           SdkErrorCodes.INVALID_PARTICIPANT.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetCombinedDocumentUrl() throws ApiException {
/*     */     try {
/* 199 */       DocumentUrl documentUrl = agreementsApi.getCombinedDocumentUrl(ApiUtils.getValidHeaderParams(), 
/* 200 */           agreementId, 
/* 201 */           TestData.VERSION_ID, 
/* 202 */           TestData.PARTICIPANT_EMAIL, 
/* 203 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/* 204 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/* 205 */       Assert.assertNotNull(documentUrl);
/*     */     }
/* 207 */     catch (ApiException e) {
/* 208 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementCombinedDocUrlApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */