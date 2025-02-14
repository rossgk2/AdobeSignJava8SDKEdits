/*    */ package com.adobe.sign.model.reminders;
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
/*    */ public class ReminderCreationInfo
/*    */ {
/* 28 */   private String agreementId = null;
/* 29 */   private String comment = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The agreement identifier")
/*    */   @JsonProperty("agreementId")
/*    */   public String getAgreementId() {
/* 38 */     return this.agreementId;
/*    */   }
/*    */   public void setAgreementId(String agreementId) {
/* 41 */     this.agreementId = agreementId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("An optional message sent to the recipients, describing what is being sent and why their signatures are required.")
/*    */   @JsonProperty("comment")
/*    */   public String getComment() {
/* 51 */     return this.comment;
/*    */   }
/*    */   public void setComment(String comment) {
/* 54 */     this.comment = comment;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     StringBuilder sb = new StringBuilder();
/* 62 */     sb.append("class ReminderCreationInfo {\n");
/*    */     
/* 64 */     sb.append("    agreementId: ").append(StringUtil.toIndentedString(this.agreementId)).append("\n");
/* 65 */     sb.append("    comment: ").append(StringUtil.toIndentedString(this.comment)).append("\n");
/* 66 */     sb.append("}");
/* 67 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\reminders\ReminderCreationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */