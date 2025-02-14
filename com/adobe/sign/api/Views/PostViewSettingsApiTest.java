/*     */ package com.adobe.sign.api.Views;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.ViewsApi;
/*     */ import com.adobe.sign.model.views.TargetViewRequest;
/*     */ import com.adobe.sign.model.views.ViewUrl;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.ViewsUtils;
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
/*     */ 
/*     */ 
/*     */ public class PostViewSettingsApiTest
/*     */ {
/*  40 */   private static ViewsApi viewsApi = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  44 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() {
/*  48 */     ApiUtils.configureProperty();
/*  49 */     viewsApi = ViewsUtils.getViewsApi();
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
/*  61 */     TargetViewRequest targetViewRequest = new TargetViewRequest();
/*  62 */     targetViewRequest.setTargetView(TargetViewRequest.TargetViewEnum.USER_PROFILE);
/*     */     
/*     */     try {
/*  65 */       viewsApi.createSettingsUrl(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  66 */           targetViewRequest);
/*     */     }
/*  68 */     catch (ApiException e) {
/*  69 */       Assert.assertTrue(e.getMessage(), 
/*  70 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  74 */       viewsApi.createSettingsUrl(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  75 */           targetViewRequest);
/*     */     }
/*  77 */     catch (ApiException e) {
/*  78 */       Assert.assertTrue(e.getMessage(), 
/*  79 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  91 */     TargetViewRequest targetViewRequest = new TargetViewRequest();
/*  92 */     targetViewRequest.setTargetView(TargetViewRequest.TargetViewEnum.USER_PROFILE);
/*     */     
/*     */     try {
/*  95 */       viewsApi.createSettingsUrl(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  96 */           targetViewRequest);
/*     */     }
/*  98 */     catch (ApiException e) {
/*  99 */       Assert.assertTrue(e.getMessage(), 
/* 100 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidTargetView() throws ApiException {
/* 112 */     TargetViewRequest targetViewRequest = new TargetViewRequest();
/* 113 */     targetViewRequest.setTargetView(null);
/*     */     
/*     */     try {
/* 116 */       viewsApi.createSettingsUrl(ApiUtils.getValidHeaderParams(), 
/* 117 */           targetViewRequest);
/*     */     }
/* 119 */     catch (ApiException e) {
/* 120 */       Assert.assertTrue(e.getMessage(), 
/* 121 */           SdkErrorCodes.INVALID_TARGET_VIEW.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testCreateSettingsUrl() throws ApiException {
/* 133 */     TargetViewRequest targetViewRequest = new TargetViewRequest();
/* 134 */     targetViewRequest.setTargetView(TargetViewRequest.TargetViewEnum.USER_PROFILE);
/*     */     
/*     */     try {
/* 137 */       ViewUrl viewUrl = viewsApi.createSettingsUrl(ApiUtils.getValidHeaderParams(), 
/* 138 */           targetViewRequest);
/* 139 */       Assert.assertNotNull(viewUrl);
/* 140 */       Assert.assertNotNull(viewUrl.getViewURL());
/*     */     }
/* 142 */     catch (ApiException e) {
/* 143 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Views\PostViewSettingsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */