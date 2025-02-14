/*     */ package com.adobe.sign.api.Users;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.UsersApi;
/*     */ import com.adobe.sign.model.users.UserDetailsInfo;
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
/*     */ public class GetUserInfoApiTest
/*     */ {
/*  38 */   private static UsersApi usersApi = null;
/*  39 */   private static String userId = null;
/*     */ 
/*     */ 
/*     */   
/*     */   @Rule
/*  44 */   public Retry retry = new Retry();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  54 */     ApiUtils.configureProperty();
/*  55 */     userId = UserUtils.getResourceId(TestData.USER_EMAIL);
/*  56 */     usersApi = UserUtils.getUsersApi();
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
/*  70 */       usersApi.getUserDetail(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  71 */           userId);
/*     */     }
/*  73 */     catch (ApiException e) {
/*  74 */       Assert.assertTrue(e.getMessage(), 
/*  75 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  79 */       usersApi.getUserDetail(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  80 */           userId);
/*     */     }
/*  82 */     catch (ApiException e) {
/*  83 */       Assert.assertTrue(e.getMessage(), 
/*  84 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testNullAndInvalidUserId() throws ApiException {
/*     */     try {
/*  99 */       usersApi.getUserDetail(ApiUtils.getValidHeaderParams(), 
/* 100 */           TestData.NULL_PARAM);
/*     */     }
/* 102 */     catch (ApiException e) {
/* 103 */       Assert.assertTrue(e.getMessage(), 
/* 104 */           SdkErrorCodes.INVALID_USER_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 108 */       usersApi.getUserDetail(ApiUtils.getValidHeaderParams(), 
/* 109 */           TestData.EMPTY_PARAM);
/*     */     }
/* 111 */     catch (ApiException e) {
/* 112 */       Assert.assertTrue(e.getMessage(), 
/* 113 */           SdkErrorCodes.INVALID_USER_ID.getApiCode().equals(e.getApiCode()));
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
/* 127 */       usersApi.getUserDetail(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 128 */           userId);
/*     */     }
/* 130 */     catch (ApiException e) {
/* 131 */       Assert.assertTrue(e.getMessage(), 
/* 132 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testUserDetail() throws ApiException {
/*     */     try {
/* 146 */       UserDetailsInfo userDetailsInfo = usersApi.getUserDetail(ApiUtils.getValidHeaderParams(), 
/* 147 */           userId);
/* 148 */       Assert.assertNotNull(userDetailsInfo);
/* 149 */       Assert.assertNotNull(userDetailsInfo.getEmail());
/*     */     }
/* 151 */     catch (ApiException e) {
/* 152 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Users\GetUserInfoApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */