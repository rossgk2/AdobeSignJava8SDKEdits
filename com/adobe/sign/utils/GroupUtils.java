/*    */ package com.adobe.sign.utils;
/*    */ import java.util.List;

/*    */ import javax.ws.rs.core.MultivaluedMap;

/*    */ 
/*    */ import com.adobe.sign.api.GroupsApi;
/*    */ import com.adobe.sign.model.groups.GroupCreationInfo;
/*    */ import com.adobe.sign.model.groups.GroupCreationResponse;
/*    */ import com.adobe.sign.model.groups.GroupInfo;
/*    */ import com.adobe.sign.model.groups.GroupsInfo;
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
/*    */ public class GroupUtils
/*    */ {
/* 26 */   private static GroupsApi groupsApi = new GroupsApi();
/* 27 */   private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();
/*    */   
/*    */   public static String getResourceId(String groupName) throws ApiException {
/* 30 */     String groupId = null;
/*    */     
/* 32 */     if (groupName == null) {
/* 33 */       return groupId;
/*    */     }
/*    */     
/* 36 */     GroupsInfo groupsInfos = groupsApi.getGroups(headers);
/*    */     
/* 38 */     List<GroupInfo> groupInfoList = groupsInfos.getGroupInfoList();
/*    */     
/* 40 */     for (GroupInfo groupInfo : groupInfoList) {
/* 41 */       if (groupInfo.getGroupName().equalsIgnoreCase(groupName)) {
/* 42 */         groupId = groupInfo.getGroupId();
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 47 */     if (groupId == null) {
/* 48 */       groupId = createGroup(groupName, 
/* 49 */           headers);
/*    */     }
/*    */ 
/*    */     
/* 53 */     return groupId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String createGroup(String groupName, MultivaluedMap headers) throws ApiException {
/* 61 */     GroupCreationInfo groupCreationInfo = new GroupCreationInfo();
/* 62 */     groupCreationInfo.setGroupName(groupName);
/* 63 */     GroupCreationResponse groupCreationResponse = null;
/*    */ 
/*    */     
/* 66 */     groupCreationResponse = groupsApi.createGroup(headers, 
/* 67 */         groupCreationInfo);
/* 68 */     return groupCreationResponse.getGroupId();
/*    */   }
/*    */   
/*    */   public static String createGroup(String groupName) throws ApiException {
/* 72 */     return createGroup(groupName, 
/* 73 */         headers);
/*    */   }
/*    */   public static GroupsApi getGroupsApi() {
/* 76 */     return groupsApi;
/*    */   }
/*    */ 
/*    */   
/*    */   public static String isExistingGroup(String staticGroupName) throws ApiException {
/* 81 */     GroupsInfo groupsInfos = groupsApi.getGroups(headers);
/*    */     
/* 83 */     List<GroupInfo> groupInfoList = groupsInfos.getGroupInfoList();
/*    */     
/* 85 */     for (GroupInfo groupInfo : groupInfoList) {
/* 86 */       if (groupInfo.getGroupName().equalsIgnoreCase(staticGroupName)) {
/* 87 */         return groupInfo.getGroupId();
/*    */       }
/*    */     } 
/* 90 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\GroupUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */