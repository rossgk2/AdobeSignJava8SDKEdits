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
/*    */ public class FormFieldCondition
/*    */ {
/* 28 */   private String value = null;
/* 29 */   private Integer whenFieldLocationIndex = null;
/* 30 */   private String whenFieldName = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Value to compare the value of the whenField with, to evaluate the condition")
/*    */   @JsonProperty("value")
/*    */   public String getValue() {
/* 39 */     return this.value;
/*    */   }
/*    */   public void setValue(String value) {
/* 42 */     this.value = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Index of the location of the whenField whose value is the basis of the condition")
/*    */   @JsonProperty("whenFieldLocationIndex")
/*    */   public Integer getWhenFieldLocationIndex() {
/* 52 */     return this.whenFieldLocationIndex;
/*    */   }
/*    */   public void setWhenFieldLocationIndex(Integer whenFieldLocationIndex) {
/* 55 */     this.whenFieldLocationIndex = whenFieldLocationIndex;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Name of the field whose value is the basis of condition")
/*    */   @JsonProperty("whenFieldName")
/*    */   public String getWhenFieldName() {
/* 65 */     return this.whenFieldName;
/*    */   }
/*    */   public void setWhenFieldName(String whenFieldName) {
/* 68 */     this.whenFieldName = whenFieldName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 75 */     StringBuilder sb = new StringBuilder();
/* 76 */     sb.append("class FormFieldCondition {\n");
/*    */     
/* 78 */     sb.append("    value: ").append(StringUtil.toIndentedString(this.value)).append("\n");
/* 79 */     sb.append("    whenFieldLocationIndex: ").append(StringUtil.toIndentedString(this.whenFieldLocationIndex)).append("\n");
/* 80 */     sb.append("    whenFieldName: ").append(StringUtil.toIndentedString(this.whenFieldName)).append("\n");
/* 81 */     sb.append("}");
/* 82 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\FormFieldCondition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */