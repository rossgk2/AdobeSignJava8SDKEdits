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
/*    */ public class VaultingInfo
/*    */ {
/* 28 */   private Boolean enabled = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("For accounts set up for document vaulting and the option to enable per agreement, this determines whether the document is to be vaulted")
/*    */   @JsonProperty("enabled")
/*    */   public Boolean getEnabled() {
/* 37 */     return this.enabled;
/*    */   }
/*    */   public void setEnabled(Boolean enabled) {
/* 40 */     this.enabled = enabled;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 47 */     StringBuilder sb = new StringBuilder();
/* 48 */     sb.append("class VaultingInfo {\n");
/*    */     
/* 50 */     sb.append("    enabled: ").append(StringUtil.toIndentedString(this.enabled)).append("\n");
/* 51 */     sb.append("}");
/* 52 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\VaultingInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */