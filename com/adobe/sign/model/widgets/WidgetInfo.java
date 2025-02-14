/*     */ package com.adobe.sign.model.widgets;

import java.util.ArrayList;
import java.util.List;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class WidgetInfo {
/*     */   private List<WidgetHistoryEvent> events;
/*     */   private String javascript;
/*     */   private String latestVersionId;
/*     */   private String locale;
/*     */   private String message;
/*     */   private String name;
/*     */   private List<WidgetParticipantSetInfo> participantSetInfos;
/*     */   private List<SecurityOptionsEnum> securityOptions;
/*     */   private StatusEnum status;
/*     */   private String url;
/*     */   private String widgetId;
/*     */   
/*     */   public enum SecurityOptionsEnum {
/*     */     OPEN_PROTECTED("OPEN_PROTECTED"),
/*     */     OTHER("OTHER");
/*     */     private String value;
/*     */     
/*     */     SecurityOptionsEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return this.value;
/*     */     }
/*     */   }
/*     */   
/*  31 */   public WidgetInfo() { this.events = new ArrayList<>();
/*  32 */     this.javascript = null;
/*  33 */     this.latestVersionId = null;
/*  34 */     this.locale = null;
/*  35 */     this.message = null;
/*  36 */     this.name = null;
/*  37 */     this.participantSetInfos = new ArrayList<>();
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
/*  55 */     this.securityOptions = new ArrayList<>();
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
/*  75 */     this.status = null;
/*  76 */     this.url = null;
/*  77 */     this.widgetId = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this widget")
/*     */   @JsonProperty("events")
/*     */   public List<WidgetHistoryEvent> getEvents() {
/*  86 */     return this.events;
/*     */   }
/*     */   public enum StatusEnum {
/*  89 */     ENABLED("ENABLED"), DISABLED("DISABLED"), ABORTED("ABORTED"), OTHER("OTHER"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setEvents(List<WidgetHistoryEvent> events) { this.events = events; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The embedded javascript code of the widget")
/*     */   @JsonProperty("javascript")
/*     */   public String getJavascript() {
/*  99 */     return this.javascript;
/*     */   }
/*     */   public void setJavascript(String javascript) {
/* 102 */     this.javascript = javascript;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "An ID which uniquely identifies the current version of the widget")
/*     */   @JsonProperty("latestVersionId")
/*     */   public String getLatestVersionId() {
/* 112 */     return this.latestVersionId;
/*     */   }
/*     */   public void setLatestVersionId(String latestVersionId) {
/* 115 */     this.latestVersionId = latestVersionId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The locale associated with this widget - for example, en_US or fr_FR")
/*     */   @JsonProperty("locale")
/*     */   public String getLocale() {
/* 125 */     return this.locale;
/*     */   }
/*     */   public void setLocale(String locale) {
/* 128 */     this.locale = locale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The message associated with the widget that the sender has provided")
/*     */   @JsonProperty("message")
/*     */   public String getMessage() {
/* 138 */     return this.message;
/*     */   }
/*     */   public void setMessage(String message) {
/* 141 */     this.message = message;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The widget name specified by the sender")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 151 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 154 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about the participant sets of the widget.")
/*     */   @JsonProperty("participantSetInfos")
/*     */   public List<WidgetParticipantSetInfo> getParticipantSetInfos() {
/* 164 */     return this.participantSetInfos;
/*     */   }
/*     */   public void setParticipantSetInfos(List<WidgetParticipantSetInfo> participantSetInfos) {
/* 167 */     this.participantSetInfos = participantSetInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Security information about the widget that specifies whether or not a password is required to view and sign the widget")
/*     */   @JsonProperty("securityOptions")
/*     */   public List<SecurityOptionsEnum> getSecurityOptions() {
/* 177 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
/* 180 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The current status of the widget")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 190 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 193 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The hosted url of the widget")
/*     */   @JsonProperty("url")
/*     */   public String getUrl() {
/* 203 */     return this.url;
/*     */   }
/*     */   public void setUrl(String url) {
/* 206 */     this.url = url;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A resource identifier that can be used to uniquely identify the widget in other apis")
/*     */   @JsonProperty("widgetId")
/*     */   public String getWidgetId() {
/* 216 */     return this.widgetId;
/*     */   }
/*     */   public void setWidgetId(String widgetId) {
/* 219 */     this.widgetId = widgetId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 226 */     StringBuilder sb = new StringBuilder();
/* 227 */     sb.append("class WidgetInfo {\n");
/*     */     
/* 229 */     sb.append("    events: ").append(StringUtil.toIndentedString(this.events)).append("\n");
/* 230 */     sb.append("    javascript: ").append(StringUtil.toIndentedString(this.javascript)).append("\n");
/* 231 */     sb.append("    latestVersionId: ").append(StringUtil.toIndentedString(this.latestVersionId)).append("\n");
/* 232 */     sb.append("    locale: ").append(StringUtil.toIndentedString(this.locale)).append("\n");
/* 233 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 234 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 235 */     sb.append("    participantSetInfos: ").append(StringUtil.toIndentedString(this.participantSetInfos)).append("\n");
/* 236 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 237 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 238 */     sb.append("    url: ").append(StringUtil.toIndentedString(this.url)).append("\n");
/* 239 */     sb.append("    widgetId: ").append(StringUtil.toIndentedString(this.widgetId)).append("\n");
/* 240 */     sb.append("}");
/* 241 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */