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
/*    */ 
/*    */ 
/*    */ 
/*    */ @ApiModel(description = "")
/*    */ public class URLFileInfo
/*    */ {
/* 28 */   private String mimeType = null;
/* 29 */   private String name = null;
/* 30 */   private String url = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The mime type of the referenced file, used to determine if the file can be accepted and the necessary conversion steps can be performed")
/*    */   @JsonProperty("mimeType")
/*    */   public String getMimeType() {
/* 39 */     return this.mimeType;
/*    */   }
/*    */   public void setMimeType(String mimeType) {
/* 42 */     this.mimeType = mimeType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The original system file name of the document being sent - used to name attachments, and to infer the mime type if one is not explicitly specified")
/*    */   @JsonProperty("name")
/*    */   public String getName() {
/* 52 */     return this.name;
/*    */   }
/*    */   public void setName(String name) {
/* 55 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("A publicly accessible URL for retrieving the raw file content. HTTP authentication is supported using standard embedded syntax - i.e. http://username:password@your.server.com/path/to/file.")
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
/* 76 */     sb.append("class URLFileInfo {\n");
/*    */     
/* 78 */     sb.append("    mimeType: ").append(StringUtil.toIndentedString(this.mimeType)).append("\n");
/* 79 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 80 */     sb.append("    url: ").append(StringUtil.toIndentedString(this.url)).append("\n");
/* 81 */     sb.append("}");
/* 82 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\URLFileInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */