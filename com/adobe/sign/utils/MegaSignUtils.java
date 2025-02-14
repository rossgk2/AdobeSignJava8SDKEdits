/*     */ package com.adobe.sign.utils;
/*     */ import java.util.ArrayList;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.api.MegaSignsApi;
/*     */ import com.adobe.sign.model.megaSigns.FileInfo;
/*     */ import com.adobe.sign.model.megaSigns.MegaSign;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignCreationInfo;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignCreationRequest;
/*     */ import com.adobe.sign.model.megaSigns.MegaSignCreationResponse;
/*     */ import com.adobe.sign.model.megaSigns.MegaSigns;
/*     */ import com.adobe.sign.model.megaSigns.PostSignOptions;
/*     */ import com.adobe.sign.model.megaSigns.RecipientInfo;
/*     */ import com.adobe.sign.model.megaSigns.RecipientSetInfo;
/*     */ import com.adobe.sign.model.megaSigns.URLFileInfo;
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
/*     */ public class MegaSignUtils
/*     */   extends ApiUtils
/*     */ {
/*  31 */   private static MegaSignsApi megaSignsApi = new MegaSignsApi();
/*  32 */   private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();
/*     */   
/*  34 */   private static String megaSignId = null;
/*     */   
/*     */   public static String getResourceId(String megaSignName) throws ApiException {
/*  37 */     if (!isExistingMegaSign(megaSignName)) {
/*  38 */       megaSignId = createMegaSign(megaSignName);
/*     */     }
/*  40 */     return megaSignId;
/*     */   }
/*     */   
/*     */   public static String createMegaSign(String name) throws ApiException {
/*  44 */     String megaSignId = null;
/*  45 */     MegaSignCreationRequest megaSignCreationRequest = getMegaSignCreationRequest(name);
/*     */     
/*  47 */     MegaSignCreationResponse megaSignCreationResponse = megaSignsApi.createMegaSign(headers, 
/*  48 */         megaSignCreationRequest);
/*  49 */     megaSignId = megaSignCreationResponse.getMegaSignId();
/*     */     
/*  51 */     return megaSignId;
/*     */   }
/*     */ 
/*     */   
/*     */   public static MegaSignCreationRequest getMegaSignCreationRequest(String documentName) throws ApiException {
/*  56 */     String libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
/*  57 */     return getMegaSignCreationRequest(TestData.POST_EMAIL, 
/*  58 */         TestData.NULL_PARAM, 
/*  59 */         libraryDocumentId, 
/*  60 */         TestData.NULL_PARAM, 
/*  61 */         TestData.NULL_PARAM, 
/*  62 */         TestData.NULL_PARAM, 
/*  63 */         documentName, 
/*  64 */         MegaSignCreationInfo.SignatureTypeEnum.ESIGN, 
/*  65 */         null);
/*     */   }
/*     */   
/*     */   public static MegaSignCreationRequest getMegaSignCreationRequest(String documentName, FileInfo fileInfo) {
/*  69 */     return getMegaSignCreationRequest(TestData.POST_EMAIL, 
/*  70 */         TestData.NULL_PARAM, 
/*  71 */         fileInfo.getLibraryDocumentId(), 
/*  72 */         fileInfo.getLibraryDocumentName(), 
/*  73 */         fileInfo.getTransientDocumentId(), 
/*  74 */         (fileInfo.getDocumentURL() != null) ? fileInfo.getDocumentURL().getUrl() : TestData.NULL_PARAM, 
/*  75 */         documentName, 
/*  76 */         MegaSignCreationInfo.SignatureTypeEnum.ESIGN, 
/*  77 */         null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static MegaSignCreationRequest getMegaSignCreationRequest(String documentName, PostSignOptions postSignOptions) throws ApiException {
/*  83 */     String libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
/*  84 */     return getMegaSignCreationRequest(TestData.POST_EMAIL, 
/*  85 */         TestData.NULL_PARAM, 
/*  86 */         libraryDocumentId, 
/*  87 */         TestData.NULL_PARAM, 
/*  88 */         TestData.NULL_PARAM, 
/*  89 */         TestData.NULL_PARAM, 
/*  90 */         documentName, 
/*  91 */         MegaSignCreationInfo.SignatureTypeEnum.ESIGN, 
/*  92 */         postSignOptions);
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
/*     */   public static MegaSignCreationRequest getMegaSignCreationRequest(String recipientEmail, String recipientFax, String fileInfoLibraryDocumentId, String fileInfoLibraryDocumentName, String fileInfoTransientDocumentId, String fileInfoDocumentUrl, String documentName, MegaSignCreationInfo.SignatureTypeEnum signatureType, PostSignOptions options) {
/* 106 */     MegaSignCreationRequest megaSignCreationRequest = new MegaSignCreationRequest();
/* 107 */     MegaSignCreationInfo megaSignCreationInfo = new MegaSignCreationInfo();
/*     */     
/* 109 */     RecipientInfo recipientInfo = new RecipientInfo();
/* 110 */     recipientInfo.setEmail(recipientEmail);
/* 111 */     recipientInfo.setFax(recipientFax);
/*     */     
/* 113 */     ArrayList<RecipientInfo> recipientInfoList = new ArrayList<>();
/* 114 */     recipientInfoList.add(recipientInfo);
/*     */     
/* 116 */     RecipientSetInfo recipientSetInfo = new RecipientSetInfo();
/* 117 */     recipientSetInfo.setRecipientSetMemberInfos(recipientInfoList);
/*     */     
/* 119 */     ArrayList<RecipientSetInfo> recipientSetInfoList = new ArrayList<>();
/* 120 */     recipientSetInfoList.add(recipientSetInfo);
/* 121 */     megaSignCreationInfo.setRecipientSetInfos(recipientSetInfoList);
/*     */     
/* 123 */     FileInfo fileInfo = new FileInfo();
/*     */     
/* 125 */     fileInfo.setLibraryDocumentId(fileInfoLibraryDocumentId);
/* 126 */     fileInfo.setLibraryDocumentName(fileInfoLibraryDocumentName);
/* 127 */     fileInfo.setTransientDocumentId(fileInfoTransientDocumentId);
/*     */     
/* 129 */     if (fileInfoDocumentUrl != null) {
/* 130 */       URLFileInfo url = new URLFileInfo();
/* 131 */       url.setUrl(fileInfoDocumentUrl);
/* 132 */       fileInfo.setDocumentURL(url);
/*     */     } 
/*     */     
/* 135 */     ArrayList<FileInfo> fileInfoList = new ArrayList<>();
/* 136 */     fileInfoList.add(fileInfo);
/*     */     
/* 138 */     megaSignCreationInfo.setName(documentName);
/* 139 */     megaSignCreationInfo.setFileInfos(fileInfoList);
/* 140 */     megaSignCreationInfo.setSignatureType(signatureType);
/* 141 */     megaSignCreationInfo.setPostSignOptions(options);
/*     */     
/* 143 */     megaSignCreationRequest.setMegaSignCreationInfo(megaSignCreationInfo);
/* 144 */     return megaSignCreationRequest;
/*     */   }
/*     */   
/*     */   public static boolean isExistingMegaSign(String staticMegaSignName) throws ApiException {
/* 148 */     MegaSigns megaSigns = megaSignsApi.getMegaSigns(headers, 
/* 149 */         TestData.MEGASIGN_QUERY);
/*     */     
/* 151 */     for (MegaSign megaSign : megaSigns.getMegaSignList()) {
/* 152 */       if (megaSign.getName().equals(staticMegaSignName) && megaSign.getStatus().equals(MegaSign.StatusEnum.OUT_FOR_SIGNATURE)) {
/* 153 */         megaSignId = megaSign.getMegaSignId();
/* 154 */         return true;
/*     */       } 
/*     */     } 
/* 157 */     return false;
/*     */   }
/*     */   
/*     */   public static MegaSignsApi getMegaSignsApi() {
/* 161 */     return megaSignsApi;
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\MegaSignUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */