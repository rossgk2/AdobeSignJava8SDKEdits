/*     */ package com.adobe.sign.api.LibraryDocuments;
/*     */ import java.util.Arrays;

/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.LibraryDocumentsApi;
/*     */ import com.adobe.sign.model.libraryDocuments.FileInfo;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryCreationInfo;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationInfo;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationResponse;
/*     */ import com.adobe.sign.model.libraryDocuments.URLFileInfo;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.LibraryDocumentsUtils;
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
/*     */ 
/*     */ public class PostLibraryDocumentsApiTest
/*     */ {
/*  45 */   private static LibraryDocumentsApi libraryDocumentsApi = null;
/*  46 */   private static String libraryDocumentId = null;
/*  47 */   private static String transientDocumentId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  51 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  55 */     ApiUtils.configureProperty();
/*  56 */     libraryDocumentsApi = LibraryDocumentsUtils.getLibraryDocumentsApi();
/*     */     
/*  58 */     libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
/*  59 */     transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
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
/*  71 */     LibraryCreationInfo creationInfo = new LibraryCreationInfo();
/*     */     
/*     */     try {
/*  74 */       libraryDocumentsApi.createLibraryDocument(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  75 */           creationInfo);
/*     */     }
/*  77 */     catch (ApiException e) {
/*  78 */       Assert.assertTrue(e.getMessage(), 
/*  79 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  83 */       libraryDocumentsApi.createLibraryDocument(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  84 */           creationInfo);
/*     */     }
/*  86 */     catch (ApiException e) {
/*  87 */       Assert.assertTrue(e.getMessage(), 
/*  88 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/* 100 */     LibraryCreationInfo creationInfo = new LibraryCreationInfo();
/*     */     
/*     */     try {
/* 103 */       libraryDocumentsApi.createLibraryDocument(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 104 */           creationInfo);
/*     */     }
/* 106 */     catch (ApiException e) {
/* 107 */       Assert.assertTrue(e.getMessage(), 
/* 108 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   
/*     */   @Test
/*     */   public void testInvalidAgreementCreationInfo() throws ApiException {
/* 122 */     FileInfo fileInfo = new FileInfo();
/*     */     
/* 124 */     LibraryCreationInfo libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(fileInfo, 
/* 125 */         ApiUtils.getLibraryDocumentName());
/*     */ 
/*     */     
/*     */     try {
/* 129 */       libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 130 */           libraryCreationInfo);
/*     */     }
/* 132 */     catch (ApiException e) {
/* 133 */       Assert.assertTrue(e.getMessage(), 
/* 134 */           SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 137 */     URLFileInfo url = new URLFileInfo();
/* 138 */     url.setUrl(TestData.INVALID_URL);
/* 139 */     fileInfo.setDocumentURL(url);
/*     */     
/* 141 */     libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(fileInfo, 
/* 142 */         ApiUtils.getLibraryDocumentName());
/*     */ 
/*     */     
/*     */     try {
/* 146 */       libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 147 */           libraryCreationInfo);
/*     */     }
/* 149 */     catch (ApiException e) {
/* 150 */       Assert.assertTrue(e.getMessage(), 
/* 151 */           SdkErrorCodes.URL_INVALID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 154 */     fileInfo.setLibraryDocumentId(libraryDocumentId);
/* 155 */     fileInfo.setTransientDocumentId(transientDocumentId);
/* 156 */     fileInfo.setDocumentURL(null);
/*     */     
/* 158 */     libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(fileInfo, 
/* 159 */         ApiUtils.getLibraryDocumentName());
/*     */ 
/*     */     
/*     */     try {
/* 163 */       libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 164 */           libraryCreationInfo);
/*     */     }
/* 166 */     catch (ApiException e) {
/* 167 */       Assert.assertTrue(e.getMessage(), 
/* 168 */           SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/* 172 */     libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(TestData.NULL_PARAM);
/*     */ 
/*     */     
/*     */     try {
/* 176 */       libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 177 */           libraryCreationInfo);
/*     */     }
/* 179 */     catch (ApiException e) {
/* 180 */       Assert.assertTrue(e.getMessage(), 
/* 181 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 184 */     libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(null, 
/* 185 */         LibraryDocumentCreationInfo.LibrarySharingModeEnum.USER, 
/* 186 */         ApiUtils.getLibraryDocumentName());
/*     */ 
/*     */     
/*     */     try {
/* 190 */       libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 191 */           libraryCreationInfo);
/*     */     }
/* 193 */     catch (ApiException e) {
/* 194 */       Assert.assertTrue(e.getMessage(), 
/* 195 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 200 */     libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(Arrays.asList(new LibraryDocumentCreationInfo.LibraryTemplateTypesEnum[] { LibraryDocumentCreationInfo.LibraryTemplateTypesEnum.DOCUMENT }, ), null, ApiUtils.getLibraryDocumentName());
/*     */ 
/*     */     
/*     */     try {
/* 204 */       libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 205 */           libraryCreationInfo);
/*     */     }
/* 207 */     catch (ApiException e) {
/* 208 */       Assert.assertTrue(e.getMessage(), 
/* 209 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testCreateLibraryDocument() throws ApiException {
/* 222 */     LibraryCreationInfo libraryCreationInfo = LibraryDocumentsUtils.getLibraryCreationInfo(ApiUtils.getLibraryDocumentName());
/*     */     
/*     */     try {
/* 225 */       LibraryDocumentCreationResponse response = libraryDocumentsApi.createLibraryDocument(ApiUtils.getValidHeaderParams(), 
/* 226 */           libraryCreationInfo);
/* 227 */       Assert.assertNotNull(response);
/* 228 */       Assert.assertNotNull(response.getLibraryDocumentId());
/*     */     }
/* 230 */     catch (ApiException e) {
/* 231 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\LibraryDocuments\PostLibraryDocumentsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */