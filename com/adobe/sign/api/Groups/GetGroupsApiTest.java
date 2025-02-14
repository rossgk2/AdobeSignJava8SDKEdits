/*     */ package com.adobe.sign.api.Groups;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.GroupsApi;
/*     */ import com.adobe.sign.model.groups.GroupsInfo;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.GroupUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.validator.SdkErrorCodes;

/*     */ import junit.framework.Assert;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GetGroupsApiTest
/*     */ {
/*  38 */   private static GroupsApi groupsApi = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  42 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() {
/*  46 */     ApiUtils.configureProperty();
/*  47 */     groupsApi = GroupUtils.getGroupsApi();
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
/*     */   @Test
/*     */   public void testNullAndEmptyAccessToken() throws ApiException {
/*     */     try {
/*  61 */       groupsApi.getGroups(ApiUtils.getNullAccessTokenHeaderParams());
/*     */     }
/*  63 */     catch (ApiException e) {
/*  64 */       Assert.assertTrue(e.getMessage(), 
/*  65 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  69 */       groupsApi.getGroups(ApiUtils.getEmptyAccessTokenHeaderParams());
/*     */     }
/*  71 */     catch (ApiException e) {
/*  72 */       Assert.assertTrue(e.getMessage(), 
/*  73 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidXApiHeader() throws ApiException {
/*     */     try {
/*  87 */       groupsApi.getGroups(ApiUtils.getEmptyXApiUserHeaderParams());
/*     */     }
/*  89 */     catch (ApiException e) {
/*  90 */       Assert.assertTrue(e.getMessage(), 
/*  91 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetGroups() throws ApiException {
/*     */     try {
/* 105 */       GroupsInfo groupsInfo = groupsApi.getGroups(ApiUtils.getValidHeaderParams());
/* 106 */       Assert.assertNotNull(groupsInfo);
/*     */     }
/* 108 */     catch (ApiException e) {
/* 109 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Groups\GetGroupsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */