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
/*    */ @ApiModel(description = "")
/*    */ public class TargetViewRequest
/*    */ {
/*    */   private Boolean autoLogin;
/*    */   private Boolean noChrome;
/*    */   
/*    */   public TargetViewRequest() {
/* 28 */     this.autoLogin = null;
/* 29 */     this.noChrome = null;
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
/* 47 */     this.targetView = null;
/*    */   } private TargetViewEnum targetView; public enum TargetViewEnum { ACCOUNT_SETTINGS("ACCOUNT_SETTINGS"),
/*    */     USER_PROFILE("USER_PROFILE"); private String value; TargetViewEnum(String value) {
/*    */       this.value = value;
/*    */     } public String toString() {
/*    */       return this.value;
/*    */     } } @ApiModelProperty("Auto LogIn Flag. If true, the URL returned will automatically log the user in. If false, the URL returned will require the credentials. By default its value is false")
/*    */   @JsonProperty("autoLogin")
/*    */   public Boolean getAutoLogin() {
/* 56 */     return this.autoLogin;
/*    */   }
/*    */   public void setAutoLogin(Boolean autoLogin) {
/* 59 */     this.autoLogin = autoLogin;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("No Chrome Flag. If true, the embedded page is shown without a navigation header or footer. If false, the standard page header and footer will be present. By default its value is false")
/*    */   @JsonProperty("noChrome")
/*    */   public Boolean getNoChrome() {
/* 69 */     return this.noChrome;
/*    */   }
/*    */   public void setNoChrome(Boolean noChrome) {
/* 72 */     this.noChrome = noChrome;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Two types of views are available- ACCOUNT_SETTINGS:- For getting the URL for Account Settings for Admin only, USER_PROFILE:- For getting the URL for User Profile")
/*    */   @JsonProperty("targetView")
/*    */   public TargetViewEnum getTargetView() {
/* 82 */     return this.targetView;
/*    */   }
/*    */   public void setTargetView(TargetViewEnum targetView) {
/* 85 */     this.targetView = targetView;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 92 */     StringBuilder sb = new StringBuilder();
/* 93 */     sb.append("class TargetViewRequest {\n");
/*    */     
/* 95 */     sb.append("    autoLogin: ").append(StringUtil.toIndentedString(this.autoLogin)).append("\n");
/* 96 */     sb.append("    noChrome: ").append(StringUtil.toIndentedString(this.noChrome)).append("\n");
/* 97 */     sb.append("    targetView: ").append(StringUtil.toIndentedString(this.targetView)).append("\n");
/* 98 */     sb.append("}");
/* 99 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\views\TargetViewRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */