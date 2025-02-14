/*     */ package com.adobe.sign.model.widgets;
/*     */ import java.util.Date;

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
/*     */ @ApiModel(description = "")
/*     */ public class UserWidget
/*     */ {
/*     */   private String javascript;
/*     */   private Date modifiedDate;
/*     */   private String name;
/*     */   
/*     */   public UserWidget() {
/*  29 */     this.javascript = null;
/*  30 */     this.modifiedDate = null;
/*  31 */     this.name = null;
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
/*  51 */     this.status = null;
/*  52 */     this.url = null;
/*  53 */     this.widgetId = null;
/*     */   }
/*     */   private StatusEnum status; private String url; private String widgetId; public enum StatusEnum {
/*     */     ENABLED("ENABLED"),
/*     */     DISABLED("DISABLED"),
/*     */     ABORTED("ABORTED"),
/*     */     OTHER("OTHER"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty(required = true, value = "The embedded javascript code of the widget")
/*     */   @JsonProperty("javascript")
/*     */   public String getJavascript() {
/*  62 */     return this.javascript;
/*     */   }
/*     */   public void setJavascript(String javascript) {
/*  65 */     this.javascript = javascript;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The day on which the widget was last modified")
/*     */   @JsonProperty("modifiedDate")
/*     */   public Date getModifiedDate() {
/*  75 */     return this.modifiedDate;
/*     */   }
/*     */   public void setModifiedDate(Date modifiedDate) {
/*  78 */     this.modifiedDate = modifiedDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the widget.")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/*  88 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/*  91 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The widget status (enabled or disabled or aborted or other)")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 101 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 104 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The hosted url of the widget")
/*     */   @JsonProperty("url")
/*     */   public String getUrl() {
/* 114 */     return this.url;
/*     */   }
/*     */   public void setUrl(String url) {
/* 117 */     this.url = url;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The unique identifier of a widget")
/*     */   @JsonProperty("widgetId")
/*     */   public String getWidgetId() {
/* 127 */     return this.widgetId;
/*     */   }
/*     */   public void setWidgetId(String widgetId) {
/* 130 */     this.widgetId = widgetId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 137 */     StringBuilder sb = new StringBuilder();
/* 138 */     sb.append("class UserWidget {\n");
/*     */     
/* 140 */     sb.append("    javascript: ").append(StringUtil.toIndentedString(this.javascript)).append("\n");
/* 141 */     sb.append("    modifiedDate: ").append(StringUtil.toIndentedString(this.modifiedDate)).append("\n");
/* 142 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 143 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 144 */     sb.append("    url: ").append(StringUtil.toIndentedString(this.url)).append("\n");
/* 145 */     sb.append("    widgetId: ").append(StringUtil.toIndentedString(this.widgetId)).append("\n");
/* 146 */     sb.append("}");
/* 147 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\UserWidget.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */