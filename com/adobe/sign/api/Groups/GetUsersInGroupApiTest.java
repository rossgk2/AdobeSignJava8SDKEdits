/*     */ package com.adobe.sign.api.Groups;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.GroupsApi;
/*     */ import com.adobe.sign.model.groups.UsersInfo;
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
/*     */ public class GetUsersInGroupApiTest
/*     */ {
/*  38 */   private static String groupId = null;
/*  39 */   private static GroupsApi groupsApi = null;
/*     */ 
/*     */ 
/*     */   
/*     */   @Rule
/*  44 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  48 */     ApiUtils.configureProperty();
/*  49 */     groupId = GroupUtils.getResourceId(TestData.GROUP_NAME);
/*  50 */     groupsApi = GroupUtils.getGroupsApi();
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
/*  64 */       groupsApi.getUsersInGroup(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  65 */           groupId);
/*     */     }
/*  67 */     catch (ApiException e) {
/*  68 */       Assert.assertTrue(e.getMessage(), 
/*  69 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  73 */       groupsApi.getUsersInGroup(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  74 */           groupId);
/*     */     }
/*  76 */     catch (ApiException e) {
/*  77 */       Assert.assertTrue(e.getMessage(), 
/*  78 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  92 */       groupsApi.getUsersInGroup(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  93 */           groupId);
/*     */     }
/*  95 */     catch (ApiException e) {
/*  96 */       Assert.assertTrue(e.getMessage(), 
/*  97 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetUsersInGroup() throws ApiException {
/*     */     try {
/* 111 */       UsersInfo usersInfo = groupsApi.getUsersInGroup(ApiUtils.getValidHeaderParams(), 
/* 112 */           groupId);
/* 113 */       Assert.assertNotNull(usersInfo);
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
/*     */   
/*     */   @Test
/*     */   public void testNullAndInvalidGroupId() throws ApiException {
/*     */     try {
/* 131 */       groupsApi.getUsersInGroup(ApiUtils.getValidHeaderParams(), 
/* 132 */           TestData.EMPTY_PARAM);
/*     */     }
/* 134 */     catch (ApiException e) {
/* 135 */       Assert.assertTrue(e.getMessage(), 
/* 136 */           SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 140 */       groupsApi.getUsersInGroup(ApiUtils.getValidHeaderParams(), 
/* 141 */           TestData.NULL_PARAM);
/*     */     }
/* 143 */     catch (ApiException e) {
/* 144 */       Assert.assertTrue(e.getMessage(), 
/* 145 */           SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Groups\GetUsersInGroupApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */