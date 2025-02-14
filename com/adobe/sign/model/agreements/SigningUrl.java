/*    */ package com.adobe.sign.model.agreements;
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
/*    */ public class SigningUrl
/*    */ {
/* 28 */   private String email = null;
/* 29 */   private String esignUrl = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The email address of the signer associated with this signing url")
/*    */   @JsonProperty("email")
/*    */   public String getEmail() {
/* 38 */     return this.email;
/*    */   }
/*    */   public void setEmail(String email) {
/* 41 */     this.email = email;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The email address of the signer associated with this signing url")
/*    */   @JsonProperty("esignUrl")
/*    */   public String getEsignUrl() {
/* 51 */     return this.esignUrl;
/*    */   }
/*    */   public void setEsignUrl(String esignUrl) {
/* 54 */     this.esignUrl = esignUrl;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     StringBuilder sb = new StringBuilder();
/* 62 */     sb.append("class SigningUrl {\n");
/*    */     
/* 64 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 65 */     sb.append("    esignUrl: ").append(StringUtil.toIndentedString(this.esignUrl)).append("\n");
/* 66 */     sb.append("}");
/* 67 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\SigningUrl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */