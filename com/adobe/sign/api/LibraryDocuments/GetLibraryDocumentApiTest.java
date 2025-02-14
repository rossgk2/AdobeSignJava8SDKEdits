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
/*     */ public class GetLibraryDocumentApiTest
/*     */ {
/*  37 */   private static LibraryDocumentsApi libraryDocumentsApi = null;
/*  38 */   private static String libraryDocumentId = null;
/*  39 */   private static String documentId = null;
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
/*  50 */     documentId = LibraryDocumentsUtils.getDocumentId();
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
/*  63 */       libraryDocumentsApi.getLibraryDocument(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  64 */           libraryDocumentId, 
/*  65 */           documentId);
/*     */     }
/*  67 */     catch (ApiException e) {
/*  68 */       Assert.assertTrue(e.getMessage(), 
/*  69 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  73 */       libraryDocumentsApi.getLibraryDocument(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  74 */           libraryDocumentId, 
/*  75 */           documentId);
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
/*     */     try {
/*  92 */       libraryDocumentsApi.getLibraryDocument(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  93 */           libraryDocumentId, 
/*  94 */           documentId);
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
/*     */   
/*     */   @Test
/*     */   public void testInvalidLibraryDocumentId() throws ApiException {
/*     */     try {
/* 111 */       libraryDocumentsApi.getLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 112 */           TestData.EMPTY_PARAM, 
/* 113 */           documentId);
/*     */     }
/* 115 */     catch (ApiException e) {
/* 116 */       Assert.assertTrue(e.getMessage(), 
/* 117 */           SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 121 */       libraryDocumentsApi.getLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 122 */           TestData.NULL_PARAM, 
/* 123 */           documentId);
/*     */     }
/* 125 */     catch (ApiException e) {
/* 126 */       Assert.assertTrue(e.getMessage(), 
/* 127 */           SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidDocumentId() throws ApiException {
/*     */     try {
/* 140 */       libraryDocumentsApi.getLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 141 */           libraryDocumentId, 
/* 142 */           TestData.EMPTY_PARAM);
/*     */     }
/* 144 */     catch (ApiException e) {
/* 145 */       Assert.assertTrue(e.getMessage(), 
/* 146 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 150 */       libraryDocumentsApi.getLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 151 */           libraryDocumentId, 
/* 152 */           TestData.NULL_PARAM);
/*     */     }
/* 154 */     catch (ApiException e) {
/* 155 */       Assert.assertTrue(e.getMessage(), 
/* 156 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testLibraryDocument() throws ApiException {
/*     */     try {
/* 169 */       byte[] libraryDocument = libraryDocumentsApi.getLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 170 */           libraryDocumentId, 
/* 171 */           documentId);
/* 172 */       Assert.assertNotNull(libraryDocument);
/*     */     }
/* 174 */     catch (ApiException e) {
/* 175 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\LibraryDocuments\GetLibraryDocumentApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */