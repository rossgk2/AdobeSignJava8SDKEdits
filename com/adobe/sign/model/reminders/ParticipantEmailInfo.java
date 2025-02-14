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
/*    */ public class ParticipantEmailInfo
/*    */ {
/* 28 */   private String participantEmail = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The email address of the user to whom the reminder was sent. This may either be the sender or the recipient of the document depending on the selected workflow, and on whose turn it was to sign. In the current release, the reminder is sent to that user that is currently expected to sign a given document")
/*    */   @JsonProperty("participantEmail")
/*    */   public String getParticipantEmail() {
/* 37 */     return this.participantEmail;
/*    */   }
/*    */   public void setParticipantEmail(String participantEmail) {
/* 40 */     this.participantEmail = participantEmail;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 47 */     StringBuilder sb = new StringBuilder();
/* 48 */     sb.append("class ParticipantEmailInfo {\n");
/*    */     
/* 50 */     sb.append("    participantEmail: ").append(StringUtil.toIndentedString(this.participantEmail)).append("\n");
/* 51 */     sb.append("}");
/* 52 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\reminders\ParticipantEmailInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */