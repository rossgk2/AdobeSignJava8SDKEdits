/*     */ package com.adobe.sign.utils;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.Type;
/*     */ import java.text.SimpleDateFormat;

/*     */ 
/*     */ import com.fasterxml.jackson.annotation.JsonInclude;
/*     */ import com.fasterxml.jackson.databind.DeserializationFeature;
/*     */ import com.fasterxml.jackson.databind.JavaType;
/*     */ import com.fasterxml.jackson.databind.Module;
/*     */ import com.fasterxml.jackson.databind.ObjectMapper;
/*     */ import com.fasterxml.jackson.databind.SerializationFeature;
/*     */ import com.fasterxml.jackson.datatype.joda.JodaModule;
/*     */ 
/*     */ public class JSON
/*     */ {
/*     */   private ObjectMapper mapper;
/*     */   private static final String CLASS_NAME = "class ";
/*     */   private static final String DESERIALIZATION_ERROR = "Error in deserialization.";
/*  19 */   private static char q = '"';
/*  20 */   private static char b = ':';
/*  21 */   private static String replace = "type" + q + ":" + q + "ACCEPTED" + q + ",";
/*  22 */   private static String replacement = "type" + q + ":" + q + "ESIGNED" + q + ",";
/*     */   
/*     */   public JSON() {
/*  25 */     this.mapper = new ObjectMapper();
/*  26 */     this.mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
/*  27 */     this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
/*  28 */     this.mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
/*  29 */     this.mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"));
/*  30 */     this.mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
/*  31 */     this.mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
/*  32 */     this.mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
/*  33 */     this.mapper.registerModule((Module)new JodaModule());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String serialize(Object obj) throws ApiException {
/*     */     try {
/*  41 */       if (obj != null) {
/*  42 */         return this.mapper.writeValueAsString(obj);
/*     */       }
/*  44 */       return null;
/*  45 */     } catch (Exception e) {
/*  46 */       throw new ApiException(400, 
/*  47 */           e.getMessage());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T deserialize(String body, TypeRef returnType) throws ApiException {
/*  60 */     body = body.replaceAll("ACCEPTANCE_REQUESTED", "SIGNATURE_REQUESTED");
/*  61 */     body = body.replaceAll("ACCEPTANCE", "SIGNATURE");
/*  62 */     body = body.replaceAll("ACCEPTOR", "SIGNER");
/*  63 */     body = body.replaceAll(replace, replacement);
/*  64 */     body = body.replaceAll("ACCEPTED", "SIGNED");
/*  65 */     System.out.println(body);
/*  66 */     if (body.equals("[]")) {
/*  67 */       return (T)getEmptyClassInstance(returnType.getType());
/*     */     }
/*     */     
/*  70 */     JavaType javaType = this.mapper.constructType(returnType.getType());
/*     */     try {
/*  72 */       return (T)this.mapper.readValue(body, 
/*  73 */           javaType);
/*  74 */     } catch (IOException e) {
/*  75 */       return (T)body;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getEmptyClassInstance(Type type) {
/*  88 */     if (type == null) {
/*  89 */       return null;
/*     */     }
/*  91 */     String className = type.toString();
/*     */     
/*  93 */     if (className == null) {
/*  94 */       return null;
/*     */     }
/*  96 */     className = className.substring("class ".length());
/*     */     
/*     */     try {
/*  99 */       Class<?> classType = Class.forName(className);
/* 100 */       return (classType == null) ? null : classType.newInstance();
/*     */     }
/* 102 */     catch (IllegalAccessException|InstantiationException|ClassNotFoundException e) {
/* 103 */       return null;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\JSON.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */