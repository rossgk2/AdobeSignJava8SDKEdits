/*     */ package com.adobe.sign.api.LibraryDocuments;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.LibraryDocumentsApi;
/*     */ import com.adobe.sign.model.libraryDocuments.DocumentLibraryItems;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.LibraryDocumentsUtils;
/*     */ import com.adobe.sign.utils.Retry;
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
/*     */ public class GetLibraryDocumentsApiTest
/*     */ {
/*  38 */   private static LibraryDocumentsApi libraryDocumentsApi = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  42 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  46 */     ApiUtils.configureProperty();
/*  47 */     libraryDocumentsApi = LibraryDocumentsUtils.getLibraryDocumentsApi();
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
/*     */     try {
/*  60 */       libraryDocumentsApi.getLibraryDocuments(ApiUtils.getNullAccessTokenHeaderParams());
/*     */     }
/*  62 */     catch (ApiException e) {
/*  63 */       Assert.assertTrue(e.getMessage(), 
/*  64 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  68 */       libraryDocumentsApi.getLibraryDocuments(ApiUtils.getEmptyAccessTokenHeaderParams());
/*     */     }
/*  70 */     catch (ApiException e) {
/*  71 */       Assert.assertTrue(e.getMessage(), 
/*  72 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  85 */       libraryDocumentsApi.getLibraryDocuments(ApiUtils.getEmptyXApiUserHeaderParams());
/*     */     }
/*  87 */     catch (ApiException e) {
/*  88 */       Assert.assertTrue(e.getMessage(), 
/*  89 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testLibraryDocuments() throws ApiException {
/*     */     try {
/* 102 */       DocumentLibraryItems documentLibraryItems = libraryDocumentsApi.getLibraryDocuments(ApiUtils.getValidHeaderParams());
/* 103 */       Assert.assertNotNull(documentLibraryItems);
/*     */     }
/* 105 */     catch (ApiException e) {
/* 106 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\LibraryDocuments\GetLibraryDocumentsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */