/*    */ package com.adobe.sign.model.agreements;
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
/*    */ public class AgreementStatusUpdateResponse
/*    */ {
/* 28 */   private String result = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A status value showing the result of this operation")
/*    */   @JsonProperty("result")
/*    */   public String getResult() {
/* 37 */     return this.result;
/*    */   }
/*    */   public void setResult(String result) {
/* 40 */     this.result = result;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 47 */     StringBuilder sb = new StringBuilder();
/* 48 */     sb.append("class AgreementStatusUpdateResponse {\n");
/*    */     
/* 50 */     sb.append("    result: ").append(StringUtil.toIndentedString(this.result)).append("\n");
/* 51 */     sb.append("}");
/* 52 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\AgreementStatusUpdateResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */