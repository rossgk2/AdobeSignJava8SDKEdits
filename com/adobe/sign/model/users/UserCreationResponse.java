/*    */ package com.adobe.sign.model.users;
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
/*    */ @ApiModel(description = "")
/*    */ public class UserCreationResponse
/*    */ {
/*    */   private String userId;
/*    */   
/*    */   public UserCreationResponse() {
/* 28 */     this.userId = null;
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
/* 49 */     this.userStatus = null;
/*    */   }
/*    */   private UserStatusEnum userStatus; public enum UserStatusEnum {
/*    */     ACTIVE("ACTIVE"),
/*    */     INACTIVE("INACTIVE"),
/*    */     CREATED("CREATED"),
/*    */     PENDING("PENDING"),
/*    */     UNVERIFIED("UNVERIFIED"); private String value; UserStatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty("The unique identifier for user in REST APIs. This identifier will not be compatible with any existing SOAP APIs and is different from user key that SOAP APIs provide and consume. userid being provided here and userkey that SOAP uses are different and the two can not be interchanged with each other")
/*    */   @JsonProperty("userId")
/* 58 */   public String getUserId() { return this.userId; }
/*    */   
/*    */   public void setUserId(String userId) {
/* 61 */     this.userId = userId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Status of the user")
/*    */   @JsonProperty("userStatus")
/*    */   public UserStatusEnum getUserStatus() {
/* 71 */     return this.userStatus;
/*    */   }
/*    */   public void setUserStatus(UserStatusEnum userStatus) {
/* 74 */     this.userStatus = userStatus;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 81 */     StringBuilder sb = new StringBuilder();
/* 82 */     sb.append("class UserCreationResponse {\n");
/*    */     
/* 84 */     sb.append("    userId: ").append(StringUtil.toIndentedString(this.userId)).append("\n");
/* 85 */     sb.append("    userStatus: ").append(StringUtil.toIndentedString(this.userStatus)).append("\n");
/* 86 */     sb.append("}");
/* 87 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\mode\\users\UserCreationResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */