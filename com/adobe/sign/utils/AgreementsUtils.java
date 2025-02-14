/*     */ package com.adobe.sign.utils;
/*     */ import java.util.ArrayList;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.AgreementCreationInfo;
/*     */ import com.adobe.sign.model.agreements.AgreementCreationResponse;
/*     */ import com.adobe.sign.model.agreements.AgreementDocuments;
/*     */ import com.adobe.sign.model.agreements.Document;
/*     */ import com.adobe.sign.model.agreements.DocumentCreationInfo;
/*     */ import com.adobe.sign.model.agreements.FileInfo;
/*     */ import com.adobe.sign.model.agreements.PostSignOptions;
/*     */ import com.adobe.sign.model.agreements.RecipientInfo;
/*     */ import com.adobe.sign.model.agreements.RecipientSetInfo;
/*     */ import com.adobe.sign.model.agreements.URLFileInfo;
/*     */ import com.adobe.sign.model.agreements.UserAgreement;
/*     */ import com.adobe.sign.model.agreements.UserAgreements;
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
/*     */ public class AgreementsUtils
/*     */   extends ApiUtils
/*     */ {
/*  34 */   private static AgreementsApi agreementsApi = new AgreementsApi();
/*     */   
/*  36 */   private static String agreementId = null;
/*  37 */   private static String documentId = null;
/*  38 */   private static String libraryDocumentId = null;
/*  39 */   private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();
/*     */ 
/*     */   
/*     */   public static String getResourceId(String agreementName) throws ApiException {
/*  43 */     if (!isExistingAgreement(agreementName)) {
/*  44 */       agreementId = createAgreement(agreementName);
/*     */     }
/*  46 */     setDocumentId();
/*  47 */     return agreementId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String createAgreement(String name) throws ApiException {
/*  54 */     String agreementId = null;
/*  55 */     AgreementCreationInfo agreementCreationInfo = getAgreementCreationInfo(name);
/*  56 */     AgreementCreationResponse agreementCreationResponse = agreementsApi.createAgreement(headers, 
/*  57 */         agreementCreationInfo);
/*  58 */     agreementId = agreementCreationResponse.getAgreementId();
/*     */     
/*  60 */     return agreementId;
/*     */   }
/*     */ 
/*     */   
/*     */   public static AgreementCreationInfo getAgreementCreationInfo(String documentName) throws ApiException {
/*  65 */     String transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
/*  66 */     return getAgreementCreationInfo(TestData.POST_EMAIL, 
/*  67 */         TestData.NULL_PARAM, 
/*  68 */         RecipientSetInfo.RecipientSetRoleEnum.SIGNER, 
/*  69 */         TestData.NULL_PARAM, 
/*  70 */         TestData.NULL_PARAM, 
/*  71 */         transientDocumentId, 
/*  72 */         TestData.NULL_PARAM, 
/*  73 */         documentName, 
/*  74 */         DocumentCreationInfo.SignatureTypeEnum.ESIGN, 
/*  75 */         null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static AgreementCreationInfo getAgreementCreationInfo(String documentName, FileInfo fileInfo) {
/*  81 */     return getAgreementCreationInfo(TestData.POST_EMAIL, 
/*  82 */         TestData.NULL_PARAM, 
/*  83 */         RecipientSetInfo.RecipientSetRoleEnum.SIGNER, 
/*  84 */         fileInfo.getLibraryDocumentId(), 
/*  85 */         fileInfo.getLibraryDocumentName(), 
/*  86 */         fileInfo.getTransientDocumentId(), 
/*  87 */         (fileInfo.getDocumentURL() != null) ? fileInfo.getDocumentURL().getUrl() : TestData.NULL_PARAM, 
/*  88 */         documentName, 
/*  89 */         DocumentCreationInfo.SignatureTypeEnum.ESIGN, 
/*  90 */         null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static AgreementCreationInfo getAgreementCreationInfo(String documentName, PostSignOptions options) throws ApiException {
/*  96 */     libraryDocumentId = getLibraryDocumentId();
/*  97 */     return getAgreementCreationInfo(TestData.POST_EMAIL, 
/*  98 */         TestData.NULL_PARAM, 
/*  99 */         RecipientSetInfo.RecipientSetRoleEnum.SIGNER, 
/* 100 */         libraryDocumentId, 
/* 101 */         TestData.NULL_PARAM, 
/* 102 */         TestData.NULL_PARAM, 
/* 103 */         TestData.NULL_PARAM, 
/* 104 */         documentName, 
/* 105 */         DocumentCreationInfo.SignatureTypeEnum.ESIGN, 
/* 106 */         options);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AgreementCreationInfo getAgreementCreationInfo(String recipientEmail, String recipientFax, RecipientSetInfo.RecipientSetRoleEnum recipientRole, String documentName) throws ApiException {
/* 114 */     libraryDocumentId = getLibraryDocumentId();
/* 115 */     return getAgreementCreationInfo(recipientEmail, 
/* 116 */         recipientFax, 
/* 117 */         recipientRole, 
/* 118 */         libraryDocumentId, 
/* 119 */         TestData.NULL_PARAM, 
/* 120 */         TestData.NULL_PARAM, 
/* 121 */         TestData.NULL_PARAM, 
/* 122 */         documentName, 
/* 123 */         DocumentCreationInfo.SignatureTypeEnum.ESIGN, 
/* 124 */         null);
/*     */   }
/*     */ 
/*     */   
/*     */   public static AgreementCreationInfo getAgreementCreationInfo(DocumentCreationInfo.SignatureTypeEnum signatureType, String documentName) throws ApiException {
/* 129 */     libraryDocumentId = getLibraryDocumentId();
/* 130 */     return getAgreementCreationInfo(TestData.POST_EMAIL, 
/* 131 */         TestData.NULL_PARAM, 
/* 132 */         RecipientSetInfo.RecipientSetRoleEnum.SIGNER, 
/* 133 */         libraryDocumentId, 
/* 134 */         TestData.NULL_PARAM, 
/* 135 */         TestData.NULL_PARAM, 
/* 136 */         TestData.NULL_PARAM, 
/* 137 */         documentName, 
/* 138 */         signatureType, 
/* 139 */         null);
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
/*     */   public static AgreementCreationInfo getAgreementCreationInfo(String recipientEmail, String recipientFax, RecipientSetInfo.RecipientSetRoleEnum recipientRole, String fileInfoLibraryDocumentId, String fileInfoLibraryDocumentName, String fileInfoTransientDocumentId, String fileInfoDocumentUrl, String documentName, DocumentCreationInfo.SignatureTypeEnum signatureType, PostSignOptions options) {
/* 153 */     AgreementCreationInfo agreementCreationInfo = new AgreementCreationInfo();
/* 154 */     DocumentCreationInfo documentCreationInfo = new DocumentCreationInfo();
/*     */     
/* 156 */     RecipientInfo recipientInfo = new RecipientInfo();
/* 157 */     recipientInfo.setEmail(recipientEmail);
/* 158 */     recipientInfo.setFax(recipientFax);
/*     */     
/* 160 */     ArrayList<RecipientInfo> recipientInfoList = new ArrayList<>();
/* 161 */     recipientInfoList.add(recipientInfo);
/*     */     
/* 163 */     RecipientSetInfo recipientSetInfo = new RecipientSetInfo();
/* 164 */     recipientSetInfo.setRecipientSetMemberInfos(recipientInfoList);
/* 165 */     recipientSetInfo.setRecipientSetRole(recipientRole);
/*     */     
/* 167 */     ArrayList<RecipientSetInfo> recipientSetInfoList = new ArrayList<>();
/* 168 */     recipientSetInfoList.add(recipientSetInfo);
/* 169 */     FileInfo fileInfo = new FileInfo();
/*     */     
/* 171 */     fileInfo.setLibraryDocumentId(fileInfoLibraryDocumentId);
/* 172 */     fileInfo.setLibraryDocumentName(fileInfoLibraryDocumentName);
/* 173 */     fileInfo.setTransientDocumentId(fileInfoTransientDocumentId);
/*     */     
/* 175 */     if (fileInfoDocumentUrl != null) {
/* 176 */       URLFileInfo url = new URLFileInfo();
/* 177 */       url.setUrl(fileInfoDocumentUrl);
/* 178 */       fileInfo.setDocumentURL(url);
/*     */     } 
/*     */     
/* 181 */     ArrayList<FileInfo> fileInfoList = new ArrayList<>();
/* 182 */     fileInfoList.add(fileInfo);
/*     */     
/* 184 */     documentCreationInfo.setName(documentName);
/* 185 */     documentCreationInfo.setRecipientSetInfos(recipientSetInfoList);
/*     */     
/* 187 */     documentCreationInfo.setFileInfos(fileInfoList);
/* 188 */     documentCreationInfo.setSignatureType(signatureType);
/* 189 */     documentCreationInfo.setSignatureFlow(DocumentCreationInfo.SignatureFlowEnum.SENDER_SIGNATURE_NOT_REQUIRED);
/* 190 */     documentCreationInfo.setPostSignOptions(options);
/*     */     
/* 192 */     agreementCreationInfo.setDocumentCreationInfo(documentCreationInfo);
/*     */     
/* 194 */     return agreementCreationInfo;
/*     */   }
/*     */   
/*     */   public static AgreementsApi getAgreementsApi() {
/* 198 */     return agreementsApi;
/*     */   }
/*     */   
/*     */   public static String getDocumentId() {
/* 202 */     return documentId;
/*     */   }
/*     */   
/*     */   private static void setDocumentId() throws ApiException {
/* 206 */     AgreementDocuments agreementDocuments = agreementsApi.getAllDocuments(headers, 
/* 207 */         agreementId, 
/* 208 */         TestData.VERSION_ID, 
/* 209 */         TestData.PARTICIPANT_EMAIL, 
/* 210 */         TestData.AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT);
/*     */     
/* 212 */     ArrayList<Document> documents = (ArrayList<Document>)agreementDocuments.getDocuments();
/* 213 */     documentId = ((Document)documents.get(0)).getDocumentId();
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isExistingAgreement(String agreementName) throws ApiException {
/* 218 */     UserAgreements userAgreements = agreementsApi.getAgreements(headers, 
/* 219 */         TestData.AGREEMENT_QUERY, 
/* 220 */         TestData.AGREEMENT_EXTERNAL_ID, 
/* 221 */         TestData.AGREEMENT_EXTERNAL_GROUP, 
/* 222 */         TestData.AGREEMENT_EXTERNAL_NAMESPACE);
/*     */     
/* 224 */     for (UserAgreement agr : userAgreements.getUserAgreementList()) {
/* 225 */       if (agr.getStatus().equals(UserAgreement.StatusEnum.OUT_FOR_SIGNATURE) && agr.getName().equals(agreementName)) {
/* 226 */         agreementId = agr.getAgreementId();
/* 227 */         return true;
/*     */       } 
/*     */     } 
/* 230 */     return false;
/*     */   }
/*     */   
/*     */   private static String getLibraryDocumentId() throws ApiException {
/* 234 */     return LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\AgreementsUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */