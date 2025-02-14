/*    */ package com.adobe.sign.model.groups;
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
/*    */ public class GroupsInfo
/*    */ {
/* 30 */   private List<GroupInfo> groupInfoList = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The list of groups in the account.")
/*    */   @JsonProperty("groupInfoList")
/*    */   public List<GroupInfo> getGroupInfoList() {
/* 39 */     return this.groupInfoList;
/*    */   }
/*    */   public void setGroupInfoList(List<GroupInfo> groupInfoList) {
/* 42 */     this.groupInfoList = groupInfoList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class GroupsInfo {\n");
/*    */     
/* 52 */     sb.append("    groupInfoList: ").append(StringUtil.toIndentedString(this.groupInfoList)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\groups\GroupsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */