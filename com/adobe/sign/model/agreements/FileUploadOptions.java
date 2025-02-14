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
/*    */ public class FileUploadOptions
/*    */ {
/* 28 */   private Boolean libraryDocument = null;
/* 29 */   private Boolean localFile = null;
/* 30 */   private Boolean webConnectors = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Whether library documents link should appear or not. Default value is taken as true")
/*    */   @JsonProperty("libraryDocument")
/*    */   public Boolean getLibraryDocument() {
/* 39 */     return this.libraryDocument;
/*    */   }
/*    */   public void setLibraryDocument(Boolean libraryDocument) {
/* 42 */     this.libraryDocument = libraryDocument;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Whether local file upload button should appear or not. Default value is taken as true")
/*    */   @JsonProperty("localFile")
/*    */   public Boolean getLocalFile() {
/* 52 */     return this.localFile;
/*    */   }
/*    */   public void setLocalFile(Boolean localFile) {
/* 55 */     this.localFile = localFile;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Whether link to attach documents from web sources like Dropbox should appear or not. Default value is taken as true")
/*    */   @JsonProperty("webConnectors")
/*    */   public Boolean getWebConnectors() {
/* 65 */     return this.webConnectors;
/*    */   }
/*    */   public void setWebConnectors(Boolean webConnectors) {
/* 68 */     this.webConnectors = webConnectors;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 75 */     StringBuilder sb = new StringBuilder();
/* 76 */     sb.append("class FileUploadOptions {\n");
/*    */     
/* 78 */     sb.append("    libraryDocument: ").append(StringUtil.toIndentedString(this.libraryDocument)).append("\n");
/* 79 */     sb.append("    localFile: ").append(StringUtil.toIndentedString(this.localFile)).append("\n");
/* 80 */     sb.append("    webConnectors: ").append(StringUtil.toIndentedString(this.webConnectors)).append("\n");
/* 81 */     sb.append("}");
/* 82 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\FileUploadOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */