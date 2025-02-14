/*    */ package com.adobe.sign.model.search;
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
/*    */ public class DocumentEventForUser
/*    */ {
/* 29 */   private String agreementAssetId = null;
/* 30 */   private String agreementAssetName = null;
/* 31 */   private String agreementAssetType = null;
/* 32 */   private DocumentHistoryEvent documentHistoryEvent = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The ID of the agreement asset.")
/*    */   @JsonProperty("agreementAssetId")
/*    */   public String getAgreementAssetId() {
/* 41 */     return this.agreementAssetId;
/*    */   }
/*    */   public void setAgreementAssetId(String agreementAssetId) {
/* 44 */     this.agreementAssetId = agreementAssetId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The name of the agreement asset")
/*    */   @JsonProperty("agreementAssetName")
/*    */   public String getAgreementAssetName() {
/* 54 */     return this.agreementAssetName;
/*    */   }
/*    */   public void setAgreementAssetName(String agreementAssetName) {
/* 57 */     this.agreementAssetName = agreementAssetName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The type of the agreement asset")
/*    */   @JsonProperty("agreementAssetType")
/*    */   public String getAgreementAssetType() {
/* 67 */     return this.agreementAssetType;
/*    */   }
/*    */   public void setAgreementAssetType(String agreementAssetType) {
/* 70 */     this.agreementAssetType = agreementAssetType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
/*    */   @JsonProperty("documentHistoryEvent")
/*    */   public DocumentHistoryEvent getDocumentHistoryEvent() {
/* 80 */     return this.documentHistoryEvent;
/*    */   }
/*    */   public void setDocumentHistoryEvent(DocumentHistoryEvent documentHistoryEvent) {
/* 83 */     this.documentHistoryEvent = documentHistoryEvent;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 90 */     StringBuilder sb = new StringBuilder();
/* 91 */     sb.append("class DocumentEventForUser {\n");
/*    */     
/* 93 */     sb.append("    agreementAssetId: ").append(StringUtil.toIndentedString(this.agreementAssetId)).append("\n");
/* 94 */     sb.append("    agreementAssetName: ").append(StringUtil.toIndentedString(this.agreementAssetName)).append("\n");
/* 95 */     sb.append("    agreementAssetType: ").append(StringUtil.toIndentedString(this.agreementAssetType)).append("\n");
/* 96 */     sb.append("    documentHistoryEvent: ").append(StringUtil.toIndentedString(this.documentHistoryEvent)).append("\n");
/* 97 */     sb.append("}");
/* 98 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\search\DocumentEventForUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */