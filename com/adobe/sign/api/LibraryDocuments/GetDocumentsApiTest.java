/*     */ package com.adobe.sign.api.LibraryDocuments;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.LibraryDocumentsApi;
/*     */ import com.adobe.sign.model.libraryDocuments.Documents;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.LibraryDocumentsUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
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
/*     */ public class GetDocumentsApiTest
/*     */ {
/*  38 */   private static LibraryDocumentsApi libraryDocumentsApi = null;
/*  39 */   private static String libraryDocumentId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  43 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  47 */     ApiUtils.configureProperty();
/*  48 */     libraryDocumentsApi = LibraryDocumentsUtils.getLibraryDocumentsApi();
/*  49 */     libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
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
/*  62 */       libraryDocumentsApi.getDocuments(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  63 */           libraryDocumentId);
/*     */     }
/*  65 */     catch (ApiException e) {
/*  66 */       Assert.assertTrue(e.getMessage(), 
/*  67 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  71 */       libraryDocumentsApi.getDocuments(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  72 */           libraryDocumentId);
/*     */     }
/*  74 */     catch (ApiException e) {
/*  75 */       Assert.assertTrue(e.getMessage(), 
/*  76 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  89 */       libraryDocumentsApi.getDocuments(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  90 */           libraryDocumentId);
/*     */     }
/*  92 */     catch (ApiException e) {
/*  93 */       Assert.assertTrue(e.getMessage(), 
/*  94 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidLibraryDocumentId() throws ApiException {
/*     */     try {
/* 107 */       libraryDocumentsApi.getDocuments(ApiUtils.getValidHeaderParams(), 
/* 108 */           TestData.EMPTY_PARAM);
/*     */     }
/* 110 */     catch (ApiException e) {
/* 111 */       Assert.assertTrue(e.getMessage(), 
/* 112 */           SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 116 */       libraryDocumentsApi.getDocuments(ApiUtils.getValidHeaderParams(), 
/* 117 */           TestData.NULL_PARAM);
/*     */     }
/* 119 */     catch (ApiException e) {
/* 120 */       Assert.assertTrue(e.getMessage(), 
/* 121 */           SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testDocuments() throws ApiException {
/*     */     try {
/* 134 */       Documents documents = libraryDocumentsApi.getDocuments(ApiUtils.getValidHeaderParams(), 
/* 135 */           libraryDocumentId);
/* 136 */       Assert.assertNotNull(documents);
/*     */     }
/* 138 */     catch (ApiException e) {
/* 139 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\LibraryDocuments\GetDocumentsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */