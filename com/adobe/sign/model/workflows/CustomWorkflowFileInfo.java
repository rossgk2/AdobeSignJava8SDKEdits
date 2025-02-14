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
/*    */ public class CustomWorkflowFileInfo
/*    */ {
/* 28 */   private String name = null;
/* 29 */   private String transientDocumentId = null;
/* 30 */   private String workflowLibraryDocumentId = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Name of file info element")
/*    */   @JsonProperty("name")
/*    */   public String getName() {
/* 39 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 42 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Transient document identifier obtained from the transient document creation API")
/*    */   @JsonProperty("transientDocumentId")
/*    */   public String getTransientDocumentId() {
/* 52 */     return this.transientDocumentId;
/*    */   }
/*    */   public void setTransientDocumentId(String transientDocumentId) {
/* 55 */     this.transientDocumentId = transientDocumentId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An id of the workflow library document that can be provided as an input file in the custom workflow agreement creation request")
/*    */   @JsonProperty("workflowLibraryDocumentId")
/*    */   public String getWorkflowLibraryDocumentId() {
/* 65 */     return this.workflowLibraryDocumentId;
/*    */   }
/*    */   public void setWorkflowLibraryDocumentId(String workflowLibraryDocumentId) {
/* 68 */     this.workflowLibraryDocumentId = workflowLibraryDocumentId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 75 */     StringBuilder sb = new StringBuilder();
/* 76 */     sb.append("class CustomWorkflowFileInfo {\n");
/*    */     
/* 78 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 79 */     sb.append("    transientDocumentId: ").append(StringUtil.toIndentedString(this.transientDocumentId)).append("\n");
/* 80 */     sb.append("    workflowLibraryDocumentId: ").append(StringUtil.toIndentedString(this.workflowLibraryDocumentId)).append("\n");
/* 81 */     sb.append("}");
/* 82 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\CustomWorkflowFileInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */