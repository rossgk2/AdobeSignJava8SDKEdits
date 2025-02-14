/*     */ package com.adobe.sign.utils;
/*     */ import java.util.List;
/*     */ import java.util.Map;

/*     */ 
/*     */ import com.adobe.sign.utils.validator.SdkErrorCodes;
/*     */ 
/*     */ public class ApiException
/*     */   extends Exception
/*     */ {
/*  10 */   private int httpCode = 0;
/*  11 */   private Map<String, List<String>> responseHeaders = null;
/*  12 */   private String responseBody = null;
/*  13 */   private String apiCode = null;
/*     */   
/*     */   public ApiException() {}
/*     */   
/*     */   public ApiException(Throwable throwable) {
/*  18 */     super(throwable);
/*     */   }
/*     */   
/*     */   public ApiException(String message) {
/*  22 */     super(message);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ApiException(String message, Throwable throwable, int httpCode, Map<String, List<String>> responseHeaders, String responseBody) {
/*  31 */     super(message, throwable);
/*  32 */     this.httpCode = httpCode;
/*  33 */     this.responseHeaders = responseHeaders;
/*  34 */     this.responseBody = responseBody;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ApiException(String message, int httpCode, Map<String, List<String>> responseHeaders, String responseBody) {
/*  45 */     this(message, (Throwable)null, httpCode, responseHeaders, responseBody);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ApiException(String message, Throwable throwable, int httpCode, Map<String, List<String>> responseHeaders) {
/*  56 */     this(message, throwable, httpCode, responseHeaders, (String)null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ApiException(int httpCode, Map<String, List<String>> responseHeaders, String responseBody) {
/*  66 */     this((String)null, (Throwable)null, httpCode, responseHeaders, responseBody);
/*     */   }
/*     */ 
/*     */   
/*     */   public ApiException(int httpCode, String message) {
/*  71 */     super(message);
/*  72 */     this.httpCode = httpCode;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ApiException(int httpCode, String apiCode, String message) {
/*  78 */     super(message);
/*  79 */     this.httpCode = httpCode;
/*  80 */     this.apiCode = apiCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ApiException(int httpCode, String message, Map<String, List<String>> responseHeaders, String responseBody) {
/*  88 */     this(httpCode, message);
/*  89 */     this.responseHeaders = responseHeaders;
/*  90 */     this.responseBody = responseBody;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ApiException(int httpCode, String message, String apiCode, Map<String, List<String>> responseHeaders, String responseBody) {
/*  99 */     this(httpCode, apiCode, message);
/* 100 */     this.responseHeaders = responseHeaders;
/* 101 */     this.responseBody = responseBody;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ApiException(SdkErrorCodes sdkErrorCode) {
/* 107 */     this(sdkErrorCode.getHttpCode(), sdkErrorCode.getApiCode(), sdkErrorCode.getMessage());
/*     */   }
/*     */   
/*     */   public int getHttpCode() {
/* 111 */     return this.httpCode;
/*     */   }
/*     */   
/*     */   public String getApiCode() {
/* 115 */     return this.apiCode;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, List<String>> getResponseHeaders() {
/* 121 */     return this.responseHeaders;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getResponseBody() {
/* 128 */     return this.responseBody;
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\ApiException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */