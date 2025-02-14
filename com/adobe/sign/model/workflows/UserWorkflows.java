/*    */ package com.adobe.sign.model.workflows;
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
/*    */ public class UserWorkflows
/*    */ {
/* 30 */   private List<UserWorkflow> userWorkflowList = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An array of workflows")
/*    */   @JsonProperty("userWorkflowList")
/*    */   public List<UserWorkflow> getUserWorkflowList() {
/* 39 */     return this.userWorkflowList;
/*    */   }
/*    */   public void setUserWorkflowList(List<UserWorkflow> userWorkflowList) {
/* 42 */     this.userWorkflowList = userWorkflowList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class UserWorkflows {\n");
/*    */     
/* 52 */     sb.append("    userWorkflowList: ").append(StringUtil.toIndentedString(this.userWorkflowList)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\UserWorkflows.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */