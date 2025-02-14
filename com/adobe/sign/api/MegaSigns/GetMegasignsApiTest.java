/*     */ package com.adobe.sign.api.MegaSigns;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.MegaSignsApi;
/*     */ import com.adobe.sign.model.megaSigns.MegaSigns;
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
/*     */ public class GetMegasignsApiTest
/*     */ {
/*  38 */   private static MegaSignsApi megaSignsApi = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  42 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  46 */     ApiUtils.configureProperty();
/*  47 */     megaSignsApi = MegaSignUtils.getMegaSignsApi();
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
/*  60 */       megaSignsApi.getMegaSigns(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  61 */           TestData.MEGASIGN_QUERY);
/*     */     }
/*  63 */     catch (ApiException e) {
/*  64 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  68 */       megaSignsApi.getMegaSigns(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  69 */           TestData.MEGASIGN_QUERY);
/*     */     }
/*  71 */     catch (ApiException e) {
/*  72 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  85 */       megaSignsApi.getMegaSigns(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  86 */           TestData.MEGASIGN_QUERY);
/*     */     }
/*  88 */     catch (ApiException e) {
/*  89 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testMegaSigns() throws ApiException {
/*     */     try {
/* 102 */       MegaSigns megaSigns = megaSignsApi.getMegaSigns(ApiUtils.getValidHeaderParams(), 
/* 103 */           TestData.MEGASIGN_QUERY);
/* 104 */       Assert.assertNotNull(megaSigns);
/*     */     }
/* 106 */     catch (ApiException e) {
/* 107 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\MegaSigns\GetMegasignsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */