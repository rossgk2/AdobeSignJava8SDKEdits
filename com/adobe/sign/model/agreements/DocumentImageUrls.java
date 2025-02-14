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
/*    */ public class DocumentImageUrls
/*    */ {
/* 30 */   private List<DocumentImageUrl> documentsImageUrls = new ArrayList<>();
/* 31 */   private List<DocumentImageUrl> supportingDocumentsImageUrls = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A list of documents image URLs.")
/*    */   @JsonProperty("documentsImageUrls")
/*    */   public List<DocumentImageUrl> getDocumentsImageUrls() {
/* 40 */     return this.documentsImageUrls;
/*    */   }
/*    */   public void setDocumentsImageUrls(List<DocumentImageUrl> documentsImageUrls) {
/* 43 */     this.documentsImageUrls = documentsImageUrls;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("A list of supporting document image URLs.")
/*    */   @JsonProperty("supportingDocumentsImageUrls")
/*    */   public List<DocumentImageUrl> getSupportingDocumentsImageUrls() {
/* 53 */     return this.supportingDocumentsImageUrls;
/*    */   }
/*    */   public void setSupportingDocumentsImageUrls(List<DocumentImageUrl> supportingDocumentsImageUrls) {
/* 56 */     this.supportingDocumentsImageUrls = supportingDocumentsImageUrls;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     StringBuilder sb = new StringBuilder();
/* 64 */     sb.append("class DocumentImageUrls {\n");
/*    */     
/* 66 */     sb.append("    documentsImageUrls: ").append(StringUtil.toIndentedString(this.documentsImageUrls)).append("\n");
/* 67 */     sb.append("    supportingDocumentsImageUrls: ").append(StringUtil.toIndentedString(this.supportingDocumentsImageUrls)).append("\n");
/* 68 */     sb.append("}");
/* 69 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\DocumentImageUrls.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */