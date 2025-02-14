/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.groups.GroupCreationInfo;
/*     */ import com.adobe.sign.model.groups.GroupCreationResponse;
/*     */ import com.adobe.sign.model.groups.GroupDetailsInfo;
/*     */ import com.adobe.sign.model.groups.GroupModificationInfo;
/*     */ import com.adobe.sign.model.groups.GroupModificationResponse;
/*     */ import com.adobe.sign.model.groups.GroupsInfo;
/*     */ import com.adobe.sign.model.groups.UsersInfo;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.GroupsApiValidator;
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
/*     */ public class GroupsApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  37 */   private final String CONTENT_TYPE = "Content-Type";
/*  38 */   private final String ACCEPT = "Accept";
/*  39 */   private final String ACCESS_TOKEN = "Access-Token";
/*  40 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public GroupsApi() {
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
/*     */   public GroupsInfo getGroups(MultivaluedMap headers) throws ApiException {
/*  60 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  63 */     GroupsApiValidator.getGroupsValidator();
/*     */ 
/*     */     
/*  66 */     String path = "/groups".replaceAll("\\{format\\}", "json");
/*     */     
/*  68 */     Object postBody = null;
/*  69 */     byte[] postBinaryBody = null;
/*     */     
/*  71 */     Map<String, String> headerParams = new HashMap<>();
/*  72 */     List<String> acceptsList = new ArrayList<>();
/*  73 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/*  75 */     acceptsList.add("application/json");
/*     */     
/*  77 */     Set<String> keys = headers.keySet();
/*     */     
/*  79 */     for (String key : keys) {
/*  80 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  81 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  82 */         contentTypesList.add(value); continue;
/*     */       } 
/*  84 */       if (key.equalsIgnoreCase("Accept")) {
/*  85 */         acceptsList.add(value); continue;
/*     */       } 
/*  87 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  88 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/*  90 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  91 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/*  95 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/*  97 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/*  99 */     String[] accepts = new String[acceptsList.size()];
/* 100 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 102 */     String[] contentTypes = new String[contentTypesList.size()];
/* 103 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 105 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 107 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 109 */     TypeRef<GroupsInfo> returnType = new TypeRef<GroupsInfo>() {  };
/* 110 */     return (GroupsInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public GroupCreationResponse createGroup(MultivaluedMap headers, GroupCreationInfo groupCreationInfo) throws ApiException {
/* 129 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 132 */     GroupsApiValidator.createGroupValidator(groupCreationInfo);
/*     */ 
/*     */     
/* 135 */     String path = "/groups".replaceAll("\\{format\\}", "json");
/*     */     
/* 137 */     Object postBody = groupCreationInfo;
/* 138 */     byte[] postBinaryBody = null;
/*     */     
/* 140 */     Map<String, String> headerParams = new HashMap<>();
/* 141 */     List<String> acceptsList = new ArrayList<>();
/* 142 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 144 */     acceptsList.add("application/json");
/*     */     
/* 146 */     Set<String> keys = headers.keySet();
/*     */     
/* 148 */     for (String key : keys) {
/* 149 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 150 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 151 */         contentTypesList.add(value); continue;
/*     */       } 
/* 153 */       if (key.equalsIgnoreCase("Accept")) {
/* 154 */         acceptsList.add(value); continue;
/*     */       } 
/* 156 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 157 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 159 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 160 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 164 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 166 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 168 */     String[] accepts = new String[acceptsList.size()];
/* 169 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 171 */     String[] contentTypes = new String[contentTypesList.size()];
/* 172 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 174 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 176 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 178 */     TypeRef<GroupCreationResponse> returnType = new TypeRef<GroupCreationResponse>() {  };
/* 179 */     return (GroupCreationResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public GroupDetailsInfo getGroupDetails(MultivaluedMap headers, String groupId) throws ApiException {
/* 198 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 201 */     GroupsApiValidator.getGroupDetailsValidator(groupId);
/*     */ 
/*     */     
/* 204 */     String path = "/groups/{groupId}".replaceAll("\\{format\\}", "json")
/* 205 */       .replaceAll("\\{groupId\\}", this.apiClient.escapeString(groupId.toString()));
/*     */     
/* 207 */     Object postBody = null;
/* 208 */     byte[] postBinaryBody = null;
/*     */     
/* 210 */     Map<String, String> headerParams = new HashMap<>();
/* 211 */     List<String> acceptsList = new ArrayList<>();
/* 212 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 214 */     acceptsList.add("application/json");
/*     */     
/* 216 */     Set<String> keys = headers.keySet();
/*     */     
/* 218 */     for (String key : keys) {
/* 219 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 220 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 221 */         contentTypesList.add(value); continue;
/*     */       } 
/* 223 */       if (key.equalsIgnoreCase("Accept")) {
/* 224 */         acceptsList.add(value); continue;
/*     */       } 
/* 226 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 227 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 229 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 230 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 234 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 236 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 238 */     String[] accepts = new String[acceptsList.size()];
/* 239 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 241 */     String[] contentTypes = new String[contentTypesList.size()];
/* 242 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 244 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 246 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 248 */     TypeRef<GroupDetailsInfo> returnType = new TypeRef<GroupDetailsInfo>() {  };
/* 249 */     return (GroupDetailsInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public GroupModificationResponse modifyGroup(MultivaluedMap headers, String groupId, GroupModificationInfo groupModificationInfo) throws ApiException {
/* 270 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 273 */     GroupsApiValidator.modifyGroupValidator(groupId, groupModificationInfo);
/*     */ 
/*     */     
/* 276 */     String path = "/groups/{groupId}".replaceAll("\\{format\\}", "json")
/* 277 */       .replaceAll("\\{groupId\\}", this.apiClient.escapeString(groupId.toString()));
/*     */     
/* 279 */     Object postBody = groupModificationInfo;
/* 280 */     byte[] postBinaryBody = null;
/*     */     
/* 282 */     Map<String, String> headerParams = new HashMap<>();
/* 283 */     List<String> acceptsList = new ArrayList<>();
/* 284 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 286 */     acceptsList.add("application/json");
/*     */     
/* 288 */     Set<String> keys = headers.keySet();
/*     */     
/* 290 */     for (String key : keys) {
/* 291 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 292 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 293 */         contentTypesList.add(value); continue;
/*     */       } 
/* 295 */       if (key.equalsIgnoreCase("Accept")) {
/* 296 */         acceptsList.add(value); continue;
/*     */       } 
/* 298 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 299 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 301 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 302 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 306 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 308 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 310 */     String[] accepts = new String[acceptsList.size()];
/* 311 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 313 */     String[] contentTypes = new String[contentTypesList.size()];
/* 314 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 316 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 318 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 320 */     TypeRef<GroupModificationResponse> returnType = new TypeRef<GroupModificationResponse>() {  };
/* 321 */     return (GroupModificationResponse)this.apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public void deleteGroup(MultivaluedMap headers, String groupId) throws ApiException {
/* 340 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 343 */     GroupsApiValidator.deleteGroupValidator(groupId);
/*     */ 
/*     */     
/* 346 */     String path = "/groups/{groupId}".replaceAll("\\{format\\}", "json")
/* 347 */       .replaceAll("\\{groupId\\}", this.apiClient.escapeString(groupId.toString()));
/*     */     
/* 349 */     Object postBody = null;
/* 350 */     byte[] postBinaryBody = null;
/*     */     
/* 352 */     Map<String, String> headerParams = new HashMap<>();
/* 353 */     List<String> acceptsList = new ArrayList<>();
/* 354 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 356 */     acceptsList.add("application/json");
/*     */     
/* 358 */     Set<String> keys = headers.keySet();
/*     */     
/* 360 */     for (String key : keys) {
/* 361 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 362 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 363 */         contentTypesList.add(value); continue;
/*     */       } 
/* 365 */       if (key.equalsIgnoreCase("Accept")) {
/* 366 */         acceptsList.add(value); continue;
/*     */       } 
/* 368 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 369 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 371 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 372 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 376 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 378 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 380 */     String[] accepts = new String[acceptsList.size()];
/* 381 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 383 */     String[] contentTypes = new String[contentTypesList.size()];
/* 384 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 386 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 388 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 390 */     this.apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, null, true);
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
/*     */   public UsersInfo getUsersInGroup(MultivaluedMap headers, String groupId) throws ApiException {
/* 409 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 412 */     GroupsApiValidator.getUsersInGroupValidator(groupId);
/*     */ 
/*     */     
/* 415 */     String path = "/groups/{groupId}/users".replaceAll("\\{format\\}", "json")
/* 416 */       .replaceAll("\\{groupId\\}", this.apiClient.escapeString(groupId.toString()));
/*     */     
/* 418 */     Object postBody = null;
/* 419 */     byte[] postBinaryBody = null;
/*     */     
/* 421 */     Map<String, String> headerParams = new HashMap<>();
/* 422 */     List<String> acceptsList = new ArrayList<>();
/* 423 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 425 */     acceptsList.add("application/json");
/*     */     
/* 427 */     Set<String> keys = headers.keySet();
/*     */     
/* 429 */     for (String key : keys) {
/* 430 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 431 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 432 */         contentTypesList.add(value); continue;
/*     */       } 
/* 434 */       if (key.equalsIgnoreCase("Accept")) {
/* 435 */         acceptsList.add(value); continue;
/*     */       } 
/* 437 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 438 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 440 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 441 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 445 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 447 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 449 */     String[] accepts = new String[acceptsList.size()];
/* 450 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 452 */     String[] contentTypes = new String[contentTypesList.size()];
/* 453 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 455 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 457 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 459 */     TypeRef<UsersInfo> returnType = new TypeRef<UsersInfo>() {  };
/* 460 */     return (UsersInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\GroupsApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */