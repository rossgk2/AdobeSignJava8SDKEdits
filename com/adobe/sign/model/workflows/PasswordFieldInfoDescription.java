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
/*     */ public class PasswordFieldInfoDescription
/*     */ {
/*  28 */   private String defaultValue = null;
/*  29 */   private String label = null;
/*  30 */   private String name = null;
/*  31 */   private Boolean required = null;
/*  32 */   private Boolean visible = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Default value of the password info field")
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
/*     */   @ApiModelProperty(required = true, value = "Label of password field")
/*     */   @JsonProperty("label")
/*     */   public String getLabel() {
/*  54 */     return this.label;
/*     */   }
/*     */   public void setLabel(String label) {
/*  57 */     this.label = label;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Name of password field")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/*  67 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/*  70 */     this.name = name;
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
/*     */   @ApiModelProperty(required = true, value = "Whether password info field is visible on agreement creation page")
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
/* 104 */     sb.append("class PasswordFieldInfoDescription {\n");
/*     */     
/* 106 */     sb.append("    defaultValue: ").append(StringUtil.toIndentedString(this.defaultValue)).append("\n");
/* 107 */     sb.append("    label: ").append(StringUtil.toIndentedString(this.label)).append("\n");
/* 108 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 109 */     sb.append("    required: ").append(StringUtil.toIndentedString(this.required)).append("\n");
/* 110 */     sb.append("    visible: ").append(StringUtil.toIndentedString(this.visible)).append("\n");
/* 111 */     sb.append("}");
/* 112 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\PasswordFieldInfoDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */