/*     */ package com.adobe.sign.model.groups;
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
/*     */ @ApiModel(description = "")
/*     */ public class UserInfo
/*     */ {
/*  28 */   private String company = null;
/*  29 */   private String email = null;
/*  30 */   private String fullNameOrEmail = null;
/*  31 */   private String groupId = null;
/*  32 */   private String userId = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The name of company of the user")
/*     */   @JsonProperty("company")
/*     */   public String getCompany() {
/*  41 */     return this.company;
/*     */   }
/*     */   public void setCompany(String company) {
/*  44 */     this.company = company;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The email address of the user")
/*     */   @JsonProperty("email")
/*     */   public String getEmail() {
/*  54 */     return this.email;
/*     */   }
/*     */   public void setEmail(String email) {
/*  57 */     this.email = email;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The full name of the user, if available; or their email address")
/*     */   @JsonProperty("fullNameOrEmail")
/*     */   public String getFullNameOrEmail() {
/*  67 */     return this.fullNameOrEmail;
/*     */   }
/*     */   public void setFullNameOrEmail(String fullNameOrEmail) {
/*  70 */     this.fullNameOrEmail = fullNameOrEmail;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The identifier that can be used in group management methods")
/*     */   @JsonProperty("groupId")
/*     */   public String getGroupId() {
/*  80 */     return this.groupId;
/*     */   }
/*     */   public void setGroupId(String groupId) {
/*  83 */     this.groupId = groupId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A unique identifier of the user resource for REST APIs. This identifier can not be used in SOAP APIs")
/*     */   @JsonProperty("userId")
/*     */   public String getUserId() {
/*  93 */     return this.userId;
/*     */   }
/*     */   public void setUserId(String userId) {
/*  96 */     this.userId = userId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 103 */     StringBuilder sb = new StringBuilder();
/* 104 */     sb.append("class UserInfo {\n");
/*     */     
/* 106 */     sb.append("    company: ").append(StringUtil.toIndentedString(this.company)).append("\n");
/* 107 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 108 */     sb.append("    fullNameOrEmail: ").append(StringUtil.toIndentedString(this.fullNameOrEmail)).append("\n");
/* 109 */     sb.append("    groupId: ").append(StringUtil.toIndentedString(this.groupId)).append("\n");
/* 110 */     sb.append("    userId: ").append(StringUtil.toIndentedString(this.userId)).append("\n");
/* 111 */     sb.append("}");
/* 112 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\groups\UserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */