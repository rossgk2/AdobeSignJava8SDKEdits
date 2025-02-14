/*    */ package com.adobe.sign.utils;
/*    */ import javax.ws.rs.core.MultivaluedMap;

/*    */ 
/*    */ import com.adobe.sign.api.TransientDocumentsApi;
/*    */ import com.adobe.sign.model.transientDocuments.TransientDocumentResponse;
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
/*    */ public class TransientDocumentsUtils
/*    */   extends ApiUtils
/*    */ {
/* 22 */   private static TransientDocumentsApi transientDocumentsApi = new TransientDocumentsApi();
/* 23 */   private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();
/*    */   
/*    */   public static String createTransientDocumentResource(String transientDocumentName) throws ApiException {
/* 26 */     String transientDocumentId = null;
/*    */     
/* 28 */     TransientDocumentResponse response = transientDocumentsApi.createTransientDocument(headers, 
/* 29 */         TestData.SAMPLE_FILE.getAbsoluteFile(), 
/* 30 */         transientDocumentName, 
/* 31 */         TestData.VALID_MIME);
/* 32 */     transientDocumentId = response.getTransientDocumentId();
/*    */     
/* 34 */     return transientDocumentId;
/*    */   }
/*    */   
/*    */   public static TransientDocumentsApi getTransientDocumentsApi() {
/* 38 */     return transientDocumentsApi;
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\TransientDocumentsUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */