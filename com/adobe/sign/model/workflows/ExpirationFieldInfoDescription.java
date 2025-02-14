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
/*     */ public class ExpirationFieldInfoDescription
/*     */ {
/*  28 */   private String defaultValue = null;
/*  29 */   private Boolean editable = null;
/*  30 */   private Integer maxDays = null;
/*  31 */   private Boolean required = null;
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
/*     */   @ApiModelProperty(required = true, value = "Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation")
/*     */   @JsonProperty("editable")
/*     */   public Boolean getEditable() {
/*  54 */     return this.editable;
/*     */   }
/*     */   public void setEditable(Boolean editable) {
/*  57 */     this.editable = editable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Maximum number of days for agreement expiration")
/*     */   @JsonProperty("maxDays")
/*     */   public Integer getMaxDays() {
/*  67 */     return this.maxDays;
/*     */   }
/*     */   public void setMaxDays(Integer maxDays) {
/*  70 */     this.maxDays = maxDays;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether this field is required or optional")
/*     */   @JsonProperty("required")
/*     */   public Boolean getRequired() {
/*  80 */     return this.required;
/*     */   }
/*     */   public void setRequired(Boolean required) {
/*  83 */     this.required = required;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether current field is visible or not. If visible attribute for this field is false then this field should not be visible in the agreement creation UI using this workflow to user")
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
/* 104 */     sb.append("class ExpirationFieldInfoDescription {\n");
/*     */     
/* 106 */     sb.append("    defaultValue: ").append(StringUtil.toIndentedString(this.defaultValue)).append("\n");
/* 107 */     sb.append("    editable: ").append(StringUtil.toIndentedString(this.editable)).append("\n");
/* 108 */     sb.append("    maxDays: ").append(StringUtil.toIndentedString(this.maxDays)).append("\n");
/* 109 */     sb.append("    required: ").append(StringUtil.toIndentedString(this.required)).append("\n");
/* 110 */     sb.append("    visible: ").append(StringUtil.toIndentedString(this.visible)).append("\n");
/* 111 */     sb.append("}");
/* 112 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\ExpirationFieldInfoDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */