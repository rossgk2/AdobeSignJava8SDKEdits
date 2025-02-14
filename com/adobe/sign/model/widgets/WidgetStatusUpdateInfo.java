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
/*    */ @ApiModel(description = "")
/*    */ public class WidgetStatusUpdateInfo
/*    */ {
/*    */   private String message;
/*    */   private String redirectUrl;
/*    */   
/*    */   public WidgetStatusUpdateInfo() {
/* 28 */     this.message = null;
/* 29 */     this.redirectUrl = null;
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
/* 47 */     this.value = null;
/*    */   } private ValueEnum value; public enum ValueEnum { DISABLE("DISABLE"),
/*    */     ENABLE("ENABLE"); private String value; ValueEnum(String value) {
/*    */       this.value = value;
/*    */     } public String toString() {
/*    */       return this.value;
/*    */     } } @ApiModelProperty(required = true, value = "Display this custom message to the user when the widget is accessed. Note that this can contain wiki markup to include clickable links in the message. This is required if redirectUrl is not provided. Both message and redirectUrl can not be specified.")
/*    */   @JsonProperty("message")
/*    */   public String getMessage() {
/* 56 */     return this.message;
/*    */   }
/*    */   public void setMessage(String message) {
/* 59 */     this.message = message;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Redirect the user to this URL when the widget is accessed. This is required if message is not provided. Both message and redirectUrl can not be specified.")
/*    */   @JsonProperty("redirectUrl")
/*    */   public String getRedirectUrl() {
/* 69 */     return this.redirectUrl;
/*    */   }
/*    */   public void setRedirectUrl(String redirectUrl) {
/* 72 */     this.redirectUrl = redirectUrl;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The status to which the widget is to be updated. The possible values for this variable are ENABLE and DISABLE")
/*    */   @JsonProperty("value")
/*    */   public ValueEnum getValue() {
/* 82 */     return this.value;
/*    */   }
/*    */   public void setValue(ValueEnum value) {
/* 85 */     this.value = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 92 */     StringBuilder sb = new StringBuilder();
/* 93 */     sb.append("class WidgetStatusUpdateInfo {\n");
/*    */     
/* 95 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 96 */     sb.append("    redirectUrl: ").append(StringUtil.toIndentedString(this.redirectUrl)).append("\n");
/* 97 */     sb.append("    value: ").append(StringUtil.toIndentedString(this.value)).append("\n");
/* 98 */     sb.append("}");
/* 99 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetStatusUpdateInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */