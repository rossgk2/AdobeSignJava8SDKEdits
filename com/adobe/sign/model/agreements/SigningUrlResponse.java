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
/*    */ public class SigningUrlResponse
/*    */ {
/* 30 */   private List<SigningUrlSetInfo> signingUrlSetInfos = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An array of urls for signer sets involved in this agreement.")
/*    */   @JsonProperty("signingUrlSetInfos")
/*    */   public List<SigningUrlSetInfo> getSigningUrlSetInfos() {
/* 39 */     return this.signingUrlSetInfos;
/*    */   }
/*    */   public void setSigningUrlSetInfos(List<SigningUrlSetInfo> signingUrlSetInfos) {
/* 42 */     this.signingUrlSetInfos = signingUrlSetInfos;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class SigningUrlResponse {\n");
/*    */     
/* 52 */     sb.append("    signingUrlSetInfos: ").append(StringUtil.toIndentedString(this.signingUrlSetInfos)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\SigningUrlResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */