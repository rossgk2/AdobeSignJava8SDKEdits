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
/*    */ public class RecipientInfo
/*    */ {
/* 28 */   private String email = null;
/* 29 */   private String fax = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Email of the recipient. This is required if fax is not provided. Both fax and email can not be provided")
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
/*    */   @ApiModelProperty("Fax of the recipient. This is required if email is not provided. Both fax and email can not be provided. In case of recipient set having more than one member, fax is not allowed")
/*    */   @JsonProperty("fax")
/*    */   public String getFax() {
/* 51 */     return this.fax;
/*    */   }
/*    */   public void setFax(String fax) {
/* 54 */     this.fax = fax;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     StringBuilder sb = new StringBuilder();
/* 62 */     sb.append("class RecipientInfo {\n");
/*    */     
/* 64 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 65 */     sb.append("    fax: ").append(StringUtil.toIndentedString(this.fax)).append("\n");
/* 66 */     sb.append("}");
/* 67 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\RecipientInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */