/*     */ package com.adobe.sign.api.OAuth;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.OAuthApi;
/*     */ import com.adobe.sign.model.oAuth.AccessTokenRefreshRequest;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.OAuthUtil;
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
/*     */ public class RefreshAccessTokenTest
/*     */ {
/*  34 */   private static OAuthApi oAuthApi = null;
/*  35 */   private static String REFRESH_TOKEN = "refreshToken";
/*     */ 
/*     */ 
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() {
/*  41 */     ApiUtils.configureProperty();
/*  42 */     oAuthApi = OAuthUtil.getoAuthApi();
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
/*     */   public void testInvalidClientId() throws ApiException {
/*  54 */     AccessTokenRefreshRequest accessTokenRefreshRequest = new AccessTokenRefreshRequest(TestData.NULL_PARAM, 
/*  55 */         TestData.CLIENT_SECRET, 
/*  56 */         REFRESH_TOKEN, 
/*  57 */         TestData.REFRESH_TOKEN_GRANT_TYPE);
/*     */     try {
/*  59 */       oAuthApi.refreshAccessToken(accessTokenRefreshRequest);
/*  60 */     } catch (ApiException e) {
/*  61 */       Assert.assertTrue(e.getMessage(), 
/*  62 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidClientSecret() throws ApiException {
/*  75 */     AccessTokenRefreshRequest accessTokenRefreshRequest = new AccessTokenRefreshRequest(TestData.CLIENT_ID, 
/*  76 */         TestData.NULL_PARAM, 
/*  77 */         REFRESH_TOKEN, 
/*  78 */         TestData.REFRESH_TOKEN_GRANT_TYPE);
/*     */     try {
/*  80 */       oAuthApi.refreshAccessToken(accessTokenRefreshRequest);
/*  81 */     } catch (ApiException e) {
/*  82 */       Assert.assertTrue(e.getMessage(), 
/*  83 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidGrantType() throws ApiException {
/*  96 */     AccessTokenRefreshRequest accessTokenRefreshRequest = new AccessTokenRefreshRequest(TestData.CLIENT_ID, 
/*  97 */         TestData.CLIENT_SECRET, 
/*  98 */         REFRESH_TOKEN, 
/*  99 */         TestData.NULL_PARAM);
/*     */     try {
/* 101 */       oAuthApi.refreshAccessToken(accessTokenRefreshRequest);
/* 102 */     } catch (ApiException e) {
/* 103 */       Assert.assertTrue(e.getMessage(), 
/* 104 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidRefreshToken() throws ApiException {
/* 117 */     AccessTokenRefreshRequest accessTokenRefreshRequest = new AccessTokenRefreshRequest(TestData.CLIENT_ID, 
/* 118 */         TestData.CLIENT_SECRET, 
/* 119 */         TestData.NULL_PARAM, 
/* 120 */         TestData.REFRESH_TOKEN_GRANT_TYPE);
/*     */     try {
/* 122 */       oAuthApi.refreshAccessToken(accessTokenRefreshRequest);
/* 123 */     } catch (ApiException e) {
/* 124 */       Assert.assertTrue(e.getMessage(), 
/* 125 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\OAuth\RefreshAccessTokenTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */