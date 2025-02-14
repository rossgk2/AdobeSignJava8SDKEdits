/*     */ package com.adobe.sign.api.Widgets;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.WidgetsApi;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
/*     */ import com.adobe.sign.utils.WidgetUtils;
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
/*     */ public class GetWidgetDocumentInfoApiTest
/*     */ {
/*  38 */   private static WidgetsApi widgetsApi = null;
/*  39 */   private static String widgetId = null;
/*  40 */   private static String documentId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  44 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  48 */     ApiUtils.configureProperty();
/*  49 */     widgetId = WidgetUtils.getResourceId(TestData.WIDGET_NAME);
/*  50 */     widgetsApi = WidgetUtils.getWidgetsApi();
/*  51 */     documentId = WidgetUtils.getDocumentId();
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
/*  64 */       widgetsApi.getWidgetDocumentInfo(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  65 */           widgetId, 
/*  66 */           documentId);
/*     */     }
/*  68 */     catch (ApiException e) {
/*  69 */       Assert.assertTrue(e.getMessage(), 
/*  70 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  74 */       widgetsApi.getWidgetDocumentInfo(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  75 */           widgetId, 
/*  76 */           documentId);
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
/*     */   
/*     */   @Test
/*     */   public void testInvalidXApiUser() throws ApiException {
/*     */     try {
/*  94 */       widgetsApi.getWidgetDocumentInfo(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  95 */           widgetId, 
/*  96 */           documentId);
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
/*     */   public void testInvalidWidgetId() throws ApiException {
/*     */     try {
/* 113 */       widgetsApi.getWidgetDocumentInfo(ApiUtils.getValidHeaderParams(), 
/* 114 */           TestData.EMPTY_PARAM, 
/* 115 */           documentId);
/*     */     }
/* 117 */     catch (ApiException e) {
/* 118 */       Assert.assertTrue(e.getMessage(), 
/* 119 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 123 */       widgetsApi.getWidgetDocumentInfo(ApiUtils.getValidHeaderParams(), 
/* 124 */           TestData.NULL_PARAM, 
/* 125 */           documentId);
/*     */     }
/* 127 */     catch (ApiException e) {
/* 128 */       Assert.assertTrue(e.getMessage(), 
/* 129 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidDocumentId() throws ApiException {
/*     */     try {
/* 143 */       widgetsApi.getWidgetDocumentInfo(ApiUtils.getValidHeaderParams(), 
/* 144 */           widgetId, 
/* 145 */           TestData.EMPTY_PARAM);
/*     */     }
/* 147 */     catch (ApiException e) {
/* 148 */       Assert.assertTrue(e.getMessage(), 
/* 149 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 153 */       widgetsApi.getWidgetDocumentInfo(ApiUtils.getValidHeaderParams(), 
/* 154 */           widgetId, 
/* 155 */           TestData.NULL_PARAM);
/*     */     }
/* 157 */     catch (ApiException e) {
/* 158 */       Assert.assertTrue(e.getMessage(), 
/* 159 */           SdkErrorCodes.INVALID_DOCUMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetWidgetDocumentInfo() throws ApiException {
/*     */     try {
/* 172 */       byte[] widgetDocumentInfo = widgetsApi.getWidgetDocumentInfo(ApiUtils.getValidHeaderParams(), 
/* 173 */           widgetId, 
/* 174 */           documentId);
/* 175 */       Assert.assertNotNull(widgetDocumentInfo);
/*     */     }
/* 177 */     catch (ApiException e) {
/* 178 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Widgets\GetWidgetDocumentInfoApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */