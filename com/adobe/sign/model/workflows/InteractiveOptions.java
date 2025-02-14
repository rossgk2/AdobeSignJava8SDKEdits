/*    */ package com.adobe.sign.model.workflows;
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
/*    */ public class InteractiveOptions
/*    */ {
/* 28 */   private Boolean authoringRequested = null;
/* 29 */   private Boolean autoLoginUser = null;
/* 30 */   private Boolean noChrome = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Indicates that authoring is requested prior to sending the document")
/*    */   @JsonProperty("authoringRequested")
/*    */   public Boolean getAuthoringRequested() {
/* 39 */     return this.authoringRequested;
/*    */   }
/*    */   public void setAuthoringRequested(Boolean authoringRequested) {
/* 42 */     this.authoringRequested = authoringRequested;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("If user settings allow, automatically logs the user in")
/*    */   @JsonProperty("autoLoginUser")
/*    */   public Boolean getAutoLoginUser() {
/* 52 */     return this.autoLoginUser;
/*    */   }
/*    */   public void setAutoLoginUser(Boolean autoLoginUser) {
/* 55 */     this.autoLoginUser = autoLoginUser;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Turn off Chrome for the URL generated")
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
/* 76 */     sb.append("class InteractiveOptions {\n");
/*    */     
/* 78 */     sb.append("    authoringRequested: ").append(StringUtil.toIndentedString(this.authoringRequested)).append("\n");
/* 79 */     sb.append("    autoLoginUser: ").append(StringUtil.toIndentedString(this.autoLoginUser)).append("\n");
/* 80 */     sb.append("    noChrome: ").append(StringUtil.toIndentedString(this.noChrome)).append("\n");
/* 81 */     sb.append("}");
/* 82 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\InteractiveOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */