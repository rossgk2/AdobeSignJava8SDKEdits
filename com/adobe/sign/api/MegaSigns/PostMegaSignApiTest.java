/*     */ package com.adobe.sign.api.MegaSigns;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.MegaSignsApi;
/*     */ import com.adobe.sign.model.megaSigns.FileInfo;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignCreationRequest;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignCreationResponse;
/*     */ import com.adobe.sign.model.megaSigns.PostSignOptions;
/*     */ import com.adobe.sign.model.megaSigns.URLFileInfo;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.LibraryDocumentsUtils;
/*     */ import com.adobe.sign.utils.MegaSignUtils;
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
/*     */ public class PostMegaSignApiTest
/*     */ {
/*  45 */   private static MegaSignsApi megaSignsApi = null;
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
/*  56 */     megaSignsApi = MegaSignUtils.getMegaSignsApi();
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
/*  71 */     MegaSignCreationRequest megaSignCreationRequest = MegaSignUtils.getMegaSignCreationRequest(TestData.MEGASIGN_NAME);
/*     */     
/*     */     try {
/*  74 */       megaSignsApi.createMegaSign(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  75 */           megaSignCreationRequest);
/*     */     }
/*  77 */     catch (ApiException e) {
/*  78 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  82 */       megaSignsApi.createMegaSign(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  83 */           megaSignCreationRequest);
/*     */     }
/*  85 */     catch (ApiException e) {
/*  86 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testInvalidMegaSignCreationInfo() throws ApiException {
/*     */     try {
/* 104 */       megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(), 
/* 105 */           null);
/*     */     }
/* 107 */     catch (ApiException e) {
/* 108 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 111 */     MegaSignCreationRequest megaSignCreationRequest = MegaSignUtils.getMegaSignCreationRequest(TestData.NULL_PARAM);
/*     */     
/*     */     try {
/* 114 */       megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(), 
/* 115 */           megaSignCreationRequest);
/*     */     }
/* 117 */     catch (ApiException e) {
/* 118 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 121 */     FileInfo fileInfo = new FileInfo();
/* 122 */     megaSignCreationRequest = MegaSignUtils.getMegaSignCreationRequest(TestData.MEGASIGN_NAME, fileInfo);
/*     */     
/*     */     try {
/* 125 */       megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(), 
/* 126 */           megaSignCreationRequest);
/*     */     }
/* 128 */     catch (ApiException e) {
/* 129 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 132 */     URLFileInfo url = new URLFileInfo();
/* 133 */     url.setUrl(TestData.INVALID_URL);
/* 134 */     fileInfo.setDocumentURL(url);
/*     */     
/* 136 */     megaSignCreationRequest = MegaSignUtils.getMegaSignCreationRequest(TestData.MEGASIGN_NAME, fileInfo);
/*     */     
/*     */     try {
/* 139 */       megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(), 
/* 140 */           megaSignCreationRequest);
/*     */     }
/* 142 */     catch (ApiException e) {
/* 143 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.URL_INVALID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 146 */     fileInfo.setLibraryDocumentId(libraryDocumentId);
/* 147 */     fileInfo.setTransientDocumentId(transientDocumentId);
/* 148 */     fileInfo.setDocumentURL(null);
/*     */     
/* 150 */     megaSignCreationRequest = MegaSignUtils.getMegaSignCreationRequest(TestData.MEGASIGN_NAME, fileInfo);
/*     */     
/*     */     try {
/* 153 */       megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(), 
/* 154 */           megaSignCreationRequest);
/*     */     }
/* 156 */     catch (ApiException e) {
/* 157 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 160 */     PostSignOptions options = new PostSignOptions();
/* 161 */     options.setRedirectUrl(TestData.EMPTY_PARAM);
/*     */     
/* 163 */     megaSignCreationRequest = MegaSignUtils.getMegaSignCreationRequest(TestData.MEGASIGN_NAME, options);
/*     */     
/*     */     try {
/* 166 */       megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(), 
/* 167 */           megaSignCreationRequest);
/*     */     }
/* 169 */     catch (ApiException e) {
/* 170 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.EMPTY_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 173 */     options.setRedirectUrl(TestData.INVALID_URL);
/* 174 */     megaSignCreationRequest = MegaSignUtils.getMegaSignCreationRequest(TestData.MEGASIGN_NAME, options);
/*     */     
/*     */     try {
/* 177 */       megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(), 
/* 178 */           megaSignCreationRequest);
/*     */     }
/* 180 */     catch (ApiException e) {
/* 181 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 184 */     options.setRedirectUrl(TestData.REDIRECT_URL);
/* 185 */     options.setRedirectDelay(Integer.valueOf(TestData.INVALID_REDIRECT_DELAY));
/*     */     
/* 187 */     megaSignCreationRequest = MegaSignUtils.getMegaSignCreationRequest(TestData.MEGASIGN_NAME, options);
/*     */     
/*     */     try {
/* 190 */       megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(), 
/* 191 */           megaSignCreationRequest);
/*     */     }
/* 193 */     catch (ApiException e) {
/* 194 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_REDIRECT_DELAY.getApiCode().equals(e.getApiCode()));
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
/* 206 */     MegaSignCreationRequest megaSignCreationRequest = MegaSignUtils.getMegaSignCreationRequest(TestData.MEGASIGN_NAME);
/*     */     
/*     */     try {
/* 209 */       megaSignsApi.createMegaSign(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 210 */           megaSignCreationRequest);
/*     */     }
/* 212 */     catch (ApiException e) {
/* 213 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testCreateMegaSign() throws ApiException {
/* 225 */     MegaSignCreationRequest megaSignCreationRequest = MegaSignUtils.getMegaSignCreationRequest(ApiUtils.getMegaSignName());
/*     */     
/*     */     try {
/* 228 */       MegaSignCreationResponse megaSignCreationResponse = megaSignsApi.createMegaSign(ApiUtils.getValidHeaderParams(), 
/* 229 */           megaSignCreationRequest);
/* 230 */       Assert.assertNotNull(megaSignCreationResponse);
/* 231 */       Assert.assertNotNull(megaSignCreationResponse.getMegaSignId());
/*     */     }
/* 233 */     catch (ApiException e) {
/* 234 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\MegaSigns\PostMegaSignApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */