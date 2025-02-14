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
/*    */ public class AccessTokenRefreshResponse
/*    */ {
/* 24 */   private String accessToken = null;
/* 25 */   private int expiresIn = -1;
/* 26 */   private String tokenType = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An OAuth Access Token")
/*    */   @JsonProperty("access_token")
/*    */   public String getAccessToken() {
/* 34 */     return this.accessToken;
/*    */   }
/*    */   public void setAccessToken(String accessToken) {
/* 37 */     this.accessToken = accessToken;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The lifetime in seconds of the Access Token")
/*    */   @JsonProperty("expires_in")
/*    */   public int getExpiresIn() {
/* 46 */     return this.expiresIn;
/*    */   }
/*    */   public void setExpiresIn(int expiresIn) {
/* 49 */     this.expiresIn = expiresIn;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The value will always be \"Bearer\"")
/*    */   @JsonProperty("token_type")
/*    */   public String getTokenType() {
/* 58 */     return this.tokenType;
/*    */   }
/*    */   public void setTokenType(String tokenType) {
/* 61 */     this.tokenType = tokenType;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 66 */     StringBuilder sb = new StringBuilder();
/* 67 */     sb.append("class AccessTokenRefreshResponse {\n");
/*    */     
/* 69 */     sb.append("    accessToken: ").append(StringUtil.toIndentedString(this.accessToken)).append("\n");
/* 70 */     sb.append("    expiresIn: ").append(StringUtil.toIndentedString(Integer.valueOf(this.expiresIn))).append("\n");
/* 71 */     sb.append("    tokenType: ").append(StringUtil.toIndentedString(this.tokenType)).append("\n");
/*    */     
/* 73 */     sb.append("}");
/*    */     
/* 75 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\oAuth\AccessTokenRefreshResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */