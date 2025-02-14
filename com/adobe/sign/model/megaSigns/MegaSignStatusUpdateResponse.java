/*    */ package com.adobe.sign.model.megaSigns;
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
/*    */ @ApiModel(description = "")
/*    */ public class MegaSignStatusUpdateResponse
/*    */ {
/*    */   private CodeEnum code;
/*    */   private String message;
/*    */   private String result;
/*    */   
/*    */   public enum CodeEnum
/*    */   {
/*    */     ALREADY_CANCELLED("ALREADY_CANCELLED"),
/*    */     ALREADY_SIGNED("ALREADY_SIGNED");
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
/*    */   public MegaSignStatusUpdateResponse() {
/* 45 */     this.code = null;
/* 46 */     this.message = null;
/* 47 */     this.result = null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The result of the attempt to cancel the MegaSign")
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
/*    */   
/*    */   @ApiModelProperty("A status value showing the result of this operation")
/*    */   @JsonProperty("result")
/*    */   public String getResult() {
/* 82 */     return this.result;
/*    */   }
/*    */   public void setResult(String result) {
/* 85 */     this.result = result;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 92 */     StringBuilder sb = new StringBuilder();
/* 93 */     sb.append("class MegaSignStatusUpdateResponse {\n");
/*    */     
/* 95 */     sb.append("    code: ").append(StringUtil.toIndentedString(this.code)).append("\n");
/* 96 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 97 */     sb.append("    result: ").append(StringUtil.toIndentedString(this.result)).append("\n");
/* 98 */     sb.append("}");
/* 99 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\MegaSignStatusUpdateResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */