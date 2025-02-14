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
/*    */ 
/*    */ @ApiModel(description = "")
/*    */ public class MegaSignCreationRequest
/*    */ {
/* 29 */   private MegaSignCreationInfo megaSignCreationInfo = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Information about the MegaSign you want to send")
/*    */   @JsonProperty("megaSignCreationInfo")
/*    */   public MegaSignCreationInfo getMegaSignCreationInfo() {
/* 38 */     return this.megaSignCreationInfo;
/*    */   }
/*    */   public void setMegaSignCreationInfo(MegaSignCreationInfo megaSignCreationInfo) {
/* 41 */     this.megaSignCreationInfo = megaSignCreationInfo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 48 */     StringBuilder sb = new StringBuilder();
/* 49 */     sb.append("class MegaSignCreationRequest {\n");
/*    */     
/* 51 */     sb.append("    megaSignCreationInfo: ").append(StringUtil.toIndentedString(this.megaSignCreationInfo)).append("\n");
/* 52 */     sb.append("}");
/* 53 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\MegaSignCreationRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */