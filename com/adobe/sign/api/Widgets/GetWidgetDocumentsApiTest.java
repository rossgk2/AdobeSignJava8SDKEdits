/*     */ package com.adobe.sign.api.Widgets;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.WidgetsApi;
/*     */ import com.adobe.sign.model.widgets.WidgetDocuments;
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
/*     */ public class GetWidgetDocumentsApiTest
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
/*  63 */       widgetsApi.getWidgetDocuments(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  64 */           widgetId, 
/*  65 */           TestData.VERSION_ID, 
/*  66 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/*  68 */     catch (ApiException e) {
/*  69 */       Assert.assertTrue(e.getMessage(), 
/*  70 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  74 */       widgetsApi.getWidgetDocuments(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  75 */           widgetId, 
/*  76 */           TestData.VERSION_ID, 
/*  77 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/*  79 */     catch (ApiException e) {
/*  80 */       Assert.assertTrue(e.getMessage(), 
/*  81 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  94 */       widgetsApi.getWidgetDocuments(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  95 */           widgetId, 
/*  96 */           TestData.VERSION_ID, 
/*  97 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/*  99 */     catch (ApiException e) {
/* 100 */       Assert.assertTrue(e.getMessage(), 
/* 101 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 114 */       widgetsApi.getWidgetDocuments(ApiUtils.getValidHeaderParams(), 
/* 115 */           TestData.EMPTY_PARAM, 
/* 116 */           TestData.VERSION_ID, 
/* 117 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/* 119 */     catch (ApiException e) {
/* 120 */       Assert.assertTrue(e.getMessage(), 
/* 121 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 125 */       widgetsApi.getWidgetDocuments(ApiUtils.getValidHeaderParams(), 
/* 126 */           TestData.NULL_PARAM, 
/* 127 */           TestData.VERSION_ID, 
/* 128 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/* 130 */     catch (ApiException e) {
/* 131 */       Assert.assertTrue(e.getMessage(), 
/* 132 */           SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidVersionId() throws Exception {
/*     */     try {
/* 146 */       widgetsApi.getWidgetDocuments(ApiUtils.getValidHeaderParams(), 
/* 147 */           widgetId, 
/* 148 */           TestData.EMPTY_PARAM, 
/* 149 */           TestData.PARTICIPANT_EMAIL);
/*     */     }
/* 151 */     catch (ApiException e) {
/* 152 */       Assert.assertTrue(e.getMessage(), 
/* 153 */           SdkErrorCodes.INVALID_VERSION_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidParticipantEmail() throws Exception {
/*     */     try {
/* 167 */       widgetsApi.getWidgetDocuments(ApiUtils.getValidHeaderParams(), 
/* 168 */           widgetId, 
/* 169 */           TestData.VERSION_ID, 
/* 170 */           TestData.EMPTY_PARAM);
/*     */     }
/* 172 */     catch (ApiException e) {
/* 173 */       Assert.assertTrue(e.getMessage(), 
/* 174 */           SdkErrorCodes.INVALID_PARTICIPANT.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testWidgetDocuments() throws ApiException {
/*     */     try {
/* 187 */       WidgetDocuments widgetDocuments = widgetsApi.getWidgetDocuments(ApiUtils.getValidHeaderParams(), 
/* 188 */           widgetId, 
/* 189 */           TestData.VERSION_ID, 
/* 190 */           TestData.PARTICIPANT_EMAIL);
/* 191 */       Assert.assertNotNull(widgetDocuments);
/*     */     }
/* 193 */     catch (ApiException e) {
/* 194 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Widgets\GetWidgetDocumentsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */