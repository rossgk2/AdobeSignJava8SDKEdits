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
/*    */ @ApiModel(description = "")
/*    */ public class WidgetStatusUpdateResponse
/*    */ {
/*    */   private CodeEnum code;
/*    */   private String message;
/*    */   
/*    */   public enum CodeEnum
/*    */   {
/*    */     OK("OK"),
/*    */     ALREADY_DISABLED("ALREADY_DISABLED"),
/*    */     ALREADY_ENABLED("ALREADY_ENABLED");
/*    */     private String value;
/*    */     
/*    */     CodeEnum(String value) {
/*    */       this.value = value;
/*    */     }
/*    */     
/*    */     public String toString() {
/*    */       return this.value;
/*    */     }
/*    */   }
/*    */   
/*    */   public WidgetStatusUpdateResponse() {
/* 46 */     this.code = null;
/* 47 */     this.message = null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The result of the attempt to disable or enable the widget")
/*    */   @JsonProperty("code")
/*    */   public CodeEnum getCode() {
/* 56 */     return this.code;
/*    */   }
/*    */   public void setCode(CodeEnum code) {
/* 59 */     this.code = code;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("String result message if there was no error")
/*    */   @JsonProperty("message")
/*    */   public String getMessage() {
/* 69 */     return this.message;
/*    */   }
/*    */   public void setMessage(String message) {
/* 72 */     this.message = message;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 79 */     StringBuilder sb = new StringBuilder();
/* 80 */     sb.append("class WidgetStatusUpdateResponse {\n");
/*    */     
/* 82 */     sb.append("    code: ").append(StringUtil.toIndentedString(this.code)).append("\n");
/* 83 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 84 */     sb.append("}");
/* 85 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetStatusUpdateResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */