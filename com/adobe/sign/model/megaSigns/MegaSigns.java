/*    */ package com.adobe.sign.model.megaSigns;
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
/*    */ public class MegaSigns
/*    */ {
/* 30 */   private List<MegaSign> megaSignList = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An array of MegaSign parent agreements")
/*    */   @JsonProperty("megaSignList")
/*    */   public List<MegaSign> getMegaSignList() {
/* 39 */     return this.megaSignList;
/*    */   }
/*    */   public void setMegaSignList(List<MegaSign> megaSignList) {
/* 42 */     this.megaSignList = megaSignList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class MegaSigns {\n");
/*    */     
/* 52 */     sb.append("    megaSignList: ").append(StringUtil.toIndentedString(this.megaSignList)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\MegaSigns.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */