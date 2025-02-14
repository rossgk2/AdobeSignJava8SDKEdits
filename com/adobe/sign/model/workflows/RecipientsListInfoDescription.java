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
/*     */ @ApiModel(description = "")
/*     */ public class RecipientsListInfoDescription
/*     */ {
/*     */   private Boolean allowfax;
/*     */   private Boolean allowSender;
/*     */   private AuthenticationMethodEnum authenticationMethod;
/*     */   private String defaultValue;
/*     */   private Boolean editable;
/*     */   
/*     */   public RecipientsListInfoDescription() {
/*  28 */     this.allowfax = null;
/*  29 */     this.allowSender = null;
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
/*     */     
/*  49 */     this.authenticationMethod = null;
/*  50 */     this.defaultValue = null;
/*  51 */     this.editable = null;
/*  52 */     this.label = null;
/*  53 */     this.maxListCount = null;
/*  54 */     this.minListCount = null;
/*  55 */     this.name = null;
/*  56 */     this.visible = null;
/*     */   }
/*     */   private String label; private Integer maxListCount; private Integer minListCount; private String name; private Boolean visible; public enum AuthenticationMethodEnum {
/*     */     NONE("NONE"),
/*     */     KBA("KBA"),
/*     */     PASSWORD("PASSWORD"),
/*     */     WEB_IDENTITY("WEB_IDENTITY"); private String value; AuthenticationMethodEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty(required = true, value = "whether fax is allowed or not")
/*     */   @JsonProperty("allowfax")
/*     */   public Boolean getAllowfax() {
/*  65 */     return this.allowfax;
/*     */   }
/*     */   public void setAllowfax(Boolean allowfax) {
/*  68 */     this.allowfax = allowfax;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "whether sender is allowed as a recipient")
/*     */   @JsonProperty("allowSender")
/*     */   public Boolean getAllowSender() {
/*  78 */     return this.allowSender;
/*     */   }
/*     */   public void setAllowSender(Boolean allowSender) {
/*  81 */     this.allowSender = allowSender;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "authentication method for the current recipient list to have access to view and sign the document")
/*     */   @JsonProperty("authenticationMethod")
/*     */   public AuthenticationMethodEnum getAuthenticationMethod() {
/*  91 */     return this.authenticationMethod;
/*     */   }
/*     */   public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
/*  94 */     this.authenticationMethod = authenticationMethod;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A default email or fax number")
/*     */   @JsonProperty("defaultValue")
/*     */   public String getDefaultValue() {
/* 104 */     return this.defaultValue;
/*     */   }
/*     */   public void setDefaultValue(String defaultValue) {
/* 107 */     this.defaultValue = defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation")
/*     */   @JsonProperty("editable")
/*     */   public Boolean getEditable() {
/* 117 */     return this.editable;
/*     */   }
/*     */   public void setEditable(Boolean editable) {
/* 120 */     this.editable = editable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A display text for the workflow user that can be used for the current recipients list")
/*     */   @JsonProperty("label")
/*     */   public String getLabel() {
/* 130 */     return this.label;
/*     */   }
/*     */   public void setLabel(String label) {
/* 133 */     this.label = label;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "maximum number of entries allowed in the current recipient list")
/*     */   @JsonProperty("maxListCount")
/*     */   public Integer getMaxListCount() {
/* 143 */     return this.maxListCount;
/*     */   }
/*     */   public void setMaxListCount(Integer maxListCount) {
/* 146 */     this.maxListCount = maxListCount;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "minimum number of entries allowed in the current recipient list")
/*     */   @JsonProperty("minListCount")
/*     */   public Integer getMinListCount() {
/* 156 */     return this.minListCount;
/*     */   }
/*     */   public void setMinListCount(Integer minListCount) {
/* 159 */     this.minListCount = minListCount;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Name of the current RecipientInfo list")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 169 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 172 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether current field is visible. If visible attribute for this field is false then this field should not be shown in the agreement creation UI using this workflow to user")
/*     */   @JsonProperty("visible")
/*     */   public Boolean getVisible() {
/* 182 */     return this.visible;
/*     */   }
/*     */   public void setVisible(Boolean visible) {
/* 185 */     this.visible = visible;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 192 */     StringBuilder sb = new StringBuilder();
/* 193 */     sb.append("class RecipientsListInfoDescription {\n");
/*     */     
/* 195 */     sb.append("    allowfax: ").append(StringUtil.toIndentedString(this.allowfax)).append("\n");
/* 196 */     sb.append("    allowSender: ").append(StringUtil.toIndentedString(this.allowSender)).append("\n");
/* 197 */     sb.append("    authenticationMethod: ").append(StringUtil.toIndentedString(this.authenticationMethod)).append("\n");
/* 198 */     sb.append("    defaultValue: ").append(StringUtil.toIndentedString(this.defaultValue)).append("\n");
/* 199 */     sb.append("    editable: ").append(StringUtil.toIndentedString(this.editable)).append("\n");
/* 200 */     sb.append("    label: ").append(StringUtil.toIndentedString(this.label)).append("\n");
/* 201 */     sb.append("    maxListCount: ").append(StringUtil.toIndentedString(this.maxListCount)).append("\n");
/* 202 */     sb.append("    minListCount: ").append(StringUtil.toIndentedString(this.minListCount)).append("\n");
/* 203 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 204 */     sb.append("    visible: ").append(StringUtil.toIndentedString(this.visible)).append("\n");
/* 205 */     sb.append("}");
/* 206 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\RecipientsListInfoDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */