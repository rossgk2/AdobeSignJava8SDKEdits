/*    */ package com.adobe.sign.api.OAuth;
/*    */ import org.junit.Assert;
/*    */ import org.junit.BeforeClass;
/*    */ import org.junit.Test;

/*    */ 
/*    */ import com.adobe.sign.api.OAuthApi;
/*    */ import com.adobe.sign.utils.ApiException;
/*    */ import com.adobe.sign.utils.ApiUtils;
/*    */ import com.adobe.sign.utils.OAuthUtil;
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
/*    */ 
/*    */ public class RevokeTokenTest
/*    */ {
/* 33 */   private static OAuthApi oAuthApi = null;
/*    */ 
/*    */ 
/*    */   
/*    */   @BeforeClass
/*    */   public static void setup() {
/* 39 */     ApiUtils.configureProperty();
/* 40 */     oAuthApi = OAuthUtil.getoAuthApi();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Test
/*    */   public void testInvalidToken() throws ApiException {
/*    */     try {
/* 54 */       oAuthApi.revokeToken(null);
/* 55 */     } catch (ApiException e) {
/* 56 */       Assert.assertTrue(e.getMessage(), 
/* 57 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\OAuth\RevokeTokenTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */