/*     */ package com.adobe.sign.api.Reminders;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.RemindersApi;
/*     */ import com.adobe.sign.model.reminders.ReminderCreationInfo;
/*     */ import com.adobe.sign.model.reminders.ReminderCreationResult;
/*     */ import com.adobe.sign.utils.AgreementsUtils;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.ReminderUtils;
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
/*     */ public class PostRemindersApiTest
/*     */ {
/*  36 */   private static RemindersApi remindersApi = null;
/*  37 */   private static String agreementId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  41 */   public Retry retry = new Retry();
/*     */ 
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  46 */     ApiUtils.configureProperty();
/*  47 */     agreementId = AgreementsUtils.getResourceId(TestData.AGREEMENT_NAME);
/*  48 */     remindersApi = ReminderUtils.getRemindersApi();
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
/*  60 */     ReminderCreationInfo reminderCreationInfo = new ReminderCreationInfo();
/*  61 */     reminderCreationInfo.setAgreementId(agreementId);
/*     */     try {
/*  63 */       remindersApi.createReminder(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  64 */           reminderCreationInfo);
/*     */     }
/*  66 */     catch (ApiException e) {
/*  67 */       Assert.assertTrue(e.getMessage(), 
/*  68 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  72 */       remindersApi.createReminder(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  73 */           reminderCreationInfo);
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
/*  89 */     ReminderCreationInfo reminderCreationInfo = new ReminderCreationInfo();
/*  90 */     reminderCreationInfo.setAgreementId(agreementId);
/*     */     try {
/*  92 */       remindersApi.createReminder(ApiUtils.getEmptyXApiUserHeaderParams(), 
/*  93 */           reminderCreationInfo);
/*     */     }
/*  95 */     catch (ApiException e) {
/*  96 */       Assert.assertTrue(e.getMessage(), 
/*  97 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidAgreementId() throws ApiException {
/* 109 */     ReminderCreationInfo reminderCreationInfo = new ReminderCreationInfo();
/* 110 */     reminderCreationInfo.setAgreementId(TestData.NULL_PARAM);
/*     */     try {
/* 112 */       remindersApi.createReminder(ApiUtils.getValidHeaderParams(), 
/* 113 */           reminderCreationInfo);
/*     */     }
/* 115 */     catch (ApiException e) {
/* 116 */       Assert.assertTrue(e.getMessage(), 
/* 117 */           SdkErrorCodes.MUST_PROVIDE_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 120 */     reminderCreationInfo.setAgreementId(TestData.EMPTY_PARAM);
/*     */     try {
/* 122 */       remindersApi.createReminder(ApiUtils.getValidHeaderParams(), 
/* 123 */           reminderCreationInfo);
/*     */     }
/* 125 */     catch (ApiException e) {
/* 126 */       Assert.assertTrue(e.getMessage(), 
/* 127 */           SdkErrorCodes.MUST_PROVIDE_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testCreateReminder() throws ApiException {
/* 139 */     ReminderCreationInfo reminderCreationInfo = new ReminderCreationInfo();
/* 140 */     reminderCreationInfo.setAgreementId(agreementId);
/*     */     try {
/* 142 */       ReminderCreationResult response = remindersApi.createReminder(ApiUtils.getValidHeaderParams(), 
/* 143 */           reminderCreationInfo);
/* 144 */       Assert.assertNotNull(response);
/* 145 */       Assert.assertNotNull(response.getResult());
/* 146 */       Assert.assertNotNull(response.getParticipantEmailsSet());
/*     */     }
/* 148 */     catch (ApiException e) {
/* 149 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Reminders\PostRemindersApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */