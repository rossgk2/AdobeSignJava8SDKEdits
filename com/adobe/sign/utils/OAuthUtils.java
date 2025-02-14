/*    */ package com.adobe.sign.utils;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.net.URLDecoder;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;

/*    */ 
/*    */ import com.adobe.sign.model.oAuth.Scope;
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
/*    */ public class OAuthUtils
/*    */ {
/* 24 */   private static String REDIRECT_URI = "redirect_uri";
/* 25 */   private static String RESPONSE_TYPE = "response_type";
/* 26 */   private static String CLIENT_ID = "client_id";
/* 27 */   private static String SCOPE = "scope";
/* 28 */   private static String STATE = "state";
/* 29 */   private static String ENCODING = "UTF-8";
/* 30 */   private static String SPACE_DELIMITER = "+";
/*    */ 
/*    */   
/*    */   private static final char QUERY_STRING_SEPARATOR = '?';
/*    */ 
/*    */   
/*    */   private static final char PARAM_SEPARATOR = '&';
/*    */   
/*    */   private static final char EQUALS = '=';
/*    */ 
/*    */   
/*    */   public static String getValueByKey(String[] pairs, String name) throws UnsupportedEncodingException {
/*    */     byte b;
/*    */     int i;
/*    */     String[] arrayOfString;
/* 45 */     for (i = (arrayOfString = pairs).length, b = 0; b < i; ) { String pair = arrayOfString[b];
/* 46 */       int idx = pair.indexOf('=');
/* 47 */       if (URLDecoder.decode(String.valueOf(pair.substring(0, idx)), ENCODING).equals(name))
/* 48 */         return URLDecoder.decode(pair.substring(idx + 1), ENCODING); 
/*    */       b++; }
/*    */     
/* 51 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String spaceDelimitedSet(ArrayList<Scope> scopes) {
/* 61 */     if (scopes.isEmpty()) {
/* 62 */       return null;
/*    */     }
/* 64 */     String scopeSet = "";
/* 65 */     Iterator<Scope> it = scopes.iterator();
/*    */     
/*    */     while (true) {
/* 68 */       Scope s = it.next();
/*    */       
/* 70 */       if (!it.hasNext()) {
/* 71 */         scopeSet = String.valueOf(scopeSet) + s.toString();
/* 72 */         return scopeSet;
/*    */       } 
/*    */       
/* 75 */       scopeSet = String.valueOf(scopeSet) + s.toString() + SPACE_DELIMITER;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String appendTo(String url, String clientId, String redirectUrl, String scopes, String state, String responseType) throws ApiException {
/* 87 */     if (!url.isEmpty()) {
/* 88 */       return String.valueOf(url) + '?' + 
/* 89 */         REDIRECT_URI + '=' + redirectUrl + '&' + 
/* 90 */         RESPONSE_TYPE + '=' + responseType + '&' + 
/* 91 */         CLIENT_ID + '=' + clientId + '&' + 
/* 92 */         SCOPE + '=' + scopes + (
/* 93 */         (state != null) ? (String.valueOf('&') + STATE + '=' + state) : "");
/*    */     }
/*    */     
/* 96 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\OAuthUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */