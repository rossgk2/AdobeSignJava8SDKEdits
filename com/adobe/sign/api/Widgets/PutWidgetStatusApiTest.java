/*     */ package com.adobe.sign.api.Widgets;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.WidgetsApi;
/*     */ import com.adobe.sign.model.widgets.WidgetStatusUpdateInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetStatusUpdateResponse;
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
/*     */ 
/*     */ public class PutWidgetStatusApiTest
/*     */ {
/*  41 */   private static WidgetsApi widgetsApi = null;
/*  42 */   private static String widgetId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  46 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  50 */     ApiUtils.configureProperty();
/*  51 */     widgetId = WidgetUtils.createWidget(ApiUtils.getWidgetName());
/*  52 */     widgetsApi = WidgetUtils.getWidgetsApi();
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
/*  63 */     WidgetStatusUpdateInfo widgetStatusUpdateInfo = new WidgetStatusUpdateInfo();
/*  64 */     widgetStatusUpdateInfo.setMessage(TestData.WIDGET_UPDATE_MESSAGE);
/*  65 */     widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.DISABLE);
/*     */     
/*     */     try {
/*  68 */       widgetsApi.updateWidgetStatus(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  69 */           widgetId, 
/*  70 */           widgetStatusUpdateInfo);
/*     */     }
/*  72 */     catch (ApiException e) {
/*  73 */       Assert.assertTrue(e.getMessage(), 
/*  74 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  78 */       widgetsApi.updateWidgetStatus(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  79 */           widgetId, 
/*  80 */           widgetStatusUpdateInfo);
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
/*  96 */     WidgetStatusUpdateInfo widgetStatusUpdateInfo = new WidgetStatusUpdateInfo();
/*  97 */     widgetStatusUpdateInfo.setMessage(TestData.WIDGET_UPDATE_MESSAGE);
/*  98 */     widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.DISABLE);
/*     */     
/*     */     try {
/* 101 */       widgetsApi.updateWidgetStatus(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 102 */           widgetId, 
/* 103 */           widgetStatusUpdateInfo);
/*     */     }
/* 105 */     catch (ApiException e) {
/* 106 */       Assert.assertTrue(e.getMessage(), 
/* 107 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 119 */     WidgetStatusUpdateInfo widgetStatusUpdateInfo = new WidgetStatusUpdateInfo();
/* 120 */     widgetStatusUpdateInfo.setMessage(TestData.WIDGET_UPDATE_MESSAGE);
/* 121 */     widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.DISABLE);
/*     */     
/*     */     try {
/* 124 */       widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(), 
/* 125 */           TestData.EMPTY_PARAM, 
/* 126 */           widgetStatusUpdateInfo);
/*     */     }
/* 128 */     catch (ApiException e) {
/* 129 */       Assert.assertTrue(e.getMessage(), 
/* 130 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 134 */       widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(), 
/* 135 */           TestData.NULL_PARAM, 
/* 136 */           widgetStatusUpdateInfo);
/*     */     }
/* 138 */     catch (ApiException e) {
/* 139 */       Assert.assertTrue(e.getMessage(), 
/* 140 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidStatusUpdateInfo() throws ApiException {
/* 154 */     WidgetStatusUpdateInfo widgetStatusUpdateInfo = new WidgetStatusUpdateInfo();
/* 155 */     widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.DISABLE);
/*     */     
/*     */     try {
/* 158 */       widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(), 
/* 159 */           widgetId, 
/* 160 */           widgetStatusUpdateInfo);
/*     */     }
/* 162 */     catch (ApiException e) {
/* 163 */       Assert.assertTrue(e.getMessage(), 
/* 164 */           SdkErrorCodes.NO_ACTION_SPECIFIED.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 167 */     widgetStatusUpdateInfo.setRedirectUrl(TestData.INVALID_URL);
/*     */     
/*     */     try {
/* 170 */       widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(), 
/* 171 */           widgetId, 
/* 172 */           widgetStatusUpdateInfo);
/*     */     }
/* 174 */     catch (ApiException e) {
/* 175 */       Assert.assertTrue(e.getMessage(), 
/* 176 */           SdkErrorCodes.INVALID_URL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 179 */     widgetStatusUpdateInfo.setRedirectUrl(TestData.REDIRECT_URL);
/* 180 */     widgetStatusUpdateInfo.setMessage(TestData.WIDGET_UPDATE_MESSAGE);
/*     */     
/*     */     try {
/* 183 */       widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(), 
/* 184 */           widgetId, 
/* 185 */           widgetStatusUpdateInfo);
/*     */     }
/* 187 */     catch (ApiException e) {
/* 188 */       Assert.assertTrue(e.getMessage(), 
/* 189 */           SdkErrorCodes.TOO_MANY_ACTIONS_SPECIFIED.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testUpdateWidgetStatus() throws ApiException {
/* 201 */     WidgetStatusUpdateInfo widgetStatusUpdateInfo = new WidgetStatusUpdateInfo();
/* 202 */     widgetStatusUpdateInfo.setMessage(TestData.WIDGET_UPDATE_MESSAGE);
/* 203 */     widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.DISABLE);
/*     */     
/*     */     try {
/* 206 */       WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(), 
/* 207 */           widgetId, 
/* 208 */           widgetStatusUpdateInfo);
/* 209 */       Assert.assertNotNull(widgetStatusUpdateResponse);
/* 210 */       Assert.assertNotNull(widgetStatusUpdateResponse.getCode());
/* 211 */       Assert.assertEquals(widgetStatusUpdateResponse.getCode(), 
/* 212 */           WidgetStatusUpdateResponse.CodeEnum.OK);
/*     */     }
/* 214 */     catch (ApiException e) {
/* 215 */       Assert.fail(e.getMessage());
/*     */     } 
/*     */ 
/*     */     
/* 219 */     widgetStatusUpdateInfo.setValue(WidgetStatusUpdateInfo.ValueEnum.ENABLE);
/*     */     try {
/* 221 */       WidgetStatusUpdateResponse widgetStatusUpdateResponse = widgetsApi.updateWidgetStatus(ApiUtils.getValidHeaderParams(), 
/* 222 */           widgetId, 
/* 223 */           widgetStatusUpdateInfo);
/* 224 */       Assert.assertNotNull(widgetStatusUpdateResponse);
/* 225 */       Assert.assertEquals(widgetStatusUpdateResponse.getCode(), 
/* 226 */           WidgetStatusUpdateResponse.CodeEnum.OK);
/*     */     }
/* 228 */     catch (ApiException e) {
/* 229 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Widgets\PutWidgetStatusApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */