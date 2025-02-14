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
/*    */ public class DocumentImageUrl
/*    */ {
/* 30 */   private List<ImageUrl> imageUrls = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A list of objects representing all image URLs.(one per imagesize).")
/*    */   @JsonProperty("imageUrls")
/*    */   public List<ImageUrl> getImageUrls() {
/* 39 */     return this.imageUrls;
/*    */   }
/*    */   public void setImageUrls(List<ImageUrl> imageUrls) {
/* 42 */     this.imageUrls = imageUrls;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class DocumentImageUrl {\n");
/*    */     
/* 52 */     sb.append("    imageUrls: ").append(StringUtil.toIndentedString(this.imageUrls)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\DocumentImageUrl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */