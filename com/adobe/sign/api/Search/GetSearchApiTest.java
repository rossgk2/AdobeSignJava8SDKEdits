/*     */ package com.adobe.sign.api.Search;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.SearchApi;
/*     */ import com.adobe.sign.model.search.AgreementAssetEventGetResponse;
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
/*     */ public class GetSearchApiTest
/*     */ {
/*  38 */   private static SearchApi searchApi = null;
/*     */   
/*  40 */   private static String searchId = null;
/*     */   
/*  42 */   private static String pageCursor = null;
/*     */ 
/*     */ 
/*     */   
/*     */   @Rule
/*  47 */   public Retry retry = new Retry();
/*     */ 
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  52 */     ApiUtils.configureProperty();
/*  53 */     searchApi = SearchUtils.getSearchApi();
/*  54 */     searchId = SearchUtils.getResourceId();
/*  55 */     pageCursor = SearchUtils.getPageCursor();
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
/*  69 */       searchApi.getAssetEvent(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  70 */           searchId, 
/*  71 */           pageCursor, 
/*  72 */           Integer.valueOf(TestData.PAGE_SIZE));
/*     */     }
/*  74 */     catch (ApiException e) {
/*  75 */       Assert.assertTrue(e.getMessage(), 
/*  76 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  80 */       searchApi.getAssetEvent(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  81 */           searchId, 
/*  82 */           pageCursor, 
/*  83 */           Integer.valueOf(TestData.PAGE_SIZE));
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
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testInvalidXApiUser() throws ApiException {
/*     */     try {
/* 101 */       searchApi.getAssetEvent(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 102 */           searchId, 
/* 103 */           pageCursor, 
/* 104 */           Integer.valueOf(TestData.PAGE_SIZE));
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
/*     */   @Test
/*     */   public void testInvalidSearchId() throws ApiException {
/*     */     try {
/* 122 */       searchApi.getAssetEvent(ApiUtils.getValidHeaderParams(), 
/* 123 */           TestData.NULL_PARAM, 
/* 124 */           pageCursor, 
/* 125 */           Integer.valueOf(TestData.PAGE_SIZE));
/*     */     }
/* 127 */     catch (ApiException e) {
/* 128 */       Assert.assertTrue(e.getMessage(), 
/* 129 */           SdkErrorCodes.INVALID_SEARCH_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 133 */       searchApi.getAssetEvent(ApiUtils.getValidHeaderParams(), 
/* 134 */           TestData.EMPTY_PARAM, 
/* 135 */           pageCursor, 
/* 136 */           Integer.valueOf(TestData.PAGE_SIZE));
/*     */     }
/* 138 */     catch (ApiException e) {
/* 139 */       Assert.assertTrue(e.getMessage(), 
/* 140 */           SdkErrorCodes.INVALID_SEARCH_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidPageCursor() throws ApiException {
/*     */     try {
/* 154 */       searchApi.getAssetEvent(ApiUtils.getValidHeaderParams(), 
/* 155 */           searchId, 
/* 156 */           TestData.NULL_PARAM, 
/* 157 */           Integer.valueOf(TestData.PAGE_SIZE));
/*     */     }
/* 159 */     catch (ApiException e) {
/* 160 */       Assert.assertTrue(e.getMessage(), 
/* 161 */           SdkErrorCodes.INVALID_PAGE_CURSOR.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 165 */       searchApi.getAssetEvent(ApiUtils.getValidHeaderParams(), 
/* 166 */           searchId, 
/* 167 */           TestData.EMPTY_PARAM, 
/* 168 */           Integer.valueOf(TestData.PAGE_SIZE));
/*     */     }
/* 170 */     catch (ApiException e) {
/* 171 */       Assert.assertTrue(e.getMessage(), 
/* 172 */           SdkErrorCodes.INVALID_PAGE_CURSOR.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetAssetEvent() throws ApiException {
/*     */     try {
/* 185 */       AgreementAssetEventGetResponse response = searchApi.getAssetEvent(ApiUtils.getValidHeaderParams(), 
/* 186 */           searchId, 
/* 187 */           pageCursor, 
/* 188 */           Integer.valueOf(TestData.PAGE_SIZE));
/* 189 */       Assert.assertNotNull(response);
/*     */     }
/* 191 */     catch (ApiException e) {
/* 192 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Search\GetSearchApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */