/*    */ package com.adobe.sign.model.widgets;
/*    */ 
/*    */ import com.adobe.sign.utils.StringUtil;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;

/*    */ import io.swagger.annotations.ApiModel;
/*    */ import io.swagger.annotations.ApiModelProperty;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ApiModel(description = "A JSON object describing the personalize widget")
/*    */ public class WidgetPersonalizeResponse
/*    */ {
/* 31 */   private String javascript = null;
/* 32 */   private String url = null;
/* 33 */   private String widgetId = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Javascript snippet suitable for an embedded page taking a user to a URL")
/*    */   @JsonProperty("javascript")
/*    */   public String getJavascript() {
/* 42 */     return this.javascript;
/*    */   }
/*    */   public void setJavascript(String javascript) {
/* 45 */     this.javascript = javascript;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Standalone URL to direct end users to")
/*    */   @JsonProperty("url")
/*    */   public String getUrl() {
/* 55 */     return this.url;
/*    */   }
/*    */   public void setUrl(String url) {
/* 58 */     this.url = url;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The unique identifier of widget which can be used to retrieve the data entered by the signers.")
/*    */   @JsonProperty("widgetId")
/*    */   public String getWidgetId() {
/* 68 */     return this.widgetId;
/*    */   }
/*    */   public void setWidgetId(String widgetId) {
/* 71 */     this.widgetId = widgetId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 78 */     StringBuilder sb = new StringBuilder();
/* 79 */     sb.append("class WidgetPersonalizeResponse {\n");
/*    */     
/* 81 */     sb.append("    javascript: ").append(StringUtil.toIndentedString(this.javascript)).append("\n");
/* 82 */     sb.append("    url: ").append(StringUtil.toIndentedString(this.url)).append("\n");
/* 83 */     sb.append("    widgetId: ").append(StringUtil.toIndentedString(this.widgetId)).append("\n");
/* 84 */     sb.append("}");
/* 85 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetPersonalizeResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */