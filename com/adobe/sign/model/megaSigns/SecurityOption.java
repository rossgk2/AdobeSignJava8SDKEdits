/*     */ package com.adobe.sign.model.megaSigns;
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
/*     */ @ApiModel(description = "")
/*     */ public class SecurityOption
/*     */ {
/*     */   private String externalPassword;
/*     */   private String internalPassword;
/*     */   private KbaProtectionEnum kbaProtection;
/*     */   private String openPassword;
/*     */   
/*     */   public SecurityOption() {
/*  28 */     this.externalPassword = null;
/*  29 */     this.internalPassword = null;
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
/*  49 */     this.kbaProtection = null;
/*  50 */     this.openPassword = null;
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
/*  70 */     this.passwordProtection = null;
/*  71 */     this.protectOpen = null;
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
/*  91 */     this.webIdentityProtection = null;
/*     */   }
/*     */   private PasswordProtectionEnum passwordProtection;
/*     */   private Boolean protectOpen;
/*     */   private WebIdentityProtectionEnum webIdentityProtection;
/*     */   public enum KbaProtectionEnum {
/*     */     NONE("NONE"), EXTERNAL_USERS("EXTERNAL_USERS"), INTERNAL_USERS("INTERNAL_USERS"), ALL_USERS("ALL_USERS");
/*     */     private String value; KbaProtectionEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum PasswordProtectionEnum {
/*     */     NONE("NONE"), EXTERNAL_USERS("EXTERNAL_USERS"), INTERNAL_USERS("INTERNAL_USERS"), ALL_USERS("ALL_USERS"); private String value; PasswordProtectionEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum WebIdentityProtectionEnum {
/* 100 */     NONE("NONE"), EXTERNAL_USERS("EXTERNAL_USERS"), INTERNAL_USERS("INTERNAL_USERS"), ALL_USERS("ALL_USERS"); private String value; WebIdentityProtectionEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty("The secondary password that will be used to protect signing the document for external signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for external signers or all signers") @JsonProperty("externalPassword") public String getExternalPassword() { return this.externalPassword; }
/*     */   
/*     */   public void setExternalPassword(String externalPassword) {
/* 103 */     this.externalPassword = externalPassword;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The secondary password that will be used to protect signing the document for internal signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for internal signers or all signers")
/*     */   @JsonProperty("internalPassword")
/*     */   public String getInternalPassword() {
/* 113 */     return this.internalPassword;
/*     */   }
/*     */   public void setInternalPassword(String internalPassword) {
/* 116 */     this.internalPassword = internalPassword;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Signers need to pass Knowledge Based Authentication before they gain access to view and sign the document.")
/*     */   @JsonProperty("kbaProtection")
/*     */   public KbaProtectionEnum getKbaProtection() {
/* 126 */     return this.kbaProtection;
/*     */   }
/*     */   public void setKbaProtection(KbaProtectionEnum kbaProtection) {
/* 129 */     this.kbaProtection = kbaProtection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The secondary password that will be used to secure the PDF document. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is used only if protectOpen field is set to true")
/*     */   @JsonProperty("openPassword")
/*     */   public String getOpenPassword() {
/* 139 */     return this.openPassword;
/*     */   }
/*     */   public void setOpenPassword(String openPassword) {
/* 142 */     this.openPassword = openPassword;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Specifies if signers are required to enter a password to have access to sign the document.")
/*     */   @JsonProperty("passwordProtection")
/*     */   public PasswordProtectionEnum getPasswordProtection() {
/* 152 */     return this.passwordProtection;
/*     */   }
/*     */   public void setPasswordProtection(PasswordProtectionEnum passwordProtection) {
/* 155 */     this.passwordProtection = passwordProtection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("If set to true, the document is always be encrypted with this password every time it is sent by email. Recipients need to provide the password to be able to view the PDF files")
/*     */   @JsonProperty("protectOpen")
/*     */   public Boolean getProtectOpen() {
/* 165 */     return this.protectOpen;
/*     */   }
/*     */   public void setProtectOpen(Boolean protectOpen) {
/* 168 */     this.protectOpen = protectOpen;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Specifies if signers are required to provide their web identity, before they gain access to view and sign the document.")
/*     */   @JsonProperty("webIdentityProtection")
/*     */   public WebIdentityProtectionEnum getWebIdentityProtection() {
/* 178 */     return this.webIdentityProtection;
/*     */   }
/*     */   public void setWebIdentityProtection(WebIdentityProtectionEnum webIdentityProtection) {
/* 181 */     this.webIdentityProtection = webIdentityProtection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 188 */     StringBuilder sb = new StringBuilder();
/* 189 */     sb.append("class SecurityOption {\n");
/*     */     
/* 191 */     sb.append("    externalPassword: ").append(StringUtil.toIndentedString(this.externalPassword)).append("\n");
/* 192 */     sb.append("    internalPassword: ").append(StringUtil.toIndentedString(this.internalPassword)).append("\n");
/* 193 */     sb.append("    kbaProtection: ").append(StringUtil.toIndentedString(this.kbaProtection)).append("\n");
/* 194 */     sb.append("    openPassword: ").append(StringUtil.toIndentedString(this.openPassword)).append("\n");
/* 195 */     sb.append("    passwordProtection: ").append(StringUtil.toIndentedString(this.passwordProtection)).append("\n");
/* 196 */     sb.append("    protectOpen: ").append(StringUtil.toIndentedString(this.protectOpen)).append("\n");
/* 197 */     sb.append("    webIdentityProtection: ").append(StringUtil.toIndentedString(this.webIdentityProtection)).append("\n");
/* 198 */     sb.append("}");
/* 199 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\SecurityOption.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */