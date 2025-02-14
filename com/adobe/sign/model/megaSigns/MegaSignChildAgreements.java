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
/*    */ public class MegaSignChildAgreements
/*    */ {
/* 30 */   private List<MegaSignChildAgreement> megaSignChildAgreementList = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "A array of MegaSign child agreements")
/*    */   @JsonProperty("megaSignChildAgreementList")
/*    */   public List<MegaSignChildAgreement> getMegaSignChildAgreementList() {
/* 39 */     return this.megaSignChildAgreementList;
/*    */   }
/*    */   public void setMegaSignChildAgreementList(List<MegaSignChildAgreement> megaSignChildAgreementList) {
/* 42 */     this.megaSignChildAgreementList = megaSignChildAgreementList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class MegaSignChildAgreements {\n");
/*    */     
/* 52 */     sb.append("    megaSignChildAgreementList: ").append(StringUtil.toIndentedString(this.megaSignChildAgreementList)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\MegaSignChildAgreements.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */