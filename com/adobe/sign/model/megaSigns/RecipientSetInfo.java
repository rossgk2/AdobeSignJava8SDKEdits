/*    */ package com.adobe.sign.model.megaSigns;
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
/*    */ public class RecipientSetInfo
/*    */ {
/* 30 */   private List<RecipientInfo> recipientSetMemberInfos = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Information about the members of the recipient set")
/*    */   @JsonProperty("recipientSetMemberInfos")
/*    */   public List<RecipientInfo> getRecipientSetMemberInfos() {
/* 39 */     return this.recipientSetMemberInfos;
/*    */   }
/*    */   public void setRecipientSetMemberInfos(List<RecipientInfo> recipientSetMemberInfos) {
/* 42 */     this.recipientSetMemberInfos = recipientSetMemberInfos;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class RecipientSetInfo {\n");
/*    */     
/* 52 */     sb.append("    recipientSetMemberInfos: ").append(StringUtil.toIndentedString(this.recipientSetMemberInfos)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\RecipientSetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */