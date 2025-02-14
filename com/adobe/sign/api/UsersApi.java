/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.users.UserCreationInfo;
/*     */ import com.adobe.sign.model.users.UserCreationResponse;
/*     */ import com.adobe.sign.model.users.UserDetailsInfo;
/*     */ import com.adobe.sign.model.users.UserModificationInfo;
/*     */ import com.adobe.sign.model.users.UserStatusUpdateInfo;
/*     */ import com.adobe.sign.model.users.UserStatusUpdateResponse;
/*     */ import com.adobe.sign.model.users.UsersInfo;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.UsersApiValidator;
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
/*     */ public class UsersApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  37 */   private final String CONTENT_TYPE = "Content-Type";
/*  38 */   private final String ACCEPT = "Accept";
/*  39 */   private final String ACCESS_TOKEN = "Access-Token";
/*  40 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public UsersApi() {
/*  43 */     this.apiClient = Context.getDefaultApiClient();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UsersInfo getUsers(MultivaluedMap headers, String xUserEmail) throws ApiException {
/*  62 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  65 */     UsersApiValidator.getUsersValidator(xUserEmail);
/*     */ 
/*     */     
/*  68 */     String path = "/users".replaceAll("\\{format\\}", "json");
/*     */     
/*  70 */     Object postBody = null;
/*  71 */     byte[] postBinaryBody = null;
/*     */     
/*  73 */     Map<String, String> headerParams = new HashMap<>();
/*  74 */     List<String> acceptsList = new ArrayList<>();
/*  75 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/*  77 */     acceptsList.add("application/json");
/*     */     
/*  79 */     Set<String> keys = headers.keySet();
/*     */     
/*  81 */     for (String key : keys) {
/*  82 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  83 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  84 */         contentTypesList.add(value); continue;
/*     */       } 
/*  86 */       if (key.equalsIgnoreCase("Accept")) {
/*  87 */         acceptsList.add(value); continue;
/*     */       } 
/*  89 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  90 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/*  92 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  93 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/*  97 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/*  99 */     queryParams.addAll(this.apiClient.parameterToPairs("", "x-user-email", xUserEmail));
/*     */     
/* 101 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 103 */     String[] accepts = new String[acceptsList.size()];
/* 104 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 106 */     String[] contentTypes = new String[contentTypesList.size()];
/* 107 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 109 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 111 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 113 */     TypeRef<UsersInfo> returnType = new TypeRef<UsersInfo>() {  };
/* 114 */     return (UsersInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UserCreationResponse createUser(MultivaluedMap headers, UserCreationInfo userCreationInfo) throws ApiException {
/* 133 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 136 */     UsersApiValidator.createUserValidator(userCreationInfo);
/*     */ 
/*     */     
/* 139 */     String path = "/users".replaceAll("\\{format\\}", "json");
/*     */     
/* 141 */     Object postBody = userCreationInfo;
/* 142 */     byte[] postBinaryBody = null;
/*     */     
/* 144 */     Map<String, String> headerParams = new HashMap<>();
/* 145 */     List<String> acceptsList = new ArrayList<>();
/* 146 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 148 */     acceptsList.add("application/json");
/*     */     
/* 150 */     Set<String> keys = headers.keySet();
/*     */     
/* 152 */     for (String key : keys) {
/* 153 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 154 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 155 */         contentTypesList.add(value); continue;
/*     */       } 
/* 157 */       if (key.equalsIgnoreCase("Accept")) {
/* 158 */         acceptsList.add(value); continue;
/*     */       } 
/* 160 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 161 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 163 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 164 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 168 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 170 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 172 */     String[] accepts = new String[acceptsList.size()];
/* 173 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 175 */     String[] contentTypes = new String[contentTypesList.size()];
/* 176 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 178 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 180 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 182 */     TypeRef<UserCreationResponse> returnType = new TypeRef<UserCreationResponse>() {  };
/* 183 */     return (UserCreationResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UserDetailsInfo getUserDetail(MultivaluedMap headers, String userId) throws ApiException {
/* 202 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 205 */     UsersApiValidator.getUserDetailValidator(userId);
/*     */ 
/*     */     
/* 208 */     String path = "/users/{userId}".replaceAll("\\{format\\}", "json")
/* 209 */       .replaceAll("\\{userId\\}", this.apiClient.escapeString(userId.toString()));
/*     */     
/* 211 */     Object postBody = null;
/* 212 */     byte[] postBinaryBody = null;
/*     */     
/* 214 */     Map<String, String> headerParams = new HashMap<>();
/* 215 */     List<String> acceptsList = new ArrayList<>();
/* 216 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 218 */     acceptsList.add("application/json");
/*     */     
/* 220 */     Set<String> keys = headers.keySet();
/*     */     
/* 222 */     for (String key : keys) {
/* 223 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 224 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 225 */         contentTypesList.add(value); continue;
/*     */       } 
/* 227 */       if (key.equalsIgnoreCase("Accept")) {
/* 228 */         acceptsList.add(value); continue;
/*     */       } 
/* 230 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 231 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 233 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 234 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 238 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 240 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 242 */     String[] accepts = new String[acceptsList.size()];
/* 243 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 245 */     String[] contentTypes = new String[contentTypesList.size()];
/* 246 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 248 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 250 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 252 */     TypeRef<UserDetailsInfo> returnType = new TypeRef<UserDetailsInfo>() {  };
/* 253 */     return (UserDetailsInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UserDetailsInfo modifyUser(MultivaluedMap headers, String userId, UserModificationInfo userModificationInfo) throws ApiException {
/* 274 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 277 */     UsersApiValidator.modifyUserValidator(userId, userModificationInfo);
/*     */ 
/*     */     
/* 280 */     String path = "/users/{userId}".replaceAll("\\{format\\}", "json")
/* 281 */       .replaceAll("\\{userId\\}", this.apiClient.escapeString(userId.toString()));
/*     */     
/* 283 */     Object postBody = userModificationInfo;
/* 284 */     byte[] postBinaryBody = null;
/*     */     
/* 286 */     Map<String, String> headerParams = new HashMap<>();
/* 287 */     List<String> acceptsList = new ArrayList<>();
/* 288 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 290 */     acceptsList.add("application/json");
/*     */     
/* 292 */     Set<String> keys = headers.keySet();
/*     */     
/* 294 */     for (String key : keys) {
/* 295 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 296 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 297 */         contentTypesList.add(value); continue;
/*     */       } 
/* 299 */       if (key.equalsIgnoreCase("Accept")) {
/* 300 */         acceptsList.add(value); continue;
/*     */       } 
/* 302 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 303 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 305 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 306 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 310 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 312 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 314 */     String[] accepts = new String[acceptsList.size()];
/* 315 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 317 */     String[] contentTypes = new String[contentTypesList.size()];
/* 318 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 320 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 322 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 324 */     TypeRef<UserDetailsInfo> returnType = new TypeRef<UserDetailsInfo>() {  };
/* 325 */     return (UserDetailsInfo)this.apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UserStatusUpdateResponse modifyUserStatus(MultivaluedMap headers, String userId, UserStatusUpdateInfo userStatusUpdateInfo) throws ApiException {
/* 346 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 349 */     UsersApiValidator.modifyUserStatusValidator(userId, userStatusUpdateInfo);
/*     */ 
/*     */     
/* 352 */     String path = "/users/{userId}/status".replaceAll("\\{format\\}", "json")
/* 353 */       .replaceAll("\\{userId\\}", this.apiClient.escapeString(userId.toString()));
/*     */     
/* 355 */     Object postBody = userStatusUpdateInfo;
/* 356 */     byte[] postBinaryBody = null;
/*     */     
/* 358 */     Map<String, String> headerParams = new HashMap<>();
/* 359 */     List<String> acceptsList = new ArrayList<>();
/* 360 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 362 */     acceptsList.add("application/json");
/*     */     
/* 364 */     Set<String> keys = headers.keySet();
/*     */     
/* 366 */     for (String key : keys) {
/* 367 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 368 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 369 */         contentTypesList.add(value); continue;
/*     */       } 
/* 371 */       if (key.equalsIgnoreCase("Accept")) {
/* 372 */         acceptsList.add(value); continue;
/*     */       } 
/* 374 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 375 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 377 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 378 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 382 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 384 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 386 */     String[] accepts = new String[acceptsList.size()];
/* 387 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 389 */     String[] contentTypes = new String[contentTypesList.size()];
/* 390 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 392 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 394 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 396 */     TypeRef<UserStatusUpdateResponse> returnType = new TypeRef<UserStatusUpdateResponse>() {  };
/* 397 */     return (UserStatusUpdateResponse)this.apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\UsersApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */