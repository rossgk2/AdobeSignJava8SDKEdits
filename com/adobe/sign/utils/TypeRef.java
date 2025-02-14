/*    */ package com.adobe.sign.utils;
/*    */ 
/*    */ import java.lang.reflect.ParameterizedType;
/*    */ import java.lang.reflect.Type;
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
/*    */ public class TypeRef<T>
/*    */ {
/* 24 */   private final Type type = getGenericType(getClass());
/*    */ 
/*    */   
/*    */   private static Type getGenericType(Class<?> klass) {
/* 28 */     Type superclass = klass.getGenericSuperclass();
/* 29 */     if (superclass instanceof Class) {
				throw new RuntimeException("Missing type parameter.");
			}
/*    */ 
/*    */     
/* 32 */     ParameterizedType parameterized = (ParameterizedType)superclass;
/* 33 */     return parameterized.getActualTypeArguments()[0];
/*    */   }
/*    */   
/*    */   public Type getType() {
/* 37 */     return this.type;
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\TypeRef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */