/*     */ package com.adobe.sign.model.users;

import java.util.ArrayList;
import java.util.List;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*     */ @ApiModel(description = "")
/*     */ public class UserModificationInfo {
/*     */   private String company;
/*     */   private String email;
/*     */   private String firstName;
/*     */   private String groupId;
/*     */   private String lastName;
/*     */   private OptInEnum optIn;
/*     */   private String phone;
/*     */   private List<RolesEnum> roles;
/*     */   private String title;
/*     */   
/*     */   public enum OptInEnum {
/*     */     YES("YES"),
/*     */     NO("NO"),
/*     */     UNKNOWN("UNKNOWN");
/*     */     private String value;
/*     */     
/*     */     OptInEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return this.value;
/*     */     }
/*     */   }
/*     */   
/*  29 */   public UserModificationInfo() { this.company = null;
/*  30 */     this.email = null;
/*  31 */     this.firstName = null;
/*  32 */     this.groupId = null;
/*  33 */     this.lastName = null;
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
/*  52 */     this.optIn = null;
/*  53 */     this.phone = null;
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
/*  72 */     this.roles = new ArrayList<>();
/*  73 */     this.title = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The new company name of the user. The server will reset to null if the value is not provided")
/*     */   @JsonProperty("company")
/*     */   public String getCompany() {
/*  82 */     return this.company;
/*     */   }
/*     */   public enum RolesEnum {
/*  85 */     ACCOUNT_ADMIN("ACCOUNT_ADMIN"), GROUP_ADMIN("GROUP_ADMIN"), NORMAL_USER("NORMAL_USER"); private String value; RolesEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setCompany(String company) { this.company = company; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The new email address of the user")
/*     */   @JsonProperty("email")
/*     */   public String getEmail() {
/*  95 */     return this.email;
/*     */   }
/*     */   public void setEmail(String email) {
/*  98 */     this.email = email;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The new first name of the user")
/*     */   @JsonProperty("firstName")
/*     */   public String getFirstName() {
/* 108 */     return this.firstName;
/*     */   }
/*     */   public void setFirstName(String firstName) {
/* 111 */     this.firstName = firstName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The new group in which the user should be added. It can be obtained through a call to the API which retrieves the list of users. The server will reset to default if the value is not provided")
/*     */   @JsonProperty("groupId")
/*     */   public String getGroupId() {
/* 121 */     return this.groupId;
/*     */   }
/*     */   public void setGroupId(String groupId) {
/* 124 */     this.groupId = groupId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The new last name of the user")
/*     */   @JsonProperty("lastName")
/*     */   public String getLastName() {
/* 134 */     return this.lastName;
/*     */   }
/*     */   public void setLastName(String lastName) {
/* 137 */     this.lastName = lastName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Whether or not the user has opted in to receive the marketing information from Adobe Sign and its partners. The server will reset to null if the value is not provided.")
/*     */   @JsonProperty("optIn")
/*     */   public OptInEnum getOptIn() {
/* 147 */     return this.optIn;
/*     */   }
/*     */   public void setOptIn(OptInEnum optIn) {
/* 150 */     this.optIn = optIn;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The new phone number of the user. The server will reset to null if the value is not provided")
/*     */   @JsonProperty("phone")
/*     */   public String getPhone() {
/* 160 */     return this.phone;
/*     */   }
/*     */   public void setPhone(String phone) {
/* 163 */     this.phone = phone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The new roles of the user")
/*     */   @JsonProperty("roles")
/*     */   public List<RolesEnum> getRoles() {
/* 173 */     return this.roles;
/*     */   }
/*     */   public void setRoles(List<RolesEnum> roles) {
/* 176 */     this.roles = roles;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The new job title of the user. The server will reset to null if the value is not provided")
/*     */   @JsonProperty("title")
/*     */   public String getTitle() {
/* 186 */     return this.title;
/*     */   }
/*     */   public void setTitle(String title) {
/* 189 */     this.title = title;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 196 */     StringBuilder sb = new StringBuilder();
/* 197 */     sb.append("class UserModificationInfo {\n");
/*     */     
/* 199 */     sb.append("    company: ").append(StringUtil.toIndentedString(this.company)).append("\n");
/* 200 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 201 */     sb.append("    firstName: ").append(StringUtil.toIndentedString(this.firstName)).append("\n");
/* 202 */     sb.append("    groupId: ").append(StringUtil.toIndentedString(this.groupId)).append("\n");
/* 203 */     sb.append("    lastName: ").append(StringUtil.toIndentedString(this.lastName)).append("\n");
/* 204 */     sb.append("    optIn: ").append(StringUtil.toIndentedString(this.optIn)).append("\n");
/* 205 */     sb.append("    phone: ").append(StringUtil.toIndentedString(this.phone)).append("\n");
/* 206 */     sb.append("    roles: ").append(StringUtil.toIndentedString(this.roles)).append("\n");
/* 207 */     sb.append("    title: ").append(StringUtil.toIndentedString(this.title)).append("\n");
/* 208 */     sb.append("}");
/* 209 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\mode\\users\UserModificationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */