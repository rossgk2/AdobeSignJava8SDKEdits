/*    */ package com.adobe.sign.utils;
/*    */ 
/*    */ import org.junit.rules.TestRule;
/*    */ import org.junit.runner.Description;
/*    */ import org.junit.runners.model.Statement;
/*    */ 
/*    */ public class Retry
/*    */   implements TestRule
/*    */ {
/*    */   private static int retryCount;
/*    */   
/*    */   public Statement apply(Statement base, Description description) {
/* 13 */     return statement(base, description);
/*    */   }
/*    */   
/*    */   private Statement statement(final Statement base, final Description description) {
/* 17 */     return new Statement()
/*    */       {
/*    */         public void evaluate() throws Throwable {
/* 20 */           Retry.retryCount = Integer.parseInt(TestData.RETRY_COUNT);
/* 21 */           Throwable caughtThrowable = null;
/*    */           
/* 23 */           for (int i = 0; i < Retry.retryCount; i++) {
/*    */             try {
/* 25 */               base.evaluate();
/*    */               
/*    */               return;
/* 28 */             } catch (Throwable t) {
/* 29 */               caughtThrowable = t;
/* 30 */               System.err.println(String.valueOf(description.getDisplayName()) + ": run " + (i + 1) + " failed");
/* 31 */               System.err.println("Message: " + t.getMessage());
/*    */             } 
/*    */           } 
/* 34 */           System.err.println(String.valueOf(description.getDisplayName()) + ": giving up after " + Retry.retryCount + " failures");
/* 35 */           throw caughtThrowable;
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\Retry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */