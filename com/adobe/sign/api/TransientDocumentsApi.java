/*     */ package com.adobe.sign.api;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.transientDocuments.TransientDocumentResponse;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.TransientDocumentsApiValidator;
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
/*     */ public class TransientDocumentsApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  32 */   private final String CONTENT_TYPE = "Content-Type";
/*  33 */   private final String ACCEPT = "Accept";
/*  34 */   private final String ACCESS_TOKEN = "Access-Token";
/*  35 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public TransientDocumentsApi() {
/*  38 */     this.apiClient = Context.getDefaultApiClient();
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
/*     */   public TransientDocumentResponse createTransientDocument(MultivaluedMap headers, File file, String fileName, String mimeType) throws ApiException {
/*  61 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  64 */     TransientDocumentsApiValidator.createTransientDocumentValidator(fileName, mimeType, file);
/*     */ 
/*     */     
/*  67 */     String path = "/transientDocuments".replaceAll("\\{format\\}", "json");
/*     */     
/*  69 */     Object postBody = null;
/*  70 */     byte[] postBinaryBody = null;
/*     */     
/*  72 */     Map<String, String> headerParams = new HashMap<>();
/*  73 */     List<String> acceptsList = new ArrayList<>();
/*  74 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/*  76 */     acceptsList.add("application/json");
/*     */     
/*  78 */     contentTypesList.add("multipart/form-data");
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
/*  99 */     Map<String, Object> formParams = new HashMap<>();
/* 100 */     if (fileName != null)
/* 101 */       formParams.put("File-Name", fileName); 
/* 102 */     if (mimeType != null)
/* 103 */       formParams.put("Mime-Type", mimeType); 
/* 104 */     if (file != null) {
/* 105 */       formParams.put("File", file);
/*     */     }
/* 107 */     String[] accepts = new String[acceptsList.size()];
/* 108 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 110 */     String[] contentTypes = new String[contentTypesList.size()];
/* 111 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 113 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 115 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 117 */     TypeRef<TransientDocumentResponse> returnType = new TypeRef<TransientDocumentResponse>() {  };
/* 118 */     return (TransientDocumentResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\TransientDocumentsApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */