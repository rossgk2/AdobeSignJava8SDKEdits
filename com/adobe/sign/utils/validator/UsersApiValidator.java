/*     */ package com.adobe.sign.utils.validator;
/*     */ import java.util.ArrayList;

/*     */ 
/*     */ import com.adobe.sign.model.users.UserCreationInfo;
/*     */ import com.adobe.sign.model.users.UserModificationInfo;
/*     */ import com.adobe.sign.model.users.UserStatusUpdateInfo;
/*     */ import com.adobe.sign.utils.ApiException;
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
/*     */ public class UsersApiValidator
/*     */ {
/*     */   public static void getUsersValidator(String xUserEmail) throws ApiException {}
/*     */   
/*     */   public static void createUserValidator(UserCreationInfo userCreationInfo) throws ApiException {
/*  47 */     ApiValidatorHelper.validateParameter(userCreationInfo);
/*     */     
/*  49 */     ArrayList<String> parameterList = new ArrayList();
/*  50 */     parameterList.add(userCreationInfo.getFirstName());
/*  51 */     parameterList.add(userCreationInfo.getLastName());
/*  52 */     ApiValidatorHelper.validateRequiredParameters(parameterList);
/*     */     
/*  54 */     ApiValidatorHelper.validateParameter(userCreationInfo.getEmail(), 
/*  55 */         SdkErrorCodes.MUST_PROVIDE_EMAIL);
/*  56 */     ApiValidatorHelper.validateEmailParamater(userCreationInfo.getEmail());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getUserDetailValidator(String userId) throws ApiException {
/*  66 */     ApiValidatorHelper.validateId(userId, 
/*  67 */         SdkErrorCodes.INVALID_USER_ID);
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
/*     */   public static void modifyUserValidator(String userId, UserModificationInfo userModificationInfo) throws ApiException {
/*  79 */     ApiValidatorHelper.validateId(userId, 
/*  80 */         SdkErrorCodes.INVALID_USER_ID);
/*  81 */     ApiValidatorHelper.validateParameter(userModificationInfo);
/*     */     
/*  83 */     ArrayList<String> parameterList = new ArrayList();
/*  84 */     parameterList.add(userModificationInfo.getFirstName());
/*  85 */     parameterList.add(userModificationInfo.getLastName());
/*  86 */     parameterList.add(userModificationInfo.getEmail());
/*  87 */     parameterList.add(userModificationInfo.getGroupId());
/*  88 */     ApiValidatorHelper.validateRequiredParameters(parameterList);
/*     */     
/*  90 */     ApiValidatorHelper.validateId(userModificationInfo.getGroupId(), 
/*  91 */         SdkErrorCodes.INVALID_GROUP_ID);
/*     */     
/*  93 */     ApiValidatorHelper.validateEmailParamater(userModificationInfo.getEmail());
/*     */     
/*  95 */     ApiValidatorHelper.validateParameter(userModificationInfo.getRoles());
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
/*     */   public static void modifyUserStatusValidator(String userId, UserStatusUpdateInfo userStatusUpdateInfo) throws ApiException {
/* 107 */     ApiValidatorHelper.validateId(userId, 
/* 108 */         SdkErrorCodes.INVALID_USER_ID);
/*     */     
/* 110 */     ApiValidatorHelper.validateParameter(userStatusUpdateInfo);
/*     */     
/* 112 */     ApiValidatorHelper.validateParameter(userStatusUpdateInfo.getUserStatus(), 
/* 113 */         SdkErrorCodes.MUST_PROVIDE_VALID_USER_STATUS);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\UsersApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */