/*    */ package com.adobe.sign.model.workflows;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @ApiModel(description = "")
/*    */ public class SecurityOption
/*    */ {
/* 28 */   private String externalPassword = null;
/* 29 */   private String internalPassword = null;
/* 30 */   private String openPassword = null;
/* 31 */   private Boolean protectOpen = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The secondary password that will be used to protect signing the document for external signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for external signers or all signers")
/*    */   @JsonProperty("externalPassword")
/*    */   public String getExternalPassword() {
/* 40 */     return this.externalPassword;
/*    */   }
/*    */   public void setExternalPassword(String externalPassword) {
/* 43 */     this.externalPassword = externalPassword;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The secondary password that will be used to protect signing the document for internal signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for internal signers or all signers")
/*    */   @JsonProperty("internalPassword")
/*    */   public String getInternalPassword() {
/* 53 */     return this.internalPassword;
/*    */   }
/*    */   public void setInternalPassword(String internalPassword) {
/* 56 */     this.internalPassword = internalPassword;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The secondary password that will be used to secure the PDF document. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is used only if protectOpen field is set to true")
/*    */   @JsonProperty("openPassword")
/*    */   public String getOpenPassword() {
/* 66 */     return this.openPassword;
/*    */   }
/*    */   public void setOpenPassword(String openPassword) {
/* 69 */     this.openPassword = openPassword;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("If set to true, the document is always be encrypted with this password every time it is sent by email. Recipients need to provide the password to be able to view the PDF files")
/*    */   @JsonProperty("protectOpen")
/*    */   public Boolean getProtectOpen() {
/* 79 */     return this.protectOpen;
/*    */   }
/*    */   public void setProtectOpen(Boolean protectOpen) {
/* 82 */     this.protectOpen = protectOpen;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 89 */     StringBuilder sb = new StringBuilder();
/* 90 */     sb.append("class SecurityOption {\n");
/*    */     
/* 92 */     sb.append("    externalPassword: ").append(StringUtil.toIndentedString(this.externalPassword)).append("\n");
/* 93 */     sb.append("    internalPassword: ").append(StringUtil.toIndentedString(this.internalPassword)).append("\n");
/* 94 */     sb.append("    openPassword: ").append(StringUtil.toIndentedString(this.openPassword)).append("\n");
/* 95 */     sb.append("    protectOpen: ").append(StringUtil.toIndentedString(this.protectOpen)).append("\n");
/* 96 */     sb.append("}");
/* 97 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\SecurityOption.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */