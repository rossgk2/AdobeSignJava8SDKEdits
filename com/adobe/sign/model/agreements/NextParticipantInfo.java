/*    */ package com.adobe.sign.model.agreements;
/*    */ import java.util.Date;

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
/*    */ public class NextParticipantInfo
/*    */ {
/* 29 */   private String email = null;
/* 30 */   private String name = null;
/* 31 */   private Date waitingSince = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The email address of the next participant")
/*    */   @JsonProperty("email")
/*    */   public String getEmail() {
/* 40 */     return this.email;
/*    */   }
/*    */   public void setEmail(String email) {
/* 43 */     this.email = email;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The name of the next participant, if available")
/*    */   @JsonProperty("name")
/*    */   public String getName() {
/* 53 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 56 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The date since which the document has been waiting for the participant to take action")
/*    */   @JsonProperty("waitingSince")
/*    */   public Date getWaitingSince() {
/* 66 */     return this.waitingSince;
/*    */   }
/*    */   public void setWaitingSince(Date waitingSince) {
/* 69 */     this.waitingSince = waitingSince;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 76 */     StringBuilder sb = new StringBuilder();
/* 77 */     sb.append("class NextParticipantInfo {\n");
/*    */     
/* 79 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 80 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 81 */     sb.append("    waitingSince: ").append(StringUtil.toIndentedString(this.waitingSince)).append("\n");
/* 82 */     sb.append("}");
/* 83 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\NextParticipantInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */