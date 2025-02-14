/*     */ package com.adobe.sign.api.Views;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.ViewsApi;
/*     */ import com.adobe.sign.model.views.AgreementAssetRequest;
/*     */ import com.adobe.sign.model.views.ViewUrl;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.LibraryDocumentsUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
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
/*     */ public class PostViewAgreementAssetsApiTest
/*     */ {
/*  40 */   private static ViewsApi viewsApi = null;
/*  41 */   private static String libraryDocumentId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  45 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  49 */     ApiUtils.configureProperty();
/*  50 */     viewsApi = ViewsUtils.getViewsApi();
/*  51 */     libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
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
/*  64 */     AgreementAssetRequest agreementAssetRequest = new AgreementAssetRequest();
/*  65 */     agreementAssetRequest.setAgreementAssetId(libraryDocumentId);
/*     */     
/*     */     try {
/*  68 */       viewsApi.createAgreementAssetUrl(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  69 */           agreementAssetRequest);
/*     */     }
/*  71 */     catch (ApiException e) {
/*  72 */       Assert.assertTrue(e.getMessage(), 
/*  73 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  77 */       viewsApi.createAgreementAssetUrl(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  78 */           agreementAssetRequest);
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
/*     */   
/*     */   @Test
/*     */   public void testInvalidXApiUser() throws ApiException {
/*  95 */     AgreementAssetRequest agreementAssetRequest = new AgreementAssetRequest();
/*  96 */     agreementAssetRequest.setAgreementAssetId(libraryDocumentId);
/*     */     
/*     */     try {
/*  99 */       viewsApi.createAgreementAssetUrl(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 100 */           agreementAssetRequest);
/*     */     }
/* 102 */     catch (ApiException e) {
/* 103 */       Assert.assertTrue(e.getMessage(), 
/* 104 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidAgreementAssetId() throws ApiException {
/* 117 */     AgreementAssetRequest agreementAssetRequest = new AgreementAssetRequest();
/* 118 */     agreementAssetRequest.setAgreementAssetId(TestData.NULL_PARAM);
/*     */     
/*     */     try {
/* 121 */       viewsApi.createAgreementAssetUrl(ApiUtils.getValidHeaderParams(), 
/* 122 */           agreementAssetRequest);
/*     */     }
/* 124 */     catch (ApiException e) {
/* 125 */       Assert.assertTrue(e.getMessage(), 
/* 126 */           SdkErrorCodes.INVALID_AGREEMENT_ASSET_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 129 */     agreementAssetRequest.setAgreementAssetId(TestData.EMPTY_PARAM);
/*     */     
/*     */     try {
/* 132 */       viewsApi.createAgreementAssetUrl(ApiUtils.getValidHeaderParams(), 
/* 133 */           agreementAssetRequest);
/*     */     }
/* 135 */     catch (ApiException e) {
/* 136 */       Assert.assertTrue(e.getMessage(), 
/* 137 */           SdkErrorCodes.INVALID_AGREEMENT_ASSET_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testCreateAgreementAssetUrl() throws ApiException {
/* 149 */     AgreementAssetRequest agreementAssetRequest = new AgreementAssetRequest();
/* 150 */     agreementAssetRequest.setAgreementAssetId(libraryDocumentId);
/*     */     
/*     */     try {
/* 153 */       ViewUrl viewUrl = viewsApi.createAgreementAssetUrl(ApiUtils.getValidHeaderParams(), 
/* 154 */           agreementAssetRequest);
/* 155 */       Assert.assertNotNull(viewUrl);
/* 156 */       Assert.assertNotNull(viewUrl.getViewURL());
/*     */     }
/* 158 */     catch (ApiException e) {
/* 159 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Views\PostViewAgreementAssetsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */