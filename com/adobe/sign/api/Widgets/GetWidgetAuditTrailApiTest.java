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
/*     */ public class GetWidgetAuditTrailApiTest
/*     */ {
/*  38 */   private static WidgetsApi widgetsApi = null;
/*  39 */   private static String widgetId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  43 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  47 */     ApiUtils.configureProperty();
/*  48 */     widgetId = WidgetUtils.getResourceId(TestData.WIDGET_NAME);
/*  49 */     widgetsApi = WidgetUtils.getWidgetsApi();
/*     */   }
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
/*  61 */       widgetsApi.getWidgetAuditTrail(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  62 */           widgetId);
/*     */     }
/*  64 */     catch (ApiException e) {
/*  65 */       Assert.assertTrue(e.getMessage(), 
/*  66 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  70 */       widgetsApi.getWidgetAuditTrail(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  71 */           widgetId);
/*     */     }
/*  73 */     catch (ApiException e) {
/*  74 */       Assert.assertTrue(e.getMessage(), 
/*  75 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  88 */       widgetsApi.getWidgetAuditTrail(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  89 */           widgetId);
/*     */     }
/*  91 */     catch (ApiException e) {
/*  92 */       Assert.assertTrue(e.getMessage(), 
/*  93 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 106 */       widgetsApi.getWidgetAuditTrail(ApiUtils.getValidHeaderParams(), 
/* 107 */           TestData.EMPTY_PARAM);
/*     */     }
/* 109 */     catch (ApiException e) {
/* 110 */       Assert.assertTrue(e.getMessage(), 
/* 111 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     try {
/* 114 */       widgetsApi.getWidgetAuditTrail(ApiUtils.getValidHeaderParams(), 
/* 115 */           TestData.NULL_PARAM);
/*     */     }
/* 117 */     catch (ApiException e) {
/* 118 */       Assert.assertTrue(e.getMessage(), 
/* 119 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetAuditTrail() throws ApiException {
/*     */     try {
/* 132 */       byte[] auditTrail = widgetsApi.getWidgetAuditTrail(ApiUtils.getValidHeaderParams(), 
/* 133 */           widgetId);
/* 134 */       Assert.assertNotNull(auditTrail);
/*     */     }
/* 136 */     catch (ApiException e) {
/* 137 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Widgets\GetWidgetAuditTrailApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */