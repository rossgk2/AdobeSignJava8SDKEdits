/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.workflows.AgreementCreationResponse;
/*     */ import com.adobe.sign.model.workflows.CustomWorkflowAgreementCreationRequest;
/*     */ import com.adobe.sign.model.workflows.UserWorkflows;
/*     */ import com.adobe.sign.model.workflows.WorkflowDescription;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.WorkflowsApiValidator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WorkflowsApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  34 */   private final String CONTENT_TYPE = "Content-Type";
/*  35 */   private final String ACCEPT = "Accept";
/*  36 */   private final String ACCESS_TOKEN = "Access-Token";
/*  37 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public WorkflowsApi() {
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
/*     */ 
/*     */   
/*     */   public UserWorkflows getWorkflows(MultivaluedMap headers, Boolean includeDraftWorkflows, String groupId) throws ApiException {
/*  61 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  64 */     WorkflowsApiValidator.getWorkflowsValidator(includeDraftWorkflows, groupId);
/*     */ 
/*     */     
/*  67 */     String path = "/workflows".replaceAll("\\{format\\}", "json");
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
/*  78 */     Set<String> keys = headers.keySet();
/*     */     
/*  80 */     for (String key : keys) {
/*  81 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  82 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  83 */         contentTypesList.add(value); continue;
/*     */       } 
/*  85 */       if (key.equalsIgnoreCase("Accept")) {
/*  86 */         acceptsList.add(value); continue;
/*     */       } 
/*  88 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  89 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/*  91 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  92 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/*  96 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/*  98 */     queryParams.addAll(this.apiClient.parameterToPairs("", "includeDraftWorkflows", includeDraftWorkflows));
/*     */     
/* 100 */     queryParams.addAll(this.apiClient.parameterToPairs("", "groupId", groupId));
/*     */     
/* 102 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 104 */     String[] accepts = new String[acceptsList.size()];
/* 105 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 107 */     String[] contentTypes = new String[contentTypesList.size()];
/* 108 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 110 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 112 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 114 */     TypeRef<UserWorkflows> returnType = new TypeRef<UserWorkflows>() {  };
/* 115 */     return (UserWorkflows)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public WorkflowDescription getWorkflowInfo(MultivaluedMap headers, String workflowId) throws ApiException {
/* 134 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 137 */     WorkflowsApiValidator.getWorkflowInfoValidator(workflowId);
/*     */ 
/*     */     
/* 140 */     String path = "/workflows/{workflowId}".replaceAll("\\{format\\}", "json")
/* 141 */       .replaceAll("\\{workflowId\\}", this.apiClient.escapeString(workflowId.toString()));
/*     */     
/* 143 */     Object postBody = null;
/* 144 */     byte[] postBinaryBody = null;
/*     */     
/* 146 */     Map<String, String> headerParams = new HashMap<>();
/* 147 */     List<String> acceptsList = new ArrayList<>();
/* 148 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 150 */     acceptsList.add("application/json");
/*     */     
/* 152 */     Set<String> keys = headers.keySet();
/*     */     
/* 154 */     for (String key : keys) {
/* 155 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 156 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 157 */         contentTypesList.add(value); continue;
/*     */       } 
/* 159 */       if (key.equalsIgnoreCase("Accept")) {
/* 160 */         acceptsList.add(value); continue;
/*     */       } 
/* 162 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 163 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 165 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 166 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 170 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 172 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 174 */     String[] accepts = new String[acceptsList.size()];
/* 175 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 177 */     String[] contentTypes = new String[contentTypesList.size()];
/* 178 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 180 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 182 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 184 */     TypeRef<WorkflowDescription> returnType = new TypeRef<WorkflowDescription>() {  };
/* 185 */     return (WorkflowDescription)this.apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
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
/*     */   public AgreementCreationResponse createWorkflowAgreement(MultivaluedMap headers, String workflowId, CustomWorkflowAgreementCreationRequest customWorkflowAgreementCreationRequest) throws ApiException {
/* 206 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/* 209 */     WorkflowsApiValidator.createWorkflowAgreementValidator(workflowId, customWorkflowAgreementCreationRequest);
/*     */ 
/*     */     
/* 212 */     String path = "/workflows/{workflowId}/agreements".replaceAll("\\{format\\}", "json")
/* 213 */       .replaceAll("\\{workflowId\\}", this.apiClient.escapeString(workflowId.toString()));
/*     */     
/* 215 */     Object postBody = customWorkflowAgreementCreationRequest;
/* 216 */     byte[] postBinaryBody = null;
/*     */     
/* 218 */     Map<String, String> headerParams = new HashMap<>();
/* 219 */     List<String> acceptsList = new ArrayList<>();
/* 220 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/* 222 */     acceptsList.add("application/json");
/*     */     
/* 224 */     Set<String> keys = headers.keySet();
/*     */     
/* 226 */     for (String key : keys) {
/* 227 */       String value = this.apiClient.parameterToString(headers.get(key));
/* 228 */       if (key.equalsIgnoreCase("Content-Type")) {
/* 229 */         contentTypesList.add(value); continue;
/*     */       } 
/* 231 */       if (key.equalsIgnoreCase("Accept")) {
/* 232 */         acceptsList.add(value); continue;
/*     */       } 
/* 234 */       if (key.equalsIgnoreCase("Access-Token")) {
/* 235 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/* 237 */       if (key.equalsIgnoreCase("x-api-user")) {
/* 238 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/* 242 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 244 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 246 */     String[] accepts = new String[acceptsList.size()];
/* 247 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/* 249 */     String[] contentTypes = new String[contentTypesList.size()];
/* 250 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 252 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 254 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 256 */     TypeRef<AgreementCreationResponse> returnType = new TypeRef<AgreementCreationResponse>() {  };
/* 257 */     return (AgreementCreationResponse)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\WorkflowsApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */