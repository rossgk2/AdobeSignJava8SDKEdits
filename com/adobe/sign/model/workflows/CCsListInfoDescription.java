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
/*     */ public class CCsListInfoDescription
/*     */ {
/*  28 */   private String defaultValue = null;
/*  29 */   private Boolean editable = null;
/*  30 */   private String label = null;
/*  31 */   private Integer maxListCount = null;
/*  32 */   private Integer minListCount = null;
/*  33 */   private String name = null;
/*  34 */   private Boolean visible = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A default email that will be used if no input is provided for this list element")
/*     */   @JsonProperty("defaultValue")
/*     */   public String getDefaultValue() {
/*  43 */     return this.defaultValue;
/*     */   }
/*     */   public void setDefaultValue(String defaultValue) {
/*  46 */     this.defaultValue = defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation")
/*     */   @JsonProperty("editable")
/*     */   public Boolean getEditable() {
/*  56 */     return this.editable;
/*     */   }
/*     */   public void setEditable(Boolean editable) {
/*  59 */     this.editable = editable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A display text for the workflow user that can be used for the current CC list")
/*     */   @JsonProperty("label")
/*     */   public String getLabel() {
/*  69 */     return this.label;
/*     */   }
/*     */   public void setLabel(String label) {
/*  72 */     this.label = label;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "maximum number of entries allowed in the current CC list")
/*     */   @JsonProperty("maxListCount")
/*     */   public Integer getMaxListCount() {
/*  82 */     return this.maxListCount;
/*     */   }
/*     */   public void setMaxListCount(Integer maxListCount) {
/*  85 */     this.maxListCount = maxListCount;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "minimum number of entries allowed in the current CC list")
/*     */   @JsonProperty("minListCount")
/*     */   public Integer getMinListCount() {
/*  95 */     return this.minListCount;
/*     */   }
/*     */   public void setMinListCount(Integer minListCount) {
/*  98 */     this.minListCount = minListCount;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Name of the current CC list")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 108 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 111 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether current field is visible or not. If visible attribute for this field is false then this field should not be shown in the agreement creation page using this workflow")
/*     */   @JsonProperty("visible")
/*     */   public Boolean getVisible() {
/* 121 */     return this.visible;
/*     */   }
/*     */   public void setVisible(Boolean visible) {
/* 124 */     this.visible = visible;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 131 */     StringBuilder sb = new StringBuilder();
/* 132 */     sb.append("class CCsListInfoDescription {\n");
/*     */     
/* 134 */     sb.append("    defaultValue: ").append(StringUtil.toIndentedString(this.defaultValue)).append("\n");
/* 135 */     sb.append("    editable: ").append(StringUtil.toIndentedString(this.editable)).append("\n");
/* 136 */     sb.append("    label: ").append(StringUtil.toIndentedString(this.label)).append("\n");
/* 137 */     sb.append("    maxListCount: ").append(StringUtil.toIndentedString(this.maxListCount)).append("\n");
/* 138 */     sb.append("    minListCount: ").append(StringUtil.toIndentedString(this.minListCount)).append("\n");
/* 139 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 140 */     sb.append("    visible: ").append(StringUtil.toIndentedString(this.visible)).append("\n");
/* 141 */     sb.append("}");
/* 142 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\CCsListInfoDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */