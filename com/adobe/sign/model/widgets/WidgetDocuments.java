/*    */ package com.adobe.sign.model.widgets;
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
/*    */ public class WidgetDocuments
/*    */ {
/* 30 */   private List<WidgetOriginalDocument> documents = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A list of objects representing the documents")
/*    */   @JsonProperty("documents")
/*    */   public List<WidgetOriginalDocument> getDocuments() {
/* 39 */     return this.documents;
/*    */   }
/*    */   public void setDocuments(List<WidgetOriginalDocument> documents) {
/* 42 */     this.documents = documents;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class WidgetDocuments {\n");
/*    */     
/* 52 */     sb.append("    documents: ").append(StringUtil.toIndentedString(this.documents)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetDocuments.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */