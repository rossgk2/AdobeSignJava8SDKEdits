/*    */ package com.adobe.sign.utils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class StringUtil
/*    */ {
/*    */   public static boolean containsIgnoreCase(String[] array, String value) {
/*    */     byte b;
/*    */     int i;
/*    */     String[] arrayOfString;
/* 14 */     for (i = (arrayOfString = array).length, b = 0; b < i; ) { String str = arrayOfString[b];
/* 15 */       if (value == null && str == null)
/* 16 */         return true; 
/* 17 */       if (value != null && value.equalsIgnoreCase(str))
/* 18 */         return true;  b++; }
/*    */     
/* 20 */     return false;
/*    */   }
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
/*    */   public static String join(String[] array, String separator) {
/* 36 */     int len = array.length;
/* 37 */     if (len == 0) {
/* 38 */       return "";
/*    */     }
/* 40 */     StringBuilder out = new StringBuilder();
/* 41 */     out.append(array[0]);
/* 42 */     for (int i = 1; i < len; i++) {
/* 43 */       out.append(separator).append(array[i]);
/*    */     }
/* 45 */     return out.toString();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String toIndentedString(Object o) {
/* 53 */     if (o == null)
/* 54 */       return "null"; 
/* 55 */     return o.toString().replace("\n", 
/* 56 */         "\n    ");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isEmpty(String value) {
/* 65 */     return !(value != null && value.length() != 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\StringUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */