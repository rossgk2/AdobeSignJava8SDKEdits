/*    */ package com.adobe.sign.model.libraryDocuments;
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
/*    */ public class LibraryCreationInfo
/*    */ {
/* 30 */   private LibraryDocumentCreationInfo libraryDocumentCreationInfo = null;
/* 31 */   private InteractiveOptions options = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Information about the library document you want to create")
/*    */   @JsonProperty("libraryDocumentCreationInfo")
/*    */   public LibraryDocumentCreationInfo getLibraryDocumentCreationInfo() {
/* 40 */     return this.libraryDocumentCreationInfo;
/*    */   }
/*    */   public void setLibraryDocumentCreationInfo(LibraryDocumentCreationInfo libraryDocumentCreationInfo) {
/* 43 */     this.libraryDocumentCreationInfo = libraryDocumentCreationInfo;
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
/* 64 */     sb.append("class LibraryCreationInfo {\n");
/*    */     
/* 66 */     sb.append("    libraryDocumentCreationInfo: ").append(StringUtil.toIndentedString(this.libraryDocumentCreationInfo)).append("\n");
/* 67 */     sb.append("    options: ").append(StringUtil.toIndentedString(this.options)).append("\n");
/* 68 */     sb.append("}");
/* 69 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\libraryDocuments\LibraryCreationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */