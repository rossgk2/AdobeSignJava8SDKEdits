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
/*    */ public class SigningUrlSetInfo
/*    */ {
/* 30 */   private List<SigningUrl> signingUrls = new ArrayList<>();
/* 31 */   private String signingUrlSetName = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An array of urls for current signer set.")
/*    */   @JsonProperty("signingUrls")
/*    */   public List<SigningUrl> getSigningUrls() {
/* 40 */     return this.signingUrls;
/*    */   }
/*    */   public void setSigningUrls(List<SigningUrl> signingUrls) {
/* 43 */     this.signingUrls = signingUrls;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The name of the current signer set. Returned only, if the API caller is the sender of agreement")
/*    */   @JsonProperty("signingUrlSetName")
/*    */   public String getSigningUrlSetName() {
/* 53 */     return this.signingUrlSetName;
/*    */   }
/*    */   public void setSigningUrlSetName(String signingUrlSetName) {
/* 56 */     this.signingUrlSetName = signingUrlSetName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     StringBuilder sb = new StringBuilder();
/* 64 */     sb.append("class SigningUrlSetInfo {\n");
/*    */     
/* 66 */     sb.append("    signingUrls: ").append(StringUtil.toIndentedString(this.signingUrls)).append("\n");
/* 67 */     sb.append("    signingUrlSetName: ").append(StringUtil.toIndentedString(this.signingUrlSetName)).append("\n");
/* 68 */     sb.append("}");
/* 69 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\SigningUrlSetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */