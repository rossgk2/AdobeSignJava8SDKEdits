/*     */ package com.adobe.sign.api.Groups;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.GroupsApi;
/*     */ import com.adobe.sign.model.groups.GroupModificationInfo;
/*     */ import com.adobe.sign.model.groups.GroupModificationResponse;
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
/*     */ public class PutGroupApiTest
/*     */ {
/*  39 */   private static String groupId = null;
/*  40 */   private static GroupsApi groupsApi = null;
/*     */ 
/*     */ 
/*     */   
/*     */   @Rule
/*  45 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  49 */     ApiUtils.configureProperty();
/*  50 */     groupId = GroupUtils.createGroup(ApiUtils.getGroupName());
/*  51 */     groupsApi = GroupUtils.getGroupsApi();
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
/*  63 */     GroupModificationInfo groupModificationInfo = new GroupModificationInfo();
/*     */     
/*     */     try {
/*  66 */       groupsApi.modifyGroup(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  67 */           groupId, 
/*  68 */           groupModificationInfo);
/*     */     }
/*  70 */     catch (ApiException e) {
/*  71 */       Assert.assertTrue(e.getMessage(), 
/*  72 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  76 */       groupsApi.modifyGroup(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  77 */           groupId, 
/*  78 */           groupModificationInfo);
/*     */     }
/*  80 */     catch (ApiException e) {
/*  81 */       Assert.assertTrue(e.getMessage(), 
/*  82 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  94 */     GroupModificationInfo groupModificationInfo = new GroupModificationInfo();
/*     */     
/*     */     try {
/*  97 */       groupsApi.modifyGroup(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  98 */           groupId, 
/*  99 */           groupModificationInfo);
/*     */     }
/* 101 */     catch (ApiException e) {
/* 102 */       Assert.assertTrue(e.getMessage(), 
/* 103 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 116 */     GroupModificationInfo groupModificationInfo = new GroupModificationInfo();
/* 117 */     groupModificationInfo.setGroupName(TestData.NULL_PARAM);
/*     */     
/*     */     try {
/* 120 */       groupsApi.modifyGroup(ApiUtils.getValidHeaderParams(), 
/* 121 */           groupId, 
/* 122 */           groupModificationInfo);
/*     */     }
/* 124 */     catch (ApiException e) {
/* 125 */       Assert.assertTrue(e.getMessage(), 
/* 126 */           SdkErrorCodes.INVALID_GROUP_NAME.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 129 */     groupModificationInfo.setGroupName(TestData.EMPTY_PARAM);
/*     */     
/*     */     try {
/* 132 */       groupsApi.modifyGroup(ApiUtils.getValidHeaderParams(), 
/* 133 */           groupId, 
/* 134 */           groupModificationInfo);
/*     */     }
/* 136 */     catch (ApiException e) {
/* 137 */       Assert.assertTrue(e.getMessage(), 
/* 138 */           SdkErrorCodes.INVALID_GROUP_NAME.getApiCode().equals(e.getApiCode()));
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
/* 151 */     GroupModificationInfo groupModificationInfo = new GroupModificationInfo();
/* 152 */     groupModificationInfo.setGroupName(TestData.MODIFIED_GROUP_NAME);
/*     */     
/*     */     try {
/* 155 */       groupsApi.modifyGroup(ApiUtils.getValidHeaderParams(), 
/* 156 */           TestData.NULL_PARAM, 
/* 157 */           groupModificationInfo);
/*     */     }
/* 159 */     catch (ApiException e) {
/* 160 */       Assert.assertTrue(e.getMessage(), 
/* 161 */           SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 165 */       groupsApi.modifyGroup(ApiUtils.getValidHeaderParams(), 
/* 166 */           TestData.EMPTY_PARAM, 
/* 167 */           groupModificationInfo);
/*     */     }
/* 169 */     catch (ApiException e) {
/* 170 */       Assert.assertTrue(e.getMessage(), 
/* 171 */           SdkErrorCodes.INVALID_GROUP_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testModifyGroup() throws ApiException {
/* 183 */     GroupModificationInfo groupModificationInfo = new GroupModificationInfo();
/* 184 */     groupModificationInfo.setGroupName(ApiUtils.getGroupName());
/*     */     
/*     */     try {
/* 187 */       GroupModificationResponse groupModificationResponse = groupsApi.modifyGroup(ApiUtils.getValidHeaderParams(), 
/* 188 */           groupId, 
/* 189 */           groupModificationInfo);
/* 190 */       Assert.assertNotNull(groupModificationResponse);
/* 191 */       Assert.assertNotNull(groupModificationResponse.getGroupName());
/*     */     }
/* 193 */     catch (ApiException e) {
/* 194 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Groups\PutGroupApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */