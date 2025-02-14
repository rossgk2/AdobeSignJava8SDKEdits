/*     */ package com.adobe.sign.api.WorkFlows;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.WorkflowsApi;
/*     */ import com.adobe.sign.model.workflows.WorkflowDescription;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
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
/*     */ public class GetWorkflowInfoApiTest
/*     */ {
/*  37 */   private static WorkflowsApi workflowsApi = null;
/*  38 */   private static String workflowId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  42 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  46 */     ApiUtils.configureProperty();
/*  47 */     workflowId = WorkFlowUtils.getResourceId();
/*  48 */     workflowsApi = WorkFlowUtils.getWorkflowsApi();
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
/*     */     try {
/*  61 */       workflowsApi.getWorkflowInfo(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  62 */           workflowId);
/*     */     }
/*  64 */     catch (ApiException e) {
/*  65 */       Assert.assertTrue(e.getMessage(), 
/*  66 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  70 */       workflowsApi.getWorkflowInfo(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  71 */           workflowId);
/*     */     }
/*  73 */     catch (ApiException e) {
/*  74 */       Assert.assertTrue(e.getMessage(), 
/*  75 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*     */     try {
/*  88 */       workflowsApi.getWorkflowInfo(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  89 */           workflowId);
/*     */     }
/*  91 */     catch (ApiException e) {
/*  92 */       Assert.assertTrue(e.getMessage(), 
/*  93 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidWorkflowId() throws ApiException {
/*     */     try {
/* 106 */       workflowsApi.getWorkflowInfo(ApiUtils.getValidHeaderParams(), 
/* 107 */           TestData.NULL_PARAM);
/*     */     }
/* 109 */     catch (ApiException e) {
/* 110 */       Assert.assertTrue(e.getMessage(), 
/* 111 */           SdkErrorCodes.INVALID_WORKFLOW_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 115 */       workflowsApi.getWorkflowInfo(ApiUtils.getValidHeaderParams(), 
/* 116 */           TestData.EMPTY_PARAM);
/*     */     }
/* 118 */     catch (ApiException e) {
/* 119 */       Assert.assertTrue(e.getMessage(), 
/* 120 */           SdkErrorCodes.INVALID_WORKFLOW_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetWorkflowInfo() throws ApiException {
/*     */     try {
/* 133 */       WorkflowDescription workflowDescription = workflowsApi.getWorkflowInfo(ApiUtils.getValidHeaderParams(), 
/* 134 */           workflowId);
/* 135 */       Assert.assertNotNull(workflowDescription);
/*     */     }
/* 137 */     catch (ApiException e) {
/* 138 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\WorkFlows\GetWorkflowInfoApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */