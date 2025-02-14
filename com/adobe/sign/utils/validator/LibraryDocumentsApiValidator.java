/*     */ package com.adobe.sign.utils.validator;
/*     */ import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.model.libraryDocuments.FileInfo;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryCreationInfo;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationInfo;
/*     */ import com.adobe.sign.utils.ApiException;
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
/*     */ public class LibraryDocumentsApiValidator
/*     */ {
/*     */   public static void getLibraryDocumentsValidator() throws ApiException {}
/*     */   
/*     */   public static void createLibraryDocumentValidator(LibraryCreationInfo libraryCreationInfo) throws ApiException {
/*  43 */     ApiValidatorHelper.validateParameter(libraryCreationInfo);
/*     */     
/*  45 */     LibraryDocumentCreationInfo libraryDocumentCreationInfo = libraryCreationInfo.getLibraryDocumentCreationInfo();
/*     */     
/*  47 */     validateFileInfo(libraryDocumentCreationInfo.getFileInfos());
/*     */     
/*  49 */     ApiValidatorHelper.validateParameter(libraryDocumentCreationInfo.getLibrarySharingMode());
/*  50 */     ApiValidatorHelper.validateParameter(libraryDocumentCreationInfo.getLibraryTemplateTypes());
/*     */     
/*  52 */     ApiValidatorHelper.validateParameter(libraryDocumentCreationInfo.getName());
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
/*     */   public static void getLibraryDocumentInfoValidator(String libraryDocumentId) throws ApiException {
/*  64 */     ApiValidatorHelper.validateId(libraryDocumentId, 
/*  65 */         SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void deleteLibraryDocumentValidator(String libraryDocumentId) throws ApiException {
/*  76 */     ApiValidatorHelper.validateId(libraryDocumentId, 
/*  77 */         SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getLibraryDocumentAuditTrailValidator(String libraryDocumentId) throws ApiException {
/*  88 */     ApiValidatorHelper.validateId(libraryDocumentId, 
/*  89 */         SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
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
/*     */   
/*     */   public static void getCombinedDocumentValidator(String libraryDocumentId, Boolean auditReport) throws ApiException {
/* 102 */     ApiValidatorHelper.validateId(libraryDocumentId, 
/* 103 */         SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getDocumentsValidator(String libraryDocumentId) throws ApiException {
/* 114 */     ApiValidatorHelper.validateId(libraryDocumentId, 
/* 115 */         SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
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
/*     */ 
/*     */   
/*     */   public static void getLibraryDocumentValidator(String libraryDocumentId, String documentId) throws ApiException {
/* 129 */     ApiValidatorHelper.validateId(libraryDocumentId, 
/* 130 */         SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID);
/* 131 */     ApiValidatorHelper.validateId(documentId, 
/* 132 */         SdkErrorCodes.INVALID_DOCUMENT_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validateFileInfo(List<FileInfo> fileInfos) throws ApiException {
/* 139 */     if (fileInfos == null) {
/* 140 */       throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */     }
/* 142 */     for (FileInfo fileInfo : fileInfos) {
/*     */       
/* 144 */       if (fileInfo == null) {
/* 145 */         throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */       }
/* 147 */       String url = (fileInfo.getDocumentURL() == null) ? null : fileInfo.getDocumentURL().getUrl();
/* 148 */       ApiValidatorHelper.validateFileInfo(fileInfo.getDocumentURL(), 
/* 149 */           fileInfo.getLibraryDocumentId(), 
/* 150 */           fileInfo.getLibraryDocumentName(), 
/* 151 */           fileInfo.getTransientDocumentId(), 
/* 152 */           url);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\LibraryDocumentsApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */