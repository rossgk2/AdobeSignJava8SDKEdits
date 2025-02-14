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
/*    */ public class NextParticipantSetInfo
/*    */ {
/* 30 */   private List<NextParticipantInfo> nextParticipantSetMemberInfos = new ArrayList<>();
/* 31 */   private String nextParticipantSetName = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Information about the members of the next participant set")
/*    */   @JsonProperty("nextParticipantSetMemberInfos")
/*    */   public List<NextParticipantInfo> getNextParticipantSetMemberInfos() {
/* 40 */     return this.nextParticipantSetMemberInfos;
/*    */   }
/*    */   public void setNextParticipantSetMemberInfos(List<NextParticipantInfo> nextParticipantSetMemberInfos) {
/* 43 */     this.nextParticipantSetMemberInfos = nextParticipantSetMemberInfos;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The name of the next participant set. Returned only, if the API caller is the sender of agreement.")
/*    */   @JsonProperty("nextParticipantSetName")
/*    */   public String getNextParticipantSetName() {
/* 53 */     return this.nextParticipantSetName;
/*    */   }
/*    */   public void setNextParticipantSetName(String nextParticipantSetName) {
/* 56 */     this.nextParticipantSetName = nextParticipantSetName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     StringBuilder sb = new StringBuilder();
/* 64 */     sb.append("class NextParticipantSetInfo {\n");
/*    */     
/* 66 */     sb.append("    nextParticipantSetMemberInfos: ").append(StringUtil.toIndentedString(this.nextParticipantSetMemberInfos)).append("\n");
/* 67 */     sb.append("    nextParticipantSetName: ").append(StringUtil.toIndentedString(this.nextParticipantSetName)).append("\n");
/* 68 */     sb.append("}");
/* 69 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\NextParticipantSetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */