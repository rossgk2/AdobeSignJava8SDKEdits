/*     */ package com.adobe.sign.api.LibraryDocuments;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.LibraryDocumentsApi;
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
/*     */ public class GetCombinedDocumentApiTest
/*     */ {
/*  37 */   private static LibraryDocumentsApi libraryDocumentsApi = null;
/*  38 */   private static String libraryDocumentId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  42 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  46 */     ApiUtils.configureProperty();
/*  47 */     libraryDocumentsApi = LibraryDocumentsUtils.getLibraryDocumentsApi();
/*  48 */     libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
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
/*  62 */       libraryDocumentsApi.getCombinedDocument(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  63 */           libraryDocumentId, 
/*  64 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/*  66 */     catch (ApiException e) {
/*  67 */       Assert.assertTrue(e.getMessage(), 
/*  68 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  72 */       libraryDocumentsApi.getCombinedDocument(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  73 */           libraryDocumentId, 
/*  74 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/*  76 */     catch (ApiException e) {
/*  77 */       Assert.assertTrue(e.getMessage(), 
/*  78 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  91 */       libraryDocumentsApi.getCombinedDocument(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  92 */           libraryDocumentId, 
/*  93 */           Boolean.valueOf(TestData.AUDIT_REPORT));
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
/*     */   public void testInvalidLibraryDocumentId() throws ApiException {
/*     */     try {
/* 110 */       libraryDocumentsApi.getCombinedDocument(ApiUtils.getValidHeaderParams(), 
/* 111 */           TestData.EMPTY_PARAM, 
/* 112 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 114 */     catch (ApiException e) {
/* 115 */       Assert.assertTrue(e.getMessage(), 
/* 116 */           SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 120 */       libraryDocumentsApi.getCombinedDocument(ApiUtils.getValidHeaderParams(), 
/* 121 */           TestData.NULL_PARAM, 
/* 122 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 124 */     catch (ApiException e) {
/* 125 */       Assert.assertTrue(e.getMessage(), 
/* 126 */           SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetCombinedDocument() throws ApiException {
/*     */     try {
/* 139 */       byte[] getCombinedDocument = libraryDocumentsApi.getCombinedDocument(ApiUtils.getValidHeaderParams(), 
/* 140 */           libraryDocumentId, 
/* 141 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/* 142 */       Assert.assertNotNull(getCombinedDocument);
/*     */     }
/* 144 */     catch (ApiException e) {
/* 145 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\LibraryDocuments\GetCombinedDocumentApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */