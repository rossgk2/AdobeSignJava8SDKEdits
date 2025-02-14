/*    */ package com.adobe.sign.utils.validator;
/*    */ import java.io.File;

/*    */ 
/*    */ import com.adobe.sign.utils.ApiException;
/*    */ import com.adobe.sign.utils.StringUtil;
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
/*    */ public class TransientDocumentsApiValidator
/*    */ {
/*    */   public static void createTransientDocumentValidator(String fileName, String mimeType, File file) throws ApiException {
/* 37 */     ApiValidatorHelper.validateParameter(fileName, 
/* 38 */         SdkErrorCodes.NO_FILE_NAME);
/*    */     
/* 40 */     ApiValidatorHelper.validateParameter(file, 
/* 41 */         SdkErrorCodes.NO_FILE_CONTENT);
/*    */     
/* 43 */     int extensionPos = file.getName().lastIndexOf(".");
/*    */     
/* 45 */     if (extensionPos < 0 && StringUtil.isEmpty(mimeType))
/* 46 */       throw new ApiException(SdkErrorCodes.NO_MEDIA_TYPE); 
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\TransientDocumentsApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */