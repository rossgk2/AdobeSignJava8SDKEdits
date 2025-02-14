/*     */ package com.adobe.sign.api.WorkFlows;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.WorkflowsApi;
/*     */ import com.adobe.sign.model.workflows.UserWorkflows;
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
/*     */ public class GetWorkFlowsApiTest
/*     */ {
/*  37 */   private static WorkflowsApi workflowsApi = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  41 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  45 */     ApiUtils.configureProperty();
/*  46 */     workflowsApi = WorkFlowUtils.getWorkflowsApi();
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
/*  59 */       workflowsApi.getWorkflows(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  60 */           Boolean.valueOf(TestData.INCLUDE_DRAFT_WORKFLOWS), 
/*  61 */           TestData.GROUP_ID);
/*     */     }
/*  63 */     catch (ApiException e) {
/*  64 */       Assert.assertTrue(e.getMessage(), 
/*  65 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  69 */       workflowsApi.getWorkflows(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  70 */           Boolean.valueOf(TestData.INCLUDE_DRAFT_WORKFLOWS), 
/*  71 */           TestData.GROUP_ID);
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
/*  88 */       workflowsApi.getWorkflows(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  89 */           Boolean.valueOf(TestData.INCLUDE_DRAFT_WORKFLOWS), 
/*  90 */           TestData.GROUP_ID);
/*     */     }
/*  92 */     catch (ApiException e) {
/*  93 */       Assert.assertTrue(e.getMessage(), 
/*  94 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testEmptyGroupId() throws ApiException {
/*     */     try {
/* 107 */       workflowsApi.getWorkflows(ApiUtils.getValidHeaderParams(), 
/* 108 */           Boolean.valueOf(TestData.INCLUDE_DRAFT_WORKFLOWS), 
/* 109 */           TestData.EMPTY_PARAM);
/*     */     }
/* 111 */     catch (ApiException e) {
/* 112 */       Assert.assertTrue(e.getMessage(), 
/* 113 */           SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetWorkflows() throws ApiException {
/*     */     try {
/* 126 */       UserWorkflows userWorkflows = workflowsApi.getWorkflows(ApiUtils.getValidHeaderParams(), 
/* 127 */           Boolean.valueOf(TestData.INCLUDE_DRAFT_WORKFLOWS), 
/* 128 */           TestData.GROUP_ID);
/* 129 */       Assert.assertNotNull(userWorkflows);
/*     */     }
/* 131 */     catch (ApiException e) {
/* 132 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\WorkFlows\GetWorkFlowsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */