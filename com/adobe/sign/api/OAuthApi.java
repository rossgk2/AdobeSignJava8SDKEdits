/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;

/*     */ 
/*     */ import com.adobe.sign.model.oAuth.AccessTokenRefreshRequest;
/*     */ import com.adobe.sign.model.oAuth.AccessTokenRefreshResponse;
/*     */ import com.adobe.sign.model.oAuth.AccessTokenRequest;
/*     */ import com.adobe.sign.model.oAuth.AccessTokenResponse;
/*     */ import com.adobe.sign.model.oAuth.AuthorizationRequest;
/*     */ import com.adobe.sign.model.oAuth.Token;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.OAuthUtils;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.OAuthApiValidator;
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
/*     */ public class OAuthApi
/*     */ {
/*  38 */   private ApiClient apiClient = Context.getDefaultApiClient();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAuthorizationUrl(AuthorizationRequest authorizationRequest) throws ApiException {
/*  49 */     String baseUri = this.apiClient.getEnvHostName();
/*  50 */     String subPath = "/public/oauth";
/*     */ 
/*     */     
/*  53 */     OAuthApiValidator.getAuthorizationUrlValidator(authorizationRequest);
/*     */     
/*  55 */     String baseUrl = String.valueOf(baseUri) + subPath;
/*  56 */     return OAuthUtils.appendTo(baseUrl, authorizationRequest.getClientId(), authorizationRequest.getRedirectUri(), OAuthUtils.spaceDelimitedSet(authorizationRequest.getScopes()), authorizationRequest.getState(), authorizationRequest.getResponseType());
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
/*     */   public AccessTokenResponse getAccessToken(AccessTokenRequest accessTokenRequest) throws ApiException {
/*  69 */     OAuthApiValidator.getAccessTokenValidator(accessTokenRequest);
/*     */ 
/*     */     
/*  72 */     String path = "/oauth/token";
/*     */     
/*  74 */     Object postBody = null;
/*  75 */     byte[] postBinaryBody = null;
/*     */     
/*  77 */     Map<String, String> headerParams = new HashMap<>();
/*  78 */     List<String> acceptsList = new ArrayList<>();
/*  79 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/*  81 */     acceptsList.add("application/json");
/*     */     
/*  83 */     contentTypesList.add("application/x-www-form-urlencoded");
/*     */     
/*  85 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/*  87 */     Map<String, Object> formParams = new HashMap<>();
/*  88 */     formParams.put("code", accessTokenRequest.getCode());
/*  89 */     formParams.put("client_id", accessTokenRequest.getClientId());
/*  90 */     formParams.put("client_secret", accessTokenRequest.getClientSecret());
/*  91 */     formParams.put("redirect_uri", accessTokenRequest.getRedirectUri());
/*  92 */     formParams.put("grant_type", accessTokenRequest.getGrantType());
/*     */ 
/*     */     
/*  95 */     String[] accepts = new String[acceptsList.size()];
/*  96 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/*  98 */     String[] contentTypes = new String[contentTypesList.size()];
/*  99 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 101 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 103 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 105 */     TypeRef<AccessTokenResponse> returnType = new TypeRef<AccessTokenResponse>() {  };
/* 106 */     return (AccessTokenResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, false);
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
/*     */   public AccessTokenRefreshResponse refreshAccessToken(AccessTokenRefreshRequest accessTokenRefreshRequest) throws ApiException {
/* 119 */     OAuthApiValidator.refreshAccessTokenValidator(accessTokenRefreshRequest);
/*     */     
/* 121 */     String path = "/oauth/refresh";
/*     */     
/* 123 */     Object postBody = null;
/* 124 */     byte[] postBinaryBody = null;
/*     */     
/* 126 */     Map<String, String> headerParams = new HashMap<>();
/* 127 */     List<String> acceptsList = new ArrayList<>();
/* 128 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 130 */     acceptsList.add("application/json");
/*     */     
/* 132 */     contentTypesList.add("application/x-www-form-urlencoded");
/*     */     
/* 134 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 136 */     Map<String, Object> formParams = new HashMap<>();
/* 137 */     formParams.put("refresh_token", accessTokenRefreshRequest.getRefreshToken());
/* 138 */     formParams.put("client_id", accessTokenRefreshRequest.getClientId());
/* 139 */     formParams.put("client_secret", accessTokenRefreshRequest.getClientSecret());
/* 140 */     formParams.put("grant_type", accessTokenRefreshRequest.getGrantType());
/*     */     
/* 142 */     String[] accepts = new String[acceptsList.size()];
/* 143 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 145 */     String[] contentTypes = new String[contentTypesList.size()];
/* 146 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 148 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 150 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 152 */     TypeRef<AccessTokenRefreshResponse> returnType = new TypeRef<AccessTokenRefreshResponse>() {  };
/* 153 */     return (AccessTokenRefreshResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, false);
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
/*     */   public void revokeToken(Token token) throws ApiException {
/* 165 */     OAuthApiValidator.revokeTokenValidator(token);
/*     */ 
/*     */     
/* 168 */     String path = "/oauth/revoke";
/*     */     
/* 170 */     Object postBody = null;
/* 171 */     byte[] postBinaryBody = null;
/*     */     
/* 173 */     Map<String, String> headerParams = new HashMap<>();
/* 174 */     List<String> acceptsList = new ArrayList<>();
/* 175 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 177 */     acceptsList.add("application/json");
/*     */     
/* 179 */     contentTypesList.add("application/x-www-form-urlencoded");
/*     */     
/* 181 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 183 */     Map<String, Object> formParams = new HashMap<>();
/* 184 */     formParams.put("token", token.getToken());
/*     */     
/* 186 */     String[] accepts = new String[acceptsList.size()];
/* 187 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 189 */     String[] contentTypes = new String[contentTypesList.size()];
/* 190 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 192 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 194 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 196 */     TypeRef returnType = null;
/* 197 */     this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, false);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\OAuthApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */