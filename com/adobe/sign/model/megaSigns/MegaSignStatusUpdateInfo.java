/*    */ package com.adobe.sign.model.megaSigns;
/*    */ 
/*    */ import com.adobe.sign.utils.StringUtil;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;

/*    */ import io.swagger.annotations.ApiModel;
/*    */ import io.swagger.annotations.ApiModelProperty;
/*    */ 
/*    */ @ApiModel(description = "")
/*    */ public class MegaSignStatusUpdateInfo {
/*    */   private String comment;
/*    */   private Boolean notifySigner;
/*    */   private ValueEnum value;
/*    */   
/*    */   public enum ValueEnum {
/*    */     CANCEL("CANCEL");
/*    */     private String value;
/*    */     
/*    */     ValueEnum(String value) {
/*    */       this.value = value;
/*    */     }
/*    */     
/*    */     public String toString() {
/*    */       return this.value;
/*    */     }
/*    */   }
/*    */   
/*    */   public MegaSignStatusUpdateInfo() {
/* 28 */     this.comment = null;
/* 29 */     this.notifySigner = null;
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
/* 46 */     this.value = null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Comment describing to the recipient why you want to cancel the transaction")
/*    */   @JsonProperty("comment")
/*    */   public String getComment() {
/* 55 */     return this.comment;
/*    */   }
/*    */   public void setComment(String comment) {
/* 58 */     this.comment = comment;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Whether or not you would like the recipient to be notified that the transaction has been cancelled. The default value is false")
/*    */   @JsonProperty("notifySigner")
/*    */   public Boolean getNotifySigner() {
/* 68 */     return this.notifySigner;
/*    */   }
/*    */   public void setNotifySigner(Boolean notifySigner) {
/* 71 */     this.notifySigner = notifySigner;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The state to which the megaSign is to be updated. The only valid state for this variable is currently, CANCEL")
/*    */   @JsonProperty("value")
/*    */   public ValueEnum getValue() {
/* 81 */     return this.value;
/*    */   }
/*    */   public void setValue(ValueEnum value) {
/* 84 */     this.value = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 91 */     StringBuilder sb = new StringBuilder();
/* 92 */     sb.append("class MegaSignStatusUpdateInfo {\n");
/*    */     
/* 94 */     sb.append("    comment: ").append(StringUtil.toIndentedString(this.comment)).append("\n");
/* 95 */     sb.append("    notifySigner: ").append(StringUtil.toIndentedString(this.notifySigner)).append("\n");
/* 96 */     sb.append("    value: ").append(StringUtil.toIndentedString(this.value)).append("\n");
/* 97 */     sb.append("}");
/* 98 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\MegaSignStatusUpdateInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */