/*    */ package com.adobe.sign.model.widgets;
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
/*    */ public class CounterSignerInfo
/*    */ {
/* 30 */   private String email = null;
/* 31 */   private List<WidgetSignerSecurityOption> securityOptions = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Email of the recipient")
/*    */   @JsonProperty("email")
/*    */   public String getEmail() {
/* 40 */     return this.email;
/*    */   }
/*    */   public void setEmail(String email) {
/* 43 */     this.email = email;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Security options that apply to the counter signers")
/*    */   @JsonProperty("securityOptions")
/*    */   public List<WidgetSignerSecurityOption> getSecurityOptions() {
/* 53 */     return this.securityOptions;
/*    */   }
/*    */   public void setSecurityOptions(List<WidgetSignerSecurityOption> securityOptions) {
/* 56 */     this.securityOptions = securityOptions;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     StringBuilder sb = new StringBuilder();
/* 64 */     sb.append("class CounterSignerInfo {\n");
/*    */     
/* 66 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 67 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 68 */     sb.append("}");
/* 69 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\CounterSignerInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */