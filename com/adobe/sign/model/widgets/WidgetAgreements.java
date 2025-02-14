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
/*    */ public class WidgetAgreements
/*    */ {
/* 30 */   private List<UserAgreement> userAgreementList = new ArrayList<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An array of WidgetAgreement items")
/*    */   @JsonProperty("userAgreementList")
/*    */   public List<UserAgreement> getUserAgreementList() {
/* 39 */     return this.userAgreementList;
/*    */   }
/*    */   public void setUserAgreementList(List<UserAgreement> userAgreementList) {
/* 42 */     this.userAgreementList = userAgreementList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class WidgetAgreements {\n");
/*    */     
/* 52 */     sb.append("    userAgreementList: ").append(StringUtil.toIndentedString(this.userAgreementList)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetAgreements.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */