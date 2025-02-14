/*    */ package com.adobe.sign.model.widgets;
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
/*    */ public class WidgetOriginalDocument
/*    */ {
/* 28 */   private String documentId = null;
/* 29 */   private String mimeType = null;
/* 30 */   private String name = null;
/* 31 */   private Integer numPages = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Id of the document")
/*    */   @JsonProperty("documentId")
/*    */   public String getDocumentId() {
/* 40 */     return this.documentId;
/*    */   }
/*    */   public void setDocumentId(String documentId) {
/* 43 */     this.documentId = documentId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Mime-type of the document")
/*    */   @JsonProperty("mimeType")
/*    */   public String getMimeType() {
/* 53 */     return this.mimeType;
/*    */   }
/*    */   public void setMimeType(String mimeType) {
/* 56 */     this.mimeType = mimeType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Name of the document")
/*    */   @JsonProperty("name")
/*    */   public String getName() {
/* 66 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 69 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Number of pages in the document")
/*    */   @JsonProperty("numPages")
/*    */   public Integer getNumPages() {
/* 79 */     return this.numPages;
/*    */   }
/*    */   public void setNumPages(Integer numPages) {
/* 82 */     this.numPages = numPages;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 89 */     StringBuilder sb = new StringBuilder();
/* 90 */     sb.append("class WidgetOriginalDocument {\n");
/*    */     
/* 92 */     sb.append("    documentId: ").append(StringUtil.toIndentedString(this.documentId)).append("\n");
/* 93 */     sb.append("    mimeType: ").append(StringUtil.toIndentedString(this.mimeType)).append("\n");
/* 94 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 95 */     sb.append("    numPages: ").append(StringUtil.toIndentedString(this.numPages)).append("\n");
/* 96 */     sb.append("}");
/* 97 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetOriginalDocument.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */