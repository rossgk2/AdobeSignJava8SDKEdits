/*     */ package com.adobe.sign.model.oAuth;
/*     */ 
/*     */ import com.adobe.sign.utils.StringUtil;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;

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
/*     */ public class AccessTokenRequest
/*     */ {
/*  22 */   private String clientId = null;
/*  23 */   private String clientSecret = null;
/*  24 */   private String redirectUri = null;
/*  25 */   private String code = null;
/*  26 */   private String grantType = null;
/*     */   
/*     */   public AccessTokenRequest(String clientId, String clientSecret, String redirectUri, String code, String grantType) {
/*  29 */     this.clientId = clientId;
/*  30 */     this.clientSecret = clientSecret;
/*  31 */     this.redirectUri = redirectUri;
/*  32 */     this.code = code;
/*  33 */     this.grantType = grantType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Value must always be \"authorization_code\".")
/*     */   @JsonProperty("grant_type")
/*     */   public String getGrantType() {
/*  43 */     return this.grantType;
/*     */   }
/*     */   public void setGrantType(String grantType) {
/*  46 */     this.grantType = grantType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Identifies the application configured on the OAuth Configuration page.")
/*     */   @JsonProperty("client_id")
/*     */   public String getClientId() {
/*  55 */     return this.clientId;
/*     */   }
/*     */   public void setClientId(String clientId) {
/*  58 */     this.clientId = clientId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Authenticates the application configured on the OAuth Configuration page.")
/*     */   @JsonProperty("client_secret")
/*     */   public String getClientSecret() {
/*  68 */     return this.clientSecret;
/*     */   }
/*     */   public void setClientSecret(String clientSecret) {
/*  71 */     this.clientSecret = clientSecret;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The url where the end user will be redirected after successful completion of authorization.\nThis value must belong to the set of values specified on the OAuth Configuration page.")
/*     */   @JsonProperty("redirect_uri")
/*     */   public String getRedirectUri() {
/*  83 */     return this.redirectUri;
/*     */   }
/*     */   public void setRedirectUri(String redirectUri) {
/*  86 */     this.redirectUri = redirectUri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The authorization code retrieved by successful authorization workflow.\nThis credential represents the resource owner's authorization.")
/*     */   @JsonProperty("code")
/*     */   public String getCode() {
/*  98 */     return this.code;
/*     */   }
/*     */   public void setCode(String code) {
/* 101 */     this.code = code;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 106 */     StringBuilder sb = new StringBuilder();
/* 107 */     sb.append("class AccessTokenRequest {\n");
/*     */     
/* 109 */     sb.append("    clientId: ").append(StringUtil.toIndentedString(this.clientId)).append("\n");
/* 110 */     sb.append("    clientSecret: ").append(StringUtil.toIndentedString(this.clientSecret)).append("\n");
/* 111 */     sb.append("    redirectUri: ").append(StringUtil.toIndentedString(this.redirectUri)).append("\n");
/* 112 */     sb.append("    code: ").append(StringUtil.toIndentedString(this.code)).append("\n");
/* 113 */     sb.append("    grantType: ").append(StringUtil.toIndentedString(this.grantType)).append("\n");
/*     */     
/* 115 */     sb.append("}");
/*     */     
/* 117 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\oAuth\AccessTokenRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */