/*    */ package com.adobe.sign.model.agreements;
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
/*    */ public class CombinedDocumentPagesInfo
/*    */ {
/* 30 */   private List<DocumentPageInfo> documentPagesInfo = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "List of basic information of all pages of the combined document of an Agreement.")
/*    */   @JsonProperty("documentPagesInfo")
/*    */   public List<DocumentPageInfo> getDocumentPagesInfo() {
/* 39 */     return this.documentPagesInfo;
/*    */   }
/*    */   public void setDocumentPagesInfo(List<DocumentPageInfo> documentPagesInfo) {
/* 42 */     this.documentPagesInfo = documentPagesInfo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class CombinedDocumentPagesInfo {\n");
/*    */     
/* 52 */     sb.append("    documentPagesInfo: ").append(StringUtil.toIndentedString(this.documentPagesInfo)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\CombinedDocumentPagesInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */