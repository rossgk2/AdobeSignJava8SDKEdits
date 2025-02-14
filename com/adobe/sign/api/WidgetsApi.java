/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.widgets.UserWidgets;
/*     */ import com.adobe.sign.model.widgets.WidgetAgreements;
/*     */ import com.adobe.sign.model.widgets.WidgetCreationRequest;
/*     */ import com.adobe.sign.model.widgets.WidgetCreationResponse;
/*     */ import com.adobe.sign.model.widgets.WidgetDocuments;
/*     */ import com.adobe.sign.model.widgets.WidgetInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetPersonalizationInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetPersonalizeResponse;
/*     */ import com.adobe.sign.model.widgets.WidgetStatusUpdateInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetStatusUpdateResponse;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.WidgetsApiValidator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WidgetsApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  40 */   private final String CONTENT_TYPE = "Content-Type";
/*  41 */   private final String ACCEPT = "Accept";
/*  42 */   private final String ACCESS_TOKEN = "Access-Token";
/*  43 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public WidgetsApi() {
/*  46 */     this.apiClient = Context.getDefaultApiClient();
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
/*     */   public UserWidgets getWidgets(MultivaluedMap headers) throws ApiException {
/*  63 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  66 */     WidgetsApiValidator.getWidgetsValidator();
/*     */ 
/*     */     
/*  69 */     String path = "/widgets".replaceAll("\\{format\\}", "json");
/*     */     
/*  71 */     Object postBody = null;
/*  72 */     byte[] postBinaryBody = null;
/*     */     
/*  74 */     Map<String, String> headerParams = new HashMap<>();
/*  75 */     List<String> acceptsList = new ArrayList<>();
/*  76 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/*  78 */     acceptsList.add("application/json");
/*     */     
/*  80 */     Set<String> keys = headers.keySet();
/*     */     
/*  82 */     for (String key : keys) {
/*  83 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  84 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  85 */         contentTypesList.add(value); continue;
/*     */       } 
/*  87 */       if (key.equalsIgnoreCase("Accept")) {
/*  88 */         acceptsList.add(value); continue;
/*     */       } 
/*  90 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  91 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/*  93 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  94 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/*  98 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 100 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 102 */     String[] accepts = new String[acceptsList.size()];
/* 103 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 105 */     String[] contentTypes = new String[contentTypesList.size()];
/* 106 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 108 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 110 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 112 */     TypeRef<UserWidgets> returnType = new TypeRef<UserWidgets>() {  };
/* 113 */     return (UserWidgets)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public WidgetCreationResponse createWidget(MultivaluedMap headers, WidgetCreationRequest widgetCreationRequest) throws ApiException {
/* 132 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 135 */     WidgetsApiValidator.createWidgetValidator(widgetCreationRequest);
/*     */ 
/*     */     
/* 138 */     String path = "/widgets".replaceAll("\\{format\\}", "json");
/*     */     
/* 140 */     Object postBody = widgetCreationRequest;
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
/* 169 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 171 */     String[] accepts = new String[acceptsList.size()];
/* 172 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 174 */     String[] contentTypes = new String[contentTypesList.size()];
/* 175 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 177 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 179 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 181 */     TypeRef<WidgetCreationResponse> returnType = new TypeRef<WidgetCreationResponse>() {  };
/* 182 */     return (WidgetCreationResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public WidgetInfo getWidgetInfo(MultivaluedMap headers, String widgetId) throws ApiException {
/* 201 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 204 */     WidgetsApiValidator.getWidgetInfoValidator(widgetId);
/*     */ 
/*     */     
/* 207 */     String path = "/widgets/{widgetId}".replaceAll("\\{format\\}", "json")
/* 208 */       .replaceAll("\\{widgetId\\}", this.apiClient.escapeString(widgetId.toString()));
/*     */     
/* 210 */     Object postBody = null;
/* 211 */     byte[] postBinaryBody = null;
/*     */     
/* 213 */     Map<String, String> headerParams = new HashMap<>();
/* 214 */     List<String> acceptsList = new ArrayList<>();
/* 215 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 217 */     acceptsList.add("application/json");
/*     */     
/* 219 */     Set<String> keys = headers.keySet();
/*     */     
/* 221 */     for (String key : keys) {
/* 222 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 223 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 224 */         contentTypesList.add(value); continue;
/*     */       } 
/* 226 */       if (key.equalsIgnoreCase("Accept")) {
/* 227 */         acceptsList.add(value); continue;
/*     */       } 
/* 229 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 230 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 232 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 233 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 237 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 239 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 241 */     String[] accepts = new String[acceptsList.size()];
/* 242 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 244 */     String[] contentTypes = new String[contentTypesList.size()];
/* 245 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 247 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 249 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 251 */     TypeRef<WidgetInfo> returnType = new TypeRef<WidgetInfo>() {  };
/* 252 */     return (WidgetInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public WidgetAgreements getWidgetAgreements(MultivaluedMap headers, String widgetId) throws ApiException {
/* 271 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 274 */     WidgetsApiValidator.getWidgetAgreementsValidator(widgetId);
/*     */ 
/*     */     
/* 277 */     String path = "/widgets/{widgetId}/agreements".replaceAll("\\{format\\}", "json")
/* 278 */       .replaceAll("\\{widgetId\\}", this.apiClient.escapeString(widgetId.toString()));
/*     */     
/* 280 */     Object postBody = null;
/* 281 */     byte[] postBinaryBody = null;
/*     */     
/* 283 */     Map<String, String> headerParams = new HashMap<>();
/* 284 */     List<String> acceptsList = new ArrayList<>();
/* 285 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 287 */     acceptsList.add("application/json");
/*     */     
/* 289 */     Set<String> keys = headers.keySet();
/*     */     
/* 291 */     for (String key : keys) {
/* 292 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 293 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 294 */         contentTypesList.add(value); continue;
/*     */       } 
/* 296 */       if (key.equalsIgnoreCase("Accept")) {
/* 297 */         acceptsList.add(value); continue;
/*     */       } 
/* 299 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 300 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 302 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 303 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 307 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 309 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 311 */     String[] accepts = new String[acceptsList.size()];
/* 312 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 314 */     String[] contentTypes = new String[contentTypesList.size()];
/* 315 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 317 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 319 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 321 */     TypeRef<WidgetAgreements> returnType = new TypeRef<WidgetAgreements>() {  };
/* 322 */     return (WidgetAgreements)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public byte[] getWidgetAuditTrail(MultivaluedMap headers, String widgetId) throws ApiException {
/* 341 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 344 */     WidgetsApiValidator.getWidgetAuditTrailValidator(widgetId);
/*     */ 
/*     */     
/* 347 */     String path = "/widgets/{widgetId}/auditTrail".replaceAll("\\{format\\}", "json")
/* 348 */       .replaceAll("\\{widgetId\\}", this.apiClient.escapeString(widgetId.toString()));
/*     */     
/* 350 */     Object postBody = null;
/* 351 */     byte[] postBinaryBody = null;
/*     */     
/* 353 */     Map<String, String> headerParams = new HashMap<>();
/* 354 */     List<String> acceptsList = new ArrayList<>();
/* 355 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 357 */     acceptsList.add("application/pdf");
/*     */     
/* 359 */     Set<String> keys = headers.keySet();
/*     */     
/* 361 */     for (String key : keys) {
/* 362 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 363 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 364 */         contentTypesList.add(value); continue;
/*     */       } 
/* 366 */       if (key.equalsIgnoreCase("Accept")) {
/* 367 */         acceptsList.add(value); continue;
/*     */       } 
/* 369 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 370 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 372 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 373 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 377 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 379 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 381 */     String[] accepts = new String[acceptsList.size()];
/* 382 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 384 */     String[] contentTypes = new String[contentTypesList.size()];
/* 385 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 387 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 389 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 391 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/* 392 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
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
/*     */ 
/*     */   
/*     */   public byte[] getWidgetCombinedDocument(MultivaluedMap headers, String widgetId, String versionId, String participantEmail, Boolean auditReport) throws ApiException {
/* 417 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 420 */     WidgetsApiValidator.getWidgetCombinedDocumentValidator(widgetId, versionId, participantEmail, auditReport);
/*     */ 
/*     */     
/* 423 */     String path = "/widgets/{widgetId}/combinedDocument".replaceAll("\\{format\\}", "json")
/* 424 */       .replaceAll("\\{widgetId\\}", this.apiClient.escapeString(widgetId.toString()));
/*     */     
/* 426 */     Object postBody = null;
/* 427 */     byte[] postBinaryBody = null;
/*     */     
/* 429 */     Map<String, String> headerParams = new HashMap<>();
/* 430 */     List<String> acceptsList = new ArrayList<>();
/* 431 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 433 */     acceptsList.add("application/pdf");
/*     */     
/* 435 */     Set<String> keys = headers.keySet();
/*     */     
/* 437 */     for (String key : keys) {
/* 438 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 439 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 440 */         contentTypesList.add(value); continue;
/*     */       } 
/* 442 */       if (key.equalsIgnoreCase("Accept")) {
/* 443 */         acceptsList.add(value); continue;
/*     */       } 
/* 445 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 446 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 448 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 449 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 453 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 455 */     queryParams.addAll(this.apiClient.parameterToPairs("", "versionId", versionId));
/*     */     
/* 457 */     queryParams.addAll(this.apiClient.parameterToPairs("", "participantEmail", participantEmail));
/*     */     
/* 459 */     queryParams.addAll(this.apiClient.parameterToPairs("", "auditReport", auditReport));
/*     */     
/* 461 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 463 */     String[] accepts = new String[acceptsList.size()];
/* 464 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 466 */     String[] contentTypes = new String[contentTypesList.size()];
/* 467 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 469 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 471 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 473 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/* 474 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
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
/*     */   public WidgetDocuments getWidgetDocuments(MultivaluedMap headers, String widgetId, String versionId, String participantEmail) throws ApiException {
/* 497 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 500 */     WidgetsApiValidator.getWidgetDocumentsValidator(widgetId, versionId, participantEmail);
/*     */ 
/*     */     
/* 503 */     String path = "/widgets/{widgetId}/documents".replaceAll("\\{format\\}", "json")
/* 504 */       .replaceAll("\\{widgetId\\}", this.apiClient.escapeString(widgetId.toString()));
/*     */     
/* 506 */     Object postBody = null;
/* 507 */     byte[] postBinaryBody = null;
/*     */     
/* 509 */     Map<String, String> headerParams = new HashMap<>();
/* 510 */     List<String> acceptsList = new ArrayList<>();
/* 511 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 513 */     acceptsList.add("application/json");
/*     */     
/* 515 */     Set<String> keys = headers.keySet();
/*     */     
/* 517 */     for (String key : keys) {
/* 518 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 519 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 520 */         contentTypesList.add(value); continue;
/*     */       } 
/* 522 */       if (key.equalsIgnoreCase("Accept")) {
/* 523 */         acceptsList.add(value); continue;
/*     */       } 
/* 525 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 526 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 528 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 529 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 533 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 535 */     queryParams.addAll(this.apiClient.parameterToPairs("", "versionId", versionId));
/*     */     
/* 537 */     queryParams.addAll(this.apiClient.parameterToPairs("", "participantEmail", participantEmail));
/*     */     
/* 539 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 541 */     String[] accepts = new String[acceptsList.size()];
/* 542 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 544 */     String[] contentTypes = new String[contentTypesList.size()];
/* 545 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 547 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 549 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 551 */     TypeRef<WidgetDocuments> returnType = new TypeRef<WidgetDocuments>() {  };
/* 552 */     return (WidgetDocuments)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public byte[] getWidgetDocumentInfo(MultivaluedMap headers, String widgetId, String documentId) throws ApiException {
/* 573 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 576 */     WidgetsApiValidator.getWidgetDocumentInfoValidator(widgetId, documentId);
/*     */ 
/*     */     
/* 579 */     String path = "/widgets/{widgetId}/documents/{documentId}".replaceAll("\\{format\\}", "json")
/* 580 */       .replaceAll("\\{widgetId\\}", this.apiClient.escapeString(widgetId.toString()))
/* 581 */       .replaceAll("\\{documentId\\}", this.apiClient.escapeString(documentId.toString()));
/*     */     
/* 583 */     Object postBody = null;
/* 584 */     byte[] postBinaryBody = null;
/*     */     
/* 586 */     Map<String, String> headerParams = new HashMap<>();
/* 587 */     List<String> acceptsList = new ArrayList<>();
/* 588 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 590 */     acceptsList.add(" */* ");
/*     */     
/* 592 */     Set<String> keys = headers.keySet();
/*     */     
/* 594 */     for (String key : keys) {
/* 595 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 596 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 597 */         contentTypesList.add(value); continue;
/*     */       } 
/* 599 */       if (key.equalsIgnoreCase("Accept")) {
/* 600 */         acceptsList.add(value); continue;
/*     */       } 
/* 602 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 603 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 605 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 606 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 610 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 612 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 614 */     String[] accepts = new String[acceptsList.size()];
/* 615 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 617 */     String[] contentTypes = new String[contentTypesList.size()];
/* 618 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 620 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 622 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 624 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/* 625 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
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
/*     */   public byte[] getWidgetFormData(MultivaluedMap headers, String widgetId) throws ApiException {
/* 644 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 647 */     WidgetsApiValidator.getWidgetFormDataValidator(widgetId);
/*     */ 
/*     */     
/* 650 */     String path = "/widgets/{widgetId}/formData".replaceAll("\\{format\\}", "json")
/* 651 */       .replaceAll("\\{widgetId\\}", this.apiClient.escapeString(widgetId.toString()));
/*     */     
/* 653 */     Object postBody = null;
/* 654 */     byte[] postBinaryBody = null;
/*     */     
/* 656 */     Map<String, String> headerParams = new HashMap<>();
/* 657 */     List<String> acceptsList = new ArrayList<>();
/* 658 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 660 */     acceptsList.add("text/csv");
/*     */     
/* 662 */     Set<String> keys = headers.keySet();
/*     */     
/* 664 */     for (String key : keys) {
/* 665 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 666 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 667 */         contentTypesList.add(value); continue;
/*     */       } 
/* 669 */       if (key.equalsIgnoreCase("Accept")) {
/* 670 */         acceptsList.add(value); continue;
/*     */       } 
/* 672 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 673 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 675 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 676 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 680 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 682 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 684 */     String[] accepts = new String[acceptsList.size()];
/* 685 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 687 */     String[] contentTypes = new String[contentTypesList.size()];
/* 688 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 690 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 692 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 694 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/* 695 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
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
/*     */   public WidgetPersonalizeResponse updateWidgetPersonalize(MultivaluedMap headers, String widgetId, WidgetPersonalizationInfo widgetPersonalizationInfo) throws ApiException {
/* 716 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 719 */     WidgetsApiValidator.updateWidgetPersonalizeValidator(widgetId, widgetPersonalizationInfo);
/*     */ 
/*     */     
/* 722 */     String path = "/widgets/{widgetId}/personalize".replaceAll("\\{format\\}", "json")
/* 723 */       .replaceAll("\\{widgetId\\}", this.apiClient.escapeString(widgetId.toString()));
/*     */     
/* 725 */     Object postBody = widgetPersonalizationInfo;
/* 726 */     byte[] postBinaryBody = null;
/*     */     
/* 728 */     Map<String, String> headerParams = new HashMap<>();
/* 729 */     List<String> acceptsList = new ArrayList<>();
/* 730 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 732 */     acceptsList.add("application/json");
/*     */     
/* 734 */     Set<String> keys = headers.keySet();
/*     */     
/* 736 */     for (String key : keys) {
/* 737 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 738 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 739 */         contentTypesList.add(value); continue;
/*     */       } 
/* 741 */       if (key.equalsIgnoreCase("Accept")) {
/* 742 */         acceptsList.add(value); continue;
/*     */       } 
/* 744 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 745 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 747 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 748 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 752 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 754 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 756 */     String[] accepts = new String[acceptsList.size()];
/* 757 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 759 */     String[] contentTypes = new String[contentTypesList.size()];
/* 760 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 762 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 764 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 766 */     TypeRef<WidgetPersonalizeResponse> returnType = new TypeRef<WidgetPersonalizeResponse>() {  };
/* 767 */     return (WidgetPersonalizeResponse)this.apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public WidgetStatusUpdateResponse updateWidgetStatus(MultivaluedMap headers, String widgetId, WidgetStatusUpdateInfo widgetStatusUpdateInfo) throws ApiException {
/* 788 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 791 */     WidgetsApiValidator.updateWidgetStatusValidator(widgetId, widgetStatusUpdateInfo);
/*     */ 
/*     */     
/* 794 */     String path = "/widgets/{widgetId}/status".replaceAll("\\{format\\}", "json")
/* 795 */       .replaceAll("\\{widgetId\\}", this.apiClient.escapeString(widgetId.toString()));
/*     */     
/* 797 */     Object postBody = widgetStatusUpdateInfo;
/* 798 */     byte[] postBinaryBody = null;
/*     */     
/* 800 */     Map<String, String> headerParams = new HashMap<>();
/* 801 */     List<String> acceptsList = new ArrayList<>();
/* 802 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 804 */     acceptsList.add("application/json");
/*     */     
/* 806 */     Set<String> keys = headers.keySet();
/*     */     
/* 808 */     for (String key : keys) {
/* 809 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 810 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 811 */         contentTypesList.add(value); continue;
/*     */       } 
/* 813 */       if (key.equalsIgnoreCase("Accept")) {
/* 814 */         acceptsList.add(value); continue;
/*     */       } 
/* 816 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 817 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 819 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 820 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 824 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 826 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 828 */     String[] accepts = new String[acceptsList.size()];
/* 829 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 831 */     String[] contentTypes = new String[contentTypesList.size()];
/* 832 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 834 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 836 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 838 */     TypeRef<WidgetStatusUpdateResponse> returnType = new TypeRef<WidgetStatusUpdateResponse>() {  };
/* 839 */     return (WidgetStatusUpdateResponse)this.apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\WidgetsApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */