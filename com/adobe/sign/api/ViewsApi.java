/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.views.AgreementAssetListRequest;
/*     */ import com.adobe.sign.model.views.AgreementAssetRequest;
/*     */ import com.adobe.sign.model.views.TargetViewRequest;
/*     */ import com.adobe.sign.model.views.ViewUrl;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.ViewsApiValidator;
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
/*     */ public class ViewsApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  34 */   private final String CONTENT_TYPE = "Content-Type";
/*  35 */   private final String ACCEPT = "Accept";
/*  36 */   private final String ACCESS_TOKEN = "Access-Token";
/*  37 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public ViewsApi() {
/*  40 */     this.apiClient = Context.getDefaultApiClient();
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
/*     */   public ViewUrl createAgreementAssetListUrl(MultivaluedMap headers, AgreementAssetListRequest agreementAssetListRequest) throws ApiException {
/*  59 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  62 */     ViewsApiValidator.createAgreementAssetListUrlValidator(agreementAssetListRequest);
/*     */ 
/*     */     
/*  65 */     String path = "/views/agreementAssetList".replaceAll("\\{format\\}", "json");
/*     */     
/*  67 */     Object postBody = agreementAssetListRequest;
/*  68 */     byte[] postBinaryBody = null;
/*     */     
/*  70 */     Map<String, String> headerParams = new HashMap<>();
/*  71 */     List<String> acceptsList = new ArrayList<>();
/*  72 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/*  74 */     acceptsList.add("application/json");
/*     */     
/*  76 */     Set<String> keys = headers.keySet();
/*     */     
/*  78 */     for (String key : keys) {
/*  79 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  80 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  81 */         contentTypesList.add(value); continue;
/*     */       } 
/*  83 */       if (key.equalsIgnoreCase("Accept")) {
/*  84 */         acceptsList.add(value); continue;
/*     */       } 
/*  86 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  87 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/*  89 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  90 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/*  94 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/*  96 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/*  98 */     String[] accepts = new String[acceptsList.size()];
/*  99 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 101 */     String[] contentTypes = new String[contentTypesList.size()];
/* 102 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 104 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 106 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 108 */     TypeRef<ViewUrl> returnType = new TypeRef<ViewUrl>() {  };
/* 109 */     return (ViewUrl)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public ViewUrl createAgreementAssetUrl(MultivaluedMap headers, AgreementAssetRequest agreementAssetRequest) throws ApiException {
/* 128 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 131 */     ViewsApiValidator.createAgreementAssetUrlValidator(agreementAssetRequest);
/*     */ 
/*     */     
/* 134 */     String path = "/views/agreementAssets".replaceAll("\\{format\\}", "json");
/*     */     
/* 136 */     Object postBody = agreementAssetRequest;
/* 137 */     byte[] postBinaryBody = null;
/*     */     
/* 139 */     Map<String, String> headerParams = new HashMap<>();
/* 140 */     List<String> acceptsList = new ArrayList<>();
/* 141 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 143 */     acceptsList.add("application/json");
/*     */     
/* 145 */     Set<String> keys = headers.keySet();
/*     */     
/* 147 */     for (String key : keys) {
/* 148 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 149 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 150 */         contentTypesList.add(value); continue;
/*     */       } 
/* 152 */       if (key.equalsIgnoreCase("Accept")) {
/* 153 */         acceptsList.add(value); continue;
/*     */       } 
/* 155 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 156 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 158 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 159 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 163 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 165 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 167 */     String[] accepts = new String[acceptsList.size()];
/* 168 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 170 */     String[] contentTypes = new String[contentTypesList.size()];
/* 171 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 173 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 175 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 177 */     TypeRef<ViewUrl> returnType = new TypeRef<ViewUrl>() {  };
/* 178 */     return (ViewUrl)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public ViewUrl createSettingsUrl(MultivaluedMap headers, TargetViewRequest targetViewRequest) throws ApiException {
/* 197 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 200 */     ViewsApiValidator.createSettingsUrlValidator(targetViewRequest);
/*     */ 
/*     */     
/* 203 */     String path = "/views/settings".replaceAll("\\{format\\}", "json");
/*     */     
/* 205 */     Object postBody = targetViewRequest;
/* 206 */     byte[] postBinaryBody = null;
/*     */     
/* 208 */     Map<String, String> headerParams = new HashMap<>();
/* 209 */     List<String> acceptsList = new ArrayList<>();
/* 210 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 212 */     acceptsList.add("application/json");
/*     */     
/* 214 */     Set<String> keys = headers.keySet();
/*     */     
/* 216 */     for (String key : keys) {
/* 217 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 218 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 219 */         contentTypesList.add(value); continue;
/*     */       } 
/* 221 */       if (key.equalsIgnoreCase("Accept")) {
/* 222 */         acceptsList.add(value); continue;
/*     */       } 
/* 224 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 225 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 227 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 228 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 232 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 234 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 236 */     String[] accepts = new String[acceptsList.size()];
/* 237 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 239 */     String[] contentTypes = new String[contentTypesList.size()];
/* 240 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 242 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 244 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 246 */     TypeRef<ViewUrl> returnType = new TypeRef<ViewUrl>() {  };
/* 247 */     return (ViewUrl)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\ViewsApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */