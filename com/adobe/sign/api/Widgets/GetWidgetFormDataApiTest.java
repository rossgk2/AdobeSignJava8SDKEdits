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
/*     */ public class GetWidgetFormDataApiTest
/*     */ {
/*  37 */   private static WidgetsApi widgetsApi = null;
/*  38 */   private static String widgetId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  42 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  46 */     ApiUtils.configureProperty();
/*  47 */     widgetId = WidgetUtils.getResourceId(TestData.WIDGET_NAME);
/*  48 */     widgetsApi = WidgetUtils.getWidgetsApi();
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
/*  62 */       widgetsApi.getWidgetFormData(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  63 */           widgetId);
/*     */     }
/*  65 */     catch (ApiException e) {
/*  66 */       Assert.assertTrue(e.getMessage(), 
/*  67 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  71 */       widgetsApi.getWidgetFormData(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  72 */           widgetId);
/*     */     }
/*  74 */     catch (ApiException e) {
/*  75 */       Assert.assertTrue(e.getMessage(), 
/*  76 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidXApiUser() throws ApiException {
/*     */     try {
/*  91 */       widgetsApi.getWidgetFormData(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  92 */           widgetId);
/*     */     }
/*  94 */     catch (ApiException e) {
/*  95 */       Assert.assertTrue(e.getMessage(), 
/*  96 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidWidgetId() throws ApiException {
/*     */     try {
/* 110 */       widgetsApi.getWidgetFormData(ApiUtils.getValidHeaderParams(), 
/* 111 */           TestData.EMPTY_PARAM);
/*     */     }
/* 113 */     catch (ApiException e) {
/* 114 */       Assert.assertTrue(e.getMessage(), 
/* 115 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 119 */       widgetsApi.getWidgetFormData(ApiUtils.getValidHeaderParams(), 
/* 120 */           TestData.NULL_PARAM);
/*     */     }
/* 122 */     catch (ApiException e) {
/* 123 */       Assert.assertTrue(e.getMessage(), 
/* 124 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetFormData() throws ApiException {
/*     */     try {
/* 138 */       byte[] formData = widgetsApi.getWidgetFormData(ApiUtils.getValidHeaderParams(), 
/* 139 */           widgetId);
/* 140 */       Assert.assertNotNull(formData);
/*     */     }
/* 142 */     catch (ApiException e) {
/* 143 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Widgets\GetWidgetFormDataApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */