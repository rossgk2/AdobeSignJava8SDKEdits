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
/*    */ 
/*    */ 
/*    */ @ApiModel(description = "A JSON that contains the id of the newly created Mega Sign")
/*    */ public class MegaSignCreationResponse
/*    */ {
/* 31 */   private String megaSignId = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Unique identifier of the MegaSign parent agreement")
/*    */   @JsonProperty("megaSignId")
/*    */   public String getMegaSignId() {
/* 40 */     return this.megaSignId;
/*    */   }
/*    */   public void setMegaSignId(String megaSignId) {
/* 43 */     this.megaSignId = megaSignId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 50 */     StringBuilder sb = new StringBuilder();
/* 51 */     sb.append("class MegaSignCreationResponse {\n");
/*    */     
/* 53 */     sb.append("    megaSignId: ").append(StringUtil.toIndentedString(this.megaSignId)).append("\n");
/* 54 */     sb.append("}");
/* 55 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\MegaSignCreationResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */