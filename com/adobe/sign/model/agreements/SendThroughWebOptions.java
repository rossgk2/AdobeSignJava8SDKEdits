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
/*    */ @ApiModel(description = "")
/*    */ public class SendThroughWebOptions
/*    */ {
/* 29 */   private FileUploadOptions fileUploadOptions = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Controls various file upload options available on the send page")
/*    */   @JsonProperty("fileUploadOptions")
/*    */   public FileUploadOptions getFileUploadOptions() {
/* 38 */     return this.fileUploadOptions;
/*    */   }
/*    */   public void setFileUploadOptions(FileUploadOptions fileUploadOptions) {
/* 41 */     this.fileUploadOptions = fileUploadOptions;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 48 */     StringBuilder sb = new StringBuilder();
/* 49 */     sb.append("class SendThroughWebOptions {\n");
/*    */     
/* 51 */     sb.append("    fileUploadOptions: ").append(StringUtil.toIndentedString(this.fileUploadOptions)).append("\n");
/* 52 */     sb.append("}");
/* 53 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\SendThroughWebOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */