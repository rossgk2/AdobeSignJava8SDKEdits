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
/*    */ 
/*    */ @ApiModel(description = "")
/*    */ public class AgreementDocuments
/*    */ {
/* 31 */   private List<Document> documents = new ArrayList<>();
/* 32 */   private List<SupportingDocument> supportingDocuments = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A list of objects representing the documents")
/*    */   @JsonProperty("documents")
/*    */   public List<Document> getDocuments() {
/* 41 */     return this.documents;
/*    */   }
/*    */   public void setDocuments(List<Document> documents) {
/* 44 */     this.documents = documents;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("A list of supporting documents. This is returned only if there are any supporting document in the agreement")
/*    */   @JsonProperty("supportingDocuments")
/*    */   public List<SupportingDocument> getSupportingDocuments() {
/* 54 */     return this.supportingDocuments;
/*    */   }
/*    */   public void setSupportingDocuments(List<SupportingDocument> supportingDocuments) {
/* 57 */     this.supportingDocuments = supportingDocuments;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 64 */     StringBuilder sb = new StringBuilder();
/* 65 */     sb.append("class AgreementDocuments {\n");
/*    */     
/* 67 */     sb.append("    documents: ").append(StringUtil.toIndentedString(this.documents)).append("\n");
/* 68 */     sb.append("    supportingDocuments: ").append(StringUtil.toIndentedString(this.supportingDocuments)).append("\n");
/* 69 */     sb.append("}");
/* 70 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\AgreementDocuments.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */