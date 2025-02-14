/*    */ package com.adobe.sign.model.oAuth;
/*    */ 
/*    */ import com.adobe.sign.utils.StringUtil;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;

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
/*    */ public class AccessTokenRefreshRequest
/*    */ {
/* 22 */   private String clientId = null;
/* 23 */   private String clientSecret = null;
/* 24 */   private String refreshToken = null;
/* 25 */   private String grantType = null;
/*    */   
/*    */   public AccessTokenRefreshRequest(String clientId, String clientSecret, String refreshToken, String grantType) {
/* 28 */     this.clientId = clientId;
/* 29 */     this.clientSecret = clientSecret;
/* 30 */     this.refreshToken = refreshToken;
/* 31 */     this.grantType = grantType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Identifies the application configured on the OAuth Configuration page.")
/*    */   @JsonProperty("client_id")
/*    */   public String getClientId() {
/* 40 */     return this.clientId;
/*    */   }
/*    */   public void setClientId(String clientId) {
/* 43 */     this.clientId = clientId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Authenticates the application configured on the OAuth Configuration page.")
/*    */   @JsonProperty("client_secret")
/*    */   public String getClientSecret() {
/* 53 */     return this.clientSecret;
/*    */   }
/*    */   public void setClientSecret(String clientSecret) {
/* 56 */     this.clientSecret = clientSecret;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Token which is used to refresh existing access token.\n")
/*    */   @JsonProperty("refresh_token")
/*    */   public String getRefreshToken() {
/* 66 */     return this.refreshToken;
/*    */   }
/*    */   public void setRefreshToken(String refreshToken) {
/* 69 */     this.refreshToken = refreshToken;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Value must always be \"refresh_token.\"")
/*    */   @JsonProperty("grant_type")
/*    */   public String getGrantType() {
/* 79 */     return this.grantType;
/*    */   }
/*    */   
/*    */   public void setGrantType(String grantType) {
/* 83 */     this.grantType = grantType;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 88 */     StringBuilder sb = new StringBuilder();
/* 89 */     sb.append("class AccessTokenRefreshRequest {\n");
/*    */     
/* 91 */     sb.append("    clientId: ").append(StringUtil.toIndentedString(this.clientId)).append("\n");
/* 92 */     sb.append("    clientSecret: ").append(StringUtil.toIndentedString(this.clientSecret)).append("\n");
/* 93 */     sb.append("    refreshToken: ").append(StringUtil.toIndentedString(this.refreshToken)).append("\n");
/* 94 */     sb.append("    grantType: ").append(StringUtil.toIndentedString(this.grantType)).append("\n");
/*    */     
/* 96 */     sb.append("}");
/*    */     
/* 98 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\oAuth\AccessTokenRefreshRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */