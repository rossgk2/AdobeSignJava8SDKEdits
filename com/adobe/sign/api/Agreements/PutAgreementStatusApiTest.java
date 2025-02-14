/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.AgreementStatusUpdateInfo;
/*     */ import com.adobe.sign.model.agreements.AgreementStatusUpdateResponse;
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
/*     */ public class PutAgreementStatusApiTest
/*     */ {
/*  38 */   private static AgreementsApi agreementsApi = null;
/*  39 */   private static String agreementId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  43 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  47 */     ApiUtils.configureProperty();
/*  48 */     agreementsApi = AgreementsUtils.getAgreementsApi();
/*  49 */     agreementId = AgreementsUtils.createAgreement(ApiUtils.getAgreementName());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testNullAndEmptyAccessToken() throws ApiException {
/*  60 */     AgreementStatusUpdateInfo updateInfo = new AgreementStatusUpdateInfo();
/*  61 */     updateInfo.setValue(AgreementStatusUpdateInfo.ValueEnum.CANCEL);
/*     */     
/*     */     try {
/*  64 */       agreementsApi.updateStatus(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  65 */           agreementId, 
/*  66 */           updateInfo);
/*     */     }
/*  68 */     catch (ApiException e) {
/*  69 */       Assert.assertTrue(e.getMessage(), 
/*  70 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  74 */       agreementsApi.updateStatus(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  75 */           agreementId, 
/*  76 */           updateInfo);
/*     */     }
/*  78 */     catch (ApiException e) {
/*  79 */       Assert.assertTrue(e.getMessage(), 
/*  80 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  92 */     AgreementStatusUpdateInfo updateInfo = new AgreementStatusUpdateInfo();
/*  93 */     updateInfo.setValue(AgreementStatusUpdateInfo.ValueEnum.CANCEL);
/*     */     
/*     */     try {
/*  96 */       agreementsApi.updateStatus(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  97 */           agreementId, 
/*  98 */           updateInfo);
/*     */     }
/* 100 */     catch (ApiException e) {
/* 101 */       Assert.assertTrue(e.getMessage(), 
/* 102 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testInvalidAgreementId() throws ApiException {
/* 113 */     AgreementStatusUpdateInfo updateInfo = new AgreementStatusUpdateInfo();
/* 114 */     updateInfo.setValue(AgreementStatusUpdateInfo.ValueEnum.CANCEL);
/*     */     
/*     */     try {
/* 117 */       agreementsApi.updateStatus(ApiUtils.getValidHeaderParams(), 
/* 118 */           TestData.EMPTY_PARAM, 
/* 119 */           updateInfo);
/*     */     }
/* 121 */     catch (ApiException e) {
/* 122 */       Assert.assertTrue(e.getMessage(), 
/* 123 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 127 */       agreementsApi.updateStatus(ApiUtils.getValidHeaderParams(), 
/* 128 */           TestData.NULL_PARAM, 
/* 129 */           updateInfo);
/*     */     }
/* 131 */     catch (ApiException e) {
/* 132 */       Assert.assertTrue(e.getMessage(), 
/* 133 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidAgreementStatus() throws ApiException {
/*     */     try {
/* 147 */       agreementsApi.updateStatus(ApiUtils.getValidHeaderParams(), 
/* 148 */           agreementId, 
/* 149 */           null);
/*     */     }
/* 151 */     catch (ApiException e) {
/* 152 */       Assert.assertTrue(e.getMessage(), 
/* 153 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 156 */     AgreementStatusUpdateInfo updateInfo = new AgreementStatusUpdateInfo();
/* 157 */     updateInfo.setValue(null);
/*     */     
/*     */     try {
/* 160 */       agreementsApi.updateStatus(ApiUtils.getValidHeaderParams(), 
/* 161 */           agreementId, 
/* 162 */           updateInfo);
/*     */     }
/* 164 */     catch (ApiException e) {
/* 165 */       Assert.assertTrue(e.getMessage(), 
/* 166 */           SdkErrorCodes.MUST_PROVIDE_VALID_AGREEMENT_STATUS.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void testUpdateStatus() throws ApiException {
/* 174 */     AgreementStatusUpdateInfo updateInfo = new AgreementStatusUpdateInfo();
/* 175 */     updateInfo.setValue(AgreementStatusUpdateInfo.ValueEnum.CANCEL);
/*     */     
/*     */     try {
/* 178 */       AgreementStatusUpdateResponse response = agreementsApi.updateStatus(ApiUtils.getValidHeaderParams(), 
/* 179 */           agreementId, 
/* 180 */           updateInfo);
/* 181 */       Assert.assertNotNull(response);
/*     */     }
/* 183 */     catch (ApiException e) {
/* 184 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\PutAgreementStatusApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */