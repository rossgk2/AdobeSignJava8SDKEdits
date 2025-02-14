/*    */ package com.adobe.sign.model.users;
/*    */ 
/*    */ import com.adobe.sign.utils.StringUtil;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;

/*    */ import io.swagger.annotations.ApiModel;
/*    */ import io.swagger.annotations.ApiModelProperty;
/*    */ 
/*    */ @ApiModel(description = "")
/*    */ public class UserStatusUpdateInfo {
/*    */   private String comment;
/*    */   private UserStatusEnum userStatus;
/*    */   
/*    */   public enum UserStatusEnum {
/*    */     ACTIVE("ACTIVE"),
/*    */     INACTIVE("INACTIVE");
/*    */     private String value;
/*    */     
/*    */     UserStatusEnum(String value) {
/*    */       this.value = value;
/*    */     }
/*    */     
/*    */     public String toString() {
/*    */       return this.value;
/*    */     }
/*    */   }
/*    */   
/*    */   public UserStatusUpdateInfo() {
/* 28 */     this.comment = null;
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
/* 46 */     this.userStatus = null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("An optional comment describing why you want to activate/deactivate a given user")
/*    */   @JsonProperty("comment")
/*    */   public String getComment() {
/* 55 */     return this.comment;
/*    */   }
/*    */   public void setComment(String comment) {
/* 58 */     this.comment = comment;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The state to which the user is to be updated. The valid states for this variable is currently, ACTIVE and INACTIVE")
/*    */   @JsonProperty("userStatus")
/*    */   public UserStatusEnum getUserStatus() {
/* 68 */     return this.userStatus;
/*    */   }
/*    */   public void setUserStatus(UserStatusEnum userStatus) {
/* 71 */     this.userStatus = userStatus;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 78 */     StringBuilder sb = new StringBuilder();
/* 79 */     sb.append("class UserStatusUpdateInfo {\n");
/*    */     
/* 81 */     sb.append("    comment: ").append(StringUtil.toIndentedString(this.comment)).append("\n");
/* 82 */     sb.append("    userStatus: ").append(StringUtil.toIndentedString(this.userStatus)).append("\n");
/* 83 */     sb.append("}");
/* 84 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\mode\\users\UserStatusUpdateInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */