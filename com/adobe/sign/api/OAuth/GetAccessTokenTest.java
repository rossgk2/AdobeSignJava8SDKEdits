/*     */ package com.adobe.sign.api.OAuth;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.OAuthApi;
/*     */ import com.adobe.sign.model.oAuth.AccessTokenRequest;
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
/*     */ public class GetAccessTokenTest
/*     */ {
/*  34 */   private static OAuthApi oAuthApi = null;
/*  35 */   private static String CODE = "code";
/*     */ 
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() {
/*  40 */     ApiUtils.configureProperty();
/*  41 */     oAuthApi = OAuthUtil.getoAuthApi();
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
/*  53 */     AccessTokenRequest accessTokenRequest = new AccessTokenRequest(TestData.NULL_PARAM, 
/*  54 */         TestData.CLIENT_SECRET, 
/*  55 */         TestData.REDIRECT_URI, 
/*  56 */         CODE, 
/*  57 */         TestData.ACCESS_TOKEN_GRANT_TYPE);
/*     */     try {
/*  59 */       oAuthApi.getAccessToken(accessTokenRequest);
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
/*  75 */     AccessTokenRequest accessTokenRequest = new AccessTokenRequest(TestData.CLIENT_ID, 
/*  76 */         TestData.NULL_PARAM, 
/*  77 */         TestData.REDIRECT_URI, 
/*  78 */         CODE, 
/*  79 */         TestData.ACCESS_TOKEN_GRANT_TYPE);
/*     */     try {
/*  81 */       oAuthApi.getAccessToken(accessTokenRequest);
/*  82 */     } catch (ApiException e) {
/*  83 */       Assert.assertTrue(e.getMessage(), 
/*  84 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
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
/*  97 */     AccessTokenRequest accessTokenRequest = new AccessTokenRequest(TestData.CLIENT_ID, 
/*  98 */         TestData.CLIENT_SECRET, 
/*  99 */         TestData.REDIRECT_URI, 
/* 100 */         CODE, 
/* 101 */         TestData.NULL_PARAM);
/*     */     try {
/* 103 */       oAuthApi.getAccessToken(accessTokenRequest);
/* 104 */     } catch (ApiException e) {
/* 105 */       Assert.assertTrue(e.getMessage(), 
/* 106 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidRedirectUri() throws ApiException {
/* 120 */     AccessTokenRequest accessTokenRequest = new AccessTokenRequest(TestData.CLIENT_ID, 
/* 121 */         TestData.CLIENT_SECRET, 
/* 122 */         TestData.NULL_PARAM, 
/* 123 */         CODE, 
/* 124 */         TestData.ACCESS_TOKEN_GRANT_TYPE);
/*     */     try {
/* 126 */       oAuthApi.getAccessToken(accessTokenRequest);
/* 127 */     } catch (ApiException e) {
/* 128 */       Assert.assertTrue(e.getMessage(), 
/* 129 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/* 133 */     accessTokenRequest.setRedirectUri(TestData.INVALID_URL);
/*     */     try {
/* 135 */       oAuthApi.getAccessToken(accessTokenRequest);
/* 136 */     } catch (ApiException e) {
/* 137 */       Assert.assertTrue(e.getMessage(), 
/* 138 */           SdkErrorCodes.INVALID_REQUEST.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidCode() throws ApiException {
/* 150 */     AccessTokenRequest accessTokenRequest = new AccessTokenRequest(TestData.CLIENT_ID, 
/* 151 */         TestData.CLIENT_SECRET, 
/* 152 */         TestData.REDIRECT_URI, 
/* 153 */         TestData.NULL_PARAM, 
/* 154 */         TestData.ACCESS_TOKEN_GRANT_TYPE);
/*     */     try {
/* 156 */       oAuthApi.getAccessToken(accessTokenRequest);
/* 157 */     } catch (ApiException e) {
/* 158 */       Assert.assertTrue(e.getMessage(), 
/* 159 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\OAuth\GetAccessTokenTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */