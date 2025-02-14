/*     */ package com.adobe.sign.model.workflows;
/*     */ 
/*     */ import com.adobe.sign.utils.StringUtil;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;

/*     */ import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class FormFieldLocation
/*     */ {
/*  28 */   private Double height = null;
/*  29 */   private Double left = null;
/*  30 */   private Integer pageNumber = null;
/*  31 */   private Double top = null;
/*  32 */   private Double width = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Height of the form field in pixels")
/*     */   @JsonProperty("height")
/*     */   public Double getHeight() {
/*  41 */     return this.height;
/*     */   }
/*     */   public void setHeight(Double height) {
/*  44 */     this.height = height;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "No. of pixels from left of the page for form field placement")
/*     */   @JsonProperty("left")
/*     */   public Double getLeft() {
/*  54 */     return this.left;
/*     */   }
/*     */   public void setLeft(Double left) {
/*  57 */     this.left = left;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Number of the page where form field has to be placed, starting from 1.")
/*     */   @JsonProperty("pageNumber")
/*     */   public Integer getPageNumber() {
/*  67 */     return this.pageNumber;
/*     */   }
/*     */   public void setPageNumber(Integer pageNumber) {
/*  70 */     this.pageNumber = pageNumber;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "No. of pixels from bottom of the page for form field placement")
/*     */   @JsonProperty("top")
/*     */   public Double getTop() {
/*  80 */     return this.top;
/*     */   }
/*     */   public void setTop(Double top) {
/*  83 */     this.top = top;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Width of the form field in pixels")
/*     */   @JsonProperty("width")
/*     */   public Double getWidth() {
/*  93 */     return this.width;
/*     */   }
/*     */   public void setWidth(Double width) {
/*  96 */     this.width = width;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 103 */     StringBuilder sb = new StringBuilder();
/* 104 */     sb.append("class FormFieldLocation {\n");
/*     */     
/* 106 */     sb.append("    height: ").append(StringUtil.toIndentedString(this.height)).append("\n");
/* 107 */     sb.append("    left: ").append(StringUtil.toIndentedString(this.left)).append("\n");
/* 108 */     sb.append("    pageNumber: ").append(StringUtil.toIndentedString(this.pageNumber)).append("\n");
/* 109 */     sb.append("    top: ").append(StringUtil.toIndentedString(this.top)).append("\n");
/* 110 */     sb.append("    width: ").append(StringUtil.toIndentedString(this.width)).append("\n");
/* 111 */     sb.append("}");
/* 112 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\FormFieldLocation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */