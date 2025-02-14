/*    */ package com.adobe.sign.model.reminders;
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
/*    */ public class ReminderCreationResult
/*    */ {
/* 30 */   private List<ParticipantEmailSetInfo> participantEmailsSet = new ArrayList<>();
/* 31 */   private String result = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The info of the party (participant sets) that was reminded.")
/*    */   @JsonProperty("participantEmailsSet")
/*    */   public List<ParticipantEmailSetInfo> getParticipantEmailsSet() {
/* 40 */     return this.participantEmailsSet;
/*    */   }
/*    */   public void setParticipantEmailsSet(List<ParticipantEmailSetInfo> participantEmailsSet) {
/* 43 */     this.participantEmailsSet = participantEmailsSet;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A status value indicating the result of the operation")
/*    */   @JsonProperty("result")
/*    */   public String getResult() {
/* 53 */     return this.result;
/*    */   }
/*    */   public void setResult(String result) {
/* 56 */     this.result = result;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     StringBuilder sb = new StringBuilder();
/* 64 */     sb.append("class ReminderCreationResult {\n");
/*    */     
/* 66 */     sb.append("    participantEmailsSet: ").append(StringUtil.toIndentedString(this.participantEmailsSet)).append("\n");
/* 67 */     sb.append("    result: ").append(StringUtil.toIndentedString(this.result)).append("\n");
/* 68 */     sb.append("}");
/* 69 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\reminders\ReminderCreationResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */