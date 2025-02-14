/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.AgreementCreationInfo;
/*     */ import com.adobe.sign.model.agreements.AgreementCreationResponse;
/*     */ import com.adobe.sign.model.agreements.FileInfo;
/*     */ import com.adobe.sign.model.agreements.PostSignOptions;
/*     */ import com.adobe.sign.model.agreements.RecipientSetInfo;
/*     */ import com.adobe.sign.model.agreements.URLFileInfo;
/*     */ import com.adobe.sign.utils.AgreementsUtils;
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
/*     */ public class PostAgreementsApiTest
/*     */ {
/*  44 */   private static AgreementsApi agreementsApi = null;
/*  45 */   private static String libraryDocumentId = null;
/*  46 */   private static String transientDocumentId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  50 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  54 */     ApiUtils.configureProperty();
/*  55 */     agreementsApi = AgreementsUtils.getAgreementsApi();
/*     */     
/*  57 */     libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
/*  58 */     transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
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
/*  70 */     AgreementCreationInfo creationInfo = new AgreementCreationInfo();
/*     */     
/*     */     try {
/*  73 */       agreementsApi.createAgreement(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  74 */           creationInfo);
/*     */     }
/*  76 */     catch (ApiException e) {
/*  77 */       Assert.assertTrue(e.getMessage(), 
/*  78 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  82 */       agreementsApi.createAgreement(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  83 */           creationInfo);
/*     */     }
/*  85 */     catch (ApiException e) {
/*  86 */       Assert.assertTrue(e.getMessage(), 
/*  87 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testInvalidXApiUser() throws ApiException {
/*  98 */     AgreementCreationInfo creationInfo = new AgreementCreationInfo();
/*     */     
/*     */     try {
/* 101 */       agreementsApi.createAgreement(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 102 */           creationInfo);
/*     */     }
/* 104 */     catch (ApiException e) {
/* 105 */       Assert.assertTrue(e.getMessage(), 
/* 106 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testInvalidAgreementCreationInfo() throws ApiException {
/* 125 */     PostSignOptions options = new PostSignOptions();
/* 126 */     FileInfo fileInfo = new FileInfo();
/*     */     
/* 128 */     AgreementCreationInfo agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(), 
/* 129 */         fileInfo);
/*     */ 
/*     */     
/*     */     try {
/* 133 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 134 */           agreementCreationInfo);
/*     */     }
/* 136 */     catch (ApiException e) {
/* 137 */       Assert.assertTrue(e.getMessage(), 
/* 138 */           SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 141 */     URLFileInfo url = new URLFileInfo();
/* 142 */     url.setUrl(TestData.INVALID_URL);
/* 143 */     fileInfo.setDocumentURL(url);
/*     */     
/* 145 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(), 
/* 146 */         fileInfo);
/*     */ 
/*     */     
/*     */     try {
/* 150 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 151 */           agreementCreationInfo);
/*     */     }
/* 153 */     catch (ApiException e) {
/* 154 */       Assert.assertTrue(e.getMessage(), 
/* 155 */           SdkErrorCodes.URL_INVALID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 158 */     fileInfo.setLibraryDocumentId(libraryDocumentId);
/* 159 */     fileInfo.setTransientDocumentId(transientDocumentId);
/* 160 */     fileInfo.setDocumentURL(null);
/*     */     
/* 162 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(), 
/* 163 */         fileInfo);
/*     */ 
/*     */     
/*     */     try {
/* 167 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 168 */           agreementCreationInfo);
/*     */     }
/* 170 */     catch (ApiException e) {
/* 171 */       Assert.assertTrue(e.getMessage(), 
/* 172 */           SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 175 */     fileInfo.setTransientDocumentId(TestData.NULL_PARAM);
/*     */     
/* 177 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(TestData.NULL_PARAM, 
/* 178 */         fileInfo);
/*     */ 
/*     */     
/*     */     try {
/* 182 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 183 */           agreementCreationInfo);
/*     */     }
/* 185 */     catch (ApiException e) {
/* 186 */       Assert.assertTrue(e.getMessage(), 
/* 187 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 190 */     options.setRedirectUrl(TestData.EMPTY_PARAM);
/* 191 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(), 
/* 192 */         options);
/*     */ 
/*     */     
/*     */     try {
/* 196 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 197 */           agreementCreationInfo);
/*     */     }
/* 199 */     catch (ApiException e) {
/* 200 */       Assert.assertTrue(e.getMessage(), 
/* 201 */           SdkErrorCodes.EMPTY_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 204 */     options.setRedirectUrl(TestData.INVALID_URL);
/* 205 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(), 
/* 206 */         options);
/*     */ 
/*     */     
/*     */     try {
/* 210 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 211 */           agreementCreationInfo);
/*     */     }
/* 213 */     catch (ApiException e) {
/* 214 */       Assert.assertTrue(e.getMessage(), 
/* 215 */           SdkErrorCodes.INVALID_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 218 */     options.setRedirectUrl(TestData.REDIRECT_URL);
/* 219 */     options.setRedirectDelay(Integer.valueOf(TestData.INVALID_REDIRECT_DELAY));
/* 220 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName(), 
/* 221 */         options);
/*     */ 
/*     */     
/*     */     try {
/* 225 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 226 */           agreementCreationInfo);
/*     */     }
/* 228 */     catch (ApiException e) {
/* 229 */       Assert.assertTrue(e.getMessage(), 
/* 230 */           SdkErrorCodes.INVALID_REDIRECT_DELAY.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 233 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(TestData.POST_EMAIL, 
/* 234 */         TestData.NULL_PARAM, 
/* 235 */         null, 
/* 236 */         ApiUtils.getAgreementName());
/*     */ 
/*     */     
/*     */     try {
/* 240 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 241 */           agreementCreationInfo);
/*     */     }
/* 243 */     catch (ApiException e) {
/* 244 */       Assert.assertTrue(e.getMessage(), 
/* 245 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 248 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(TestData.NULL_PARAM, 
/* 249 */         TestData.NULL_PARAM, 
/* 250 */         RecipientSetInfo.RecipientSetRoleEnum.SIGNER, 
/* 251 */         ApiUtils.getAgreementName());
/*     */ 
/*     */     
/*     */     try {
/* 255 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 256 */           agreementCreationInfo);
/*     */     }
/* 258 */     catch (ApiException e) {
/* 259 */       Assert.assertTrue(e.getMessage(), 
/* 260 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 263 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(TestData.INVALID_EMAIL, 
/* 264 */         TestData.NULL_PARAM, 
/* 265 */         RecipientSetInfo.RecipientSetRoleEnum.SIGNER, 
/* 266 */         ApiUtils.getAgreementName());
/*     */ 
/*     */     
/*     */     try {
/* 270 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 271 */           agreementCreationInfo);
/*     */     }
/* 273 */     catch (ApiException e) {
/* 274 */       Assert.assertTrue(e.getMessage(), 
/* 275 */           SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 278 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(TestData.POST_EMAIL, 
/* 279 */         TestData.POST_FAX, 
/* 280 */         RecipientSetInfo.RecipientSetRoleEnum.SIGNER, 
/* 281 */         ApiUtils.getAgreementName());
/*     */ 
/*     */     
/*     */     try {
/* 285 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 286 */           agreementCreationInfo);
/*     */     }
/* 288 */     catch (ApiException e) {
/* 289 */       Assert.assertTrue(e.getMessage(), 
/* 290 */           SdkErrorCodes.INVALID_ARGUMENTS.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 293 */     agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(null, ApiUtils.getAgreementName());
/*     */ 
/*     */     
/*     */     try {
/* 297 */       agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 298 */           agreementCreationInfo);
/*     */     }
/* 300 */     catch (ApiException e) {
/* 301 */       Assert.assertTrue(e.getMessage(), 
/* 302 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testCreateAgreement() throws ApiException {
/* 311 */     AgreementCreationInfo agreementCreationInfo = AgreementsUtils.getAgreementCreationInfo(ApiUtils.getAgreementName());
/*     */     
/*     */     try {
/* 314 */       AgreementCreationResponse agreementCreationResponse = agreementsApi.createAgreement(ApiUtils.getValidHeaderParams(), 
/* 315 */           agreementCreationInfo);
/* 316 */       Assert.assertNotNull(agreementCreationResponse);
/* 317 */       Assert.assertNotNull(agreementCreationResponse.getAgreementId());
/*     */     }
/* 319 */     catch (ApiException e) {
/* 320 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\PostAgreementsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */