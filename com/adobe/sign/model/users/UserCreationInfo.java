/*     */ package com.adobe.sign.model.users;
import java.util.ArrayList;
import java.util.List;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ @ApiModel(description = "")
/*     */ public class UserCreationInfo {
/*     */   private String company;
/*     */   private String email;
/*     */   private String firstName;
/*     */   private String groupId;
/*     */   private String lastName;
/*     */   private OptInEnum optIn;
/*     */   private String password;
/*     */   private String phone;
/*     */   private List<RolesEnum> roles;
/*     */   private String title;
/*     */   
/*     */   public enum OptInEnum { YES("YES"),
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
/*     */     } }
/*     */   
/*  29 */   public UserCreationInfo() { this.company = null;
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
/*  53 */     this.password = null;
/*  54 */     this.phone = null;
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
/*  73 */     this.roles = new ArrayList<>();
/*  74 */     this.title = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The name of the company of the new user")
/*     */   @JsonProperty("company")
/*     */   public String getCompany() {
/*  83 */     return this.company;
/*     */   }
/*     */   public enum RolesEnum {
/*  86 */     ACCOUNT_ADMIN("ACCOUNT_ADMIN"), GROUP_ADMIN("GROUP_ADMIN"), NORMAL_USER("NORMAL_USER"); private String value; RolesEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setCompany(String company) { this.company = company; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The email address of the new user")
/*     */   @JsonProperty("email")
/*     */   public String getEmail() {
/*  96 */     return this.email;
/*     */   }
/*     */   public void setEmail(String email) {
/*  99 */     this.email = email;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The first name of the new user")
/*     */   @JsonProperty("firstName")
/*     */   public String getFirstName() {
/* 109 */     return this.firstName;
/*     */   }
/*     */   public void setFirstName(String firstName) {
/* 112 */     this.firstName = firstName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Group in which the new user should be added. It can be obtained through a call to the API which retrieves users. Default is Group of the user making this call. The user is inferred from the access_token header.")
/*     */   @JsonProperty("groupId")
/*     */   public String getGroupId() {
/* 122 */     return this.groupId;
/*     */   }
/*     */   public void setGroupId(String groupId) {
/* 125 */     this.groupId = groupId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The last name of the new user")
/*     */   @JsonProperty("lastName")
/*     */   public String getLastName() {
/* 135 */     return this.lastName;
/*     */   }
/*     */   public void setLastName(String lastName) {
/* 138 */     this.lastName = lastName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Whether or not the user has opted in to receive marketing information from Adobe Sign and its partners. Default value is UNKNOWN")
/*     */   @JsonProperty("optIn")
/*     */   public OptInEnum getOptIn() {
/* 148 */     return this.optIn;
/*     */   }
/*     */   public void setOptIn(OptInEnum optIn) {
/* 151 */     this.optIn = optIn;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The password of the new user")
/*     */   @JsonProperty("password")
/*     */   public String getPassword() {
/* 161 */     return this.password;
/*     */   }
/*     */   public void setPassword(String password) {
/* 164 */     this.password = password;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The phone number of the new user")
/*     */   @JsonProperty("phone")
/*     */   public String getPhone() {
/* 174 */     return this.phone;
/*     */   }
/*     */   public void setPhone(String phone) {
/* 177 */     this.phone = phone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The current roles of the user")
/*     */   @JsonProperty("roles")
/*     */   public List<RolesEnum> getRoles() {
/* 187 */     return this.roles;
/*     */   }
/*     */   public void setRoles(List<RolesEnum> roles) {
/* 190 */     this.roles = roles;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The job title of the new user")
/*     */   @JsonProperty("title")
/*     */   public String getTitle() {
/* 200 */     return this.title;
/*     */   }
/*     */   public void setTitle(String title) {
/* 203 */     this.title = title;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 210 */     StringBuilder sb = new StringBuilder();
/* 211 */     sb.append("class UserCreationInfo {\n");
/*     */     
/* 213 */     sb.append("    company: ").append(StringUtil.toIndentedString(this.company)).append("\n");
/* 214 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 215 */     sb.append("    firstName: ").append(StringUtil.toIndentedString(this.firstName)).append("\n");
/* 216 */     sb.append("    groupId: ").append(StringUtil.toIndentedString(this.groupId)).append("\n");
/* 217 */     sb.append("    lastName: ").append(StringUtil.toIndentedString(this.lastName)).append("\n");
/* 218 */     sb.append("    optIn: ").append(StringUtil.toIndentedString(this.optIn)).append("\n");
/* 219 */     sb.append("    password: ").append(StringUtil.toIndentedString(this.password)).append("\n");
/* 220 */     sb.append("    phone: ").append(StringUtil.toIndentedString(this.phone)).append("\n");
/* 221 */     sb.append("    roles: ").append(StringUtil.toIndentedString(this.roles)).append("\n");
/* 222 */     sb.append("    title: ").append(StringUtil.toIndentedString(this.title)).append("\n");
/* 223 */     sb.append("}");
/* 224 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\mode\\users\UserCreationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */