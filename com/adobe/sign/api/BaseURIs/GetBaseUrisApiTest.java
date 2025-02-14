/*    */ package com.adobe.sign.api.BaseURIs;
/*    */ import org.junit.Assert;
/*    */ import org.junit.BeforeClass;
/*    */ import org.junit.Rule;
/*    */ import org.junit.Test;

/*    */ 
/*    */ import com.adobe.sign.api.BaseUrisApi;
/*    */ import com.adobe.sign.model.baseUris.BaseUriInfo;
/*    */ import com.adobe.sign.utils.ApiException;
/*    */ import com.adobe.sign.utils.ApiUtils;
/*    */ import com.adobe.sign.utils.BaseUrisUtils;
/*    */ import com.adobe.sign.utils.Retry;
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
/*    */ 
/*    */ 
/*    */ public class GetBaseUrisApiTest
/*    */ {
/* 38 */   private static BaseUrisApi baseurisApi = null;
/*    */ 
/*    */   
/*    */   @Rule
/* 42 */   public Retry retry = new Retry();
/*    */   
/*    */   @BeforeClass
/*    */   public static void setup() {
/* 46 */     ApiUtils.configureProperty();
/* 47 */     baseurisApi = BaseUrisUtils.getBaseUrisApi();
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
/*    */   public void testNullAndEmptyAccessToken() throws ApiException {
/*    */     try {
/* 61 */       baseurisApi.getBaseUris(ApiUtils.getNullAccessTokenHeaderParams());
/*    */     }
/* 63 */     catch (ApiException e) {
/* 64 */       Assert.assertTrue(e.getMessage(), 
/* 65 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*    */     } 
/*    */     
/*    */     try {
/* 69 */       baseurisApi.getBaseUris(ApiUtils.getEmptyAccessTokenHeaderParams());
/*    */     }
/* 71 */     catch (ApiException e) {
/* 72 */       Assert.assertTrue(e.getMessage(), 
/* 73 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Test
/*    */   public void testGetBaseUri() throws ApiException {
/*    */     try {
/* 86 */       BaseUriInfo baseUriInfo = baseurisApi.getBaseUris(ApiUtils.getValidHeaderParams());
/* 87 */       Assert.assertNotNull(baseUriInfo);
/*    */     }
/* 89 */     catch (ApiException e) {
/* 90 */       Assert.fail(ApiUtils.getMessage(e));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\BaseURIs\GetBaseUrisApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */