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
/*    */ @ApiModel(description = "")
/*    */ public class WidgetCompletionInfo
/*    */ {
/* 28 */   private Boolean deframe = null;
/* 29 */   private Integer delay = null;
/* 30 */   private String url = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("If deframe is false, the success page will be shown inside the widget frame. If deframe is true, the success page will be shown in the full browser window. Note that if this widget is loaded through javascript returned from this end point, browser security restrictions do not permit automatic redirection in the full browser window, so if deframe is true the user will instead just see a link to the success page. We recommend this scenario be avoided - in other words, setting deframe to false is recommended for this case.")
/*    */   @JsonProperty("deframe")
/*    */   public Boolean getDeframe() {
/* 39 */     return this.deframe;
/*    */   }
/*    */   public void setDeframe(Boolean deframe) {
/* 42 */     this.deframe = deframe;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The delay (in seconds) before the user is taken to the success page. If this value is greater than 0, the user will first see the standard Adobe Sign success message, and then after a delay will be redirected to your success page. Note that this parameter has no effect for widgets loaded with javascript when deframe is true.")
/*    */   @JsonProperty("delay")
/*    */   public Integer getDelay() {
/* 52 */     return this.delay;
/*    */   }
/*    */   public void setDelay(Integer delay) {
/* 55 */     this.delay = delay;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A publicly accessible url to which the user will be sent after successfully completing the widget. If the URL you provide includes information that allows you to identify the specific transaction, such as your own unique identifier, you can use the browser request to this URL as a callback to notify you that this transaction is completed. In addition, Adobe Sign will append a documentKey parameter to the URL which will contain the Adobe Sign DocumentKey for this signed widget, but only if the sender is the same as the API key user. Your application can use this value to get the form data for this widget.")
/*    */   @JsonProperty("url")
/*    */   public String getUrl() {
/* 65 */     return this.url;
/*    */   }
/*    */   public void setUrl(String url) {
/* 68 */     this.url = url;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 75 */     StringBuilder sb = new StringBuilder();
/* 76 */     sb.append("class WidgetCompletionInfo {\n");
/*    */     
/* 78 */     sb.append("    deframe: ").append(StringUtil.toIndentedString(this.deframe)).append("\n");
/* 79 */     sb.append("    delay: ").append(StringUtil.toIndentedString(this.delay)).append("\n");
/* 80 */     sb.append("    url: ").append(StringUtil.toIndentedString(this.url)).append("\n");
/* 81 */     sb.append("}");
/* 82 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetCompletionInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */