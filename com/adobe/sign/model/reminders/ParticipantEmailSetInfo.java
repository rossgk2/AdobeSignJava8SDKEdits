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
/*    */ public class ParticipantEmailSetInfo
/*    */ {
/* 30 */   private List<ParticipantEmailInfo> participantEmailSetInfo = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The info about the members of the participant set")
/*    */   @JsonProperty("participantEmailSetInfo")
/*    */   public List<ParticipantEmailInfo> getParticipantEmailSetInfo() {
/* 39 */     return this.participantEmailSetInfo;
/*    */   }
/*    */   public void setParticipantEmailSetInfo(List<ParticipantEmailInfo> participantEmailSetInfo) {
/* 42 */     this.participantEmailSetInfo = participantEmailSetInfo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class ParticipantEmailSetInfo {\n");
/*    */     
/* 52 */     sb.append("    participantEmailSetInfo: ").append(StringUtil.toIndentedString(this.participantEmailSetInfo)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\reminders\ParticipantEmailSetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */