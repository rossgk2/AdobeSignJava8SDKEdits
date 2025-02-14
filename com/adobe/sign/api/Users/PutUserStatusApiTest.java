/*    */ package com.adobe.sign.api.Users;
/*    */ import org.junit.Assert;
/*    */ import org.junit.BeforeClass;
/*    */ import org.junit.Rule;
/*    */ import org.junit.Test;

/*    */ 
/*    */ import com.adobe.sign.api.UsersApi;
/*    */ import com.adobe.sign.model.users.UserStatusUpdateInfo;
/*    */ import com.adobe.sign.utils.ApiException;
/*    */ import com.adobe.sign.utils.ApiUtils;
/*    */ import com.adobe.sign.utils.Retry;
/*    */ import com.adobe.sign.utils.TestData;
/*    */ import com.adobe.sign.utils.UserUtils;
/*    */ import com.adobe.sign.utils.validator.SdkErrorCodes;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PutUserStatusApiTest
/*    */ {
/* 36 */   private static UsersApi usersApi = null;
/* 37 */   private static String userId = null;
/* 38 */   private static String envHostName = TestData.ENV_HOST_NAME;
/*    */ 
/*    */   
/*    */   @Rule
/* 42 */   public Retry retry = new Retry();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @BeforeClass
/*    */   public static void setup() throws ApiException {
/* 51 */     ApiUtils.configureProperty();
/* 52 */     userId = UserUtils.createUser(ApiUtils.getUserEmail());
/* 53 */     usersApi = UserUtils.getUsersApi();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Test
/*    */   public void testInvalidUserStatus() throws ApiException {
/* 65 */     UserStatusUpdateInfo updateInfo = new UserStatusUpdateInfo();
/* 66 */     updateInfo.setUserStatus(null);
/*    */     
/*    */     try {
/* 69 */       usersApi.modifyUserStatus(ApiUtils.getValidHeaderParams(), 
/* 70 */           userId, 
/* 71 */           updateInfo);
/*    */     }
/* 73 */     catch (ApiException e) {
/* 74 */       Assert.assertTrue(e.getMessage(), 
/* 75 */           SdkErrorCodes.MUST_PROVIDE_VALID_USER_STATUS.getApiCode().equals(e.getApiCode()));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Users\PutUserStatusApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */