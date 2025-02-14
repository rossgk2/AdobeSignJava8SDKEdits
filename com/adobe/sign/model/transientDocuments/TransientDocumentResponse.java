/*    */ package com.adobe.sign.model.transientDocuments;
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
/*    */ public class TransientDocumentResponse
/*    */ {
/* 28 */   private String transientDocumentId = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The unique identifier of the uploaded document that can be used in an agreement or a megaSign or widget creation call")
/*    */   @JsonProperty("transientDocumentId")
/*    */   public String getTransientDocumentId() {
/* 37 */     return this.transientDocumentId;
/*    */   }
/*    */   public void setTransientDocumentId(String transientDocumentId) {
/* 40 */     this.transientDocumentId = transientDocumentId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 47 */     StringBuilder sb = new StringBuilder();
/* 48 */     sb.append("class TransientDocumentResponse {\n");
/*    */     
/* 50 */     sb.append("    transientDocumentId: ").append(StringUtil.toIndentedString(this.transientDocumentId)).append("\n");
/* 51 */     sb.append("}");
/* 52 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\transientDocuments\TransientDocumentResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */