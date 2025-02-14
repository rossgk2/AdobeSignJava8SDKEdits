/*     */ package com.adobe.sign.api.TransientDocuments;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.TransientDocumentsApi;
/*     */ import com.adobe.sign.model.transientDocuments.TransientDocumentResponse;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
/*     */ import com.adobe.sign.utils.TransientDocumentsUtils;
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
/*     */ public class PostTransientDocumentsApiTest
/*     */ {
/*  38 */   private static TransientDocumentsApi transientDocumentsApi = null;
/*     */ 
/*     */ 
/*     */   
/*     */   @Rule
/*  43 */   public Retry retry = new Retry();
/*     */ 
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() {
/*  48 */     ApiUtils.configureProperty();
/*  49 */     transientDocumentsApi = TransientDocumentsUtils.getTransientDocumentsApi();
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
/*  62 */       transientDocumentsApi.createTransientDocument(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  63 */           TestData.SAMPLE_FILE, 
/*  64 */           TestData.TRANSIENT_DOCUMENT_NAME, 
/*  65 */           TestData.VALID_MIME);
/*     */     }
/*  67 */     catch (ApiException e) {
/*  68 */       Assert.assertTrue(e.getMessage(), 
/*  69 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  73 */       transientDocumentsApi.createTransientDocument(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  74 */           TestData.SAMPLE_FILE, 
/*  75 */           TestData.TRANSIENT_DOCUMENT_NAME, 
/*  76 */           TestData.VALID_MIME);
/*     */     }
/*  78 */     catch (ApiException e) {
/*  79 */       Assert.assertTrue(e.getMessage(), 
/*  80 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  93 */       transientDocumentsApi.createTransientDocument(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  94 */           TestData.SAMPLE_FILE, 
/*  95 */           TestData.TRANSIENT_DOCUMENT_NAME, 
/*  96 */           TestData.VALID_MIME);
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
/*     */   public void testInvalidFile() throws ApiException {
/*     */     try {
/* 113 */       transientDocumentsApi.createTransientDocument(ApiUtils.getValidHeaderParams(), 
/* 114 */           null, 
/* 115 */           TestData.TRANSIENT_DOCUMENT_NAME, 
/* 116 */           TestData.VALID_MIME);
/*     */     }
/* 118 */     catch (ApiException e) {
/* 119 */       Assert.assertTrue(e.getMessage(), 
/* 120 */           SdkErrorCodes.NO_FILE_CONTENT.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidFileName() throws ApiException {
/*     */     try {
/* 133 */       transientDocumentsApi.createTransientDocument(ApiUtils.getValidHeaderParams(), 
/* 134 */           TestData.SAMPLE_FILE, 
/* 135 */           TestData.EMPTY_PARAM, 
/* 136 */           TestData.VALID_MIME);
/*     */     }
/* 138 */     catch (ApiException e) {
/* 139 */       Assert.assertTrue(e.getMessage(), 
/* 140 */           SdkErrorCodes.NO_FILE_NAME.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidFileExtensionAndMime() throws ApiException {
/*     */     try {
/* 154 */       transientDocumentsApi.createTransientDocument(ApiUtils.getValidHeaderParams(), 
/* 155 */           TestData.NO_EXTENSION_FILE, 
/* 156 */           TestData.TRANSIENT_DOCUMENT_NAME, 
/* 157 */           TestData.EMPTY_MIME);
/*     */     }
/* 159 */     catch (ApiException e) {
/* 160 */       Assert.assertTrue(e.getMessage(), 
/* 161 */           SdkErrorCodes.NO_MEDIA_TYPE.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testCreateTransientDocument() throws ApiException {
/*     */     try {
/* 173 */       TransientDocumentResponse response = transientDocumentsApi.createTransientDocument(ApiUtils.getValidHeaderParams(), 
/* 174 */           TestData.SAMPLE_FILE.getAbsoluteFile(), 
/* 175 */           TestData.TRANSIENT_DOCUMENT_NAME, 
/* 176 */           TestData.VALID_MIME);
/* 177 */       Assert.assertNotNull(response);
/* 178 */       Assert.assertNotNull(response.getTransientDocumentId());
/*     */     }
/* 180 */     catch (ApiException e) {
/* 181 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\TransientDocuments\PostTransientDocumentsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */