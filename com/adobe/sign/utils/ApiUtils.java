/*     */ package com.adobe.sign.utils;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.Properties;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.sun.jersey.core.util.MultivaluedMapImpl;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ApiUtils
/*     */ {
/*     */   private static final String HTTP_STATUS_CODE = "\"httpCode\": ";
/*     */   private static final String CODE = "\"apiCode\": ";
/*     */   private static final String MESSAGE = "\"message\": ";
/*     */   private static final String SEPARATOR = ", ";
/*     */   private static final String BUILD_SEPERATOR = "build";
/*     */   private static final String ACCESS_TOKEN_KEY = "Access-Token";
/*     */   private static final String X_API_USER_KEY = "x-api-user";
/*  40 */   private static String ENV_HOST_NAME = TestData.ENV_HOST_NAME;
/*     */   
/*     */   public static Properties getProperties(String configPath) {
/*  43 */     Properties prop = new Properties();
/*     */     try {
/*  45 */       InputStream input = new FileInputStream(configPath);
/*     */       
/*  47 */       prop.load(input);
/*  48 */     } catch (IOException ex) {
/*  49 */       System.out.println(ex.getMessage());
/*     */     } 
/*  51 */     return prop;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getMessage(ApiException e) {
/*  62 */     if (e == null) {
/*  63 */       return "";
/*     */     }
/*  65 */     String message = (e.getMessage() == null) ? "" : e.getMessage();
/*  66 */     String apiCode = (e.getApiCode() == null) ? "" : e.getApiCode();
/*  67 */     int httpStatusCode = e.getHttpCode();
/*     */     
/*  69 */     String errMessage = "";
/*     */     
/*  71 */     if (httpStatusCode != 0) {
/*  72 */       errMessage = errMessage.concat("\"httpCode\": " + Integer.toString(httpStatusCode));
/*     */     }
/*  74 */     if (!StringUtil.isEmpty(apiCode)) {
/*  75 */       if (!StringUtil.isEmpty(errMessage)) {
/*  76 */         errMessage = errMessage.concat(", ");
/*     */       }
/*  78 */       errMessage = errMessage.concat("\"apiCode\": " + apiCode);
/*     */     } 
/*     */     
/*  81 */     if (!StringUtil.isEmpty(message)) {
/*  82 */       if (!StringUtil.isEmpty(errMessage)) {
/*  83 */         errMessage = errMessage.concat(", ");
/*     */       }
/*  85 */       errMessage = errMessage.concat("\"message\": " + message);
/*     */     } 
/*     */     
/*  88 */     return errMessage;
/*     */   }
/*     */   
/*     */   public static String getUserEmail() {
/*  92 */     return String.valueOf(TestData.EMAIL) + String.valueOf(System.currentTimeMillis()) + TestData.EMAIL_DOMAIN;
/*     */   }
/*     */   
/*     */   public static String getGroupName() {
/*  96 */     return String.valueOf(TestData.GROUP_NAME_PREFIX) + String.valueOf(System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static String getAgreementName() {
/* 100 */     return String.valueOf(TestData.AGREEMENT_NAME_PREFIX) + String.valueOf(System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static String getLibraryDocumentName() {
/* 104 */     return String.valueOf(TestData.LIBRARY_DOCUMENT_NAME_PREFIX) + String.valueOf(System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static String getWidgetName() {
/* 108 */     return String.valueOf(TestData.WIDGET_NAME_PREFIX) + String.valueOf(System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static String getMegaSignName() {
/* 112 */     return String.valueOf(TestData.MEGASIGN_NAME_PREFIX) + String.valueOf(System.currentTimeMillis());
/*     */   }
/*     */   
/*     */   public static Date getDate(int offset) {
/* 116 */     Calendar cal = Calendar.getInstance();
/* 117 */     cal.add(5, offset);
/* 118 */     return cal.getTime();
/*     */   }
/*     */   
/*     */   public static String getSdkAbsolutePath() {
/* 122 */     String path = ApiUtils.class.getClassLoader().getResource(".").getPath();
/* 123 */     return path.substring(0, path.indexOf("build"));
/*     */   }
/*     */   
/*     */   public static MultivaluedMap getValidHeaderParams() {
/* 127 */     MultivaluedMapImpl multivaluedMapImpl = new MultivaluedMapImpl();
/*     */ 
/*     */     
/* 130 */     multivaluedMapImpl.put("Access-Token", TestData.ACCESS_TOKEN);
/* 131 */     multivaluedMapImpl.put("x-api-user", TestData.X_API_HEADER);
/* 132 */     return (MultivaluedMap)multivaluedMapImpl;
/*     */   }
/*     */   
/*     */   public static MultivaluedMap getNullAccessTokenHeaderParams() {
/* 136 */     MultivaluedMapImpl multivaluedMapImpl = new MultivaluedMapImpl();
/*     */ 
/*     */     
/* 139 */     multivaluedMapImpl.put("Access-Token", TestData.NULL_PARAM);
/* 140 */     multivaluedMapImpl.put("x-api-user", TestData.X_API_HEADER);
/* 141 */     return (MultivaluedMap)multivaluedMapImpl;
/*     */   }
/*     */   
/*     */   public static MultivaluedMap getEmptyAccessTokenHeaderParams() {
/* 145 */     MultivaluedMapImpl multivaluedMapImpl = new MultivaluedMapImpl();
/*     */ 
/*     */     
/* 148 */     multivaluedMapImpl.put("Access-Token", TestData.EMPTY_PARAM);
/* 149 */     multivaluedMapImpl.put("x-api-user", TestData.X_API_HEADER);
/* 150 */     return (MultivaluedMap)multivaluedMapImpl;
/*     */   }
/*     */   
/*     */   public static MultivaluedMap getEmptyXApiUserHeaderParams() {
/* 154 */     MultivaluedMapImpl multivaluedMapImpl = new MultivaluedMapImpl();
/*     */ 
/*     */     
/* 157 */     multivaluedMapImpl.put("Access-Token", TestData.ACCESS_TOKEN);
/* 158 */     multivaluedMapImpl.put("x-api-user", TestData.EMPTY_PARAM);
/* 159 */     return (MultivaluedMap)multivaluedMapImpl;
/*     */   }
/*     */   public static void configureProperty() {
/* 162 */     configureEnvHostName();
/*     */   }
/*     */   public static void configureEnvHostName() {
/* 165 */     if (ENV_HOST_NAME != null && ENV_HOST_NAME.length() > 0)
/* 166 */       Context.setEnvHostName(ENV_HOST_NAME); 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\ApiUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */