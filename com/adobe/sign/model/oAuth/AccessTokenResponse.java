/*    */ package com.adobe.sign.model.oAuth;
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
/*    */ @ApiModel(description = "")
/*    */ public class AccessTokenResponse
/*    */ {
/* 24 */   private String accessToken = null;
/* 25 */   private String refreshToken = null;
/* 26 */   private int expiresIn = -1;
/* 27 */   private String tokenType = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An OAuth Access Token")
/*    */   @JsonProperty("access_token")
/*    */   public String getAccessToken() {
/* 35 */     return this.accessToken;
/*    */   }
/*    */   public void setAccessToken(String accessToken) {
/* 38 */     this.accessToken = accessToken;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Refresh Token, which can be used to get a fresh Access Token")
/*    */   @JsonProperty("refresh_token")
/*    */   public String getRefreshToken() {
/* 47 */     return this.refreshToken;
/*    */   }
/*    */   public void setRefreshToken(String refreshToken) {
/* 50 */     this.refreshToken = refreshToken;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The lifetime in seconds of the Access Token")
/*    */   @JsonProperty("expires_in")
/*    */   public int getExpiresIn() {
/* 59 */     return this.expiresIn;
/*    */   }
/*    */   public void setExpiresIn(int expiresIn) {
/* 62 */     this.expiresIn = expiresIn;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The value will always be \"Bearer\"")
/*    */   @JsonProperty("token_type")
/*    */   public String getTokenType() {
/* 71 */     return this.tokenType;
/*    */   }
/*    */   public void setTokenType(String tokenType) {
/* 74 */     this.tokenType = tokenType;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 79 */     StringBuilder sb = new StringBuilder();
/* 80 */     sb.append("class AccessTokenResponse {\n");
/*    */     
/* 82 */     sb.append("    accessToken: ").append(StringUtil.toIndentedString(this.accessToken)).append("\n");
/* 83 */     sb.append("    refreshToken: ").append(StringUtil.toIndentedString(this.refreshToken)).append("\n");
/* 84 */     sb.append("    expiresIn: ").append(StringUtil.toIndentedString(Integer.valueOf(this.expiresIn))).append("\n");
/* 85 */     sb.append("    tokenType: ").append(StringUtil.toIndentedString(this.tokenType)).append("\n");
/*    */     
/* 87 */     sb.append("}");
/*    */ 
/*    */     
/* 90 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\oAuth\AccessTokenResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */