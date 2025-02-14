/*     */ package com.adobe.sign.model.widgets;
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
/*     */ public class WidgetSignerSecurityOption
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
/*     */   public WidgetSignerSecurityOption() {
/*  51 */     this.authenticationMethod = null;
/*  52 */     this.password = null;
/*  53 */     this.phoneInfos = new ArrayList<>();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The authentication method for the recipients to have access to view and sign the widget. PHONE authentication is only applicable to counter signers but not to widget signer")
/*     */   @JsonProperty("authenticationMethod")
/*     */   public AuthenticationMethodEnum getAuthenticationMethod() {
/*  62 */     return this.authenticationMethod;
/*     */   }
/*     */   public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
/*  65 */     this.authenticationMethod = authenticationMethod;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The password required for the recipient to view and sign the widget")
/*     */   @JsonProperty("password")
/*     */   public String getPassword() {
/*  75 */     return this.password;
/*     */   }
/*     */   public void setPassword(String password) {
/*  78 */     this.password = password;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The phoneInfo required for the counter signer to view and sign the widget if authentication method is PHONE. Not applicable to widget signer")
/*     */   @JsonProperty("phoneInfos")
/*     */   public List<PhoneInfo> getPhoneInfos() {
/*  88 */     return this.phoneInfos;
/*     */   }
/*     */   public void setPhoneInfos(List<PhoneInfo> phoneInfos) {
/*  91 */     this.phoneInfos = phoneInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  98 */     StringBuilder sb = new StringBuilder();
/*  99 */     sb.append("class WidgetSignerSecurityOption {\n");
/*     */     
/* 101 */     sb.append("    authenticationMethod: ").append(StringUtil.toIndentedString(this.authenticationMethod)).append("\n");
/* 102 */     sb.append("    password: ").append(StringUtil.toIndentedString(this.password)).append("\n");
/* 103 */     sb.append("    phoneInfos: ").append(StringUtil.toIndentedString(this.phoneInfos)).append("\n");
/* 104 */     sb.append("}");
/* 105 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetSignerSecurityOption.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */