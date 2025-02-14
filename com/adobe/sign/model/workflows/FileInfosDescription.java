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
/*    */ public class FileInfosDescription
/*    */ {
/* 30 */   private String label = null;
/* 31 */   private String name = null;
/* 32 */   private Boolean required = null;
/* 33 */   private List<WorkflowLibraryDocument> workflowLibraryDocumentSelectorList = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Display label of this field for the external users")
/*    */   @JsonProperty("label")
/*    */   public String getLabel() {
/* 42 */     return this.label;
/*    */   }
/*    */   public void setLabel(String label) {
/* 45 */     this.label = label;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Name of the fileInfo element")
/*    */   @JsonProperty("name")
/*    */   public String getName() {
/* 55 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 58 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Whether this field is required or optional")
/*    */   @JsonProperty("required")
/*    */   public Boolean getRequired() {
/* 68 */     return this.required;
/*    */   }
/*    */   public void setRequired(Boolean required) {
/* 71 */     this.required = required;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A list of workflow library documents out of which one workflow library document can be selected with this fileInfo object")
/*    */   @JsonProperty("workflowLibraryDocumentSelectorList")
/*    */   public List<WorkflowLibraryDocument> getWorkflowLibraryDocumentSelectorList() {
/* 81 */     return this.workflowLibraryDocumentSelectorList;
/*    */   }
/*    */   public void setWorkflowLibraryDocumentSelectorList(List<WorkflowLibraryDocument> workflowLibraryDocumentSelectorList) {
/* 84 */     this.workflowLibraryDocumentSelectorList = workflowLibraryDocumentSelectorList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 91 */     StringBuilder sb = new StringBuilder();
/* 92 */     sb.append("class FileInfosDescription {\n");
/*    */     
/* 94 */     sb.append("    label: ").append(StringUtil.toIndentedString(this.label)).append("\n");
/* 95 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 96 */     sb.append("    required: ").append(StringUtil.toIndentedString(this.required)).append("\n");
/* 97 */     sb.append("    workflowLibraryDocumentSelectorList: ").append(StringUtil.toIndentedString(this.workflowLibraryDocumentSelectorList)).append("\n");
/* 98 */     sb.append("}");
/* 99 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\FileInfosDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */