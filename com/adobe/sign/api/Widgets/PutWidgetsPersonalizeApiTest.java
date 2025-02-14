/*     */ package com.adobe.sign.api.Widgets;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.WidgetsApi;
/*     */ import com.adobe.sign.model.widgets.WidgetPersonalizationInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetPersonalizeResponse;
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
/*     */ public class PutWidgetsPersonalizeApiTest
/*     */ {
/*  40 */   private static WidgetsApi widgetsApi = null;
/*  41 */   private static String widgetId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  45 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  49 */     ApiUtils.configureProperty();
/*  50 */     widgetId = WidgetUtils.createWidget(ApiUtils.getWidgetName());
/*  51 */     widgetsApi = WidgetUtils.getWidgetsApi();
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
/*  64 */     WidgetPersonalizationInfo widgetPersonalizationInfo = new WidgetPersonalizationInfo();
/*  65 */     widgetPersonalizationInfo.setEmail(TestData.POST_EMAIL);
/*     */     
/*     */     try {
/*  68 */       widgetsApi.updateWidgetPersonalize(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  69 */           widgetId, 
/*  70 */           widgetPersonalizationInfo);
/*     */     }
/*  72 */     catch (ApiException e) {
/*  73 */       Assert.assertTrue(e.getMessage(), 
/*  74 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  78 */       widgetsApi.updateWidgetPersonalize(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  79 */           widgetId, 
/*  80 */           widgetPersonalizationInfo);
/*     */     }
/*  82 */     catch (ApiException e) {
/*  83 */       Assert.assertTrue(e.getMessage(), 
/*  84 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  96 */     WidgetPersonalizationInfo widgetPersonalizationInfo = new WidgetPersonalizationInfo();
/*  97 */     widgetPersonalizationInfo.setEmail(TestData.POST_EMAIL);
/*     */     try {
/*  99 */       widgetsApi.updateWidgetPersonalize(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 100 */           widgetId, 
/* 101 */           widgetPersonalizationInfo);
/*     */     }
/* 103 */     catch (ApiException e) {
/* 104 */       Assert.assertTrue(e.getMessage(), 
/* 105 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 117 */     WidgetPersonalizationInfo widgetPersonalizationInfo = new WidgetPersonalizationInfo();
/* 118 */     widgetPersonalizationInfo.setEmail(TestData.POST_EMAIL);
/*     */     try {
/* 120 */       widgetsApi.updateWidgetPersonalize(ApiUtils.getValidHeaderParams(), 
/* 121 */           TestData.EMPTY_PARAM, 
/* 122 */           widgetPersonalizationInfo);
/*     */     }
/* 124 */     catch (ApiException e) {
/* 125 */       Assert.assertTrue(e.getMessage(), 
/* 126 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 130 */       widgetsApi.updateWidgetPersonalize(ApiUtils.getValidHeaderParams(), 
/* 131 */           TestData.NULL_PARAM, 
/* 132 */           widgetPersonalizationInfo);
/*     */     }
/* 134 */     catch (ApiException e) {
/* 135 */       Assert.assertTrue(e.getMessage(), 
/* 136 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidWidgetPersonalizationInfo() throws ApiException {
/* 148 */     WidgetPersonalizationInfo widgetPersonalizationInfo = new WidgetPersonalizationInfo();
/* 149 */     widgetPersonalizationInfo.setEmail(TestData.NULL_PARAM);
/*     */     try {
/* 151 */       widgetsApi.updateWidgetPersonalize(ApiUtils.getValidHeaderParams(), 
/* 152 */           widgetId, 
/* 153 */           widgetPersonalizationInfo);
/*     */     }
/* 155 */     catch (ApiException e) {
/* 156 */       Assert.assertTrue(e.getMessage(), 
/* 157 */           SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 160 */     widgetPersonalizationInfo.setEmail(TestData.INVALID_EMAIL);
/*     */     try {
/* 162 */       widgetsApi.updateWidgetPersonalize(ApiUtils.getValidHeaderParams(), 
/* 163 */           widgetId, 
/* 164 */           widgetPersonalizationInfo);
/*     */     }
/* 166 */     catch (ApiException e) {
/* 167 */       Assert.assertTrue(e.getMessage(), 
/* 168 */           SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testUpdateWidgetPersonalize() throws ApiException {
/* 180 */     WidgetPersonalizationInfo widgetPersonalizationInfo = new WidgetPersonalizationInfo();
/* 181 */     widgetPersonalizationInfo.setEmail(TestData.POST_EMAIL);
/*     */     try {
/* 183 */       WidgetPersonalizeResponse widgetPersonalizeResponse = widgetsApi.updateWidgetPersonalize(ApiUtils.getValidHeaderParams(), 
/* 184 */           widgetId, 
/* 185 */           widgetPersonalizationInfo);
/* 186 */       Assert.assertNotNull(widgetPersonalizeResponse);
/* 187 */       Assert.assertNotNull(widgetPersonalizeResponse.getWidgetId());
/* 188 */       Assert.assertNotNull(widgetPersonalizeResponse.getJavascript());
/* 189 */       Assert.assertNotNull(widgetPersonalizeResponse.getUrl());
/*     */     }
/* 191 */     catch (ApiException e) {
/* 192 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Widgets\PutWidgetsPersonalizeApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */