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
/*    */ public class DisplayUserInfo
/*    */ {
/* 28 */   private String company = null;
/* 29 */   private String email = null;
/* 30 */   private String fullName = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Displays the name of the company of the user, if available")
/*    */   @JsonProperty("company")
/*    */   public String getCompany() {
/* 39 */     return this.company;
/*    */   }
/*    */   public void setCompany(String company) {
/* 42 */     this.company = company;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Displays the email of the user")
/*    */   @JsonProperty("email")
/*    */   public String getEmail() {
/* 52 */     return this.email;
/*    */   }
/*    */   public void setEmail(String email) {
/* 55 */     this.email = email;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Displays the full name of the user, if available.")
/*    */   @JsonProperty("fullName")
/*    */   public String getFullName() {
/* 65 */     return this.fullName;
/*    */   }
/*    */   public void setFullName(String fullName) {
/* 68 */     this.fullName = fullName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 75 */     StringBuilder sb = new StringBuilder();
/* 76 */     sb.append("class DisplayUserInfo {\n");
/*    */     
/* 78 */     sb.append("    company: ").append(StringUtil.toIndentedString(this.company)).append("\n");
/* 79 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 80 */     sb.append("    fullName: ").append(StringUtil.toIndentedString(this.fullName)).append("\n");
/* 81 */     sb.append("}");
/* 82 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\DisplayUserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */