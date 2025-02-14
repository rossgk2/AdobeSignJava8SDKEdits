/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.baseUris.BaseUriInfo;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.BaseUrisApiValidator;
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
/*     */ public class BaseUrisApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  31 */   private final String CONTENT_TYPE = "Content-Type";
/*  32 */   private final String ACCEPT = "Accept";
/*  33 */   private final String ACCESS_TOKEN = "Access-Token";
/*  34 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public BaseUrisApi() {
/*  37 */     this.apiClient = Context.getDefaultApiClient();
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
/*     */   public BaseUriInfo getBaseUris(MultivaluedMap headers) throws ApiException {
/*  53 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  56 */     BaseUrisApiValidator.getBaseUrisValidator();
/*     */ 
/*     */     
/*  59 */     String path = "/base_uris".replaceAll("\\{format\\}", "json");
/*     */     
/*  61 */     Object postBody = null;
/*  62 */     byte[] postBinaryBody = null;
/*     */     
/*  64 */     Map<String, String> headerParams = new HashMap<>();
/*  65 */     List<String> acceptsList = new ArrayList<>();
/*  66 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/*  68 */     acceptsList.add("application/json");
/*     */     
/*  70 */     Set<String> keys = headers.keySet();
/*     */     
/*  72 */     for (String key : keys) {
/*  73 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  74 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  75 */         contentTypesList.add(value); continue;
/*     */       } 
/*  77 */       if (key.equalsIgnoreCase("Accept")) {
/*  78 */         acceptsList.add(value); continue;
/*     */       } 
/*  80 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  81 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/*  83 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  84 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/*  88 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/*  90 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/*  92 */     String[] accepts = new String[acceptsList.size()];
/*  93 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/*  95 */     String[] contentTypes = new String[contentTypesList.size()];
/*  96 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/*  98 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 100 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 102 */     TypeRef<BaseUriInfo> returnType = new TypeRef<BaseUriInfo>() {  };
/* 103 */     return (BaseUriInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\BaseUrisApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */