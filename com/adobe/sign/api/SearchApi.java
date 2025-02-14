/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.search.AgreementAssetEventGetResponse;
/*     */ import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
/*     */ import com.adobe.sign.model.search.AgreementAssetEventRequest;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.SearchApiValidator;
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
/*     */ public class SearchApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  33 */   private final String CONTENT_TYPE = "Content-Type";
/*  34 */   private final String ACCEPT = "Accept";
/*  35 */   private final String ACCESS_TOKEN = "Access-Token";
/*  36 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public SearchApi() {
/*  39 */     this.apiClient = Context.getDefaultApiClient();
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
/*     */   public AgreementAssetEventPostResponse createAssetEvent(MultivaluedMap headers, AgreementAssetEventRequest agreementAssetEventRequest) throws ApiException {
/*  58 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  61 */     SearchApiValidator.createAssetEventValidator(agreementAssetEventRequest);
/*     */ 
/*     */     
/*  64 */     String path = "/search/agreementAssetEvents".replaceAll("\\{format\\}", "json");
/*     */     
/*  66 */     Object postBody = agreementAssetEventRequest;
/*  67 */     byte[] postBinaryBody = null;
/*     */     
/*  69 */     Map<String, String> headerParams = new HashMap<>();
/*  70 */     List<String> acceptsList = new ArrayList<>();
/*  71 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/*  73 */     acceptsList.add("application/json");
/*     */     
/*  75 */     Set<String> keys = headers.keySet();
/*     */     
/*  77 */     for (String key : keys) {
/*  78 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  79 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  80 */         contentTypesList.add(value); continue;
/*     */       } 
/*  82 */       if (key.equalsIgnoreCase("Accept")) {
/*  83 */         acceptsList.add(value); continue;
/*     */       } 
/*  85 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  86 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/*  88 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  89 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/*  93 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/*  95 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/*  97 */     String[] accepts = new String[acceptsList.size()];
/*  98 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 100 */     String[] contentTypes = new String[contentTypesList.size()];
/* 101 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 103 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 105 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 107 */     TypeRef<AgreementAssetEventPostResponse> returnType = new TypeRef<AgreementAssetEventPostResponse>() {  };
/* 108 */     return (AgreementAssetEventPostResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */ 
/*     */   
/*     */   public AgreementAssetEventGetResponse getAssetEvent(MultivaluedMap headers, String searchId, String pageCursor, Integer pageSize) throws ApiException {
/* 131 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 134 */     SearchApiValidator.getAssetEventValidator(searchId, pageCursor, pageSize);
/*     */ 
/*     */     
/* 137 */     String path = "/search/agreementAssetEvents/{searchId}".replaceAll("\\{format\\}", "json")
/* 138 */       .replaceAll("\\{searchId\\}", this.apiClient.escapeString(searchId.toString()));
/*     */     
/* 140 */     Object postBody = null;
/* 141 */     byte[] postBinaryBody = null;
/*     */     
/* 143 */     Map<String, String> headerParams = new HashMap<>();
/* 144 */     List<String> acceptsList = new ArrayList<>();
/* 145 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 147 */     acceptsList.add("application/json");
/*     */     
/* 149 */     Set<String> keys = headers.keySet();
/*     */     
/* 151 */     for (String key : keys) {
/* 152 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 153 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 154 */         contentTypesList.add(value); continue;
/*     */       } 
/* 156 */       if (key.equalsIgnoreCase("Accept")) {
/* 157 */         acceptsList.add(value); continue;
/*     */       } 
/* 159 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 160 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 162 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 163 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 167 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 169 */     queryParams.addAll(this.apiClient.parameterToPairs("", "pageCursor", pageCursor));
/*     */     
/* 171 */     queryParams.addAll(this.apiClient.parameterToPairs("", "pageSize", pageSize));
/*     */     
/* 173 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 175 */     String[] accepts = new String[acceptsList.size()];
/* 176 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 178 */     String[] contentTypes = new String[contentTypesList.size()];
/* 179 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 181 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 183 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 185 */     TypeRef<AgreementAssetEventGetResponse> returnType = new TypeRef<AgreementAssetEventGetResponse>() {  };
/* 186 */     return (AgreementAssetEventGetResponse)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\SearchApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */