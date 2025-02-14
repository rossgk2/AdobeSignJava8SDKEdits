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
/*    */ public class GroupInfo
/*    */ {
/* 28 */   private String groupId = null;
/* 29 */   private String groupName = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Unique identifier of the group")
/*    */   @JsonProperty("groupId")
/*    */   public String getGroupId() {
/* 38 */     return this.groupId;
/*    */   }
/*    */   public void setGroupId(String groupId) {
/* 41 */     this.groupId = groupId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Name of the group")
/*    */   @JsonProperty("groupName")
/*    */   public String getGroupName() {
/* 51 */     return this.groupName;
/*    */   }
/*    */   public void setGroupName(String groupName) {
/* 54 */     this.groupName = groupName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     StringBuilder sb = new StringBuilder();
/* 62 */     sb.append("class GroupInfo {\n");
/*    */     
/* 64 */     sb.append("    groupId: ").append(StringUtil.toIndentedString(this.groupId)).append("\n");
/* 65 */     sb.append("    groupName: ").append(StringUtil.toIndentedString(this.groupName)).append("\n");
/* 66 */     sb.append("}");
/* 67 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\groups\GroupInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */