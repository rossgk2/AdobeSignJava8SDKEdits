/*    */ package com.adobe.sign.utils;
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
/*    */ public class Pair
/*    */ {
/* 18 */   private String name = "";
/* 19 */   private String value = "";
/*    */   
/*    */   public Pair(String name, String value) {
/* 22 */     setName(name);
/* 23 */     setValue(value);
/*    */   }
/*    */   
/*    */   private void setName(String name) {
/* 27 */     if (!isValidString(name))
/*    */       return; 
/* 29 */     this.name = name;
/*    */   }
/*    */   
/*    */   private void setValue(String value) {
/* 33 */     if (!isValidString(value))
/*    */       return; 
/* 35 */     this.value = value;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 39 */     return this.name;
/*    */   }
/*    */   
/*    */   public String getValue() {
/* 43 */     return this.value;
/*    */   }
/*    */   
/*    */   private boolean isValidString(String arg) {
/* 47 */     if (arg == null) return false; 
/* 48 */     if (arg.trim().isEmpty()) return false;
/*    */     
/* 50 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\Pair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */