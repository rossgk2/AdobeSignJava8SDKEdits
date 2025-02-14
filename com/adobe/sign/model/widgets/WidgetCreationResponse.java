/*     */ package com.adobe.sign.model.widgets;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @ApiModel(description = "A JSON object describing the widget")
/*     */ public class WidgetCreationResponse
/*     */ {
/*  31 */   private String javascript = null;
/*  32 */   private String nextPageEmbeddedCode = null;
/*  33 */   private String nextPageUrl = null;
/*  34 */   private String url = null;
/*  35 */   private String widgetId = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Javascript snippet suitable for an embedded page taking a user to a URL")
/*     */   @JsonProperty("javascript")
/*     */   public String getJavascript() {
/*  44 */     return this.javascript;
/*     */   }
/*     */   public void setJavascript(String javascript) {
/*  47 */     this.javascript = javascript;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Javascript snippet suitable for an embedded page of the redirected URL that can be used by widget creators")
/*     */   @JsonProperty("nextPageEmbeddedCode")
/*     */   public String getNextPageEmbeddedCode() {
/*  57 */     return this.nextPageEmbeddedCode;
/*     */   }
/*     */   public void setNextPageEmbeddedCode(String nextPageEmbeddedCode) {
/*  60 */     this.nextPageEmbeddedCode = nextPageEmbeddedCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Redirect URL once the widget is created")
/*     */   @JsonProperty("nextPageUrl")
/*     */   public String getNextPageUrl() {
/*  70 */     return this.nextPageUrl;
/*     */   }
/*     */   public void setNextPageUrl(String nextPageUrl) {
/*  73 */     this.nextPageUrl = nextPageUrl;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Standalone URL to direct end users to")
/*     */   @JsonProperty("url")
/*     */   public String getUrl() {
/*  83 */     return this.url;
/*     */   }
/*     */   public void setUrl(String url) {
/*  86 */     this.url = url;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The unique identifier of widget which can be used to retrieve the data entered by the signers.")
/*     */   @JsonProperty("widgetId")
/*     */   public String getWidgetId() {
/*  96 */     return this.widgetId;
/*     */   }
/*     */   public void setWidgetId(String widgetId) {
/*  99 */     this.widgetId = widgetId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 106 */     StringBuilder sb = new StringBuilder();
/* 107 */     sb.append("class WidgetCreationResponse {\n");
/*     */     
/* 109 */     sb.append("    javascript: ").append(StringUtil.toIndentedString(this.javascript)).append("\n");
/* 110 */     sb.append("    nextPageEmbeddedCode: ").append(StringUtil.toIndentedString(this.nextPageEmbeddedCode)).append("\n");
/* 111 */     sb.append("    nextPageUrl: ").append(StringUtil.toIndentedString(this.nextPageUrl)).append("\n");
/* 112 */     sb.append("    url: ").append(StringUtil.toIndentedString(this.url)).append("\n");
/* 113 */     sb.append("    widgetId: ").append(StringUtil.toIndentedString(this.widgetId)).append("\n");
/* 114 */     sb.append("}");
/* 115 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetCreationResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */