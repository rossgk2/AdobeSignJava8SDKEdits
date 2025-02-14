/*     */ package com.adobe.sign.api.MegaSigns;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.MegaSignsApi;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateInfo;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignStatusUpdateResponse;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.MegaSignUtils;
/*     */ import com.adobe.sign.utils.Retry;
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
/*     */ public class PutMegaSignsApiTest
/*     */ {
/*  39 */   private static MegaSignsApi megaSignsApi = null;
/*  40 */   private static String megaSignId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  44 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  48 */     ApiUtils.configureProperty();
/*  49 */     megaSignId = MegaSignUtils.createMegaSign(ApiUtils.getMegaSignName());
/*  50 */     megaSignsApi = MegaSignUtils.getMegaSignsApi();
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
/*  62 */     MegaSignStatusUpdateInfo updateInfo = new MegaSignStatusUpdateInfo();
/*  63 */     updateInfo.setValue(MegaSignStatusUpdateInfo.ValueEnum.CANCEL);
/*     */     
/*     */     try {
/*  66 */       megaSignsApi.updateMegaSignStatus(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  67 */           megaSignId, 
/*  68 */           updateInfo);
/*     */     }
/*  70 */     catch (ApiException e) {
/*  71 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  75 */       megaSignsApi.updateMegaSignStatus(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  76 */           megaSignId, 
/*  77 */           updateInfo);
/*     */     }
/*  79 */     catch (ApiException e) {
/*  80 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*  93 */     MegaSignStatusUpdateInfo updateInfo = new MegaSignStatusUpdateInfo();
/*  94 */     updateInfo.setValue(MegaSignStatusUpdateInfo.ValueEnum.CANCEL);
/*     */     
/*     */     try {
/*  97 */       megaSignsApi.updateMegaSignStatus(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  98 */           megaSignId, 
/*  99 */           updateInfo);
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
/*     */   @Test
/*     */   public void testInvalidMegaSignId() throws ApiException {
/* 114 */     MegaSignStatusUpdateInfo updateInfo = new MegaSignStatusUpdateInfo();
/* 115 */     updateInfo.setValue(MegaSignStatusUpdateInfo.ValueEnum.CANCEL);
/*     */     
/*     */     try {
/* 118 */       megaSignsApi.updateMegaSignStatus(ApiUtils.getValidHeaderParams(), 
/* 119 */           TestData.EMPTY_PARAM, 
/* 120 */           updateInfo);
/*     */     }
/* 122 */     catch (ApiException e) {
/* 123 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 127 */       megaSignsApi.updateMegaSignStatus(ApiUtils.getValidHeaderParams(), 
/* 128 */           TestData.NULL_PARAM, 
/* 129 */           updateInfo);
/*     */     }
/* 131 */     catch (ApiException e) {
/* 132 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_MEGASIGN_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidMegaSignStatus() throws ApiException {
/*     */     try {
/* 146 */       megaSignsApi.updateMegaSignStatus(ApiUtils.getValidHeaderParams(), 
/* 147 */           megaSignId, 
/* 148 */           null);
/*     */     }
/* 150 */     catch (ApiException e) {
/* 151 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 154 */     MegaSignStatusUpdateInfo updateInfo = new MegaSignStatusUpdateInfo();
/* 155 */     updateInfo.setValue(null);
/*     */     
/*     */     try {
/* 158 */       megaSignsApi.updateMegaSignStatus(ApiUtils.getValidHeaderParams(), 
/* 159 */           megaSignId, 
/* 160 */           updateInfo);
/*     */     }
/* 162 */     catch (ApiException e) {
/* 163 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_MEGASIGN_STATUS.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void testUpdateStatus() throws ApiException {
/* 174 */     MegaSignStatusUpdateInfo updateInfo = new MegaSignStatusUpdateInfo();
/* 175 */     updateInfo.setValue(MegaSignStatusUpdateInfo.ValueEnum.CANCEL);
/*     */     
/*     */     try {
/* 178 */       MegaSignStatusUpdateResponse megaSignStatusUpdateResponse = megaSignsApi.updateMegaSignStatus(ApiUtils.getValidHeaderParams(), 
/* 179 */           megaSignId, 
/* 180 */           updateInfo);
/* 181 */       Assert.assertNotNull(megaSignStatusUpdateResponse);
/*     */     }
/* 183 */     catch (ApiException e) {
/* 184 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\MegaSigns\PutMegaSignsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */