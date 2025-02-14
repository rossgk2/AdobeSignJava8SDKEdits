/*    */ package com.adobe.sign.utils.validator;
/*    */ 
/*    */ import com.adobe.sign.model.reminders.ReminderCreationInfo;
/*    */ import com.adobe.sign.utils.ApiException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RemindersApiValidator
/*    */ {
/*    */   public static void createReminderValidator(ReminderCreationInfo reminderCreationInfo) throws ApiException {
/* 31 */     ApiValidatorHelper.validateParameter(reminderCreationInfo);
/*    */     
/* 33 */     ApiValidatorHelper.validateParameter(reminderCreationInfo.getAgreementId(), 
/* 34 */         SdkErrorCodes.MUST_PROVIDE_AGREEMENT_ID);
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\RemindersApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */