/*     */ package com.adobe.sign.model.workflows;
/*     */ import java.util.Date;

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
/*     */ @ApiModel(description = "A JSON that contains both the id of the newly created agreement and URL / embedded code to direct the user to tne next step in the creation process.")
/*     */ public class AgreementCreationResponse
/*     */ {
/*  32 */   private String agreementId = null;
/*  33 */   private String embeddedCode = null;
/*  34 */   private Date expiration = null;
/*  35 */   private String url = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The unique identifier that can be used to query status and download signed documents")
/*     */   @JsonProperty("agreementId")
/*     */   public String getAgreementId() {
/*  44 */     return this.agreementId;
/*     */   }
/*     */   public void setAgreementId(String agreementId) {
/*  47 */     this.agreementId = agreementId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Javascript snippet suitable for an embedded page taking a user to a URL")
/*     */   @JsonProperty("embeddedCode")
/*     */   public String getEmbeddedCode() {
/*  57 */     return this.embeddedCode;
/*     */   }
/*     */   public void setEmbeddedCode(String embeddedCode) {
/*  60 */     this.embeddedCode = embeddedCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Expiration date for autologin. This is based on the user setting, API_AUTO_LOGIN_LIFETIME")
/*     */   @JsonProperty("expiration")
/*     */   public Date getExpiration() {
/*  70 */     return this.expiration;
/*     */   }
/*     */   public void setExpiration(Date expiration) {
/*  73 */     this.expiration = expiration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Standalone URL to direct end users to")
/*     */   @JsonProperty("url")
/*     */   public String getUrl() {
/*  83 */     return this.url;
/*     */   }
/*     */   public void setUrl(String url) {
/*  86 */     this.url = url;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  93 */     StringBuilder sb = new StringBuilder();
/*  94 */     sb.append("class AgreementCreationResponse {\n");
/*     */     
/*  96 */     sb.append("    agreementId: ").append(StringUtil.toIndentedString(this.agreementId)).append("\n");
/*  97 */     sb.append("    embeddedCode: ").append(StringUtil.toIndentedString(this.embeddedCode)).append("\n");
/*  98 */     sb.append("    expiration: ").append(StringUtil.toIndentedString(this.expiration)).append("\n");
/*  99 */     sb.append("    url: ").append(StringUtil.toIndentedString(this.url)).append("\n");
/* 100 */     sb.append("}");
/* 101 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\AgreementCreationResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */