/*    */ package com.adobe.sign.model.oAuth;
/*    */ 
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
/*    */ public class Scope
/*    */ {
/* 19 */   private String target = null;
/* 20 */   private String modifier = null;
/*    */   
/*    */   public Scope(String target, String modifier) {
/* 23 */     this.target = target;
/* 24 */     this.modifier = modifier;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Combination of the action and the resource on which that action will be performed.")
/*    */   public String getTarget() {
/* 32 */     return this.target;
/*    */   }
/*    */   public void setTarget(String target) {
/* 35 */     this.target = target;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Access the resource of self, group, account.")
/*    */   public String getModifier() {
/* 43 */     return this.modifier;
/*    */   }
/*    */   public void setModifier(String modifier) {
/* 46 */     this.modifier = modifier;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 50 */     return String.valueOf(this.target) + ":" + this.modifier;
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\oAuth\Scope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */