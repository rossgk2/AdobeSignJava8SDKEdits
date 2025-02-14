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
/*     */ public class GetWidgetCombinedDocApiTest
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
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testNullAndEmptyAccessToken() throws ApiException {
/*     */     try {
/*  63 */       widgetsApi.getWidgetCombinedDocument(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  64 */           widgetId, 
/*  65 */           TestData.VERSION_ID, 
/*  66 */           TestData.PARTICIPANT_EMAIL, 
/*  67 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/*  69 */     catch (ApiException e) {
/*  70 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  74 */       widgetsApi.getWidgetCombinedDocument(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  75 */           widgetId, 
/*  76 */           TestData.VERSION_ID, 
/*  77 */           TestData.PARTICIPANT_EMAIL, 
/*  78 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/*  80 */     catch (ApiException e) {
/*  81 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  95 */       widgetsApi.getWidgetCombinedDocument(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  96 */           widgetId, 
/*  97 */           TestData.VERSION_ID, 
/*  98 */           TestData.PARTICIPANT_EMAIL, 
/*  99 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 101 */     catch (ApiException e) {
/* 102 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/* 116 */       widgetsApi.getWidgetCombinedDocument(ApiUtils.getValidHeaderParams(), 
/* 117 */           TestData.EMPTY_PARAM, 
/* 118 */           TestData.VERSION_ID, 
/* 119 */           TestData.PARTICIPANT_EMAIL, 
/* 120 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 122 */     catch (ApiException e) {
/* 123 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 127 */       widgetsApi.getWidgetCombinedDocument(ApiUtils.getValidHeaderParams(), 
/* 128 */           TestData.NULL_PARAM, 
/* 129 */           TestData.VERSION_ID, 
/* 130 */           TestData.PARTICIPANT_EMAIL, 
/* 131 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 133 */     catch (ApiException e) {
/* 134 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_WIDGET_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidVersionId() throws Exception {
/*     */     try {
/* 149 */       widgetsApi.getWidgetCombinedDocument(ApiUtils.getValidHeaderParams(), 
/* 150 */           widgetId, 
/* 151 */           TestData.EMPTY_PARAM, 
/* 152 */           TestData.PARTICIPANT_EMAIL, 
/* 153 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/* 154 */     } catch (ApiException e) {
/* 155 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_VERSION_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidParticipantEmail() throws Exception {
/*     */     try {
/* 170 */       widgetsApi.getWidgetCombinedDocument(ApiUtils.getValidHeaderParams(), 
/* 171 */           widgetId, 
/* 172 */           TestData.VERSION_ID, 
/* 173 */           TestData.EMPTY_PARAM, 
/* 174 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/*     */     }
/* 176 */     catch (ApiException e) {
/* 177 */       Assert.assertTrue(e.getMessage(), 
/* 178 */           SdkErrorCodes.INVALID_PARTICIPANT.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testGetCombinedDocument() throws ApiException {
/*     */     try {
/* 191 */       byte[] widgetCombinedDocument = widgetsApi.getWidgetCombinedDocument(ApiUtils.getValidHeaderParams(), 
/* 192 */           widgetId, 
/* 193 */           TestData.VERSION_ID, 
/* 194 */           TestData.PARTICIPANT_EMAIL, 
/* 195 */           Boolean.valueOf(TestData.AUDIT_REPORT));
/* 196 */       Assert.assertNotNull(widgetCombinedDocument);
/*     */     }
/* 198 */     catch (ApiException e) {
/* 199 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Widgets\GetWidgetCombinedDocApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */