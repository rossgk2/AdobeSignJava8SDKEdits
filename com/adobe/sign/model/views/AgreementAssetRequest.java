/*    */ package com.adobe.sign.model.views;
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
/*    */ public class AgreementAssetRequest
/*    */ {
/* 28 */   private String agreementAssetId = null;
/* 29 */   private Boolean autoLogin = null;
/* 30 */   private Boolean noChrome = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The ID of the agreement asset.")
/*    */   @JsonProperty("agreementAssetId")
/*    */   public String getAgreementAssetId() {
/* 39 */     return this.agreementAssetId;
/*    */   }
/*    */   public void setAgreementAssetId(String agreementAssetId) {
/* 42 */     this.agreementAssetId = agreementAssetId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Auto LogIn Flag. If true, the URL returned will automatically log the user in. If false, the URL returned will require the credentials. By default its value is false")
/*    */   @JsonProperty("autoLogin")
/*    */   public Boolean getAutoLogin() {
/* 52 */     return this.autoLogin;
/*    */   }
/*    */   public void setAutoLogin(Boolean autoLogin) {
/* 55 */     this.autoLogin = autoLogin;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("No Chrome Flag. If true, the embedded page is shown without a navigation header or footer. If false, the standard page header and footer will be present. By default its value is false")
/*    */   @JsonProperty("noChrome")
/*    */   public Boolean getNoChrome() {
/* 65 */     return this.noChrome;
/*    */   }
/*    */   public void setNoChrome(Boolean noChrome) {
/* 68 */     this.noChrome = noChrome;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 75 */     StringBuilder sb = new StringBuilder();
/* 76 */     sb.append("class AgreementAssetRequest {\n");
/*    */     
/* 78 */     sb.append("    agreementAssetId: ").append(StringUtil.toIndentedString(this.agreementAssetId)).append("\n");
/* 79 */     sb.append("    autoLogin: ").append(StringUtil.toIndentedString(this.autoLogin)).append("\n");
/* 80 */     sb.append("    noChrome: ").append(StringUtil.toIndentedString(this.noChrome)).append("\n");
/* 81 */     sb.append("}");
/* 82 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\views\AgreementAssetRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */