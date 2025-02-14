/*     */ package com.adobe.sign.api.Groups;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.GroupsApi;
/*     */ import com.adobe.sign.model.groups.GroupDetailsInfo;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.GroupUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
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
/*     */ public class GetGroupInfoApiTest
/*     */ {
/*  38 */   private static String groupId = null;
/*  39 */   private static GroupsApi groupsApi = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  43 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  47 */     ApiUtils.configureProperty();
/*  48 */     groupId = GroupUtils.getResourceId(TestData.GROUP_NAME);
/*  49 */     groupsApi = GroupUtils.getGroupsApi();
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
/*  63 */       groupsApi.getGroupDetails(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  64 */           groupId);
/*     */     }
/*  66 */     catch (ApiException e) {
/*  67 */       Assert.assertTrue(e.getMessage(), 
/*  68 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  72 */       groupsApi.getGroupDetails(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  73 */           groupId);
/*     */     }
/*  75 */     catch (ApiException e) {
/*  76 */       Assert.assertTrue(e.getMessage(), 
/*  77 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  91 */       groupsApi.getGroupDetails(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  92 */           groupId);
/*     */     }
/*  94 */     catch (ApiException e) {
/*  95 */       Assert.assertTrue(e.getMessage(), 
/*  96 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetGroupDetails() throws ApiException {
/*     */     try {
/* 110 */       GroupDetailsInfo groupDetailsInfo = groupsApi.getGroupDetails(ApiUtils.getValidHeaderParams(), 
/* 111 */           groupId);
/* 112 */       Assert.assertNotNull(groupDetailsInfo);
/* 113 */       Assert.assertNotNull(groupDetailsInfo.getGroupId());
/*     */     }
/* 115 */     catch (ApiException e) {
/* 116 */       Assert.fail(ApiUtils.getMessage(e));
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
/*     */   public void testNullAndInvalidGroupId() throws ApiException {
/*     */     try {
/* 130 */       groupsApi.getGroupDetails(ApiUtils.getValidHeaderParams(), 
/* 131 */           TestData.EMPTY_PARAM);
/*     */     }
/* 133 */     catch (ApiException e) {
/* 134 */       Assert.assertTrue(e.getMessage(), 
/* 135 */           SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 139 */       groupsApi.getGroupDetails(ApiUtils.getValidHeaderParams(), 
/* 140 */           TestData.NULL_PARAM);
/*     */     }
/* 142 */     catch (ApiException e) {
/* 143 */       Assert.assertTrue(e.getMessage(), 
/* 144 */           SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Groups\GetGroupInfoApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */