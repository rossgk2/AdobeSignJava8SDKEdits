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
/*     */ public class DeleteLibraryDocumentApiTest
/*     */ {
/*  36 */   private static LibraryDocumentsApi libraryDocumentsApi = null;
/*  37 */   private static String libraryDocumentId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  41 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  45 */     ApiUtils.configureProperty();
/*  46 */     libraryDocumentsApi = LibraryDocumentsUtils.getLibraryDocumentsApi();
/*  47 */     libraryDocumentId = LibraryDocumentsUtils.createLibraryDocument(ApiUtils.getLibraryDocumentName());
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
/*  60 */       libraryDocumentsApi.deleteLibraryDocument(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  61 */           libraryDocumentId);
/*     */     }
/*  63 */     catch (ApiException e) {
/*  64 */       Assert.assertTrue(e.getMessage(), 
/*  65 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  69 */       libraryDocumentsApi.deleteLibraryDocument(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  70 */           libraryDocumentId);
/*     */     }
/*  72 */     catch (ApiException e) {
/*  73 */       Assert.assertTrue(e.getMessage(), 
/*  74 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  87 */       libraryDocumentsApi.deleteLibraryDocument(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  88 */           libraryDocumentId);
/*     */     }
/*  90 */     catch (ApiException e) {
/*  91 */       Assert.assertTrue(e.getMessage(), 
/*  92 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 105 */       libraryDocumentsApi.deleteLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 106 */           TestData.EMPTY_PARAM);
/*     */     }
/* 108 */     catch (ApiException e) {
/* 109 */       Assert.assertTrue(e.getMessage(), 
/* 110 */           SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 114 */       libraryDocumentsApi.deleteLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 115 */           TestData.NULL_PARAM);
/*     */     }
/* 117 */     catch (ApiException e) {
/* 118 */       Assert.assertTrue(e.getMessage(), 
/* 119 */           SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testDeleteLibraryDocument() throws ApiException {
/*     */     try {
/* 133 */       libraryDocumentsApi.deleteLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 134 */           libraryDocumentId);
/*     */     }
/* 136 */     catch (ApiException e) {
/* 137 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\LibraryDocuments\DeleteLibraryDocumentApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */