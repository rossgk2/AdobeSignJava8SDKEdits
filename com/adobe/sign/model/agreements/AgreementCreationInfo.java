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
/*    */ 
/*    */ 
/*    */ @ApiModel(description = "")
/*    */ public class AgreementCreationInfo
/*    */ {
/* 30 */   private DocumentCreationInfo documentCreationInfo = null;
/* 31 */   private InteractiveOptions options = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Information about the document you want to send")
/*    */   @JsonProperty("documentCreationInfo")
/*    */   public DocumentCreationInfo getDocumentCreationInfo() {
/* 40 */     return this.documentCreationInfo;
/*    */   }
/*    */   public void setDocumentCreationInfo(DocumentCreationInfo documentCreationInfo) {
/* 43 */     this.documentCreationInfo = documentCreationInfo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Options for authoring and sending the agreement")
/*    */   @JsonProperty("options")
/*    */   public InteractiveOptions getOptions() {
/* 53 */     return this.options;
/*    */   }
/*    */   public void setOptions(InteractiveOptions options) {
/* 56 */     this.options = options;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     StringBuilder sb = new StringBuilder();
/* 64 */     sb.append("class AgreementCreationInfo {\n");
/*    */     
/* 66 */     sb.append("    documentCreationInfo: ").append(StringUtil.toIndentedString(this.documentCreationInfo)).append("\n");
/* 67 */     sb.append("    options: ").append(StringUtil.toIndentedString(this.options)).append("\n");
/* 68 */     sb.append("}");
/* 69 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\AgreementCreationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */