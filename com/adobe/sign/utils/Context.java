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
/*    */ public class Context
/*    */ {
/* 18 */   private static ApiClient defaultApiClient = new ApiClient();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ApiClient getDefaultApiClient() {
/* 25 */     return defaultApiClient;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void setBaseUri(String baseUri) {
/* 33 */     defaultApiClient.setBaseUri(baseUri);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String getBaseUri() {
/* 41 */     return defaultApiClient.getBaseUri();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void setEnvHostName(String hostName) {
/* 49 */     defaultApiClient.setEnvHostName(hostName);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String getEnvHostName() {
/* 57 */     return defaultApiClient.getEnvHostName();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\Context.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */