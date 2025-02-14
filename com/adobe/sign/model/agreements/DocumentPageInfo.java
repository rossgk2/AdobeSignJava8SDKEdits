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
/*    */ public class DocumentPageInfo
/*    */ {
/* 28 */   private Double height = null;
/* 29 */   private Integer pageNumber = null;
/* 30 */   private Double rotation = null;
/* 31 */   private Double width = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Height of the page")
/*    */   @JsonProperty("height")
/*    */   public Double getHeight() {
/* 40 */     return this.height;
/*    */   }
/*    */   public void setHeight(Double height) {
/* 43 */     this.height = height;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Number of the page in combined document starting from 1.")
/*    */   @JsonProperty("pageNumber")
/*    */   public Integer getPageNumber() {
/* 53 */     return this.pageNumber;
/*    */   }
/*    */   public void setPageNumber(Integer pageNumber) {
/* 56 */     this.pageNumber = pageNumber;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Rotation angle of the page in clockwise direction in degree.")
/*    */   @JsonProperty("rotation")
/*    */   public Double getRotation() {
/* 66 */     return this.rotation;
/*    */   }
/*    */   public void setRotation(Double rotation) {
/* 69 */     this.rotation = rotation;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Width of the page")
/*    */   @JsonProperty("width")
/*    */   public Double getWidth() {
/* 79 */     return this.width;
/*    */   }
/*    */   public void setWidth(Double width) {
/* 82 */     this.width = width;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 89 */     StringBuilder sb = new StringBuilder();
/* 90 */     sb.append("class DocumentPageInfo {\n");
/*    */     
/* 92 */     sb.append("    height: ").append(StringUtil.toIndentedString(this.height)).append("\n");
/* 93 */     sb.append("    pageNumber: ").append(StringUtil.toIndentedString(this.pageNumber)).append("\n");
/* 94 */     sb.append("    rotation: ").append(StringUtil.toIndentedString(this.rotation)).append("\n");
/* 95 */     sb.append("    width: ").append(StringUtil.toIndentedString(this.width)).append("\n");
/* 96 */     sb.append("}");
/* 97 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\DocumentPageInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */