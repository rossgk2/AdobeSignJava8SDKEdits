/*     */ package com.adobe.sign.api.Views;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.ViewsApi;
/*     */ import com.adobe.sign.model.views.AgreementAssetListRequest;
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
/*     */ public class PostViewAgreementAssetListApiTest
/*     */ {
/*  39 */   private static ViewsApi viewsApi = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  43 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() {
/*  47 */     ApiUtils.configureProperty();
/*  48 */     viewsApi = ViewsUtils.getViewsApi();
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
/*  60 */     AgreementAssetListRequest agreementAssetListRequest = new AgreementAssetListRequest();
/*     */     
/*     */     try {
/*  63 */       viewsApi.createAgreementAssetListUrl(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  64 */           agreementAssetListRequest);
/*     */     }
/*  66 */     catch (ApiException e) {
/*  67 */       Assert.assertTrue(e.getMessage(), 
/*  68 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  72 */       viewsApi.createAgreementAssetListUrl(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  73 */           agreementAssetListRequest);
/*     */     }
/*  75 */     catch (ApiException e) {
/*  76 */       Assert.assertTrue(e.getMessage(), 
/*  77 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  89 */     AgreementAssetListRequest agreementAssetListRequest = new AgreementAssetListRequest();
/*     */     
/*     */     try {
/*  92 */       viewsApi.createAgreementAssetListUrl(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  93 */           agreementAssetListRequest);
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
/*     */   @Test
/*     */   public void testCreateAgreementAssetListUrl() throws ApiException {
/* 109 */     AgreementAssetListRequest agreementAssetListRequest = new AgreementAssetListRequest();
/*     */     
/*     */     try {
/* 112 */       ViewUrl viewUrl = viewsApi.createAgreementAssetListUrl(ApiUtils.getValidHeaderParams(), 
/* 113 */           agreementAssetListRequest);
/* 114 */       Assert.assertNotNull(viewUrl);
/* 115 */       Assert.assertNotNull(viewUrl.getViewURL());
/*     */     }
/* 117 */     catch (ApiException e) {
/* 118 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Views\PostViewAgreementAssetListApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */