/*     */ package com.adobe.sign.model.users;
/*     */ 
/*     */ import com.adobe.sign.utils.StringUtil;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;

/*     */ import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
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
/*     */ @ApiModel(description = "")
/*     */ public class UserStatusUpdateResponse
/*     */ {
/*     */   private CodeEnum code;
/*     */   private String message;
/*     */   
/*     */   public UserStatusUpdateResponse() {
/*  48 */     this.code = null;
/*  49 */     this.message = null;
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
/*  70 */     this.userStatus = null;
/*     */   }
/*     */   private UserStatusEnum userStatus;
/*     */   public enum CodeEnum {
/*     */     ALREADY_ACTIVE("ALREADY_ACTIVE"), ALREADY_INACTIVE("ALREADY_INACTIVE"), OK("OK"), RESET_PASSWORD_WORKFLOW_INITIATED("RESET_PASSWORD_WORKFLOW_INITIATED"), SET_PASSWORD_WORKFLOW_INITIATED("SET_PASSWORD_WORKFLOW_INITIATED");
/*     */     private String value; CodeEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum UserStatusEnum {
/*     */     ACTIVE("ACTIVE"), INACTIVE("INACTIVE"), CREATED("CREATED"), PENDING("PENDING"),
/*     */     UNVERIFIED("UNVERIFIED"); private String value; UserStatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty(required = true, value = "The result of the attempt to activate or deactivate the user")
/*     */   @JsonProperty("code")
/*  79 */   public CodeEnum getCode() { return this.code; }
/*     */   
/*     */   public void setCode(CodeEnum code) {
/*  82 */     this.code = code;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("String result message if there was no error")
/*     */   @JsonProperty("message")
/*     */   public String getMessage() {
/*  92 */     return this.message;
/*     */   }
/*     */   public void setMessage(String message) {
/*  95 */     this.message = message;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A status value showing the result of this operation")
/*     */   @JsonProperty("userStatus")
/*     */   public UserStatusEnum getUserStatus() {
/* 105 */     return this.userStatus;
/*     */   }
/*     */   public void setUserStatus(UserStatusEnum userStatus) {
/* 108 */     this.userStatus = userStatus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 115 */     StringBuilder sb = new StringBuilder();
/* 116 */     sb.append("class UserStatusUpdateResponse {\n");
/*     */     
/* 118 */     sb.append("    code: ").append(StringUtil.toIndentedString(this.code)).append("\n");
/* 119 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 120 */     sb.append("    userStatus: ").append(StringUtil.toIndentedString(this.userStatus)).append("\n");
/* 121 */     sb.append("}");
/* 122 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\mode\\users\UserStatusUpdateResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */