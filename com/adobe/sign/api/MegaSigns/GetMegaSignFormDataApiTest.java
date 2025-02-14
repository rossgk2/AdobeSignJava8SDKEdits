/*     */ package com.adobe.sign.api.MegaSigns;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.MegaSignsApi;
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
/*     */ public class GetMegaSignFormDataApiTest
/*     */ {
/*  37 */   private static MegaSignsApi megaSignsApi = null;
/*  38 */   private static String megaSignId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  42 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  46 */     ApiUtils.configureProperty();
/*  47 */     megaSignId = MegaSignUtils.getResourceId(TestData.MEGASIGN_NAME);
/*  48 */     megaSignsApi = MegaSignUtils.getMegaSignsApi();
/*     */   }
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testNullAndEmptyAccessToken() throws ApiException {
/*     */     try {
/*  55 */       megaSignsApi.getMegaSignFormData(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  56 */           megaSignId);
/*     */     }
/*  58 */     catch (ApiException e) {
/*  59 */       Assert.assertTrue(e.getMessage(), 
/*  60 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  64 */       megaSignsApi.getMegaSignFormData(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  65 */           megaSignId);
/*     */     }
/*  67 */     catch (ApiException e) {
/*  68 */       Assert.assertTrue(e.getMessage(), 
/*  69 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidXApiUser() throws ApiException {
/*     */     try {
/*  84 */       megaSignsApi.getMegaSignFormData(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  85 */           megaSignId);
/*     */     }
/*  87 */     catch (ApiException e) {
/*  88 */       Assert.assertTrue(e.getMessage(), 
/*  89 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidMegaSignId() throws ApiException {
/*     */     try {
/* 103 */       megaSignsApi.getMegaSignFormData(ApiUtils.getValidHeaderParams(), 
/* 104 */           TestData.EMPTY_PARAM);
/*     */     }
/* 106 */     catch (ApiException e) {
/* 107 */       Assert.assertTrue(e.getMessage(), 
/* 108 */           SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 112 */       megaSignsApi.getMegaSignFormData(ApiUtils.getValidHeaderParams(), 
/* 113 */           TestData.NULL_PARAM);
/*     */     }
/* 115 */     catch (ApiException e) {
/* 116 */       Assert.assertTrue(e.getMessage(), 
/* 117 */           SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetFormData() throws ApiException {
/*     */     try {
/* 131 */       byte[] megaSignFormData = megaSignsApi.getMegaSignFormData(ApiUtils.getValidHeaderParams(), 
/* 132 */           megaSignId);
/* 133 */       Assert.assertNotNull(megaSignFormData);
/*     */     }
/* 135 */     catch (ApiException e) {
/* 136 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\MegaSigns\GetMegaSignFormDataApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */