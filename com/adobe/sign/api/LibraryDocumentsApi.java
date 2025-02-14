/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.libraryDocuments.DocumentLibraryItems;
/*     */ import com.adobe.sign.model.libraryDocuments.Documents;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryCreationInfo;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationResponse;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryDocumentInfo;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.LibraryDocumentsApiValidator;
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
/*     */ public class LibraryDocumentsApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  35 */   private final String CONTENT_TYPE = "Content-Type";
/*  36 */   private final String ACCEPT = "Accept";
/*  37 */   private final String ACCESS_TOKEN = "Access-Token";
/*  38 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public LibraryDocumentsApi() {
/*  41 */     this.apiClient = Context.getDefaultApiClient();
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
/*     */   public DocumentLibraryItems getLibraryDocuments(MultivaluedMap headers) throws ApiException {
/*  58 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  61 */     LibraryDocumentsApiValidator.getLibraryDocumentsValidator();
/*     */ 
/*     */     
/*  64 */     String path = "/libraryDocuments".replaceAll("\\{format\\}", "json");
/*     */     
/*  66 */     Object postBody = null;
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
/* 107 */     TypeRef<DocumentLibraryItems> returnType = new TypeRef<DocumentLibraryItems>() {  };
/* 108 */     return (DocumentLibraryItems)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public LibraryDocumentCreationResponse createLibraryDocument(MultivaluedMap headers, LibraryCreationInfo libraryCreationInfo) throws ApiException {
/* 127 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 130 */     LibraryDocumentsApiValidator.createLibraryDocumentValidator(libraryCreationInfo);
/*     */ 
/*     */     
/* 133 */     String path = "/libraryDocuments".replaceAll("\\{format\\}", "json");
/*     */     
/* 135 */     Object postBody = libraryCreationInfo;
/* 136 */     byte[] postBinaryBody = null;
/*     */     
/* 138 */     Map<String, String> headerParams = new HashMap<>();
/* 139 */     List<String> acceptsList = new ArrayList<>();
/* 140 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 142 */     acceptsList.add("application/json");
/*     */     
/* 144 */     Set<String> keys = headers.keySet();
/*     */     
/* 146 */     for (String key : keys) {
/* 147 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 148 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 149 */         contentTypesList.add(value); continue;
/*     */       } 
/* 151 */       if (key.equalsIgnoreCase("Accept")) {
/* 152 */         acceptsList.add(value); continue;
/*     */       } 
/* 154 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 155 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 157 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 158 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 162 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 164 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 166 */     String[] accepts = new String[acceptsList.size()];
/* 167 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 169 */     String[] contentTypes = new String[contentTypesList.size()];
/* 170 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 172 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 174 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 176 */     TypeRef<LibraryDocumentCreationResponse> returnType = new TypeRef<LibraryDocumentCreationResponse>() {  };
/* 177 */     return (LibraryDocumentCreationResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public LibraryDocumentInfo getLibraryDocumentInfo(MultivaluedMap headers, String libraryDocumentId) throws ApiException {
/* 196 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 199 */     LibraryDocumentsApiValidator.getLibraryDocumentInfoValidator(libraryDocumentId);
/*     */ 
/*     */     
/* 202 */     String path = "/libraryDocuments/{libraryDocumentId}".replaceAll("\\{format\\}", "json")
/* 203 */       .replaceAll("\\{libraryDocumentId\\}", this.apiClient.escapeString(libraryDocumentId.toString()));
/*     */     
/* 205 */     Object postBody = null;
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
/* 246 */     TypeRef<LibraryDocumentInfo> returnType = new TypeRef<LibraryDocumentInfo>() {  };
/* 247 */     return (LibraryDocumentInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public void deleteLibraryDocument(MultivaluedMap headers, String libraryDocumentId) throws ApiException {
/* 266 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 269 */     LibraryDocumentsApiValidator.deleteLibraryDocumentValidator(libraryDocumentId);
/*     */ 
/*     */     
/* 272 */     String path = "/libraryDocuments/{libraryDocumentId}".replaceAll("\\{format\\}", "json")
/* 273 */       .replaceAll("\\{libraryDocumentId\\}", this.apiClient.escapeString(libraryDocumentId.toString()));
/*     */     
/* 275 */     Object postBody = null;
/* 276 */     byte[] postBinaryBody = null;
/*     */     
/* 278 */     Map<String, String> headerParams = new HashMap<>();
/* 279 */     List<String> acceptsList = new ArrayList<>();
/* 280 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 282 */     acceptsList.add("application/json");
/*     */     
/* 284 */     Set<String> keys = headers.keySet();
/*     */     
/* 286 */     for (String key : keys) {
/* 287 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 288 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 289 */         contentTypesList.add(value); continue;
/*     */       } 
/* 291 */       if (key.equalsIgnoreCase("Accept")) {
/* 292 */         acceptsList.add(value); continue;
/*     */       } 
/* 294 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 295 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 297 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 298 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 302 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 304 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 306 */     String[] accepts = new String[acceptsList.size()];
/* 307 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 309 */     String[] contentTypes = new String[contentTypesList.size()];
/* 310 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 312 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 314 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 316 */     this.apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, null, true);
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
/*     */   public byte[] getLibraryDocumentAuditTrail(MultivaluedMap headers, String libraryDocumentId) throws ApiException {
/* 335 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 338 */     LibraryDocumentsApiValidator.getLibraryDocumentAuditTrailValidator(libraryDocumentId);
/*     */ 
/*     */     
/* 341 */     String path = "/libraryDocuments/{libraryDocumentId}/auditTrail".replaceAll("\\{format\\}", "json")
/* 342 */       .replaceAll("\\{libraryDocumentId\\}", this.apiClient.escapeString(libraryDocumentId.toString()));
/*     */     
/* 344 */     Object postBody = null;
/* 345 */     byte[] postBinaryBody = null;
/*     */     
/* 347 */     Map<String, String> headerParams = new HashMap<>();
/* 348 */     List<String> acceptsList = new ArrayList<>();
/* 349 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 351 */     acceptsList.add("application/pdf");
/*     */     
/* 353 */     Set<String> keys = headers.keySet();
/*     */     
/* 355 */     for (String key : keys) {
/* 356 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 357 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 358 */         contentTypesList.add(value); continue;
/*     */       } 
/* 360 */       if (key.equalsIgnoreCase("Accept")) {
/* 361 */         acceptsList.add(value); continue;
/*     */       } 
/* 363 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 364 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 366 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 367 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 371 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 373 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 375 */     String[] accepts = new String[acceptsList.size()];
/* 376 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 378 */     String[] contentTypes = new String[contentTypesList.size()];
/* 379 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 381 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 383 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 385 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/* 386 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
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
/*     */   public byte[] getCombinedDocument(MultivaluedMap headers, String libraryDocumentId, Boolean auditReport) throws ApiException {
/* 407 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 410 */     LibraryDocumentsApiValidator.getCombinedDocumentValidator(libraryDocumentId, auditReport);
/*     */ 
/*     */     
/* 413 */     String path = "/libraryDocuments/{libraryDocumentId}/combinedDocument".replaceAll("\\{format\\}", "json")
/* 414 */       .replaceAll("\\{libraryDocumentId\\}", this.apiClient.escapeString(libraryDocumentId.toString()));
/*     */     
/* 416 */     Object postBody = null;
/* 417 */     byte[] postBinaryBody = null;
/*     */     
/* 419 */     Map<String, String> headerParams = new HashMap<>();
/* 420 */     List<String> acceptsList = new ArrayList<>();
/* 421 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 423 */     acceptsList.add("application/pdf");
/*     */     
/* 425 */     Set<String> keys = headers.keySet();
/*     */     
/* 427 */     for (String key : keys) {
/* 428 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 429 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 430 */         contentTypesList.add(value); continue;
/*     */       } 
/* 432 */       if (key.equalsIgnoreCase("Accept")) {
/* 433 */         acceptsList.add(value); continue;
/*     */       } 
/* 435 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 436 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 438 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 439 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 443 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 445 */     queryParams.addAll(this.apiClient.parameterToPairs("", "auditReport", auditReport));
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
/* 459 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/* 460 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
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
/*     */   public Documents getDocuments(MultivaluedMap headers, String libraryDocumentId) throws ApiException {
/* 479 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 482 */     LibraryDocumentsApiValidator.getDocumentsValidator(libraryDocumentId);
/*     */ 
/*     */     
/* 485 */     String path = "/libraryDocuments/{libraryDocumentId}/documents".replaceAll("\\{format\\}", "json")
/* 486 */       .replaceAll("\\{libraryDocumentId\\}", this.apiClient.escapeString(libraryDocumentId.toString()));
/*     */     
/* 488 */     Object postBody = null;
/* 489 */     byte[] postBinaryBody = null;
/*     */     
/* 491 */     Map<String, String> headerParams = new HashMap<>();
/* 492 */     List<String> acceptsList = new ArrayList<>();
/* 493 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 495 */     acceptsList.add("application/json");
/*     */     
/* 497 */     Set<String> keys = headers.keySet();
/*     */     
/* 499 */     for (String key : keys) {
/* 500 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 501 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 502 */         contentTypesList.add(value); continue;
/*     */       } 
/* 504 */       if (key.equalsIgnoreCase("Accept")) {
/* 505 */         acceptsList.add(value); continue;
/*     */       } 
/* 507 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 508 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 510 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 511 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 515 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 517 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 519 */     String[] accepts = new String[acceptsList.size()];
/* 520 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 522 */     String[] contentTypes = new String[contentTypesList.size()];
/* 523 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 525 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 527 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 529 */     TypeRef<Documents> returnType = new TypeRef<Documents>() {  };
/* 530 */     return (Documents)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public byte[] getLibraryDocument(MultivaluedMap headers, String libraryDocumentId, String documentId) throws ApiException {
/* 551 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 554 */     LibraryDocumentsApiValidator.getLibraryDocumentValidator(libraryDocumentId, documentId);
/*     */ 
/*     */     
/* 557 */     String path = "/libraryDocuments/{libraryDocumentId}/documents/{documentId}".replaceAll("\\{format\\}", "json")
/* 558 */       .replaceAll("\\{libraryDocumentId\\}", this.apiClient.escapeString(libraryDocumentId.toString()))
/* 559 */       .replaceAll("\\{documentId\\}", this.apiClient.escapeString(documentId.toString()));
/*     */     
/* 561 */     Object postBody = null;
/* 562 */     byte[] postBinaryBody = null;
/*     */     
/* 564 */     Map<String, String> headerParams = new HashMap<>();
/* 565 */     List<String> acceptsList = new ArrayList<>();
/* 566 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 568 */     acceptsList.add(" */* ");
/*     */     
/* 570 */     Set<String> keys = headers.keySet();
/*     */     
/* 572 */     for (String key : keys) {
/* 573 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 574 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 575 */         contentTypesList.add(value); continue;
/*     */       } 
/* 577 */       if (key.equalsIgnoreCase("Accept")) {
/* 578 */         acceptsList.add(value); continue;
/*     */       } 
/* 580 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 581 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 583 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 584 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 588 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 590 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 592 */     String[] accepts = new String[acceptsList.size()];
/* 593 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 595 */     String[] contentTypes = new String[contentTypesList.size()];
/* 596 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 598 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 600 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 602 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/* 603 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\LibraryDocumentsApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */