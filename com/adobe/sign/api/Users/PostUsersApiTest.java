/*     */ package com.adobe.sign.api.Users;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.UsersApi;
/*     */ import com.adobe.sign.model.users.UserCreationInfo;
/*     */ import com.adobe.sign.model.users.UserCreationResponse;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
/*     */ import com.adobe.sign.utils.UserUtils;
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
/*     */ public class PostUsersApiTest
/*     */ {
/*  39 */   private static UsersApi usersApi = null;
/*     */   
/*     */   @Rule
/*  42 */   public Retry retry = new Retry();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  52 */     ApiUtils.configureProperty();
/*  53 */     usersApi = UserUtils.getUsersApi();
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
/*  67 */       UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME, 
/*  68 */           TestData.LAST_NAME, 
/*  69 */           ApiUtils.getUserEmail());
/*  70 */       usersApi.createUser(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  71 */           userCreationInfo);
/*     */     }
/*  73 */     catch (ApiException e) {
/*  74 */       Assert.assertTrue(e.getMessage(), 
/*  75 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  79 */       UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME, 
/*  80 */           TestData.LAST_NAME, 
/*  81 */           ApiUtils.getUserEmail());
/*  82 */       usersApi.createUser(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  83 */           userCreationInfo);
/*     */     }
/*  85 */     catch (ApiException e) {
/*  86 */       Assert.assertTrue(e.getMessage(), 
/*  87 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidXApiUser() throws ApiException {
/*     */     try {
/* 101 */       UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME, 
/* 102 */           TestData.LAST_NAME, 
/* 103 */           ApiUtils.getUserEmail());
/* 104 */       usersApi.createUser(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 105 */           userCreationInfo);
/*     */     }
/* 107 */     catch (ApiException e) {
/* 108 */       Assert.assertTrue(e.getMessage(), 
/* 109 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testMissingParams() throws ApiException {
/*     */     try {
/* 124 */       UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.NULL_PARAM, 
/* 125 */           TestData.LAST_NAME, 
/* 126 */           ApiUtils.getUserEmail());
/* 127 */       usersApi.createUser(ApiUtils.getValidHeaderParams(), 
/* 128 */           userCreationInfo);
/*     */     }
/* 130 */     catch (ApiException e) {
/* 131 */       Assert.assertTrue(e.getMessage(), 
/* 132 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 136 */       UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME, 
/* 137 */           TestData.NULL_PARAM, 
/* 138 */           ApiUtils.getUserEmail());
/* 139 */       usersApi.createUser(ApiUtils.getValidHeaderParams(), 
/* 140 */           userCreationInfo);
/*     */     }
/* 142 */     catch (ApiException e) {
/* 143 */       Assert.assertTrue(e.getMessage(), 
/* 144 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 148 */       UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.EMPTY_PARAM, 
/* 149 */           TestData.LAST_NAME, 
/* 150 */           ApiUtils.getUserEmail());
/* 151 */       usersApi.createUser(ApiUtils.getValidHeaderParams(), 
/* 152 */           userCreationInfo);
/*     */     }
/* 154 */     catch (ApiException e) {
/* 155 */       Assert.assertTrue(e.getMessage(), 
/* 156 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testNullAndInvalidEmail() throws ApiException {
/*     */     try {
/* 171 */       UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME, 
/* 172 */           TestData.LAST_NAME, 
/* 173 */           TestData.NULL_PARAM);
/* 174 */       usersApi.createUser(ApiUtils.getValidHeaderParams(), 
/* 175 */           userCreationInfo);
/*     */     }
/* 177 */     catch (ApiException e) {
/* 178 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.MUST_PROVIDE_EMAIL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 182 */       UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME, 
/* 183 */           TestData.LAST_NAME, 
/* 184 */           TestData.EMPTY_PARAM);
/* 185 */       usersApi.createUser(ApiUtils.getValidHeaderParams(), 
/* 186 */           userCreationInfo);
/*     */     }
/* 188 */     catch (ApiException e) {
/* 189 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.MUST_PROVIDE_EMAIL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 193 */       UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME, 
/* 194 */           TestData.LAST_NAME, 
/* 195 */           TestData.INVALID_EMAIL);
/* 196 */       usersApi.createUser(ApiUtils.getValidHeaderParams(), 
/* 197 */           userCreationInfo);
/*     */     }
/* 199 */     catch (ApiException e) {
/* 200 */       Assert.assertTrue(e.getMessage(), 
/* 201 */           SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testCreateUser() throws ApiException {
/*     */     try {
/* 214 */       UserCreationInfo userCreationInfo = UserUtils.getUserCreationInfo(TestData.FIRST_NAME, 
/* 215 */           TestData.LAST_NAME, 
/* 216 */           ApiUtils.getUserEmail());
/* 217 */       UserCreationResponse response = usersApi.createUser(ApiUtils.getValidHeaderParams(), 
/* 218 */           userCreationInfo);
/* 219 */       Assert.assertNotNull(response.getUserId());
/*     */     }
/* 221 */     catch (ApiException e) {
/* 222 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Users\PostUsersApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */