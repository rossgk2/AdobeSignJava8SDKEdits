/*     */ package com.adobe.sign.api.OAuth;
/*     */ import java.util.ArrayList;

/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.OAuthApi;
/*     */ import com.adobe.sign.model.oAuth.AuthorizationRequest;
/*     */ import com.adobe.sign.model.oAuth.Scope;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GetAuthorizationUrlTest
/*     */ {
/*  39 */   private static OAuthApi oAuthApi = null;
/*  40 */   private static ArrayList<Scope> scopes = new ArrayList<>();
/*     */ 
/*     */ 
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() {
/*  46 */     ApiUtils.configureProperty();
/*  47 */     oAuthApi = OAuthUtil.getoAuthApi();
/*  48 */     scopes.add(new Scope("user_write", "account"));
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
/*  60 */     AuthorizationRequest authorizationRequest = new AuthorizationRequest(TestData.NULL_PARAM, 
/*  61 */         TestData.REDIRECT_URI, 
/*  62 */         scopes, 
/*  63 */         TestData.STATE, 
/*  64 */         TestData.RESPONSE_TYPE);
/*     */     try {
/*  66 */       oAuthApi.getAuthorizationUrl(authorizationRequest);
/*  67 */     } catch (ApiException e) {
/*  68 */       Assert.assertTrue(e.getMessage(), 
/*  69 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
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
/*     */   
/*     */   @Test
/*     */   public void testInvalidRedirectUri() throws ApiException {
/*  84 */     AuthorizationRequest authorizationRequest = new AuthorizationRequest(TestData.CLIENT_ID, 
/*  85 */         TestData.NULL_PARAM, 
/*  86 */         scopes, 
/*  87 */         TestData.STATE, 
/*  88 */         TestData.RESPONSE_TYPE);
/*     */     try {
/*  90 */       oAuthApi.getAuthorizationUrl(authorizationRequest);
/*  91 */     } catch (ApiException e) {
/*  92 */       Assert.assertTrue(e.getMessage(), 
/*  93 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/*  97 */     authorizationRequest.setRedirectUri(TestData.INVALID_URL);
/*     */     try {
/*  99 */       oAuthApi.getAuthorizationUrl(authorizationRequest);
/* 100 */     } catch (ApiException e) {
/* 101 */       Assert.assertTrue(e.getMessage(), 
/* 102 */           SdkErrorCodes.INVALID_REQUEST.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidScopes() throws ApiException {
/* 116 */     AuthorizationRequest authorizationRequest = new AuthorizationRequest(TestData.CLIENT_ID, 
/* 117 */         TestData.REDIRECT_URI, 
/* 118 */         null, 
/* 119 */         TestData.STATE, 
/* 120 */         TestData.RESPONSE_TYPE);
/*     */     try {
/* 122 */       oAuthApi.getAuthorizationUrl(authorizationRequest);
/* 123 */     } catch (ApiException e) {
/* 124 */       Assert.assertTrue(e.getMessage(), 
/* 125 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidResponseType() throws ApiException {
/* 138 */     AuthorizationRequest authorizationRequest = new AuthorizationRequest(TestData.CLIENT_ID, 
/* 139 */         TestData.REDIRECT_URI, 
/* 140 */         scopes, 
/* 141 */         TestData.STATE, 
/* 142 */         TestData.NULL_PARAM);
/*     */     try {
/* 144 */       oAuthApi.getAuthorizationUrl(authorizationRequest);
/* 145 */     } catch (ApiException e) {
/* 146 */       Assert.assertTrue(e.getMessage(), 
/* 147 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetAuthorizationUrl() throws ApiException {
/* 160 */     AuthorizationRequest authorizationRequest = new AuthorizationRequest(TestData.CLIENT_ID, 
/* 161 */         TestData.REDIRECT_URI, 
/* 162 */         scopes, 
/* 163 */         TestData.STATE, 
/* 164 */         TestData.RESPONSE_TYPE);
/*     */     try {
/* 166 */       String authorizationUrl = oAuthApi.getAuthorizationUrl(authorizationRequest);
/* 167 */       Assert.assertNotNull(authorizationUrl);
/*     */     }
/* 169 */     catch (ApiException e) {
/* 170 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\OAuth\GetAuthorizationUrlTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */