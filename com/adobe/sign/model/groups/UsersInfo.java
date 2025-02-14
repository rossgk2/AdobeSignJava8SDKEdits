/*    */ package com.adobe.sign.model.groups;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;

/*    */ 
/*    */ import com.adobe.sign.utils.StringUtil;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;

/*    */ import io.swagger.annotations.ApiModel;
/*    */ import io.swagger.annotations.ApiModelProperty;
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
/*    */ @ApiModel(description = "")
/*    */ public class UsersInfo
/*    */ {
/* 30 */   private List<UserInfo> userInfoList = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The list of users in the account")
/*    */   @JsonProperty("userInfoList")
/*    */   public List<UserInfo> getUserInfoList() {
/* 39 */     return this.userInfoList;
/*    */   }
/*    */   public void setUserInfoList(List<UserInfo> userInfoList) {
/* 42 */     this.userInfoList = userInfoList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class UsersInfo {\n");
/*    */     
/* 52 */     sb.append("    userInfoList: ").append(StringUtil.toIndentedString(this.userInfoList)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\groups\UsersInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */