/*    */ package com.adobe.sign.model.workflows;
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
/*    */ @ApiModel(description = "")
/*    */ public class CcsInfo
/*    */ {
/* 29 */   private List<String> emails = new ArrayList<>();
/* 30 */   private String name = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file")
/*    */   @JsonProperty("emails")
/*    */   public List<String> getEmails() {
/* 39 */     return this.emails;
/*    */   }
/*    */   public void setEmails(List<String> emails) {
/* 42 */     this.emails = emails;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Name of the CC list as returned in workflow description")
/*    */   @JsonProperty("name")
/*    */   public String getName() {
/* 52 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 55 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 62 */     StringBuilder sb = new StringBuilder();
/* 63 */     sb.append("class CcsInfo {\n");
/*    */     
/* 65 */     sb.append("    emails: ").append(StringUtil.toIndentedString(this.emails)).append("\n");
/* 66 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 67 */     sb.append("}");
/* 68 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\CcsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */