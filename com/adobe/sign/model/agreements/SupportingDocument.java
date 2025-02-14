/*     */ package com.adobe.sign.model.agreements;
/*     */ 
/*     */ import com.adobe.sign.utils.StringUtil;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;

/*     */ import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class SupportingDocument
/*     */ {
/*  28 */   private String displayLabel = null;
/*  29 */   private String fieldName = null;
/*  30 */   private String mimeType = null;
/*  31 */   private Integer numPages = null;
/*  32 */   private String supportingDocumentId = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Display name of the document")
/*     */   @JsonProperty("displayLabel")
/*     */   public String getDisplayLabel() {
/*  41 */     return this.displayLabel;
/*     */   }
/*     */   public void setDisplayLabel(String displayLabel) {
/*  44 */     this.displayLabel = displayLabel;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the supporting document field")
/*     */   @JsonProperty("fieldName")
/*     */   public String getFieldName() {
/*  54 */     return this.fieldName;
/*     */   }
/*     */   public void setFieldName(String fieldName) {
/*  57 */     this.fieldName = fieldName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Mime-type of the document")
/*     */   @JsonProperty("mimeType")
/*     */   public String getMimeType() {
/*  67 */     return this.mimeType;
/*     */   }
/*     */   public void setMimeType(String mimeType) {
/*  70 */     this.mimeType = mimeType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Number of pages in the document")
/*     */   @JsonProperty("numPages")
/*     */   public Integer getNumPages() {
/*  80 */     return this.numPages;
/*     */   }
/*     */   public void setNumPages(Integer numPages) {
/*  83 */     this.numPages = numPages;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Id representing the document")
/*     */   @JsonProperty("supportingDocumentId")
/*     */   public String getSupportingDocumentId() {
/*  93 */     return this.supportingDocumentId;
/*     */   }
/*     */   public void setSupportingDocumentId(String supportingDocumentId) {
/*  96 */     this.supportingDocumentId = supportingDocumentId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 103 */     StringBuilder sb = new StringBuilder();
/* 104 */     sb.append("class SupportingDocument {\n");
/*     */     
/* 106 */     sb.append("    displayLabel: ").append(StringUtil.toIndentedString(this.displayLabel)).append("\n");
/* 107 */     sb.append("    fieldName: ").append(StringUtil.toIndentedString(this.fieldName)).append("\n");
/* 108 */     sb.append("    mimeType: ").append(StringUtil.toIndentedString(this.mimeType)).append("\n");
/* 109 */     sb.append("    numPages: ").append(StringUtil.toIndentedString(this.numPages)).append("\n");
/* 110 */     sb.append("    supportingDocumentId: ").append(StringUtil.toIndentedString(this.supportingDocumentId)).append("\n");
/* 111 */     sb.append("}");
/* 112 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\SupportingDocument.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */