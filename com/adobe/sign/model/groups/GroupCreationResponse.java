/*    */ package com.adobe.sign.model.groups;
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
/*    */ public class GroupCreationResponse
/*    */ {
/* 28 */   private String groupId = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Unique identifier of the group created.")
/*    */   @JsonProperty("groupId")
/*    */   public String getGroupId() {
/* 37 */     return this.groupId;
/*    */   }
/*    */   public void setGroupId(String groupId) {
/* 40 */     this.groupId = groupId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 47 */     StringBuilder sb = new StringBuilder();
/* 48 */     sb.append("class GroupCreationResponse {\n");
/*    */     
/* 50 */     sb.append("    groupId: ").append(StringUtil.toIndentedString(this.groupId)).append("\n");
/* 51 */     sb.append("}");
/* 52 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\groups\GroupCreationResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */