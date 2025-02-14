/*    */ package com.adobe.sign.model.agreements;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;

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
/* 30 */   private String email = null;
/* 31 */   private String fax = null;
/* 32 */   private List<RecipientSecurityOption> securityOptions = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Email of the recipient. This is required if fax is not provided. Both fax and email can not be provided")
/*    */   @JsonProperty("email")
/*    */   public String getEmail() {
/* 41 */     return this.email;
/*    */   }
/*    */   public void setEmail(String email) {
/* 44 */     this.email = email;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Fax of the recipient. This is required if email is not provided. Both fax and email can not be provided. In case of recipient set having more than one member, fax is not allowed")
/*    */   @JsonProperty("fax")
/*    */   public String getFax() {
/* 54 */     return this.fax;
/*    */   }
/*    */   public void setFax(String fax) {
/* 57 */     this.fax = fax;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Security options that apply to the recipient")
/*    */   @JsonProperty("securityOptions")
/*    */   public List<RecipientSecurityOption> getSecurityOptions() {
/* 67 */     return this.securityOptions;
/*    */   }
/*    */   public void setSecurityOptions(List<RecipientSecurityOption> securityOptions) {
/* 70 */     this.securityOptions = securityOptions;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 77 */     StringBuilder sb = new StringBuilder();
/* 78 */     sb.append("class RecipientInfo {\n");
/*    */     
/* 80 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 81 */     sb.append("    fax: ").append(StringUtil.toIndentedString(this.fax)).append("\n");
/* 82 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 83 */     sb.append("}");
/* 84 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\RecipientInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */