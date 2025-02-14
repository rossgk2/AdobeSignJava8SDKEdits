/*     */ package com.adobe.sign.utils;
/*     */ 
/*     */ import com.adobe.sign.api.LibraryDocumentsApi;
/*     */ import com.adobe.sign.model.libraryDocuments.DocumentLibraryItem;
/*     */ import com.adobe.sign.model.libraryDocuments.DocumentLibraryItems;
/*     */ import com.adobe.sign.model.libraryDocuments.Documents;
/*     */ import com.adobe.sign.model.libraryDocuments.FileInfo;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryCreationInfo;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationInfo;
/*     */ import com.adobe.sign.model.libraryDocuments.LibraryDocumentCreationResponse;
/*     */ import com.adobe.sign.model.libraryDocuments.OriginalDocument;
/*     */ import com.adobe.sign.model.libraryDocuments.URLFileInfo;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import javax.ws.rs.core.MultivaluedMap;
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
/*     */ public class LibraryDocumentsUtils
/*     */ {
/*  35 */   private static LibraryDocumentsApi libraryDocumentsApi = new LibraryDocumentsApi();
/*  36 */   private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();
/*     */   
/*  38 */   private static String documentId = null;
/*  39 */   private static String libraryDocumentId = null;
/*     */   
/*     */   public static String getResourceId(String libraryDocumentName) throws ApiException {
/*  42 */     if (!isExistingLibraryDocument(libraryDocumentName)) {
/*  43 */       libraryDocumentId = createLibraryDocument(libraryDocumentName);
/*     */     }
/*  45 */     setDocumentId(libraryDocumentId);
/*  46 */     return libraryDocumentId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String createLibraryDocument(String name) throws ApiException {
/*  52 */     LibraryCreationInfo libraryCreationInfo = getLibraryCreationInfo(name);
/*  53 */     LibraryDocumentCreationResponse response = libraryDocumentsApi.createLibraryDocument(headers, 
/*  54 */         libraryCreationInfo);
/*  55 */     libraryDocumentId = response.getLibraryDocumentId();
/*  56 */     return libraryDocumentId;
/*     */   }
/*     */ 
/*     */   
/*     */   public static LibraryCreationInfo getLibraryCreationInfo(String documentName) throws ApiException {
/*  61 */     String transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     return getLibraryCreationInfo(Arrays.asList(new LibraryDocumentCreationInfo.LibraryTemplateTypesEnum[] { LibraryDocumentCreationInfo.LibraryTemplateTypesEnum.DOCUMENT }), LibraryDocumentCreationInfo.LibrarySharingModeEnum.USER, TestData.NULL_PARAM, TestData.NULL_PARAM, transientDocumentId, TestData.NULL_PARAM, documentName);
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
/*     */   public static LibraryCreationInfo getLibraryCreationInfo(FileInfo fileInfo, String documentName) {
/*  80 */     return getLibraryCreationInfo(Arrays.asList(new LibraryDocumentCreationInfo.LibraryTemplateTypesEnum[] { LibraryDocumentCreationInfo.LibraryTemplateTypesEnum.DOCUMENT }), LibraryDocumentCreationInfo.LibrarySharingModeEnum.USER, fileInfo.getLibraryDocumentId(), fileInfo.getLibraryDocumentName(), fileInfo.getTransientDocumentId(), (fileInfo.getDocumentURL() != null) ? fileInfo.getDocumentURL().getUrl() : TestData.NULL_PARAM, documentName);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static LibraryCreationInfo getLibraryCreationInfo(List<LibraryDocumentCreationInfo.LibraryTemplateTypesEnum> templateType, LibraryDocumentCreationInfo.LibrarySharingModeEnum sharingMode, String documentName) {
/*  86 */     return getLibraryCreationInfo(templateType, 
/*  87 */         sharingMode, 
/*  88 */         libraryDocumentId, 
/*  89 */         TestData.NULL_PARAM, 
/*  90 */         TestData.NULL_PARAM, 
/*  91 */         TestData.NULL_PARAM, 
/*  92 */         documentName);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static LibraryCreationInfo getLibraryCreationInfo(List<LibraryDocumentCreationInfo.LibraryTemplateTypesEnum> templateType, LibraryDocumentCreationInfo.LibrarySharingModeEnum sharingMode, String fileInfoLibraryDocumentId, String fileInfoLibraryDocumentName, String fileInfoTransientDocumentId, String fileInfoDocumentUrl, String documentName) {
/* 103 */     LibraryCreationInfo libraryCreationInfo = new LibraryCreationInfo();
/* 104 */     LibraryDocumentCreationInfo libraryDocumentCreationInfo = new LibraryDocumentCreationInfo();
/*     */     
/* 106 */     libraryDocumentCreationInfo.setLibrarySharingMode(sharingMode);
/* 107 */     libraryDocumentCreationInfo.setLibraryTemplateTypes(templateType);
/*     */     
/* 109 */     FileInfo fileInfo = new FileInfo();
/* 110 */     fileInfo.setLibraryDocumentId(fileInfoLibraryDocumentId);
/* 111 */     fileInfo.setLibraryDocumentName(fileInfoLibraryDocumentName);
/* 112 */     fileInfo.setTransientDocumentId(fileInfoTransientDocumentId);
/*     */     
/* 114 */     if (fileInfoDocumentUrl != null) {
/* 115 */       URLFileInfo url = new URLFileInfo();
/* 116 */       url.setUrl(fileInfoDocumentUrl);
/* 117 */       fileInfo.setDocumentURL(url);
/*     */     } 
/*     */     
/* 120 */     ArrayList<FileInfo> fileInfoList = new ArrayList<>();
/* 121 */     fileInfoList.add(fileInfo);
/*     */     
/* 123 */     libraryDocumentCreationInfo.setName(documentName);
/* 124 */     libraryDocumentCreationInfo.setFileInfos(fileInfoList);
/*     */     
/* 126 */     libraryCreationInfo.setLibraryDocumentCreationInfo(libraryDocumentCreationInfo);
/*     */     
/* 128 */     return libraryCreationInfo;
/*     */   }
/*     */   
/*     */   public static LibraryDocumentsApi getLibraryDocumentsApi() {
/* 132 */     return libraryDocumentsApi;
/*     */   }
/*     */   
/*     */   public static String getDocumentId() {
/* 136 */     return documentId;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void setDocumentId(String libraryDocumentId2) throws ApiException {
/* 141 */     Documents documents = libraryDocumentsApi.getDocuments(headers, 
/* 142 */         libraryDocumentId);
/* 143 */     List<OriginalDocument> documentsList = documents.getDocuments();
/* 144 */     documentId = ((OriginalDocument)documentsList.get(0)).getDocumentId();
/*     */   }
/*     */   
/*     */   public static boolean isExistingLibraryDocument(String name) throws ApiException {
/* 148 */     DocumentLibraryItems documentLibraryItems = libraryDocumentsApi.getLibraryDocuments(headers);
/* 149 */     for (DocumentLibraryItem agr : documentLibraryItems.getLibraryDocumentList()) {
/* 150 */       if (agr.getScope().equals(DocumentLibraryItem.ScopeEnum.PERSONAL) && agr.getName().equals(name)) {
/* 151 */         libraryDocumentId = agr.getLibraryDocumentId();
/* 152 */         return true;
/*     */       } 
/*     */     } 
/* 155 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\LibraryDocumentsUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */