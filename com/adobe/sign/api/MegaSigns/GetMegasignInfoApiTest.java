/*     */ package com.adobe.sign.api.MegaSigns;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.MegaSignsApi;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignInfo;
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
/*     */ public class GetMegasignInfoApiTest
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
/*     */   @Test
/*     */   public void testNullAndEmptyAccessToken() throws ApiException {
/*     */     try {
/*  62 */       megaSignsApi.getMegaSignInfo(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  63 */           megaSignId);
/*     */     }
/*  65 */     catch (ApiException e) {
/*  66 */       Assert.assertTrue(e.getMessage(), 
/*  67 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  71 */       megaSignsApi.getMegaSignInfo(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  72 */           megaSignId);
/*     */     }
/*  74 */     catch (ApiException e) {
/*  75 */       Assert.assertTrue(e.getMessage(), 
/*  76 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  89 */       megaSignsApi.getMegaSignInfo(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  90 */           megaSignId);
/*     */     }
/*  92 */     catch (ApiException e) {
/*  93 */       Assert.assertTrue(e.getMessage(), 
/*  94 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 107 */       megaSignsApi.getMegaSignInfo(ApiUtils.getValidHeaderParams(), 
/* 108 */           TestData.EMPTY_PARAM);
/*     */     }
/* 110 */     catch (ApiException e) {
/* 111 */       Assert.assertTrue(e.getMessage(), 
/* 112 */           SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 116 */       megaSignsApi.getMegaSignInfo(ApiUtils.getValidHeaderParams(), 
/* 117 */           TestData.NULL_PARAM);
/*     */     }
/* 119 */     catch (ApiException e) {
/* 120 */       Assert.assertTrue(e.getMessage(), 
/* 121 */           SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testMegaSignInfo() throws ApiException {
/*     */     try {
/* 134 */       MegaSignInfo megaSignInfo = megaSignsApi.getMegaSignInfo(ApiUtils.getValidHeaderParams(), 
/* 135 */           megaSignId);
/* 136 */       Assert.assertNotNull(megaSignInfo);
/* 137 */       Assert.assertNotNull(megaSignInfo.getMegaSignId());
/*     */     }
/* 139 */     catch (ApiException e) {
/* 140 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\MegaSigns\GetMegasignInfoApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */