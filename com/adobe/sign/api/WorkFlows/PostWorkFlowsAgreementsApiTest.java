/*     */ package com.adobe.sign.api.WorkFlows;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.WorkflowsApi;
/*     */ import com.adobe.sign.model.workflows.AgreementCreationResponse;
/*     */ import com.adobe.sign.model.workflows.CustomWorkflowAgreementCreationRequest;
/*     */ import com.adobe.sign.model.workflows.CustomWorkflowFileInfo;
/*     */ import com.adobe.sign.model.workflows.PostSignOptions;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.LibraryDocumentsUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
/*     */ import com.adobe.sign.utils.TransientDocumentsUtils;
/*     */ import com.adobe.sign.utils.WorkFlowUtils;
/*     */ import com.adobe.sign.utils.validator.SdkErrorCodes;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PostWorkFlowsAgreementsApiTest
/*     */ {
/*  43 */   private static WorkflowsApi workflowsApi = null;
/*  44 */   private static String workflowId = null;
/*  45 */   private static String libraryDocumentId = null;
/*  46 */   private static String transientDocumentId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  50 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  54 */     ApiUtils.configureProperty();
/*  55 */     workflowId = WorkFlowUtils.getResourceId();
/*  56 */     workflowsApi = WorkFlowUtils.getWorkflowsApi();
/*     */     
/*  58 */     libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
/*  59 */     transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testNullAndEmptyAccessToken() throws ApiException {
/*  71 */     CustomWorkflowAgreementCreationRequest creationRequest = new CustomWorkflowAgreementCreationRequest();
/*     */     
/*     */     try {
/*  74 */       workflowsApi.createWorkflowAgreement(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  75 */           workflowId, 
/*  76 */           creationRequest);
/*     */     }
/*  78 */     catch (ApiException e) {
/*  79 */       Assert.assertTrue(e.getMessage(), 
/*  80 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  84 */       workflowsApi.createWorkflowAgreement(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  85 */           workflowId, 
/*  86 */           creationRequest);
/*     */     }
/*  88 */     catch (ApiException e) {
/*  89 */       Assert.assertTrue(e.getMessage(), 
/*  90 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testInvalidXApiUser() throws ApiException {
/* 102 */     CustomWorkflowAgreementCreationRequest creationRequest = new CustomWorkflowAgreementCreationRequest();
/*     */     
/*     */     try {
/* 105 */       workflowsApi.createWorkflowAgreement(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 106 */           workflowId, 
/* 107 */           creationRequest);
/*     */     }
/* 109 */     catch (ApiException e) {
/* 110 */       Assert.assertTrue(e.getMessage(), 
/* 111 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testInvalidWorkflowId() throws ApiException {
/* 124 */     CustomWorkflowAgreementCreationRequest creationRequest = new CustomWorkflowAgreementCreationRequest();
/*     */     
/*     */     try {
/* 127 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 128 */           TestData.NULL_PARAM, 
/* 129 */           creationRequest);
/*     */     }
/* 131 */     catch (ApiException e) {
/* 132 */       Assert.assertTrue(e.getMessage(), 
/* 133 */           SdkErrorCodes.INVALID_WORKFLOW_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 137 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 138 */           TestData.EMPTY_PARAM, 
/* 139 */           creationRequest);
/*     */     }
/* 141 */     catch (ApiException e) {
/* 142 */       Assert.assertTrue(e.getMessage(), 
/* 143 */           SdkErrorCodes.INVALID_WORKFLOW_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
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
/*     */   @Test
/*     */   public void testInvalidAgreementCreationInfo() throws ApiException {
/* 162 */     PostSignOptions options = new PostSignOptions();
/* 163 */     CustomWorkflowFileInfo fileInfo = new CustomWorkflowFileInfo();
/*     */ 
/*     */     
/*     */     try {
/* 167 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 168 */           workflowId, 
/* 169 */           null);
/*     */     }
/* 171 */     catch (ApiException e) {
/* 172 */       Assert.assertTrue(e.getMessage(), 
/* 173 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 176 */     CustomWorkflowAgreementCreationRequest agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(fileInfo, 
/* 177 */         ApiUtils.getAgreementName());
/*     */     
/* 179 */     agreementCreationRequest.getDocumentCreationInfo().setFileInfos(null);
/*     */     
/*     */     try {
/* 182 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 183 */           workflowId, 
/* 184 */           agreementCreationRequest);
/*     */     }
/* 186 */     catch (ApiException e) {
/* 187 */       Assert.assertTrue(e.getMessage(), 
/* 188 */           SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 191 */     fileInfo.setWorkflowLibraryDocumentId(libraryDocumentId);
/* 192 */     fileInfo.setTransientDocumentId(transientDocumentId);
/*     */ 
/*     */     
/* 195 */     agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(fileInfo, 
/* 196 */         ApiUtils.getAgreementName());
/*     */     
/*     */     try {
/* 199 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 200 */           workflowId, 
/* 201 */           agreementCreationRequest);
/*     */     }
/* 203 */     catch (ApiException e) {
/* 204 */       Assert.assertTrue(e.getMessage(), 
/* 205 */           SdkErrorCodes.FILE_INFO_NAME_MISSING.getApiCode().equals(e.getApiCode()));
/*     */     } 
/* 207 */     fileInfo.setName(TestData.AGREEMENT_NAME);
/* 208 */     fileInfo.setWorkflowLibraryDocumentId(TestData.NULL_PARAM);
/* 209 */     fileInfo.setTransientDocumentId(TestData.EMPTY_PARAM);
/*     */ 
/*     */     
/* 212 */     agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(fileInfo, 
/* 213 */         ApiUtils.getAgreementName());
/*     */     
/*     */     try {
/* 216 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 217 */           workflowId, 
/* 218 */           agreementCreationRequest);
/*     */     }
/* 220 */     catch (ApiException e) {
/* 221 */       Assert.assertTrue(e.getMessage(), 
/* 222 */           SdkErrorCodes.INVALID_TRANSIENTDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 225 */     fileInfo.setWorkflowLibraryDocumentId(TestData.EMPTY_PARAM);
/* 226 */     fileInfo.setTransientDocumentId(TestData.NULL_PARAM);
/*     */ 
/*     */     
/* 229 */     agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(fileInfo, 
/* 230 */         ApiUtils.getAgreementName());
/*     */     try {
/* 232 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 233 */           workflowId, 
/* 234 */           agreementCreationRequest);
/*     */     }
/* 236 */     catch (ApiException e) {
/* 237 */       Assert.assertTrue(e.getMessage(), 
/* 238 */           SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/* 242 */     agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(TestData.NULL_PARAM);
/*     */     
/*     */     try {
/* 245 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 246 */           workflowId, 
/* 247 */           agreementCreationRequest);
/*     */     }
/* 249 */     catch (ApiException e) {
/* 250 */       Assert.assertTrue(e.getMessage(), 
/* 251 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/* 255 */     options.setRedirectUrl(TestData.EMPTY_PARAM);
/* 256 */     agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(), 
/* 257 */         options);
/*     */     try {
/* 259 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 260 */           workflowId, 
/* 261 */           agreementCreationRequest);
/*     */     }
/* 263 */     catch (ApiException e) {
/* 264 */       Assert.assertTrue(e.getMessage(), 
/* 265 */           SdkErrorCodes.EMPTY_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/* 269 */     options.setRedirectUrl(TestData.INVALID_URL);
/* 270 */     agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(), 
/* 271 */         options);
/*     */     try {
/* 273 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 274 */           workflowId, 
/* 275 */           agreementCreationRequest);
/*     */     }
/* 277 */     catch (ApiException e) {
/* 278 */       Assert.assertTrue(e.getMessage(), 
/* 279 */           SdkErrorCodes.INVALID_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/* 283 */     options.setRedirectUrl(TestData.REDIRECT_URL);
/* 284 */     options.setRedirectDelay(Integer.valueOf(TestData.INVALID_REDIRECT_DELAY));
/* 285 */     agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(), 
/* 286 */         options);
/*     */     try {
/* 288 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 289 */           workflowId, 
/* 290 */           agreementCreationRequest);
/*     */     }
/* 292 */     catch (ApiException e) {
/* 293 */       Assert.assertTrue(e.getMessage(), 
/* 294 */           SdkErrorCodes.INVALID_REDIRECT_DELAY.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/* 298 */     agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(), 
/* 299 */         TestData.NULL_PARAM, 
/* 300 */         TestData.NULL_PARAM);
/*     */     try {
/* 302 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 303 */           workflowId, 
/* 304 */           agreementCreationRequest);
/*     */     }
/* 306 */     catch (ApiException e) {
/* 307 */       Assert.assertTrue(e.getMessage(), 
/* 308 */           SdkErrorCodes.MIN_ADDRESSES_NOT_MET.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/* 312 */     agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(), 
/* 313 */         TestData.INVALID_EMAIL, 
/* 314 */         TestData.NULL_PARAM);
/*     */     try {
/* 316 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 317 */           workflowId, 
/* 318 */           agreementCreationRequest);
/*     */     }
/* 320 */     catch (ApiException e) {
/* 321 */       Assert.assertTrue(e.getMessage(), 
/* 322 */           SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/* 326 */     agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(), 
/* 327 */         TestData.POST_EMAIL, 
/* 328 */         TestData.POST_FAX);
/*     */     try {
/* 330 */       workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 331 */           workflowId, 
/* 332 */           agreementCreationRequest);
/*     */     }
/* 334 */     catch (ApiException e) {
/* 335 */       Assert.assertTrue(e.getMessage(), 
/* 336 */           SdkErrorCodes.INVALID_ARGUMENTS.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testCreateWorkflowAgreement() throws ApiException {
/* 346 */     CustomWorkflowAgreementCreationRequest agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName());
/*     */     
/*     */     try {
/* 349 */       AgreementCreationResponse response = workflowsApi.createWorkflowAgreement(ApiUtils.getValidHeaderParams(), 
/* 350 */           workflowId, 
/* 351 */           agreementCreationRequest);
/* 352 */       Assert.assertNotNull(response);
/* 353 */       Assert.assertNotNull(response.getAgreementId());
/*     */     }
/* 355 */     catch (ApiException e) {
/* 356 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\WorkFlows\PostWorkFlowsAgreementsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */