/*     */ package com.adobe.sign.api.Widgets;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.WidgetsApi;
/*     */ import com.adobe.sign.model.widgets.WidgetAgreements;
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
/*     */ public class GetWidgetAgreementsApiTest
/*     */ {
/*  39 */   private static WidgetsApi widgetsApi = null;
/*  40 */   private static String widgetId = null;
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
/*  63 */       widgetsApi.getWidgetAgreements(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  64 */           widgetId);
/*     */     }
/*  66 */     catch (ApiException e) {
/*  67 */       Assert.assertTrue(e.getMessage(), 
/*  68 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  72 */       widgetsApi.getWidgetAgreements(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  73 */           widgetId);
/*     */     }
/*  75 */     catch (ApiException e) {
/*  76 */       Assert.assertTrue(e.getMessage(), 
/*  77 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  90 */       widgetsApi.getWidgetAgreements(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  91 */           widgetId);
/*     */     }
/*  93 */     catch (ApiException e) {
/*  94 */       Assert.assertTrue(e.getMessage(), 
/*  95 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 108 */       widgetsApi.getWidgetAgreements(ApiUtils.getValidHeaderParams(), 
/* 109 */           TestData.EMPTY_PARAM);
/*     */     }
/* 111 */     catch (ApiException e) {
/* 112 */       Assert.assertTrue(e.getMessage(), 
/* 113 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 117 */       widgetsApi.getWidgetAgreements(ApiUtils.getValidHeaderParams(), 
/* 118 */           TestData.NULL_PARAM);
/*     */     }
/* 120 */     catch (ApiException e) {
/* 121 */       Assert.assertTrue(e.getMessage(), 
/* 122 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetAgreements() throws ApiException {
/*     */     try {
/* 135 */       WidgetAgreements widgetAgreements = widgetsApi.getWidgetAgreements(ApiUtils.getValidHeaderParams(), 
/* 136 */           widgetId);
/* 137 */       Assert.assertNotNull(widgetAgreements);
/*     */     }
/* 139 */     catch (ApiException e) {
/* 140 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Widgets\GetWidgetAgreementsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */