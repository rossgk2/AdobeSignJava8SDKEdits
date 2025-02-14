/*    */ package com.adobe.sign.model.workflows;
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
/*    */ public class WorkflowLibraryDocument
/*    */ {
/* 28 */   private String label = null;
/* 29 */   private String workflowLibDoc = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A display text for this form for workflow users")
/*    */   @JsonProperty("label")
/*    */   public String getLabel() {
/* 38 */     return this.label;
/*    */   }
/*    */   public void setLabel(String label) {
/* 41 */     this.label = label;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An id of the workflow library document that can be provided as an input file in the custom workflow agreement creation request")
/*    */   @JsonProperty("workflowLibDoc")
/*    */   public String getWorkflowLibDoc() {
/* 51 */     return this.workflowLibDoc;
/*    */   }
/*    */   public void setWorkflowLibDoc(String workflowLibDoc) {
/* 54 */     this.workflowLibDoc = workflowLibDoc;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     StringBuilder sb = new StringBuilder();
/* 62 */     sb.append("class WorkflowLibraryDocument {\n");
/*    */     
/* 64 */     sb.append("    label: ").append(StringUtil.toIndentedString(this.label)).append("\n");
/* 65 */     sb.append("    workflowLibDoc: ").append(StringUtil.toIndentedString(this.workflowLibDoc)).append("\n");
/* 66 */     sb.append("}");
/* 67 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\WorkflowLibraryDocument.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */