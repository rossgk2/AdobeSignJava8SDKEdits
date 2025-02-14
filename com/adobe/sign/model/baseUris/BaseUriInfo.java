/*    */ package com.adobe.sign.model.baseUris;
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
/*    */ public class BaseUriInfo
/*    */ {
/* 28 */   private String apiAccessPoint = null;
/* 29 */   private String webAccessPoint = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The access point from where other APIs need to be accessed. In case other APIs are accessed from a different end point, it will be considered an invalid request.")
/*    */   @JsonProperty("api_access_point")
/*    */   public String getApiAccessPoint() {
/* 38 */     return this.apiAccessPoint;
/*    */   }
/*    */   public void setApiAccessPoint(String apiAccessPoint) {
/* 41 */     this.apiAccessPoint = apiAccessPoint;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The access point from where Adobe Sign website can be be accessed.")
/*    */   @JsonProperty("web_access_point")
/*    */   public String getWebAccessPoint() {
/* 51 */     return this.webAccessPoint;
/*    */   }
/*    */   public void setWebAccessPoint(String webAccessPoint) {
/* 54 */     this.webAccessPoint = webAccessPoint;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 61 */     StringBuilder sb = new StringBuilder();
/* 62 */     sb.append("class BaseUriInfo {\n");
/*    */     
/* 64 */     sb.append("    apiAccessPoint: ").append(StringUtil.toIndentedString(this.apiAccessPoint)).append("\n");
/* 65 */     sb.append("    webAccessPoint: ").append(StringUtil.toIndentedString(this.webAccessPoint)).append("\n");
/* 66 */     sb.append("}");
/* 67 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\baseUris\BaseUriInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */