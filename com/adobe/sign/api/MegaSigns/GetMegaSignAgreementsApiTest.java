/*     */ package com.adobe.sign.api.MegaSigns;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.MegaSignsApi;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignChildAgreements;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.MegaSignUtils;
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
/*     */ public class GetMegaSignAgreementsApiTest
/*     */ {
/*  38 */   private static MegaSignsApi megaSignsApi = null;
/*  39 */   private static String megaSignId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  43 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  47 */     ApiUtils.configureProperty();
/*  48 */     megaSignId = MegaSignUtils.getResourceId(TestData.MEGASIGN_NAME);
/*  49 */     megaSignsApi = MegaSignUtils.getMegaSignsApi();
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
/*  63 */       megaSignsApi.getMegaSignChildAgreements(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  64 */           megaSignId);
/*     */     }
/*  66 */     catch (ApiException e) {
/*  67 */       Assert.assertTrue(e.getMessage(), 
/*  68 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  72 */       megaSignsApi.getMegaSignChildAgreements(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  73 */           megaSignId);
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
/*  90 */       megaSignsApi.getMegaSignChildAgreements(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  91 */           megaSignId);
/*     */     }
/*  93 */     catch (ApiException e) {
/*  94 */       Assert.assertTrue(e.getMessage(), 
/*  95 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidMegaSignId() throws ApiException {
/*     */     try {
/* 108 */       megaSignsApi.getMegaSignChildAgreements(ApiUtils.getValidHeaderParams(), 
/* 109 */           TestData.EMPTY_PARAM);
/*     */     }
/* 111 */     catch (ApiException e) {
/* 112 */       Assert.assertTrue(e.getMessage(), 
/* 113 */           SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 117 */       megaSignsApi.getMegaSignChildAgreements(ApiUtils.getValidHeaderParams(), 
/* 118 */           TestData.NULL_PARAM);
/*     */     }
/* 120 */     catch (ApiException e) {
/* 121 */       Assert.assertTrue(e.getMessage(), 
/* 122 */           SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetAgreement() throws ApiException {
/*     */     try {
/* 135 */       MegaSignChildAgreements megaSignChildAgreements = megaSignsApi.getMegaSignChildAgreements(ApiUtils.getValidHeaderParams(), 
/* 136 */           megaSignId);
/* 137 */       Assert.assertNotNull(megaSignChildAgreements);
/*     */     }
/* 139 */     catch (ApiException e) {
/* 140 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\MegaSigns\GetMegaSignAgreementsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */