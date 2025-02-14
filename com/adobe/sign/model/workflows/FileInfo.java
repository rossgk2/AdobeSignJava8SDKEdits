/*    */ package com.adobe.sign.model.workflows;
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
/*    */ public class FileInfo
/*    */ {
/* 29 */   private URLFileInfo documentURL = null;
/* 30 */   private String libraryDocumentId = null;
/* 31 */   private String libraryDocumentName = null;
/* 32 */   private String transientDocumentId = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("File at a public URL location")
/*    */   @JsonProperty("documentURL")
/*    */   public URLFileInfo getDocumentURL() {
/* 41 */     return this.documentURL;
/*    */   }
/*    */   public void setDocumentURL(URLFileInfo documentURL) {
/* 44 */     this.documentURL = documentURL;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The ID for a library document that is available to the sender")
/*    */   @JsonProperty("libraryDocumentId")
/*    */   public String getLibraryDocumentId() {
/* 54 */     return this.libraryDocumentId;
/*    */   }
/*    */   public void setLibraryDocumentId(String libraryDocumentId) {
/* 57 */     this.libraryDocumentId = libraryDocumentId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The name of a library document that is available to the sender")
/*    */   @JsonProperty("libraryDocumentName")
/*    */   public String getLibraryDocumentName() {
/* 67 */     return this.libraryDocumentName;
/*    */   }
/*    */   public void setLibraryDocumentName(String libraryDocumentName) {
/* 70 */     this.libraryDocumentName = libraryDocumentName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The documentID as returned from the transient document creation API")
/*    */   @JsonProperty("transientDocumentId")
/*    */   public String getTransientDocumentId() {
/* 80 */     return this.transientDocumentId;
/*    */   }
/*    */   public void setTransientDocumentId(String transientDocumentId) {
/* 83 */     this.transientDocumentId = transientDocumentId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 90 */     StringBuilder sb = new StringBuilder();
/* 91 */     sb.append("class FileInfo {\n");
/*    */     
/* 93 */     sb.append("    documentURL: ").append(StringUtil.toIndentedString(this.documentURL)).append("\n");
/* 94 */     sb.append("    libraryDocumentId: ").append(StringUtil.toIndentedString(this.libraryDocumentId)).append("\n");
/* 95 */     sb.append("    libraryDocumentName: ").append(StringUtil.toIndentedString(this.libraryDocumentName)).append("\n");
/* 96 */     sb.append("    transientDocumentId: ").append(StringUtil.toIndentedString(this.transientDocumentId)).append("\n");
/* 97 */     sb.append("}");
/* 98 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\FileInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */