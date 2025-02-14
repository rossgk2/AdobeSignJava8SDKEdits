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
/*    */ @ApiModel(description = "")
/*    */ public class WidgetCreationRequest
/*    */ {
/* 29 */   private WidgetCreationInfo widgetCreationInfo = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Information about the widget that you want to create.")
/*    */   @JsonProperty("widgetCreationInfo")
/*    */   public WidgetCreationInfo getWidgetCreationInfo() {
/* 38 */     return this.widgetCreationInfo;
/*    */   }
/*    */   public void setWidgetCreationInfo(WidgetCreationInfo widgetCreationInfo) {
/* 41 */     this.widgetCreationInfo = widgetCreationInfo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 48 */     StringBuilder sb = new StringBuilder();
/* 49 */     sb.append("class WidgetCreationRequest {\n");
/*    */     
/* 51 */     sb.append("    widgetCreationInfo: ").append(StringUtil.toIndentedString(this.widgetCreationInfo)).append("\n");
/* 52 */     sb.append("}");
/* 53 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetCreationRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */