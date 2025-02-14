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
/*    */ public class PhoneInfo
/*    */ {
/* 28 */   private String countryCode = null;
/* 29 */   private String phone = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The phoneInfo country code required for the recipient to view and sign the document if authentication type is PHONE")
/*    */   @JsonProperty("countryCode")
/*    */   public String getCountryCode() {
/* 38 */     return this.countryCode;
/*    */   }
/*    */   public void setCountryCode(String countryCode) {
/* 41 */     this.countryCode = countryCode;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The phone number required for the recipient to view and sign the document if authentication type is PHONE")
/*    */   @JsonProperty("phone")
/*    */   public String getPhone() {
/* 51 */     return this.phone;
/*    */   }
/*    */   public void setPhone(String phone) {
/* 54 */     this.phone = phone;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     StringBuilder sb = new StringBuilder();
/* 62 */     sb.append("class PhoneInfo {\n");
/*    */     
/* 64 */     sb.append("    countryCode: ").append(StringUtil.toIndentedString(this.countryCode)).append("\n");
/* 65 */     sb.append("    phone: ").append(StringUtil.toIndentedString(this.phone)).append("\n");
/* 66 */     sb.append("}");
/* 67 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\PhoneInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */