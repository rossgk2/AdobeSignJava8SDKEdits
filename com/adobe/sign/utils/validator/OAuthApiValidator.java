/*     */ package com.adobe.sign.utils.validator;
/*     */ import java.util.ArrayList;

/*     */ 
/*     */ import com.adobe.sign.model.oAuth.AccessTokenRefreshRequest;
/*     */ import com.adobe.sign.model.oAuth.AccessTokenRequest;
/*     */ import com.adobe.sign.model.oAuth.AuthorizationRequest;
/*     */ import com.adobe.sign.model.oAuth.Token;
/*     */ import com.adobe.sign.utils.ApiException;
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
/*     */ 
/*     */ 
/*     */ public class OAuthApiValidator
/*     */ {
/*     */   public static void getAuthorizationUrlValidator(AuthorizationRequest authorizationRequest) throws ApiException {
/*  36 */     ApiValidatorHelper.validateParameter(authorizationRequest);
/*     */     
/*  38 */     ArrayList<String> parameterList = new ArrayList<>();
/*  39 */     parameterList.add(authorizationRequest.getClientId());
/*  40 */     parameterList.add(authorizationRequest.getRedirectUri());
/*     */     
/*  42 */     ApiValidatorHelper.validateRequiredParameters(parameterList);
/*  43 */     ApiValidatorHelper.validateParameter(authorizationRequest.getScopes());
/*  44 */     validateRedirectUri(authorizationRequest.getRedirectUri());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getAccessTokenValidator(AccessTokenRequest accessTokenRequest) throws ApiException {
/*  54 */     ApiValidatorHelper.validateParameter(accessTokenRequest);
/*     */     
/*  56 */     ArrayList<String> parameterList = new ArrayList<>();
/*  57 */     parameterList.add(accessTokenRequest.getClientId());
/*  58 */     parameterList.add(accessTokenRequest.getClientSecret());
/*  59 */     parameterList.add(accessTokenRequest.getCode());
/*  60 */     parameterList.add(accessTokenRequest.getGrantType());
/*     */     
/*  62 */     ApiValidatorHelper.validateRequiredParameters(parameterList);
/*  63 */     validateRedirectUri(accessTokenRequest.getRedirectUri());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void refreshAccessTokenValidator(AccessTokenRefreshRequest accessTokenRefreshRequest) throws ApiException {
/*  73 */     ApiValidatorHelper.validateParameter(accessTokenRefreshRequest);
/*     */     
/*  75 */     ArrayList<String> parameterList = new ArrayList<>();
/*  76 */     parameterList.add(accessTokenRefreshRequest.getClientId());
/*  77 */     parameterList.add(accessTokenRefreshRequest.getClientSecret());
/*  78 */     parameterList.add(accessTokenRefreshRequest.getRefreshToken());
/*  79 */     parameterList.add(accessTokenRefreshRequest.getGrantType());
/*     */     
/*  81 */     ApiValidatorHelper.validateRequiredParameters(parameterList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void revokeTokenValidator(Token token) throws ApiException {
/*  91 */     ApiValidatorHelper.validateParameter(token);
/*     */     
/*  93 */     ApiValidatorHelper.validateParameter(token.getToken(), 
/*  94 */         SdkErrorCodes.MISSING_REQUIRED_PARAM);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validateRedirectUri(String redirectUri) throws ApiException {
/* 104 */     ApiValidatorHelper.validateParameter(redirectUri, 
/* 105 */         SdkErrorCodes.MISSING_REQUIRED_PARAM);
/* 106 */     ApiValidatorHelper.validateUrlParameter(redirectUri, 
/* 107 */         SdkErrorCodes.INVALID_REQUEST);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\OAuthApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */