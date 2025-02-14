/*     */ package com.adobe.sign.model.agreements;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;

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
/*     */ @ApiModel(description = "")
/*     */ public class ImageUrl
/*     */ {
/*     */   private Boolean imagesAvailable;
/*     */   private ImageSizeEnum imageSize;
/*     */   
/*     */   public ImageUrl() {
/*  29 */     this.imagesAvailable = null;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     this.imageSize = null;
/*  55 */     this.urls = new ArrayList<>();
/*     */   }
/*     */   private List<String> urls; public enum ImageSizeEnum {
/*     */     FIXED_WIDTH_50PX("FIXED_WIDTH_50px"), FIXED_WIDTH_250PX("FIXED_WIDTH_250px"), FIXED_WIDTH_675PX("FIXED_WIDTH_675px"), ZOOM_50_PERCENT("ZOOM_50_PERCENT"), ZOOM_75_PERCENT("ZOOM_75_PERCENT"),
/*     */     ZOOM_100_PERCENT("ZOOM_100_PERCENT"),
/*     */     ZOOM_125_PERCENT("ZOOM_125_PERCENT"),
/*     */     ZOOM_150_PERCENT("ZOOM_150_PERCENT"),
/*     */     ZOOM_200_PERCENT("ZOOM_200_PERCENT"); private String value; ImageSizeEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty("true if images for the associated image size is available, else false.")
/*     */   @JsonProperty("imagesAvailable")
/*  64 */   public Boolean getImagesAvailable() { return this.imagesAvailable; }
/*     */   
/*     */   public void setImagesAvailable(Boolean imagesAvailable) {
/*  67 */     this.imagesAvailable = imagesAvailable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("ImageSize corresponding to the imageUrl returned")
/*     */   @JsonProperty("imageSize")
/*     */   public ImageSizeEnum getImageSize() {
/*  77 */     return this.imageSize;
/*     */   }
/*     */   public void setImageSize(ImageSizeEnum imageSize) {
/*  80 */     this.imageSize = imageSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "An ordered list of image urls (one per page).")
/*     */   @JsonProperty("urls")
/*     */   public List<String> getUrls() {
/*  90 */     return this.urls;
/*     */   }
/*     */   public void setUrls(List<String> urls) {
/*  93 */     this.urls = urls;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 100 */     StringBuilder sb = new StringBuilder();
/* 101 */     sb.append("class ImageUrl {\n");
/*     */     
/* 103 */     sb.append("    imagesAvailable: ").append(StringUtil.toIndentedString(this.imagesAvailable)).append("\n");
/* 104 */     sb.append("    imageSize: ").append(StringUtil.toIndentedString(this.imageSize)).append("\n");
/* 105 */     sb.append("    urls: ").append(StringUtil.toIndentedString(this.urls)).append("\n");
/* 106 */     sb.append("}");
/* 107 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\ImageUrl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */