/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.megaSigns.MegaSignChildAgreements;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignCreationRequest;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignCreationResponse;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignInfo;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateInfo;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateResponse;
/*     */ import com.adobe.sign.model.megaSigns.MegaSigns;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.MegaSignsApiValidator;
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
/*     */ public class MegaSignsApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  37 */   private final String CONTENT_TYPE = "Content-Type";
/*  38 */   private final String ACCEPT = "Accept";
/*  39 */   private final String ACCESS_TOKEN = "Access-Token";
/*  40 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public MegaSignsApi() {
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
/*     */   public MegaSigns getMegaSigns(MultivaluedMap headers, String query) throws ApiException {
/*  62 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  65 */     MegaSignsApiValidator.getMegaSignsValidator(query);
/*     */ 
/*     */     
/*  68 */     String path = "/megaSigns".replaceAll("\\{format\\}", "json");
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
/*  99 */     queryParams.addAll(this.apiClient.parameterToPairs("", "query", query));
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
/* 113 */     TypeRef<MegaSigns> returnType = new TypeRef<MegaSigns>() {  };
/* 114 */     return (MegaSigns)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public MegaSignCreationResponse createMegaSign(MultivaluedMap headers, MegaSignCreationRequest megaSignCreationRequest) throws ApiException {
/* 133 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 136 */     MegaSignsApiValidator.createMegaSignValidator(megaSignCreationRequest);
/*     */ 
/*     */     
/* 139 */     String path = "/megaSigns".replaceAll("\\{format\\}", "json");
/*     */     
/* 141 */     Object postBody = megaSignCreationRequest;
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
/* 182 */     TypeRef<MegaSignCreationResponse> returnType = new TypeRef<MegaSignCreationResponse>() {  };
/* 183 */     return (MegaSignCreationResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public MegaSignInfo getMegaSignInfo(MultivaluedMap headers, String megaSignId) throws ApiException {
/* 202 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 205 */     MegaSignsApiValidator.getMegaSignInfoValidator(megaSignId);
/*     */ 
/*     */     
/* 208 */     String path = "/megaSigns/{megaSignId}".replaceAll("\\{format\\}", "json")
/* 209 */       .replaceAll("\\{megaSignId\\}", this.apiClient.escapeString(megaSignId.toString()));
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
/* 252 */     TypeRef<MegaSignInfo> returnType = new TypeRef<MegaSignInfo>() {  };
/* 253 */     return (MegaSignInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public MegaSignChildAgreements getMegaSignChildAgreements(MultivaluedMap headers, String megaSignId) throws ApiException {
/* 272 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 275 */     MegaSignsApiValidator.getMegaSignChildAgreementsValidator(megaSignId);
/*     */ 
/*     */     
/* 278 */     String path = "/megaSigns/{megaSignId}/agreements".replaceAll("\\{format\\}", "json")
/* 279 */       .replaceAll("\\{megaSignId\\}", this.apiClient.escapeString(megaSignId.toString()));
/*     */     
/* 281 */     Object postBody = null;
/* 282 */     byte[] postBinaryBody = null;
/*     */     
/* 284 */     Map<String, String> headerParams = new HashMap<>();
/* 285 */     List<String> acceptsList = new ArrayList<>();
/* 286 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 288 */     acceptsList.add("application/json");
/*     */     
/* 290 */     Set<String> keys = headers.keySet();
/*     */     
/* 292 */     for (String key : keys) {
/* 293 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 294 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 295 */         contentTypesList.add(value); continue;
/*     */       } 
/* 297 */       if (key.equalsIgnoreCase("Accept")) {
/* 298 */         acceptsList.add(value); continue;
/*     */       } 
/* 300 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 301 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 303 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 304 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 308 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 310 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 312 */     String[] accepts = new String[acceptsList.size()];
/* 313 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 315 */     String[] contentTypes = new String[contentTypesList.size()];
/* 316 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 318 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 320 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 322 */     TypeRef<MegaSignChildAgreements> returnType = new TypeRef<MegaSignChildAgreements>() {  };
/* 323 */     return (MegaSignChildAgreements)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public byte[] getMegaSignFormData(MultivaluedMap headers, String megaSignId) throws ApiException {
/* 343 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 346 */     MegaSignsApiValidator.getMegaSignFormDataValidator(megaSignId);
/*     */ 
/*     */     
/* 349 */     String path = "/megaSigns/{megaSignId}/formData".replaceAll("\\{format\\}", "json")
/* 350 */       .replaceAll("\\{megaSignId\\}", this.apiClient.escapeString(megaSignId.toString()));
/*     */     
/* 352 */     Object postBody = null;
/* 353 */     byte[] postBinaryBody = null;
/*     */     
/* 355 */     Map<String, String> headerParams = new HashMap<>();
/* 356 */     List<String> acceptsList = new ArrayList<>();
/* 357 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 359 */     acceptsList.add("text/csv");
/*     */     
/* 361 */     Set<String> keys = headers.keySet();
/*     */     
/* 363 */     for (String key : keys) {
/* 364 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 365 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 366 */         contentTypesList.add(value); continue;
/*     */       } 
/* 368 */       if (key.equalsIgnoreCase("Accept")) {
/* 369 */         acceptsList.add(value); continue;
/*     */       } 
/* 371 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 372 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 374 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 375 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 379 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 381 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 383 */     String[] accepts = new String[acceptsList.size()];
/* 384 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 386 */     String[] contentTypes = new String[contentTypesList.size()];
/* 387 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 389 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 391 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 393 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/* 394 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
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
/*     */   public MegaSignStatusUpdateResponse updateMegaSignStatus(MultivaluedMap headers, String megaSignId, MegaSignStatusUpdateInfo megaSignStatusUpdateInfo) throws ApiException {
/* 415 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 418 */     MegaSignsApiValidator.updateMegaSignStatusValidator(megaSignId, megaSignStatusUpdateInfo);
/*     */ 
/*     */     
/* 421 */     String path = "/megaSigns/{megaSignId}/status".replaceAll("\\{format\\}", "json")
/* 422 */       .replaceAll("\\{megaSignId\\}", this.apiClient.escapeString(megaSignId.toString()));
/*     */     
/* 424 */     Object postBody = megaSignStatusUpdateInfo;
/* 425 */     byte[] postBinaryBody = null;
/*     */     
/* 427 */     Map<String, String> headerParams = new HashMap<>();
/* 428 */     List<String> acceptsList = new ArrayList<>();
/* 429 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 431 */     acceptsList.add("application/json");
/*     */     
/* 433 */     Set<String> keys = headers.keySet();
/*     */     
/* 435 */     for (String key : keys) {
/* 436 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 437 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 438 */         contentTypesList.add(value); continue;
/*     */       } 
/* 440 */       if (key.equalsIgnoreCase("Accept")) {
/* 441 */         acceptsList.add(value); continue;
/*     */       } 
/* 443 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 444 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 446 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 447 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 451 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 453 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 455 */     String[] accepts = new String[acceptsList.size()];
/* 456 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 458 */     String[] contentTypes = new String[contentTypesList.size()];
/* 459 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 461 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 463 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 465 */     TypeRef<MegaSignStatusUpdateResponse> returnType = new TypeRef<MegaSignStatusUpdateResponse>() {  };
/* 466 */     return (MegaSignStatusUpdateResponse)this.apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\MegaSignsApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */