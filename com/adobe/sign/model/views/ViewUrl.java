/*    */ package com.adobe.sign.model.views;
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
/*    */ public class ViewUrl
/*    */ {
/* 28 */   private String viewURL = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The output URL of the selected view.")
/*    */   @JsonProperty("viewURL")
/*    */   public String getViewURL() {
/* 37 */     return this.viewURL;
/*    */   }
/*    */   public void setViewURL(String viewURL) {
/* 40 */     this.viewURL = viewURL;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 47 */     StringBuilder sb = new StringBuilder();
/* 48 */     sb.append("class ViewUrl {\n");
/*    */     
/* 50 */     sb.append("    viewURL: ").append(StringUtil.toIndentedString(this.viewURL)).append("\n");
/* 51 */     sb.append("}");
/* 52 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\views\ViewUrl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */