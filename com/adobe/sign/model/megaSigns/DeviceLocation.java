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
/*    */ public class DeviceLocation
/*    */ {
/* 28 */   private Float latitude = null;
/* 29 */   private Float longitude = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Latitude coordinate")
/*    */   @JsonProperty("latitude")
/*    */   public Float getLatitude() {
/* 38 */     return this.latitude;
/*    */   }
/*    */   public void setLatitude(Float latitude) {
/* 41 */     this.latitude = latitude;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Longitude coordinate")
/*    */   @JsonProperty("longitude")
/*    */   public Float getLongitude() {
/* 51 */     return this.longitude;
/*    */   }
/*    */   public void setLongitude(Float longitude) {
/* 54 */     this.longitude = longitude;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     StringBuilder sb = new StringBuilder();
/* 62 */     sb.append("class DeviceLocation {\n");
/*    */     
/* 64 */     sb.append("    latitude: ").append(StringUtil.toIndentedString(this.latitude)).append("\n");
/* 65 */     sb.append("    longitude: ").append(StringUtil.toIndentedString(this.longitude)).append("\n");
/* 66 */     sb.append("}");
/* 67 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\DeviceLocation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */