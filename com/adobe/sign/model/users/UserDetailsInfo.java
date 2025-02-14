/*     */ package com.adobe.sign.model.users;
import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.utils.StringUtil;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class UserDetailsInfo {
/*     */   private String account;
/*     */   private AccountTypeEnum accountType;
/*     */   private List<CapabilityFlagsEnum> capabilityFlags;
/*     */   private String channel;
/*     */   private String company;
/*     */   private String email;
/*     */   private String firstName;
/*     */   private String group;
/*     */   private String groupId;
/*     */   private String initials;
/*     */   private String lastName;
/*     */   private String locale;
/*     */   private OptInEnum optIn;
/*     */   private Date passwordExpiration;
/*     */   private String phone;
/*     */   private List<RolesEnum> roles;
/*     */   private String title;
/*     */   private UserStatusEnum userStatus;
/*     */   
/*  30 */   public UserDetailsInfo() { this.account = null;
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
/*  54 */     this.accountType = null;
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
/*  76 */     this.capabilityFlags = new ArrayList<>();
/*  77 */     this.channel = null;
/*  78 */     this.company = null;
/*  79 */     this.email = null;
/*  80 */     this.firstName = null;
/*  81 */     this.group = null;
/*  82 */     this.groupId = null;
/*  83 */     this.initials = null;
/*  84 */     this.lastName = null;
/*  85 */     this.locale = null;
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
/* 104 */     this.optIn = null;
/* 105 */     this.passwordExpiration = null;
/* 106 */     this.phone = null;
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
/* 126 */     this.roles = new ArrayList<>();
/* 127 */     this.title = null;
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
/* 148 */     this.userStatus = null; }
/*     */   public enum AccountTypeEnum {
/*     */     FREE("FREE"), PRO("PRO"), TEAM("TEAM"), TEAM_TRIAL("TEAM_TRIAL"), ENTERPRISE("ENTERPRISE"), ENTERPRISE_TRIAL("ENTERPRISE_TRIAL"), GLOBAL("GLOBAL"), GLOBAL_TRIAL("GLOBAL_TRIAL");
/*     */     private String value;
/*     */     AccountTypeEnum(String value) { this.value = value; }
/*     */     public String toString() { return this.value; } } public enum CapabilityFlagsEnum {
/*     */     CAN_SEND("CAN_SEND"), CAN_SIGN("CAN_SIGN"), CAN_REPLACE_SIGNER("CAN_REPLACE_SIGNER"), VAULT_ENABLED("VAULT_ENABLED"), VAULT_PER_AGREEMENT("VAULT_PER_AGREEMENT"),
/*     */     OTHER("OTHER"); private String value; CapabilityFlagsEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty("Nickname of the account to which the user belongs")
/*     */   @JsonProperty("account")
/* 157 */   public String getAccount() { return this.account; } public enum OptInEnum {
/*     */     YES("YES"), NO("NO"), UNKNOWN("UNKNOWN"); private String value; OptInEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum RolesEnum {
/*     */     API("API"), ACCOUNT_ADMIN("ACCOUNT_ADMIN"), GROUP_ADMIN("GROUP_ADMIN"), OTHER("OTHER"); private String value; RolesEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum UserStatusEnum {
/* 160 */     ACTIVE("ACTIVE"), INACTIVE("INACTIVE"), CREATED("CREATED"), PENDING("PENDING"), UNVERIFIED("UNVERIFIED"); private String value; UserStatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setAccount(String account) { this.account = account; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Type of account to which the user belongs (null if no account)")
/*     */   @JsonProperty("accountType")
/*     */   public AccountTypeEnum getAccountType() {
/* 170 */     return this.accountType;
/*     */   }
/*     */   public void setAccountType(AccountTypeEnum accountType) {
/* 173 */     this.accountType = accountType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A set of capabilities applicable to the user")
/*     */   @JsonProperty("capabilityFlags")
/*     */   public List<CapabilityFlagsEnum> getCapabilityFlags() {
/* 183 */     return this.capabilityFlags;
/*     */   }
/*     */   public void setCapabilityFlags(List<CapabilityFlagsEnum> capabilityFlags) {
/* 186 */     this.capabilityFlags = capabilityFlags;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Name of the channel to which the user belongs")
/*     */   @JsonProperty("channel")
/*     */   public String getChannel() {
/* 196 */     return this.channel;
/*     */   }
/*     */   public void setChannel(String channel) {
/* 199 */     this.channel = channel;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The name of company of the user")
/*     */   @JsonProperty("company")
/*     */   public String getCompany() {
/* 209 */     return this.company;
/*     */   }
/*     */   public void setCompany(String company) {
/* 212 */     this.company = company;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The email address of the user")
/*     */   @JsonProperty("email")
/*     */   public String getEmail() {
/* 222 */     return this.email;
/*     */   }
/*     */   public void setEmail(String email) {
/* 225 */     this.email = email;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The first name of the user")
/*     */   @JsonProperty("firstName")
/*     */   public String getFirstName() {
/* 235 */     return this.firstName;
/*     */   }
/*     */   public void setFirstName(String firstName) {
/* 238 */     this.firstName = firstName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Name of the group to which the user belongs")
/*     */   @JsonProperty("group")
/*     */   public String getGroup() {
/* 248 */     return this.group;
/*     */   }
/*     */   public void setGroup(String group) {
/* 251 */     this.group = group;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The identifier that can be used in group management methods")
/*     */   @JsonProperty("groupId")
/*     */   public String getGroupId() {
/* 261 */     return this.groupId;
/*     */   }
/*     */   public void setGroupId(String groupId) {
/* 264 */     this.groupId = groupId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The initials of the user")
/*     */   @JsonProperty("initials")
/*     */   public String getInitials() {
/* 274 */     return this.initials;
/*     */   }
/*     */   public void setInitials(String initials) {
/* 277 */     this.initials = initials;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The last name of the user")
/*     */   @JsonProperty("lastName")
/*     */   public String getLastName() {
/* 287 */     return this.lastName;
/*     */   }
/*     */   public void setLastName(String lastName) {
/* 290 */     this.lastName = lastName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The UI locale of the user")
/*     */   @JsonProperty("locale")
/*     */   public String getLocale() {
/* 300 */     return this.locale;
/*     */   }
/*     */   public void setLocale(String locale) {
/* 303 */     this.locale = locale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Whether or not the user has opted in to receive marketing information from Adobe Sign and its partners. Default value is UNKNOWN")
/*     */   @JsonProperty("optIn")
/*     */   public OptInEnum getOptIn() {
/* 313 */     return this.optIn;
/*     */   }
/*     */   public void setOptIn(OptInEnum optIn) {
/* 316 */     this.optIn = optIn;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The date of password expiration")
/*     */   @JsonProperty("passwordExpiration")
/*     */   public Date getPasswordExpiration() {
/* 326 */     return this.passwordExpiration;
/*     */   }
/*     */   public void setPasswordExpiration(Date passwordExpiration) {
/* 329 */     this.passwordExpiration = passwordExpiration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The phone number of the user")
/*     */   @JsonProperty("phone")
/*     */   public String getPhone() {
/* 339 */     return this.phone;
/*     */   }
/*     */   public void setPhone(String phone) {
/* 342 */     this.phone = phone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The current roles of the user")
/*     */   @JsonProperty("roles")
/*     */   public List<RolesEnum> getRoles() {
/* 352 */     return this.roles;
/*     */   }
/*     */   public void setRoles(List<RolesEnum> roles) {
/* 355 */     this.roles = roles;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The job title of the user")
/*     */   @JsonProperty("title")
/*     */   public String getTitle() {
/* 365 */     return this.title;
/*     */   }
/*     */   public void setTitle(String title) {
/* 368 */     this.title = title;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Status of the user")
/*     */   @JsonProperty("userStatus")
/*     */   public UserStatusEnum getUserStatus() {
/* 378 */     return this.userStatus;
/*     */   }
/*     */   public void setUserStatus(UserStatusEnum userStatus) {
/* 381 */     this.userStatus = userStatus;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 388 */     StringBuilder sb = new StringBuilder();
/* 389 */     sb.append("class UserDetailsInfo {\n");
/*     */     
/* 391 */     sb.append("    account: ").append(StringUtil.toIndentedString(this.account)).append("\n");
/* 392 */     sb.append("    accountType: ").append(StringUtil.toIndentedString(this.accountType)).append("\n");
/* 393 */     sb.append("    capabilityFlags: ").append(StringUtil.toIndentedString(this.capabilityFlags)).append("\n");
/* 394 */     sb.append("    channel: ").append(StringUtil.toIndentedString(this.channel)).append("\n");
/* 395 */     sb.append("    company: ").append(StringUtil.toIndentedString(this.company)).append("\n");
/* 396 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 397 */     sb.append("    firstName: ").append(StringUtil.toIndentedString(this.firstName)).append("\n");
/* 398 */     sb.append("    group: ").append(StringUtil.toIndentedString(this.group)).append("\n");
/* 399 */     sb.append("    groupId: ").append(StringUtil.toIndentedString(this.groupId)).append("\n");
/* 400 */     sb.append("    initials: ").append(StringUtil.toIndentedString(this.initials)).append("\n");
/* 401 */     sb.append("    lastName: ").append(StringUtil.toIndentedString(this.lastName)).append("\n");
/* 402 */     sb.append("    locale: ").append(StringUtil.toIndentedString(this.locale)).append("\n");
/* 403 */     sb.append("    optIn: ").append(StringUtil.toIndentedString(this.optIn)).append("\n");
/* 404 */     sb.append("    passwordExpiration: ").append(StringUtil.toIndentedString(this.passwordExpiration)).append("\n");
/* 405 */     sb.append("    phone: ").append(StringUtil.toIndentedString(this.phone)).append("\n");
/* 406 */     sb.append("    roles: ").append(StringUtil.toIndentedString(this.roles)).append("\n");
/* 407 */     sb.append("    title: ").append(StringUtil.toIndentedString(this.title)).append("\n");
/* 408 */     sb.append("    userStatus: ").append(StringUtil.toIndentedString(this.userStatus)).append("\n");
/* 409 */     sb.append("}");
/* 410 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\mode\\users\UserDetailsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */