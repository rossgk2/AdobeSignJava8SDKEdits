/*     */ package com.adobe.sign.model.workflows;
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
/*     */ public class MergeFieldInfoDescription
/*     */ {
/*  28 */   private String defaultValue = null;
/*  29 */   private String displayName = null;
/*  30 */   private Boolean editable = null;
/*  31 */   private String fieldName = null;
/*  32 */   private Boolean visible = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "default value of the field if input for this field is not provided and this field is required")
/*     */   @JsonProperty("defaultValue")
/*     */   public String getDefaultValue() {
/*  41 */     return this.defaultValue;
/*     */   }
/*     */   public void setDefaultValue(String defaultValue) {
/*  44 */     this.defaultValue = defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The display text that can be shown for this custom field")
/*     */   @JsonProperty("displayName")
/*     */   public String getDisplayName() {
/*  54 */     return this.displayName;
/*     */   }
/*     */   public void setDisplayName(String displayName) {
/*  57 */     this.displayName = displayName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation")
/*     */   @JsonProperty("editable")
/*     */   public Boolean getEditable() {
/*  67 */     return this.editable;
/*     */   }
/*     */   public void setEditable(Boolean editable) {
/*  70 */     this.editable = editable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Name of the custom field in this workflow")
/*     */   @JsonProperty("fieldName")
/*     */   public String getFieldName() {
/*  80 */     return this.fieldName;
/*     */   }
/*     */   public void setFieldName(String fieldName) {
/*  83 */     this.fieldName = fieldName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether current field should be visible on agreement creation page. If visible attribute for this field is false then this field should not be shown on the agreement creation page using this workflow")
/*     */   @JsonProperty("visible")
/*     */   public Boolean getVisible() {
/*  93 */     return this.visible;
/*     */   }
/*     */   public void setVisible(Boolean visible) {
/*  96 */     this.visible = visible;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 103 */     StringBuilder sb = new StringBuilder();
/* 104 */     sb.append("class MergeFieldInfoDescription {\n");
/*     */     
/* 106 */     sb.append("    defaultValue: ").append(StringUtil.toIndentedString(this.defaultValue)).append("\n");
/* 107 */     sb.append("    displayName: ").append(StringUtil.toIndentedString(this.displayName)).append("\n");
/* 108 */     sb.append("    editable: ").append(StringUtil.toIndentedString(this.editable)).append("\n");
/* 109 */     sb.append("    fieldName: ").append(StringUtil.toIndentedString(this.fieldName)).append("\n");
/* 110 */     sb.append("    visible: ").append(StringUtil.toIndentedString(this.visible)).append("\n");
/* 111 */     sb.append("}");
/* 112 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\MergeFieldInfoDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */