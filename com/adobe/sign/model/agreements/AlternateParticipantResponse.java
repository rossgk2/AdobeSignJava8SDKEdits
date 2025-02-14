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
/*    */ 
/*    */ 
/*    */ 
/*    */ @ApiModel(description = "A JSON that contains the id of the newly created alternate participant")
/*    */ public class AlternateParticipantResponse
/*    */ {
/* 31 */   private String participantId = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The unique identifier of the alternate participant")
/*    */   @JsonProperty("participantId")
/*    */   public String getParticipantId() {
/* 40 */     return this.participantId;
/*    */   }
/*    */   public void setParticipantId(String participantId) {
/* 43 */     this.participantId = participantId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 50 */     StringBuilder sb = new StringBuilder();
/* 51 */     sb.append("class AlternateParticipantResponse {\n");
/*    */     
/* 53 */     sb.append("    participantId: ").append(StringUtil.toIndentedString(this.participantId)).append("\n");
/* 54 */     sb.append("}");
/* 55 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\AlternateParticipantResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */