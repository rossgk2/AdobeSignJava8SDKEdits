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
/*    */ 
/*    */ @ApiModel(description = "")
/*    */ public class RecipientsInfo
/*    */ {
/* 30 */   private String name = null;
/* 31 */   private List<RecipientInfo> recipients = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Name of the recipient list as returned in workflow description")
/*    */   @JsonProperty("name")
/*    */   public String getName() {
/* 40 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 43 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A list of one or more recipients. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document. This limit includes the sender if the signature of the sender is also required")
/*    */   @JsonProperty("recipients")
/*    */   public List<RecipientInfo> getRecipients() {
/* 53 */     return this.recipients;
/*    */   }
/*    */   public void setRecipients(List<RecipientInfo> recipients) {
/* 56 */     this.recipients = recipients;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     StringBuilder sb = new StringBuilder();
/* 64 */     sb.append("class RecipientsInfo {\n");
/*    */     
/* 66 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 67 */     sb.append("    recipients: ").append(StringUtil.toIndentedString(this.recipients)).append("\n");
/* 68 */     sb.append("}");
/* 69 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\RecipientsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */