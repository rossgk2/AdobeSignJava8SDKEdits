/*     */ package com.adobe.sign.model.agreements;
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
/*     */ @ApiModel(description = "")
/*     */ public class InteractiveOptions
/*     */ {
/*  29 */   private Boolean authoringRequested = null;
/*  30 */   private Boolean autoLoginUser = null;
/*  31 */   private String locale = null;
/*  32 */   private Boolean noChrome = null;
/*  33 */   private Boolean sendThroughWeb = null;
/*  34 */   private SendThroughWebOptions sendThroughWebOptions = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Indicates that authoring is requested prior to sending the document")
/*     */   @JsonProperty("authoringRequested")
/*     */   public Boolean getAuthoringRequested() {
/*  43 */     return this.authoringRequested;
/*     */   }
/*     */   public void setAuthoringRequested(Boolean authoringRequested) {
/*  46 */     this.authoringRequested = authoringRequested;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("If user settings allow, automatically logs the user in")
/*     */   @JsonProperty("autoLoginUser")
/*     */   public Boolean getAutoLoginUser() {
/*  56 */     return this.autoLoginUser;
/*     */   }
/*     */   public void setAutoLoginUser(Boolean autoLoginUser) {
/*  59 */     this.autoLoginUser = autoLoginUser;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The locale in which page returned by this API should be shown in - for example, en_US or fr_FR. In case locale provided by client is not available or no locale is specified, page will be shown in the default language set in the user account")
/*     */   @JsonProperty("locale")
/*     */   public String getLocale() {
/*  69 */     return this.locale;
/*     */   }
/*     */   public void setLocale(String locale) {
/*  72 */     this.locale = locale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Turn off Chrome for the URL generated")
/*     */   @JsonProperty("noChrome")
/*     */   public Boolean getNoChrome() {
/*  82 */     return this.noChrome;
/*     */   }
/*     */   public void setNoChrome(Boolean noChrome) {
/*  85 */     this.noChrome = noChrome;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A url to send page will be returned from where the agreement creation needs to be completed. All the parameters provided here will be retained in the send page")
/*     */   @JsonProperty("sendThroughWeb")
/*     */   public Boolean getSendThroughWeb() {
/*  95 */     return this.sendThroughWeb;
/*     */   }
/*     */   public void setSendThroughWeb(Boolean sendThroughWeb) {
/*  98 */     this.sendThroughWeb = sendThroughWeb;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A JSON object of Type SendThroughWebOptions to customize the sendPage. This one will apply only if sendThroughWeb is set to true")
/*     */   @JsonProperty("sendThroughWebOptions")
/*     */   public SendThroughWebOptions getSendThroughWebOptions() {
/* 108 */     return this.sendThroughWebOptions;
/*     */   }
/*     */   public void setSendThroughWebOptions(SendThroughWebOptions sendThroughWebOptions) {
/* 111 */     this.sendThroughWebOptions = sendThroughWebOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 118 */     StringBuilder sb = new StringBuilder();
/* 119 */     sb.append("class InteractiveOptions {\n");
/*     */     
/* 121 */     sb.append("    authoringRequested: ").append(StringUtil.toIndentedString(this.authoringRequested)).append("\n");
/* 122 */     sb.append("    autoLoginUser: ").append(StringUtil.toIndentedString(this.autoLoginUser)).append("\n");
/* 123 */     sb.append("    locale: ").append(StringUtil.toIndentedString(this.locale)).append("\n");
/* 124 */     sb.append("    noChrome: ").append(StringUtil.toIndentedString(this.noChrome)).append("\n");
/* 125 */     sb.append("    sendThroughWeb: ").append(StringUtil.toIndentedString(this.sendThroughWeb)).append("\n");
/* 126 */     sb.append("    sendThroughWebOptions: ").append(StringUtil.toIndentedString(this.sendThroughWebOptions)).append("\n");
/* 127 */     sb.append("}");
/* 128 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\InteractiveOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */