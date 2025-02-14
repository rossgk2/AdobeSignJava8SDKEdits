/*     */ package com.adobe.sign.api.Groups;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.GroupsApi;
/*     */ import com.adobe.sign.model.groups.GroupCreationInfo;
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
/*     */ public class PostGroupsApiTest
/*     */ {
/*  38 */   private static GroupsApi groupsApi = null;
/*     */ 
/*     */ 
/*     */   
/*     */   @Rule
/*  43 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() {
/*  47 */     ApiUtils.configureProperty();
/*  48 */     groupsApi = GroupUtils.getGroupsApi();
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
/*  60 */     GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
/*  61 */     groupCreationInfo.setGroupName(ApiUtils.getGroupName());
/*     */     
/*     */     try {
/*  64 */       groupsApi.createGroup(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  65 */           groupCreationInfo);
/*     */     }
/*  67 */     catch (ApiException e) {
/*  68 */       Assert.assertTrue(e.getMessage(), 
/*  69 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  73 */       groupsApi.createGroup(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  74 */           groupCreationInfo);
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
/*     */   @Test
/*     */   public void testInvalidXApiHeader() throws ApiException {
/*  90 */     GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
/*  91 */     groupCreationInfo.setGroupName(ApiUtils.getGroupName());
/*     */     
/*     */     try {
/*  94 */       groupsApi.createGroup(ApiUtils.getValidHeaderParams(), 
/*  95 */           groupCreationInfo);
/*     */     }
/*  97 */     catch (ApiException e) {
/*  98 */       Assert.assertTrue(e.getMessage(), 
/*  99 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testCreateGroup() throws ApiException {
/* 111 */     GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
/* 112 */     groupCreationInfo.setGroupName(ApiUtils.getGroupName());
/*     */     
/*     */     try {
/* 115 */       String groupId = groupsApi.createGroup(ApiUtils.getValidHeaderParams(), 
/* 116 */           groupCreationInfo).getGroupId();
/* 117 */       Assert.assertNotNull(groupId);
/*     */       
/* 119 */       groupsApi.deleteGroup(ApiUtils.getValidHeaderParams(), 
/* 120 */           groupId);
/*     */     }
/* 122 */     catch (ApiException e) {
/* 123 */       Assert.fail(ApiUtils.getMessage(e));
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
/*     */   public void testNullAndInvalidGroupName() throws ApiException {
/* 136 */     GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
/* 137 */     groupCreationInfo.setGroupName(TestData.EMPTY_PARAM);
/*     */     
/*     */     try {
/* 140 */       groupsApi.createGroup(ApiUtils.getValidHeaderParams(), 
/* 141 */           groupCreationInfo).getGroupId();
/*     */     }
/* 143 */     catch (ApiException e) {
/* 144 */       Assert.assertTrue(e.getMessage(), 
/* 145 */           SdkErrorCodes.INVALID_GROUP_NAME.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 148 */     groupCreationInfo.setGroupName(TestData.NULL_PARAM);
/*     */     
/*     */     try {
/* 151 */       groupsApi.createGroup(ApiUtils.getValidHeaderParams(), 
/* 152 */           groupCreationInfo);
/*     */     }
/* 154 */     catch (ApiException e) {
/* 155 */       Assert.assertTrue(e.getMessage(), 
/* 156 */           SdkErrorCodes.INVALID_GROUP_NAME.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Groups\PostGroupsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */