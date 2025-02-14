/*    */ package com.adobe.sign.model.megaSigns;
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
/*    */ public class PostSignOptions
/*    */ {
/* 28 */   private Integer redirectDelay = null;
/* 29 */   private String redirectUrl = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The delay (in seconds) before the user is taken to the success page. If this value is greater than 0, the user will first see the standard Adobe Sign success message, and then after a delay will be redirected to your success page.")
/*    */   @JsonProperty("redirectDelay")
/*    */   public Integer getRedirectDelay() {
/* 38 */     return this.redirectDelay;
/*    */   }
/*    */   public void setRedirectDelay(Integer redirectDelay) {
/* 41 */     this.redirectDelay = redirectDelay;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A publicly accessible url to which the user will be sent after successfully completing the signing process.")
/*    */   @JsonProperty("redirectUrl")
/*    */   public String getRedirectUrl() {
/* 51 */     return this.redirectUrl;
/*    */   }
/*    */   public void setRedirectUrl(String redirectUrl) {
/* 54 */     this.redirectUrl = redirectUrl;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     StringBuilder sb = new StringBuilder();
/* 62 */     sb.append("class PostSignOptions {\n");
/*    */     
/* 64 */     sb.append("    redirectDelay: ").append(StringUtil.toIndentedString(this.redirectDelay)).append("\n");
/* 65 */     sb.append("    redirectUrl: ").append(StringUtil.toIndentedString(this.redirectUrl)).append("\n");
/* 66 */     sb.append("}");
/* 67 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\PostSignOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */