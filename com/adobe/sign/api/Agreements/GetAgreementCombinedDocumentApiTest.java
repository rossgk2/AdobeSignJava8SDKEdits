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
/*     */ 
/*     */ public class GetAgreementCombinedDocumentApiTest
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
/*     */   
/*     */   @Test
/*     */   public void testNullAndEmptyAccessToken() throws ApiException {
/*     */     try {
/*  62 */       agreementsApi.getCombinedDocument(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  63 */           agreementId, 
/*  64 */           TestData.VERSION_ID, 
/*  65 */           TestData.PARTICIPANT_EMAIL, 
/*  66 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/*  67 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/*  69 */     catch (ApiException e) {
/*  70 */       Assert.assertTrue(e.getMessage(), 
/*  71 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  75 */       agreementsApi.getCombinedDocument(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  76 */           agreementId, 
/*  77 */           TestData.VERSION_ID, 
/*  78 */           TestData.PARTICIPANT_EMAIL, 
/*  79 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/*  80 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/*  82 */     catch (ApiException e) {
/*  83 */       Assert.assertTrue(e.getMessage(), 
/*  84 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  97 */       agreementsApi.getCombinedDocument(ApiUtils.getEmptyXApiUserHeaderParams(), 
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
/* 119 */       agreementsApi.getCombinedDocument(ApiUtils.getValidHeaderParams(), 
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
/* 132 */       agreementsApi.getCombinedDocument(ApiUtils.getValidHeaderParams(), 
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
/* 154 */       agreementsApi.getCombinedDocument(ApiUtils.getValidHeaderParams(), 
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
/* 176 */       agreementsApi.getCombinedDocument(ApiUtils.getValidHeaderParams(), 
/* 177 */           agreementId, 
/* 178 */           TestData.VERSION_ID, 
/* 179 */           TestData.EMPTY_PARAM, 
/* 180 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/* 181 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/* 182 */     } catch (ApiException e) {
/* 183 */       Assert.assertTrue(e.getMessage(), 
/* 184 */           SdkErrorCodes.INVALID_PARTICIPANT.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetCombinedDocument() throws ApiException {
/*     */     try {
/* 197 */       byte[] combinedDocument = agreementsApi.getCombinedDocument(ApiUtils.getValidHeaderParams(), 
/* 198 */           agreementId, 
/* 199 */           TestData.VERSION_ID, 
/* 200 */           TestData.PARTICIPANT_EMAIL, 
/* 201 */           Boolean.valueOf(TestData.ATTACH_SUPPORTING_DOCUMENTS), 
/* 202 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/* 203 */       Assert.assertNotNull(combinedDocument);
/*     */     }
/* 205 */     catch (ApiException e) {
/* 206 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\GetAgreementCombinedDocumentApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */