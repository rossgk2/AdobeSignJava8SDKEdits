/*    */ package com.adobe.sign.model.megaSigns;
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
/*    */ public class MergefieldInfo
/*    */ {
/* 28 */   private String defaultValue = null;
/* 29 */   private String fieldName = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The default value of the field")
/*    */   @JsonProperty("defaultValue")
/*    */   public String getDefaultValue() {
/* 38 */     return this.defaultValue;
/*    */   }
/*    */   public void setDefaultValue(String defaultValue) {
/* 41 */     this.defaultValue = defaultValue;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The name of the field")
/*    */   @JsonProperty("fieldName")
/*    */   public String getFieldName() {
/* 51 */     return this.fieldName;
/*    */   }
/*    */   public void setFieldName(String fieldName) {
/* 54 */     this.fieldName = fieldName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     StringBuilder sb = new StringBuilder();
/* 62 */     sb.append("class MergefieldInfo {\n");
/*    */     
/* 64 */     sb.append("    defaultValue: ").append(StringUtil.toIndentedString(this.defaultValue)).append("\n");
/* 65 */     sb.append("    fieldName: ").append(StringUtil.toIndentedString(this.fieldName)).append("\n");
/* 66 */     sb.append("}");
/* 67 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\MergefieldInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */