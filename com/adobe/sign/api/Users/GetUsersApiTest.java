/*     */ package com.adobe.sign.api.Users;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.UsersApi;
/*     */ import com.adobe.sign.model.users.UsersInfo;
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
/*     */ public class GetUsersApiTest
/*     */ {
/*  38 */   private static UsersApi usersApi = null;
/*     */   
/*     */   @Rule
/*  41 */   public Retry retry = new Retry();
/*  42 */   private static String envHostName = TestData.ENV_HOST_NAME;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  51 */     ApiUtils.configureProperty();
/*  52 */     usersApi = UserUtils.getUsersApi();
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
/*  66 */       usersApi.getUsers(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  67 */           TestData.X_USER_EMAIL);
/*     */     }
/*  69 */     catch (ApiException e) {
/*  70 */       Assert.assertTrue(e.getMessage(), 
/*  71 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  75 */       usersApi.getUsers(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  76 */           TestData.X_USER_EMAIL);
/*     */     }
/*  78 */     catch (ApiException e) {
/*  79 */       Assert.assertTrue(e.getMessage(), 
/*  80 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  93 */       usersApi.getUsers(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  94 */           TestData.X_USER_EMAIL);
/*     */     }
/*  96 */     catch (ApiException e) {
/*  97 */       Assert.assertTrue(e.getMessage(), 
/*  98 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testGetUsers() throws ApiException {
/*     */     try {
/* 110 */       UsersInfo userInfos = usersApi.getUsers(ApiUtils.getValidHeaderParams(), 
/* 111 */           TestData.X_USER_EMAIL);
/* 112 */       Assert.assertNotNull(userInfos);
/*     */     }
/* 114 */     catch (ApiException e) {
/* 115 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Users\GetUsersApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */