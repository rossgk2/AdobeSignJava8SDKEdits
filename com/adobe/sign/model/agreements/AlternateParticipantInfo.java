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
/*    */ public class AlternateParticipantInfo
/*    */ {
/* 28 */   private String countryCode = null;
/* 29 */   private String email = null;
/* 30 */   private String phone = null;
/* 31 */   private String privateMessage = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The country code for the alternate participant")
/*    */   @JsonProperty("countryCode")
/*    */   public String getCountryCode() {
/* 40 */     return this.countryCode;
/*    */   }
/*    */   public void setCountryCode(String countryCode) {
/* 43 */     this.countryCode = countryCode;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The email of the alternate participant. This is required if fax is not provided. Both fax and email can not be provided")
/*    */   @JsonProperty("email")
/*    */   public String getEmail() {
/* 53 */     return this.email;
/*    */   }
/*    */   public void setEmail(String email) {
/* 56 */     this.email = email;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The phone number for the alternate participant")
/*    */   @JsonProperty("phone")
/*    */   public String getPhone() {
/* 66 */     return this.phone;
/*    */   }
/*    */   public void setPhone(String phone) {
/* 69 */     this.phone = phone;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The private message for the alternate participant")
/*    */   @JsonProperty("privateMessage")
/*    */   public String getPrivateMessage() {
/* 79 */     return this.privateMessage;
/*    */   }
/*    */   public void setPrivateMessage(String privateMessage) {
/* 82 */     this.privateMessage = privateMessage;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 89 */     StringBuilder sb = new StringBuilder();
/* 90 */     sb.append("class AlternateParticipantInfo {\n");
/*    */     
/* 92 */     sb.append("    countryCode: ").append(StringUtil.toIndentedString(this.countryCode)).append("\n");
/* 93 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 94 */     sb.append("    phone: ").append(StringUtil.toIndentedString(this.phone)).append("\n");
/* 95 */     sb.append("    privateMessage: ").append(StringUtil.toIndentedString(this.privateMessage)).append("\n");
/* 96 */     sb.append("}");
/* 97 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\AlternateParticipantInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */