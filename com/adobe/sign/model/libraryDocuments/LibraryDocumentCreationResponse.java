/*     */ package com.adobe.sign.model.libraryDocuments;
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
/*     */ @ApiModel(description = "A JSON object describing the library template")
/*     */ public class LibraryDocumentCreationResponse
/*     */ {
/*  32 */   private String embeddedCode = null;
/*  33 */   private Date expiration = null;
/*  34 */   private String libraryDocumentId = null;
/*  35 */   private String url = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Javascript snippet suitable for an embedded page taking a user to a URL")
/*     */   @JsonProperty("embeddedCode")
/*     */   public String getEmbeddedCode() {
/*  44 */     return this.embeddedCode;
/*     */   }
/*     */   public void setEmbeddedCode(String embeddedCode) {
/*  47 */     this.embeddedCode = embeddedCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Expiration date for autologin. This is based on the user setting, API_AUTO_LOGIN_LIFETIME")
/*     */   @JsonProperty("expiration")
/*     */   public Date getExpiration() {
/*  57 */     return this.expiration;
/*     */   }
/*     */   public void setExpiration(Date expiration) {
/*  60 */     this.expiration = expiration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The unique identifier that can be used to refer to the library template")
/*     */   @JsonProperty("libraryDocumentId")
/*     */   public String getLibraryDocumentId() {
/*  70 */     return this.libraryDocumentId;
/*     */   }
/*     */   public void setLibraryDocumentId(String libraryDocumentId) {
/*  73 */     this.libraryDocumentId = libraryDocumentId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Standalone URL to direct end users to")
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
/*  94 */     sb.append("class LibraryDocumentCreationResponse {\n");
/*     */     
/*  96 */     sb.append("    embeddedCode: ").append(StringUtil.toIndentedString(this.embeddedCode)).append("\n");
/*  97 */     sb.append("    expiration: ").append(StringUtil.toIndentedString(this.expiration)).append("\n");
/*  98 */     sb.append("    libraryDocumentId: ").append(StringUtil.toIndentedString(this.libraryDocumentId)).append("\n");
/*  99 */     sb.append("    url: ").append(StringUtil.toIndentedString(this.url)).append("\n");
/* 100 */     sb.append("}");
/* 101 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\libraryDocuments\LibraryDocumentCreationResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */