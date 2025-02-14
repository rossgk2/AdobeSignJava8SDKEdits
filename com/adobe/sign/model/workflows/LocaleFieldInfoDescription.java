/*     */ package com.adobe.sign.model.workflows;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;

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
/*     */ @ApiModel(description = "")
/*     */ public class LocaleFieldInfoDescription
/*     */ {
/*  29 */   private List<String> availableLocales = new ArrayList<>();
/*  30 */   private String defaultValue = null;
/*  31 */   private Boolean editable = null;
/*  32 */   private Boolean required = null;
/*  33 */   private Boolean visible = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Which locales can be chosen for this workflow")
/*     */   @JsonProperty("availableLocales")
/*     */   public List<String> getAvailableLocales() {
/*  42 */     return this.availableLocales;
/*     */   }
/*     */   public void setAvailableLocales(List<String> availableLocales) {
/*  45 */     this.availableLocales = availableLocales;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "default value of the field if input for this field is not provided and this field is required")
/*     */   @JsonProperty("defaultValue")
/*     */   public String getDefaultValue() {
/*  55 */     return this.defaultValue;
/*     */   }
/*     */   public void setDefaultValue(String defaultValue) {
/*  58 */     this.defaultValue = defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation")
/*     */   @JsonProperty("editable")
/*     */   public Boolean getEditable() {
/*  68 */     return this.editable;
/*     */   }
/*     */   public void setEditable(Boolean editable) {
/*  71 */     this.editable = editable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether this field is required or optional")
/*     */   @JsonProperty("required")
/*     */   public Boolean getRequired() {
/*  81 */     return this.required;
/*     */   }
/*     */   public void setRequired(Boolean required) {
/*  84 */     this.required = required;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether current field is visible or not. If visible attribute for this field is false then this field should not be visible in the agreement creation UI using this workflow to user")
/*     */   @JsonProperty("visible")
/*     */   public Boolean getVisible() {
/*  94 */     return this.visible;
/*     */   }
/*     */   public void setVisible(Boolean visible) {
/*  97 */     this.visible = visible;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 104 */     StringBuilder sb = new StringBuilder();
/* 105 */     sb.append("class LocaleFieldInfoDescription {\n");
/*     */     
/* 107 */     sb.append("    availableLocales: ").append(StringUtil.toIndentedString(this.availableLocales)).append("\n");
/* 108 */     sb.append("    defaultValue: ").append(StringUtil.toIndentedString(this.defaultValue)).append("\n");
/* 109 */     sb.append("    editable: ").append(StringUtil.toIndentedString(this.editable)).append("\n");
/* 110 */     sb.append("    required: ").append(StringUtil.toIndentedString(this.required)).append("\n");
/* 111 */     sb.append("    visible: ").append(StringUtil.toIndentedString(this.visible)).append("\n");
/* 112 */     sb.append("}");
/* 113 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\LocaleFieldInfoDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */