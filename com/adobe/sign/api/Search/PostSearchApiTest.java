/*     */ package com.adobe.sign.api.Search;
/*     */ import java.util.Date;

/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.SearchApi;
/*     */ import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
/*     */ import com.adobe.sign.model.search.AgreementAssetEventRequest;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.SearchUtils;
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
/*     */ 
/*     */ public class PostSearchApiTest
/*     */ {
/*  41 */   private static SearchApi searchApi = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  45 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() {
/*  49 */     ApiUtils.configureProperty();
/*  50 */     searchApi = SearchUtils.getSearchApi();
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
/*  62 */     AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(TestData.STATIC_START_DATE, 
/*  63 */         TestData.STATIC_END_DATE);
/*     */     try {
/*  65 */       searchApi.createAssetEvent(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  66 */           agreementAssetEventRequest);
/*     */     }
/*  68 */     catch (ApiException e) {
/*  69 */       Assert.assertTrue(e.getMessage(), 
/*  70 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  74 */       searchApi.createAssetEvent(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  75 */           agreementAssetEventRequest);
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
/*  91 */     AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(TestData.STATIC_START_DATE, 
/*  92 */         TestData.STATIC_END_DATE);
/*     */     try {
/*  94 */       searchApi.createAssetEvent(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  95 */           agreementAssetEventRequest);
/*     */     }
/*  97 */     catch (ApiException e) {
/*  98 */       Assert.assertTrue(e.getMessage(), 
/*  99 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidAgreementAssetEventRequest() throws ApiException {
/*     */     try {
/* 113 */       searchApi.createAssetEvent(ApiUtils.getValidHeaderParams(), 
/* 114 */           null);
/*     */     }
/* 116 */     catch (ApiException e) {
/* 117 */       Assert.assertTrue(e.getMessage(), 
/* 118 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 121 */     AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(null, 
/* 122 */         TestData.STATIC_END_DATE);
/*     */     try {
/* 124 */       searchApi.createAssetEvent(ApiUtils.getValidHeaderParams(), 
/* 125 */           agreementAssetEventRequest);
/*     */     }
/* 127 */     catch (ApiException e) {
/* 128 */       Assert.assertTrue(e.getMessage(), 
/* 129 */           SdkErrorCodes.INVALID_DATE.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 132 */     agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(TestData.STATIC_START_DATE, 
/* 133 */         null);
/*     */     try {
/* 135 */       searchApi.createAssetEvent(ApiUtils.getValidHeaderParams(), 
/* 136 */           agreementAssetEventRequest);
/*     */     }
/* 138 */     catch (ApiException e) {
/* 139 */       Assert.assertTrue(e.getMessage(), 
/* 140 */           SdkErrorCodes.INVALID_DATE.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 143 */     Date startDate = TestData.STATIC_END_DATE;
/* 144 */     Date endDate = TestData.STATIC_START_DATE;
/*     */     
/* 146 */     agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(startDate, 
/* 147 */         endDate);
/*     */     try {
/* 149 */       searchApi.createAssetEvent(ApiUtils.getValidHeaderParams(), 
/* 150 */           agreementAssetEventRequest);
/*     */     }
/* 152 */     catch (ApiException e) {
/* 153 */       Assert.assertTrue(e.getMessage(), 
/* 154 */           SdkErrorCodes.INVALID_DATE.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testCreateAssetEvent() throws ApiException {
/* 166 */     AgreementAssetEventRequest agreementAssetEventRequest = SearchUtils.getAgreementAssetEventRequest(TestData.STATIC_START_DATE, 
/* 167 */         TestData.STATIC_END_DATE);
/*     */     try {
/* 169 */       AgreementAssetEventPostResponse response = searchApi.createAssetEvent(ApiUtils.getValidHeaderParams(), 
/* 170 */           agreementAssetEventRequest);
/* 171 */       Assert.assertNotNull(response);
/* 172 */       Assert.assertNotNull(response.getSearchId());
/*     */     }
/* 174 */     catch (ApiException e) {
/* 175 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Search\PostSearchApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */