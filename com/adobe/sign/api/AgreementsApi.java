/*      */ package com.adobe.sign.api;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashMap;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;

/*      */ import javax.ws.rs.core.MultivaluedMap;

/*      */ 
/*      */ import com.adobe.sign.model.agreements.AgreementCreationInfo;
/*      */ import com.adobe.sign.model.agreements.AgreementCreationResponse;
/*      */ import com.adobe.sign.model.agreements.AgreementDocuments;
/*      */ import com.adobe.sign.model.agreements.AgreementInfo;
/*      */ import com.adobe.sign.model.agreements.AgreementStatusUpdateInfo;
/*      */ import com.adobe.sign.model.agreements.AgreementStatusUpdateResponse;
/*      */ import com.adobe.sign.model.agreements.AlternateParticipantInfo;
/*      */ import com.adobe.sign.model.agreements.AlternateParticipantResponse;
/*      */ import com.adobe.sign.model.agreements.CombinedDocumentPagesInfo;
/*      */ import com.adobe.sign.model.agreements.DocumentImageUrl;
/*      */ import com.adobe.sign.model.agreements.DocumentImageUrls;
/*      */ import com.adobe.sign.model.agreements.DocumentUrl;
/*      */ import com.adobe.sign.model.agreements.SigningUrlResponse;
/*      */ import com.adobe.sign.model.agreements.UserAgreements;
/*      */ import com.adobe.sign.utils.ApiClient;
/*      */ import com.adobe.sign.utils.ApiException;
/*      */ import com.adobe.sign.utils.Context;
/*      */ import com.adobe.sign.utils.Pair;
/*      */ import com.adobe.sign.utils.TypeRef;
/*      */ import com.adobe.sign.utils.validator.AgreementsApiValidator;
/*      */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class AgreementsApi
/*      */ {
/*      */   private ApiClient apiClient;
/*   44 */   private final String CONTENT_TYPE = "Content-Type";
/*   45 */   private final String ACCEPT = "Accept";
/*   46 */   private final String ACCESS_TOKEN = "Access-Token";
/*   47 */   private final String X_API_USER = "x-api-user";
/*      */   
/*      */   public AgreementsApi() {
/*   50 */     this.apiClient = Context.getDefaultApiClient();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public UserAgreements getAgreements(MultivaluedMap headers, String query, String externalId, String externalGroup, String externalNamespace) throws ApiException {
/*   75 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*   78 */     AgreementsApiValidator.getAgreementsValidator(query, externalId, externalGroup, externalNamespace);
/*      */ 
/*      */     
/*   81 */     String path = "/agreements".replaceAll("\\{format\\}", "json");
/*      */     
/*   83 */     Object postBody = null;
/*   84 */     byte[] postBinaryBody = null;
/*      */     
/*   86 */     Map<String, String> headerParams = new HashMap<>();
/*   87 */     List<String> acceptsList = new ArrayList<>();
/*   88 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*   90 */     acceptsList.add("application/json");
/*      */     
/*   92 */     Set<String> keys = headers.keySet();
/*      */     
/*   94 */     for (String key : keys) {
/*   95 */       String value = this.apiClient.parameterToString(headers.get(key));
/*   96 */       if (key.equalsIgnoreCase("Content-Type")) {
/*   97 */         contentTypesList.add(value); continue;
/*      */       } 
/*   99 */       if (key.equalsIgnoreCase("Accept")) {
/*  100 */         acceptsList.add(value); continue;
/*      */       } 
/*  102 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  103 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  105 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  106 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  110 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  112 */     queryParams.addAll(this.apiClient.parameterToPairs("", "query", query));
/*      */     
/*  114 */     queryParams.addAll(this.apiClient.parameterToPairs("", "externalId", externalId));
/*      */     
/*  116 */     queryParams.addAll(this.apiClient.parameterToPairs("", "externalGroup", externalGroup));
/*      */     
/*  118 */     queryParams.addAll(this.apiClient.parameterToPairs("", "externalNamespace", externalNamespace));
/*      */     
/*  120 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  122 */     String[] accepts = new String[acceptsList.size()];
/*  123 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  125 */     String[] contentTypes = new String[contentTypesList.size()];
/*  126 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  128 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  130 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  132 */     TypeRef<UserAgreements> returnType = new TypeRef<UserAgreements>() {  };
/*  133 */     return (UserAgreements)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AgreementCreationResponse createAgreement(MultivaluedMap headers, AgreementCreationInfo agreementCreationInfo) throws ApiException {
/*  152 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  155 */     AgreementsApiValidator.createAgreementValidator(agreementCreationInfo);
/*      */ 
/*      */     
/*  158 */     String path = "/agreements".replaceAll("\\{format\\}", "json");
/*      */     
/*  160 */     Object postBody = agreementCreationInfo;
/*  161 */     byte[] postBinaryBody = null;
/*      */     
/*  163 */     Map<String, String> headerParams = new HashMap<>();
/*  164 */     List<String> acceptsList = new ArrayList<>();
/*  165 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  167 */     acceptsList.add("application/json");
/*      */     
/*  169 */     Set<String> keys = headers.keySet();
/*      */     
/*  171 */     for (String key : keys) {
/*  172 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  173 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  174 */         contentTypesList.add(value); continue;
/*      */       } 
/*  176 */       if (key.equalsIgnoreCase("Accept")) {
/*  177 */         acceptsList.add(value); continue;
/*      */       } 
/*  179 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  180 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  182 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  183 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  187 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  189 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  191 */     String[] accepts = new String[acceptsList.size()];
/*  192 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  194 */     String[] contentTypes = new String[contentTypesList.size()];
/*  195 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  197 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  199 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  201 */     TypeRef<AgreementCreationResponse> returnType = new TypeRef<AgreementCreationResponse>() {  };
/*  202 */     return (AgreementCreationResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AgreementInfo getAgreementInfo(MultivaluedMap headers, String agreementId) throws ApiException {
/*  221 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  224 */     AgreementsApiValidator.getAgreementInfoValidator(agreementId);
/*      */ 
/*      */     
/*  227 */     String path = "/agreements/{agreementId}".replaceAll("\\{format\\}", "json")
/*  228 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/*  230 */     Object postBody = null;
/*  231 */     byte[] postBinaryBody = null;
/*      */     
/*  233 */     Map<String, String> headerParams = new HashMap<>();
/*  234 */     List<String> acceptsList = new ArrayList<>();
/*  235 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  237 */     acceptsList.add("application/json");
/*      */     
/*  239 */     Set<String> keys = headers.keySet();
/*      */     
/*  241 */     for (String key : keys) {
/*  242 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  243 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  244 */         contentTypesList.add(value); continue;
/*      */       } 
/*  246 */       if (key.equalsIgnoreCase("Accept")) {
/*  247 */         acceptsList.add(value); continue;
/*      */       } 
/*  249 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  250 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  252 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  253 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  257 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  259 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  261 */     String[] accepts = new String[acceptsList.size()];
/*  262 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  264 */     String[] contentTypes = new String[contentTypesList.size()];
/*  265 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  267 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  269 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  271 */     TypeRef<AgreementInfo> returnType = new TypeRef<AgreementInfo>() {  };
/*  272 */     return (AgreementInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteAgreement(MultivaluedMap headers, String agreementId) throws ApiException {
/*  291 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  294 */     AgreementsApiValidator.deleteAgreementValidator(agreementId);
/*      */ 
/*      */     
/*  297 */     String path = "/agreements/{agreementId}".replaceAll("\\{format\\}", "json")
/*  298 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/*  300 */     Object postBody = null;
/*  301 */     byte[] postBinaryBody = null;
/*      */     
/*  303 */     Map<String, String> headerParams = new HashMap<>();
/*  304 */     List<String> acceptsList = new ArrayList<>();
/*  305 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  307 */     acceptsList.add("application/json");
/*      */     
/*  309 */     Set<String> keys = headers.keySet();
/*      */     
/*  311 */     for (String key : keys) {
/*  312 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  313 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  314 */         contentTypesList.add(value); continue;
/*      */       } 
/*  316 */       if (key.equalsIgnoreCase("Accept")) {
/*  317 */         acceptsList.add(value); continue;
/*      */       } 
/*  319 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  320 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  322 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  323 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  327 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  329 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  331 */     String[] accepts = new String[acceptsList.size()];
/*  332 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  334 */     String[] contentTypes = new String[contentTypesList.size()];
/*  335 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  337 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  339 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  341 */     this.apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, null, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public byte[] getAuditTrail(MultivaluedMap headers, String agreementId) throws ApiException {
/*  360 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  363 */     AgreementsApiValidator.getAuditTrailValidator(agreementId);
/*      */ 
/*      */     
/*  366 */     String path = "/agreements/{agreementId}/auditTrail".replaceAll("\\{format\\}", "json")
/*  367 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/*  369 */     Object postBody = null;
/*  370 */     byte[] postBinaryBody = null;
/*      */     
/*  372 */     Map<String, String> headerParams = new HashMap<>();
/*  373 */     List<String> acceptsList = new ArrayList<>();
/*  374 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  376 */     acceptsList.add(" */* ");
/*      */     
/*  378 */     Set<String> keys = headers.keySet();
/*      */     
/*  380 */     for (String key : keys) {
/*  381 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  382 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  383 */         contentTypesList.add(value); continue;
/*      */       } 
/*  385 */       if (key.equalsIgnoreCase("Accept")) {
/*  386 */         acceptsList.add(value); continue;
/*      */       } 
/*  388 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  389 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  391 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  392 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  396 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  398 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  400 */     String[] accepts = new String[acceptsList.size()];
/*  401 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  403 */     String[] contentTypes = new String[contentTypesList.size()];
/*  404 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  406 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  408 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  410 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/*  411 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public byte[] getCombinedDocument(MultivaluedMap headers, String agreementId, String versionId, String participantEmail, Boolean attachSupportingDocuments, Boolean auditReport) throws ApiException {
/*  438 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  441 */     AgreementsApiValidator.getCombinedDocumentValidator(agreementId, versionId, participantEmail, attachSupportingDocuments.booleanValue(), auditReport.booleanValue());
/*      */ 
/*      */     
/*  444 */     String path = "/agreements/{agreementId}/combinedDocument".replaceAll("\\{format\\}", "json")
/*  445 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/*  447 */     Object postBody = null;
/*  448 */     byte[] postBinaryBody = null;
/*      */     
/*  450 */     Map<String, String> headerParams = new HashMap<>();
/*  451 */     List<String> acceptsList = new ArrayList<>();
/*  452 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  454 */     acceptsList.add(" */* ");
/*      */     
/*  456 */     Set<String> keys = headers.keySet();
/*      */     
/*  458 */     for (String key : keys) {
/*  459 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  460 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  461 */         contentTypesList.add(value); continue;
/*      */       } 
/*  463 */       if (key.equalsIgnoreCase("Accept")) {
/*  464 */         acceptsList.add(value); continue;
/*      */       } 
/*  466 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  467 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  469 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  470 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  474 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  476 */     queryParams.addAll(this.apiClient.parameterToPairs("", "versionId", versionId));
/*      */     
/*  478 */     queryParams.addAll(this.apiClient.parameterToPairs("", "participantEmail", participantEmail));
/*      */     
/*  480 */     queryParams.addAll(this.apiClient.parameterToPairs("", "attachSupportingDocuments", attachSupportingDocuments));
/*      */     
/*  482 */     queryParams.addAll(this.apiClient.parameterToPairs("", "auditReport", auditReport));
/*      */     
/*  484 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  486 */     String[] accepts = new String[acceptsList.size()];
/*  487 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  489 */     String[] contentTypes = new String[contentTypesList.size()];
/*  490 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  492 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  494 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  496 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/*  497 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CombinedDocumentPagesInfo getCombinedDocumentPagesInfo(MultivaluedMap headers, String agreementId, Boolean includeSupportingDocumentsPagesInfo) throws ApiException {
/*  518 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  521 */     AgreementsApiValidator.getCombinedDocumentPagesInfoValidator(agreementId, includeSupportingDocumentsPagesInfo.booleanValue());
/*      */ 
/*      */     
/*  524 */     String path = "/agreements/{agreementId}/combinedDocument/pagesInfo".replaceAll("\\{format\\}", "json")
/*  525 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/*  527 */     Object postBody = null;
/*  528 */     byte[] postBinaryBody = null;
/*      */     
/*  530 */     Map<String, String> headerParams = new HashMap<>();
/*  531 */     List<String> acceptsList = new ArrayList<>();
/*  532 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  534 */     acceptsList.add("application/json");
/*      */     
/*  536 */     Set<String> keys = headers.keySet();
/*      */     
/*  538 */     for (String key : keys) {
/*  539 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  540 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  541 */         contentTypesList.add(value); continue;
/*      */       } 
/*  543 */       if (key.equalsIgnoreCase("Accept")) {
/*  544 */         acceptsList.add(value); continue;
/*      */       } 
/*  546 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  547 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  549 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  550 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  554 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  556 */     queryParams.addAll(this.apiClient.parameterToPairs("", "includeSupportingDocumentsPagesInfo", includeSupportingDocumentsPagesInfo));
/*      */     
/*  558 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  560 */     String[] accepts = new String[acceptsList.size()];
/*  561 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  563 */     String[] contentTypes = new String[contentTypesList.size()];
/*  564 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  566 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  568 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  570 */     TypeRef<CombinedDocumentPagesInfo> returnType = new TypeRef<CombinedDocumentPagesInfo>() {  };
/*  571 */     return (CombinedDocumentPagesInfo)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DocumentUrl getCombinedDocumentUrl(MultivaluedMap headers, String agreementId, String versionId, String participantEmail, Boolean attachSupportingDocuments, Boolean auditReport) throws ApiException {
/*  598 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  601 */     AgreementsApiValidator.getCombinedDocumentUrlValidator(agreementId, versionId, participantEmail, attachSupportingDocuments.booleanValue(), auditReport.booleanValue());
/*      */ 
/*      */     
/*  604 */     String path = "/agreements/{agreementId}/combinedDocument/url".replaceAll("\\{format\\}", "json")
/*  605 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/*  607 */     Object postBody = null;
/*  608 */     byte[] postBinaryBody = null;
/*      */     
/*  610 */     Map<String, String> headerParams = new HashMap<>();
/*  611 */     List<String> acceptsList = new ArrayList<>();
/*  612 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  614 */     acceptsList.add("application/json");
/*      */     
/*  616 */     Set<String> keys = headers.keySet();
/*      */     
/*  618 */     for (String key : keys) {
/*  619 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  620 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  621 */         contentTypesList.add(value); continue;
/*      */       } 
/*  623 */       if (key.equalsIgnoreCase("Accept")) {
/*  624 */         acceptsList.add(value); continue;
/*      */       } 
/*  626 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  627 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  629 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  630 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  634 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  636 */     queryParams.addAll(this.apiClient.parameterToPairs("", "versionId", versionId));
/*      */     
/*  638 */     queryParams.addAll(this.apiClient.parameterToPairs("", "participantEmail", participantEmail));
/*      */     
/*  640 */     queryParams.addAll(this.apiClient.parameterToPairs("", "attachSupportingDocuments", attachSupportingDocuments));
/*      */     
/*  642 */     queryParams.addAll(this.apiClient.parameterToPairs("", "auditReport", auditReport));
/*      */     
/*  644 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  646 */     String[] accepts = new String[acceptsList.size()];
/*  647 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  649 */     String[] contentTypes = new String[contentTypesList.size()];
/*  650 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  652 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  654 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  656 */     TypeRef<DocumentUrl> returnType = new TypeRef<DocumentUrl>() {  };
/*  657 */     return (DocumentUrl)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AgreementDocuments getAllDocuments(MultivaluedMap headers, String agreementId, String versionId, String participantEmail, String supportingDocumentContentFormat) throws ApiException {
/*  682 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  685 */     AgreementsApiValidator.getAllDocumentsValidator(agreementId, versionId, participantEmail, supportingDocumentContentFormat);
/*      */ 
/*      */     
/*  688 */     String path = "/agreements/{agreementId}/documents".replaceAll("\\{format\\}", "json")
/*  689 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/*  691 */     Object postBody = null;
/*  692 */     byte[] postBinaryBody = null;
/*      */     
/*  694 */     Map<String, String> headerParams = new HashMap<>();
/*  695 */     List<String> acceptsList = new ArrayList<>();
/*  696 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  698 */     acceptsList.add("application/json");
/*      */     
/*  700 */     Set<String> keys = headers.keySet();
/*      */     
/*  702 */     for (String key : keys) {
/*  703 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  704 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  705 */         contentTypesList.add(value); continue;
/*      */       } 
/*  707 */       if (key.equalsIgnoreCase("Accept")) {
/*  708 */         acceptsList.add(value); continue;
/*      */       } 
/*  710 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  711 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  713 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  714 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  718 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  720 */     queryParams.addAll(this.apiClient.parameterToPairs("", "versionId", versionId));
/*      */     
/*  722 */     queryParams.addAll(this.apiClient.parameterToPairs("", "participantEmail", participantEmail));
/*      */     
/*  724 */     queryParams.addAll(this.apiClient.parameterToPairs("", "supportingDocumentContentFormat", supportingDocumentContentFormat));
/*      */     
/*  726 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  728 */     String[] accepts = new String[acceptsList.size()];
/*  729 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  731 */     String[] contentTypes = new String[contentTypesList.size()];
/*  732 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  734 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  736 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  738 */     TypeRef<AgreementDocuments> returnType = new TypeRef<AgreementDocuments>() {  };
/*  739 */     return (AgreementDocuments)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteDocuments(MultivaluedMap headers, String agreementId) throws ApiException {
/*  758 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  761 */     AgreementsApiValidator.deleteDocumentsValidator(agreementId);
/*      */ 
/*      */     
/*  764 */     String path = "/agreements/{agreementId}/documents".replaceAll("\\{format\\}", "json")
/*  765 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/*  767 */     Object postBody = null;
/*  768 */     byte[] postBinaryBody = null;
/*      */     
/*  770 */     Map<String, String> headerParams = new HashMap<>();
/*  771 */     List<String> acceptsList = new ArrayList<>();
/*  772 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  774 */     acceptsList.add("application/json");
/*      */     
/*  776 */     Set<String> keys = headers.keySet();
/*      */     
/*  778 */     for (String key : keys) {
/*  779 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  780 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  781 */         contentTypesList.add(value); continue;
/*      */       } 
/*  783 */       if (key.equalsIgnoreCase("Accept")) {
/*  784 */         acceptsList.add(value); continue;
/*      */       } 
/*  786 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  787 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  789 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  790 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  794 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  796 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  798 */     String[] accepts = new String[acceptsList.size()];
/*  799 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  801 */     String[] contentTypes = new String[contentTypesList.size()];
/*  802 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  804 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  806 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  808 */     this.apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, null, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DocumentImageUrls getCombinedDocumentImageUrls(MultivaluedMap headers, String agreementId, String versionId, String participantEmail, String imageSizes, Boolean includeSupportingDocumentsImageUrls, Boolean showImageAvailabilityOnly) throws ApiException {
/*  837 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  840 */     AgreementsApiValidator.getCombinedDocumentImageUrlsValidator(agreementId, versionId, participantEmail, imageSizes, includeSupportingDocumentsImageUrls.booleanValue(), showImageAvailabilityOnly.booleanValue());
/*      */ 
/*      */     
/*  843 */     String path = "/agreements/{agreementId}/documents/imageUrls".replaceAll("\\{format\\}", "json")
/*  844 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/*  846 */     Object postBody = null;
/*  847 */     byte[] postBinaryBody = null;
/*      */     
/*  849 */     Map<String, String> headerParams = new HashMap<>();
/*  850 */     List<String> acceptsList = new ArrayList<>();
/*  851 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  853 */     acceptsList.add("application/json");
/*      */     
/*  855 */     Set<String> keys = headers.keySet();
/*      */     
/*  857 */     for (String key : keys) {
/*  858 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  859 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  860 */         contentTypesList.add(value); continue;
/*      */       } 
/*  862 */       if (key.equalsIgnoreCase("Accept")) {
/*  863 */         acceptsList.add(value); continue;
/*      */       } 
/*  865 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  866 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  868 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  869 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  873 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  875 */     queryParams.addAll(this.apiClient.parameterToPairs("", "versionId", versionId));
/*      */     
/*  877 */     queryParams.addAll(this.apiClient.parameterToPairs("", "participantEmail", participantEmail));
/*      */     
/*  879 */     queryParams.addAll(this.apiClient.parameterToPairs("", "imageSizes", imageSizes));
/*      */     
/*  881 */     queryParams.addAll(this.apiClient.parameterToPairs("", "includeSupportingDocumentsImageUrls", includeSupportingDocumentsImageUrls));
/*      */     
/*  883 */     queryParams.addAll(this.apiClient.parameterToPairs("", "showImageAvailabilityOnly", showImageAvailabilityOnly));
/*      */     
/*  885 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  887 */     String[] accepts = new String[acceptsList.size()];
/*  888 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  890 */     String[] contentTypes = new String[contentTypesList.size()];
/*  891 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  893 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  895 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  897 */     TypeRef<DocumentImageUrls> returnType = new TypeRef<DocumentImageUrls>() {  };
/*  898 */     return (DocumentImageUrls)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public byte[] getDocument(MultivaluedMap headers, String agreementId, String documentId) throws ApiException {
/*  919 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/*  922 */     AgreementsApiValidator.getDocumentValidator(agreementId, documentId);
/*      */ 
/*      */     
/*  925 */     String path = "/agreements/{agreementId}/documents/{documentId}".replaceAll("\\{format\\}", "json")
/*  926 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()))
/*  927 */       .replaceAll("\\{documentId\\}", this.apiClient.escapeString(documentId.toString()));
/*      */     
/*  929 */     Object postBody = null;
/*  930 */     byte[] postBinaryBody = null;
/*      */     
/*  932 */     Map<String, String> headerParams = new HashMap<>();
/*  933 */     List<String> acceptsList = new ArrayList<>();
/*  934 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/*  936 */     acceptsList.add(" */* ");
/*      */     
/*  938 */     Set<String> keys = headers.keySet();
/*      */     
/*  940 */     for (String key : keys) {
/*  941 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  942 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  943 */         contentTypesList.add(value); continue;
/*      */       } 
/*  945 */       if (key.equalsIgnoreCase("Accept")) {
/*  946 */         acceptsList.add(value); continue;
/*      */       } 
/*  948 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  949 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/*  951 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  952 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/*  956 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/*  958 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/*  960 */     String[] accepts = new String[acceptsList.size()];
/*  961 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/*  963 */     String[] contentTypes = new String[contentTypesList.size()];
/*  964 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/*  966 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/*  968 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/*  970 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/*  971 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DocumentImageUrl getDocumentImageUrls(MultivaluedMap headers, String agreementId, String documentId, String versionId, String participantEmail, String imageSizes, Boolean showImageAvailabilityOnly, Integer startPage, Integer endPage) throws ApiException {
/* 1004 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/* 1007 */     AgreementsApiValidator.getDocumentImageUrlsValidator(agreementId, documentId, versionId, participantEmail, imageSizes, showImageAvailabilityOnly.booleanValue(), startPage, endPage);
/*      */ 
/*      */     
/* 1010 */     String path = "/agreements/{agreementId}/documents/{documentId}/imageUrls".replaceAll("\\{format\\}", "json")
/* 1011 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()))
/* 1012 */       .replaceAll("\\{documentId\\}", this.apiClient.escapeString(documentId.toString()));
/*      */     
/* 1014 */     Object postBody = null;
/* 1015 */     byte[] postBinaryBody = null;
/*      */     
/* 1017 */     Map<String, String> headerParams = new HashMap<>();
/* 1018 */     List<String> acceptsList = new ArrayList<>();
/* 1019 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/* 1021 */     acceptsList.add("application/json");
/*      */     
/* 1023 */     Set<String> keys = headers.keySet();
/*      */     
/* 1025 */     for (String key : keys) {
/* 1026 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 1027 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 1028 */         contentTypesList.add(value); continue;
/*      */       } 
/* 1030 */       if (key.equalsIgnoreCase("Accept")) {
/* 1031 */         acceptsList.add(value); continue;
/*      */       } 
/* 1033 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 1034 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/* 1036 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 1037 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/* 1041 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/* 1043 */     queryParams.addAll(this.apiClient.parameterToPairs("", "versionId", versionId));
/*      */     
/* 1045 */     queryParams.addAll(this.apiClient.parameterToPairs("", "participantEmail", participantEmail));
/*      */     
/* 1047 */     queryParams.addAll(this.apiClient.parameterToPairs("", "imageSizes", imageSizes));
/*      */     
/* 1049 */     queryParams.addAll(this.apiClient.parameterToPairs("", "showImageAvailabilityOnly", showImageAvailabilityOnly));
/*      */     
/* 1051 */     queryParams.addAll(this.apiClient.parameterToPairs("", "startPage", startPage));
/*      */     
/* 1053 */     queryParams.addAll(this.apiClient.parameterToPairs("", "endPage", endPage));
/*      */     
/* 1055 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/* 1057 */     String[] accepts = new String[acceptsList.size()];
/* 1058 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/* 1060 */     String[] contentTypes = new String[contentTypesList.size()];
/* 1061 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/* 1063 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/* 1065 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/* 1067 */     TypeRef<DocumentImageUrl> returnType = new TypeRef<DocumentImageUrl>() {  };
/* 1068 */     return (DocumentImageUrl)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DocumentUrl getDocumentUrl(MultivaluedMap headers, String agreementId, String documentId, String versionId, String participantEmail) throws ApiException {
/* 1093 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/* 1096 */     AgreementsApiValidator.getDocumentUrlValidator(agreementId, documentId, versionId, participantEmail);
/*      */ 
/*      */     
/* 1099 */     String path = "/agreements/{agreementId}/documents/{documentId}/url".replaceAll("\\{format\\}", "json")
/* 1100 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()))
/* 1101 */       .replaceAll("\\{documentId\\}", this.apiClient.escapeString(documentId.toString()));
/*      */     
/* 1103 */     Object postBody = null;
/* 1104 */     byte[] postBinaryBody = null;
/*      */     
/* 1106 */     Map<String, String> headerParams = new HashMap<>();
/* 1107 */     List<String> acceptsList = new ArrayList<>();
/* 1108 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/* 1110 */     acceptsList.add("application/json");
/*      */     
/* 1112 */     Set<String> keys = headers.keySet();
/*      */     
/* 1114 */     for (String key : keys) {
/* 1115 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 1116 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 1117 */         contentTypesList.add(value); continue;
/*      */       } 
/* 1119 */       if (key.equalsIgnoreCase("Accept")) {
/* 1120 */         acceptsList.add(value); continue;
/*      */       } 
/* 1122 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 1123 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/* 1125 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 1126 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/* 1130 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/* 1132 */     queryParams.addAll(this.apiClient.parameterToPairs("", "versionId", versionId));
/*      */     
/* 1134 */     queryParams.addAll(this.apiClient.parameterToPairs("", "participantEmail", participantEmail));
/*      */     
/* 1136 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/* 1138 */     String[] accepts = new String[acceptsList.size()];
/* 1139 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/* 1141 */     String[] contentTypes = new String[contentTypesList.size()];
/* 1142 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/* 1144 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/* 1146 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/* 1148 */     TypeRef<DocumentUrl> returnType = new TypeRef<DocumentUrl>() {  };
/* 1149 */     return (DocumentUrl)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public byte[] getFormData(MultivaluedMap headers, String agreementId) throws ApiException {
/* 1168 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/* 1171 */     AgreementsApiValidator.getFormDataValidator(agreementId);
/*      */ 
/*      */     
/* 1174 */     String path = "/agreements/{agreementId}/formData".replaceAll("\\{format\\}", "json")
/* 1175 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/* 1177 */     Object postBody = null;
/* 1178 */     byte[] postBinaryBody = null;
/*      */     
/* 1180 */     Map<String, String> headerParams = new HashMap<>();
/* 1181 */     List<String> acceptsList = new ArrayList<>();
/* 1182 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/* 1184 */     acceptsList.add("text/csv");
/*      */     
/* 1186 */     Set<String> keys = headers.keySet();
/*      */     
/* 1188 */     for (String key : keys) {
/* 1189 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 1190 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 1191 */         contentTypesList.add(value); continue;
/*      */       } 
/* 1193 */       if (key.equalsIgnoreCase("Accept")) {
/* 1194 */         acceptsList.add(value); continue;
/*      */       } 
/* 1196 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 1197 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/* 1199 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 1200 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/* 1204 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/* 1206 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/* 1208 */     String[] accepts = new String[acceptsList.size()];
/* 1209 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/* 1211 */     String[] contentTypes = new String[contentTypesList.size()];
/* 1212 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/* 1214 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/* 1216 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/* 1218 */     return this.apiClient.invokeBinaryAPI(path, "GET", queryParams, 
/* 1219 */         postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AlternateParticipantResponse createAlternateParticipant(MultivaluedMap headers, String agreementId, String participantSetId, String participantId, AlternateParticipantInfo alternateParticipantInfo) throws ApiException {
/* 1244 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/* 1247 */     AgreementsApiValidator.createAlternateParticipantValidator(agreementId, participantSetId, participantId, alternateParticipantInfo);
/*      */ 
/*      */     
/* 1250 */     String path = "/agreements/{agreementId}/participantSets/{participantSetId}/participants/{participantId}/alternateParticipants".replaceAll("\\{format\\}", "json")
/* 1251 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()))
/* 1252 */       .replaceAll("\\{participantSetId\\}", this.apiClient.escapeString(participantSetId.toString()))
/* 1253 */       .replaceAll("\\{participantId\\}", this.apiClient.escapeString(participantId.toString()));
/*      */     
/* 1255 */     Object postBody = alternateParticipantInfo;
/* 1256 */     byte[] postBinaryBody = null;
/*      */     
/* 1258 */     Map<String, String> headerParams = new HashMap<>();
/* 1259 */     List<String> acceptsList = new ArrayList<>();
/* 1260 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/* 1262 */     acceptsList.add("application/json");
/*      */     
/* 1264 */     Set<String> keys = headers.keySet();
/*      */     
/* 1266 */     for (String key : keys) {
/* 1267 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 1268 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 1269 */         contentTypesList.add(value); continue;
/*      */       } 
/* 1271 */       if (key.equalsIgnoreCase("Accept")) {
/* 1272 */         acceptsList.add(value); continue;
/*      */       } 
/* 1274 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 1275 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/* 1277 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 1278 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/* 1282 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/* 1284 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/* 1286 */     String[] accepts = new String[acceptsList.size()];
/* 1287 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/* 1289 */     String[] contentTypes = new String[contentTypesList.size()];
/* 1290 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/* 1292 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/* 1294 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/* 1296 */     TypeRef<AlternateParticipantResponse> returnType = new TypeRef<AlternateParticipantResponse>() {  };
/* 1297 */     return (AlternateParticipantResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SigningUrlResponse getSigningUrl(MultivaluedMap headers, String agreementId) throws ApiException {
/* 1316 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/* 1319 */     AgreementsApiValidator.getSigningUrlValidator(agreementId);
/*      */ 
/*      */     
/* 1322 */     String path = "/agreements/{agreementId}/signingUrls".replaceAll("\\{format\\}", "json")
/* 1323 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/* 1325 */     Object postBody = null;
/* 1326 */     byte[] postBinaryBody = null;
/*      */     
/* 1328 */     Map<String, String> headerParams = new HashMap<>();
/* 1329 */     List<String> acceptsList = new ArrayList<>();
/* 1330 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/* 1332 */     acceptsList.add("application/json");
/*      */     
/* 1334 */     Set<String> keys = headers.keySet();
/*      */     
/* 1336 */     for (String key : keys) {
/* 1337 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 1338 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 1339 */         contentTypesList.add(value); continue;
/*      */       } 
/* 1341 */       if (key.equalsIgnoreCase("Accept")) {
/* 1342 */         acceptsList.add(value); continue;
/*      */       } 
/* 1344 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 1345 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/* 1347 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 1348 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/* 1352 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/* 1354 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/* 1356 */     String[] accepts = new String[acceptsList.size()];
/* 1357 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/* 1359 */     String[] contentTypes = new String[contentTypesList.size()];
/* 1360 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/* 1362 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/* 1364 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/* 1366 */     TypeRef<SigningUrlResponse> returnType = new TypeRef<SigningUrlResponse>() {  };
/* 1367 */     return (SigningUrlResponse)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AgreementStatusUpdateResponse updateStatus(MultivaluedMap headers, String agreementId, AgreementStatusUpdateInfo agreementStatusUpdateInfo) throws ApiException {
/* 1388 */     ApiValidatorHelper.validateHeaderParams(headers);
/*      */ 
/*      */     
/* 1391 */     AgreementsApiValidator.updateStatusValidator(agreementId, agreementStatusUpdateInfo);
/*      */ 
/*      */     
/* 1394 */     String path = "/agreements/{agreementId}/status".replaceAll("\\{format\\}", "json")
/* 1395 */       .replaceAll("\\{agreementId\\}", this.apiClient.escapeString(agreementId.toString()));
/*      */     
/* 1397 */     Object postBody = agreementStatusUpdateInfo;
/* 1398 */     byte[] postBinaryBody = null;
/*      */     
/* 1400 */     Map<String, String> headerParams = new HashMap<>();
/* 1401 */     List<String> acceptsList = new ArrayList<>();
/* 1402 */     List<String> contentTypesList = new ArrayList<>();
/*      */     
/* 1404 */     acceptsList.add("application/json");
/*      */     
/* 1406 */     Set<String> keys = headers.keySet();
/*      */     
/* 1408 */     for (String key : keys) {
/* 1409 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 1410 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 1411 */         contentTypesList.add(value); continue;
/*      */       } 
/* 1413 */       if (key.equalsIgnoreCase("Accept")) {
/* 1414 */         acceptsList.add(value); continue;
/*      */       } 
/* 1416 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 1417 */         headerParams.put("Access-Token", value); continue;
/*      */       } 
/* 1419 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 1420 */         headerParams.put("x-api-user", value);
/*      */       }
/*      */     } 
/*      */     
/* 1424 */     List<Pair> queryParams = new ArrayList<>();
/*      */     
/* 1426 */     Map<String, Object> formParams = new HashMap<>();
/*      */     
/* 1428 */     String[] accepts = new String[acceptsList.size()];
/* 1429 */     accepts = acceptsList.<String>toArray(accepts);
/*      */     
/* 1431 */     String[] contentTypes = new String[contentTypesList.size()];
/* 1432 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*      */     
/* 1434 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*      */     
/* 1436 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*      */     
/* 1438 */     TypeRef<AgreementStatusUpdateResponse> returnType = new TypeRef<AgreementStatusUpdateResponse>() {  };
/* 1439 */     return (AgreementStatusUpdateResponse)this.apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*      */   }
/*      */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\AgreementsApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */