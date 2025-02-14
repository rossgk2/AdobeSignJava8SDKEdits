/*    */ package com.adobe.sign.utils;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
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
/*    */ public class OAuthException
/*    */ {
/*    */   @JsonProperty("error")
/*    */   private String code;
/*    */   @JsonProperty("error_description")
/*    */   private String message;
/*    */   
/*    */   public String getCode() {
/* 29 */     return this.code;
/*    */   }
/*    */   
/*    */   public void setCode(String code) {
/* 33 */     this.code = code;
/*    */   }
/*    */   
/*    */   public String getMessage() {
/* 37 */     return this.message;
/*    */   }
/*    */   
/*    */   public void setMessage(String message) {
/* 41 */     this.message = message;
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\OAuthException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */