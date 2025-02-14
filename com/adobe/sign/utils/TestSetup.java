/*    */ package com.adobe.sign.utils;
/*    */ 
/*    */ public class TestSetup
/*    */ {
/*    */   public static void main(String[] args) throws ApiException {
/*    */     try {
/*  7 */       TestSetup client = new TestSetup();
/*  8 */       client.run();
/*    */     }
/* 10 */     catch (ApiException apiException) {}
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void run() throws ApiException {
/* 18 */     ApiUtils.configureProperty();
/* 19 */     if (!AgreementsUtils.isExistingAgreement(TestData.AGREEMENT_NAME)) {
/* 20 */       AgreementsUtils.createAgreement(TestData.AGREEMENT_NAME);
/*    */     }
/* 22 */     if (GroupUtils.isExistingGroup(TestData.GROUP_NAME) == null) {
/* 23 */       GroupUtils.createGroup(TestData.GROUP_NAME);
/*    */     }
/* 25 */     if (!LibraryDocumentsUtils.isExistingLibraryDocument(TestData.LIBRARY_DOCUMENT_NAME)) {
/* 26 */       LibraryDocumentsUtils.createLibraryDocument(TestData.LIBRARY_DOCUMENT_NAME);
/*    */     }
/* 28 */     if (!MegaSignUtils.isExistingMegaSign(TestData.MEGASIGN_NAME)) {
/* 29 */       MegaSignUtils.createMegaSign(TestData.MEGASIGN_NAME);
/*    */     }
/*    */     
/* 32 */     if (!WidgetUtils.isExistingWidget(TestData.WIDGET_NAME))
/* 33 */       WidgetUtils.createWidget(TestData.WIDGET_NAME); 
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\TestSetup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */