/*    */ package com.adobe.sign.utils.validator;
/*    */ 
/*    */ import com.adobe.sign.model.groups.GroupCreationInfo;
/*    */ import com.adobe.sign.model.groups.GroupModificationInfo;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GroupsApiValidator
/*    */ {
/*    */   public static void getGroupsValidator() throws ApiException {}
/*    */   
/*    */   public static void createGroupValidator(GroupCreationInfo groupCreationInfo) throws ApiException {
/* 43 */     ApiValidatorHelper.validateParameter(groupCreationInfo);
/*    */     
/* 45 */     ApiValidatorHelper.validateParameter(groupCreationInfo.getGroupName(), 
/* 46 */         SdkErrorCodes.INVALID_GROUP_NAME);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void getGroupDetailsValidator(String groupId) throws ApiException {
/* 56 */     ApiValidatorHelper.validateId(groupId, 
/* 57 */         SdkErrorCodes.INVALID_GROUP_ID);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void modifyGroupValidator(String groupId, GroupModificationInfo groupModificationInfo) throws ApiException {
/* 69 */     ApiValidatorHelper.validateId(groupId, 
/* 70 */         SdkErrorCodes.INVALID_GROUP_ID);
/*    */     
/* 72 */     ApiValidatorHelper.validateParameter(groupModificationInfo);
/* 73 */     ApiValidatorHelper.validateParameter(groupModificationInfo.getGroupName(), 
/* 74 */         SdkErrorCodes.INVALID_GROUP_NAME);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void deleteGroupValidator(String groupId) throws ApiException {
/* 84 */     ApiValidatorHelper.validateId(groupId, 
/* 85 */         SdkErrorCodes.INVALID_GROUP_ID);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void getUsersInGroupValidator(String groupId) throws ApiException {
/* 97 */     ApiValidatorHelper.validateId(groupId, 
/* 98 */         SdkErrorCodes.INVALID_GROUP_ID);
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\GroupsApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */