/*     */ package com.adobe.sign.model.agreements;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;

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
/*     */ @ApiModel(description = "")
/*     */ public class RecipientSecurityOption
/*     */ {
/*     */   private AuthenticationMethodEnum authenticationMethod;
/*     */   private String password;
/*     */   private List<PhoneInfo> phoneInfos;
/*     */   
/*     */   public enum AuthenticationMethodEnum
/*     */   {
/*     */     NONE("NONE"),
/*     */     INHERITED_FROM_DOCUMENT("INHERITED_FROM_DOCUMENT"),
/*     */     PASSWORD("PASSWORD"),
/*     */     WEB_IDENTITY("WEB_IDENTITY"),
/*     */     ADOBE_SIGN("ADOBE_SIGN"),
/*     */     GOV_ID("GOV_ID"),
/*     */     KBA("KBA"),
/*     */     PHONE("PHONE");
/*     */     private String value;
/*     */     
/*     */     AuthenticationMethodEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return this.value;
/*     */     }
/*     */   }
/*     */   
/*     */   public RecipientSecurityOption() {
/*  53 */     this.authenticationMethod = null;
/*  54 */     this.password = null;
/*  55 */     this.phoneInfos = new ArrayList<>();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The authentication method for the recipients to have access to view and sign the document")
/*     */   @JsonProperty("authenticationMethod")
/*     */   public AuthenticationMethodEnum getAuthenticationMethod() {
/*  64 */     return this.authenticationMethod;
/*     */   }
/*     */   public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
/*  67 */     this.authenticationMethod = authenticationMethod;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The password required for the recipient to view and sign the document")
/*     */   @JsonProperty("password")
/*     */   public String getPassword() {
/*  77 */     return this.password;
/*     */   }
/*     */   public void setPassword(String password) {
/*  80 */     this.password = password;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The phoneInfo required for the recipient to view and sign the document")
/*     */   @JsonProperty("phoneInfos")
/*     */   public List<PhoneInfo> getPhoneInfos() {
/*  90 */     return this.phoneInfos;
/*     */   }
/*     */   public void setPhoneInfos(List<PhoneInfo> phoneInfos) {
/*  93 */     this.phoneInfos = phoneInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 100 */     StringBuilder sb = new StringBuilder();
/* 101 */     sb.append("class RecipientSecurityOption {\n");
/*     */     
/* 103 */     sb.append("    authenticationMethod: ").append(StringUtil.toIndentedString(this.authenticationMethod)).append("\n");
/* 104 */     sb.append("    password: ").append(StringUtil.toIndentedString(this.password)).append("\n");
/* 105 */     sb.append("    phoneInfos: ").append(StringUtil.toIndentedString(this.phoneInfos)).append("\n");
/* 106 */     sb.append("}");
/* 107 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\RecipientSecurityOption.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */