/*    */ package com.adobe.sign.model.oAuth;
/*    */ 
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
/*    */ public class Token
/*    */ {
/* 20 */   private String token = null;
/*    */   
/*    */   public Token(String token) {
/* 23 */     this.token = token;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The access token or refresh token which has to be revoked.")
/*    */   @JsonProperty("token")
/*    */   public String getToken() {
/* 33 */     return this.token;
/*    */   }
/*    */   public void setToken(String token) {
/* 36 */     this.token = token;
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\oAuth\Token.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */