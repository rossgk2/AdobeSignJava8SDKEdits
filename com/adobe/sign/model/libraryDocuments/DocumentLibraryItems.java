/*    */ package com.adobe.sign.model.libraryDocuments;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;

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
/*    */ public class DocumentLibraryItems
/*    */ {
/* 30 */   private List<DocumentLibraryItem> libraryDocumentList = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An array of document library items")
/*    */   @JsonProperty("libraryDocumentList")
/*    */   public List<DocumentLibraryItem> getLibraryDocumentList() {
/* 39 */     return this.libraryDocumentList;
/*    */   }
/*    */   public void setLibraryDocumentList(List<DocumentLibraryItem> libraryDocumentList) {
/* 42 */     this.libraryDocumentList = libraryDocumentList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class DocumentLibraryItems {\n");
/*    */     
/* 52 */     sb.append("    libraryDocumentList: ").append(StringUtil.toIndentedString(this.libraryDocumentList)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\libraryDocuments\DocumentLibraryItems.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */