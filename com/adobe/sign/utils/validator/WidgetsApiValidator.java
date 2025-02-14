/*     */ package com.adobe.sign.utils.validator;
/*     */ import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.model.widgets.CounterSignerInfo;
/*     */ import com.adobe.sign.model.widgets.CounterSignerSetInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetCreationInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetCreationRequest;
/*     */ import com.adobe.sign.model.widgets.WidgetFileInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetPersonalizationInfo;
/*     */ import com.adobe.sign.model.widgets.WidgetStatusUpdateInfo;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.StringUtil;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WidgetsApiValidator
/*     */ {
/*     */   public static void getWidgetsValidator() throws ApiException {}
/*     */   
/*     */   public static void createWidgetValidator(WidgetCreationRequest widgetCreationRequest) throws ApiException {
/*  51 */     ApiValidatorHelper.validateParameter(widgetCreationRequest);
/*     */     
/*  53 */     WidgetCreationInfo widgetCreationInfo = widgetCreationRequest.getWidgetCreationInfo();
/*  54 */     ApiValidatorHelper.validateParameter(widgetCreationInfo);
/*     */     
/*  56 */     List<WidgetFileInfo> fileInfos = widgetCreationInfo.getFileInfos();
/*  57 */     validateFileInfo(fileInfos);
/*     */     
/*  59 */     ApiValidatorHelper.validateParameter(widgetCreationInfo.getName());
/*     */     
/*  61 */     if (widgetCreationInfo.getSignatureFlow() != null) {
/*  62 */       ApiValidatorHelper.validateParameter(widgetCreationInfo.getSignatureFlow(), 
/*  63 */           SdkErrorCodes.INVALID_SIGNATURE_FLOW);
/*     */     }
/*  65 */     List<CounterSignerSetInfo> counterSignerSetInfo = widgetCreationInfo.getCounterSignerSetInfos();
/*  66 */     if (counterSignerSetInfo != null) {
/*  67 */       validateCounterSignerSetInfo(counterSignerSetInfo);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getWidgetInfoValidator(String widgetId) throws ApiException {
/*  77 */     ApiValidatorHelper.validateId(widgetId, 
/*  78 */         SdkErrorCodes.INVALID_WIDGET_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getWidgetAgreementsValidator(String widgetId) throws ApiException {
/*  88 */     ApiValidatorHelper.validateId(widgetId, 
/*  89 */         SdkErrorCodes.INVALID_WIDGET_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getWidgetAuditTrailValidator(String widgetId) throws ApiException {
/*  99 */     ApiValidatorHelper.validateId(widgetId, 
/* 100 */         SdkErrorCodes.INVALID_WIDGET_ID);
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
/*     */ 
/*     */   
/*     */   public static void getWidgetCombinedDocumentValidator(String widgetId, String versionId, String participantEmail, Boolean auditReport) throws ApiException {
/* 116 */     ApiValidatorHelper.validateId(widgetId, 
/* 117 */         SdkErrorCodes.INVALID_WIDGET_ID);
/* 118 */     ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
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
/*     */   public static void getWidgetDocumentsValidator(String widgetId, String versionId, String participantEmail) throws ApiException {
/* 132 */     ApiValidatorHelper.validateId(widgetId, 
/* 133 */         SdkErrorCodes.INVALID_WIDGET_ID);
/* 134 */     ApiValidatorHelper.validateVersionIdAndParticipantEmail(versionId, participantEmail);
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
/*     */   public static void getWidgetDocumentInfoValidator(String widgetId, String documentId) throws ApiException {
/* 146 */     ApiValidatorHelper.validateId(widgetId, 
/* 147 */         SdkErrorCodes.INVALID_WIDGET_ID);
/* 148 */     ApiValidatorHelper.validateId(documentId, 
/* 149 */         SdkErrorCodes.INVALID_DOCUMENT_ID);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void getWidgetFormDataValidator(String widgetId) throws ApiException {
/* 159 */     ApiValidatorHelper.validateId(widgetId, 
/* 160 */         SdkErrorCodes.INVALID_WIDGET_ID);
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
/*     */   public static void updateWidgetPersonalizeValidator(String widgetId, WidgetPersonalizationInfo widgetPersonalizationInfo) throws ApiException {
/* 172 */     ApiValidatorHelper.validateId(widgetId, 
/* 173 */         SdkErrorCodes.INVALID_WIDGET_ID);
/* 174 */     ApiValidatorHelper.validateParameter(widgetPersonalizationInfo);
/* 175 */     ApiValidatorHelper.validateEmailParamater(widgetPersonalizationInfo.getEmail());
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
/*     */   public static void updateWidgetStatusValidator(String widgetId, WidgetStatusUpdateInfo widgetStatusUpdateInfo) throws ApiException {
/* 187 */     ApiValidatorHelper.validateId(widgetId, 
/* 188 */         SdkErrorCodes.INVALID_WIDGET_ID);
/* 189 */     ApiValidatorHelper.validateParameter(widgetStatusUpdateInfo);
/* 190 */     ApiValidatorHelper.validateParameter(widgetStatusUpdateInfo.getValue(), 
/* 191 */         SdkErrorCodes.MUST_PROVIDE_VALID_WIDGET_STATUS);
/*     */ 
/*     */     
/* 194 */     String message = widgetStatusUpdateInfo.getMessage();
/* 195 */     String redirectUrl = widgetStatusUpdateInfo.getRedirectUrl();
/*     */     
/* 197 */     if (!StringUtil.isEmpty(message) && !StringUtil.isEmpty(redirectUrl)) {
/* 198 */       throw new ApiException(SdkErrorCodes.TOO_MANY_ACTIONS_SPECIFIED);
/*     */     }
/* 200 */     if (StringUtil.isEmpty(message) && StringUtil.isEmpty(redirectUrl)) {
/* 201 */       throw new ApiException(SdkErrorCodes.NO_ACTION_SPECIFIED);
/*     */     }
/* 203 */     if (!StringUtil.isEmpty(redirectUrl)) {
/* 204 */       ApiValidatorHelper.validateUrlParameter(redirectUrl, 
/* 205 */           SdkErrorCodes.INVALID_URL);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validateFileInfo(List<WidgetFileInfo> fileInfos) throws ApiException {
/* 212 */     if (fileInfos == null) {
/* 213 */       throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */     }
/* 215 */     for (WidgetFileInfo fileInfo : fileInfos) {
/*     */       
/* 217 */       if (fileInfo == null) {
/* 218 */         throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */       }
/* 220 */       String url = (fileInfo.getDocumentURL() == null) ? null : fileInfo.getDocumentURL().getUrl();
/* 221 */       ApiValidatorHelper.validateFileInfo(fileInfo.getDocumentURL(), 
/* 222 */           fileInfo.getLibraryDocumentId(), 
/* 223 */           fileInfo.getLibraryDocumentName(), 
/* 224 */           fileInfo.getTransientDocumentId(), 
/* 225 */           url);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validateCounterSignerSetInfo(List<CounterSignerSetInfo> counterSignerSetInfos) throws ApiException {
/* 233 */     for (CounterSignerSetInfo counterSignerSetInfo : counterSignerSetInfos) {
/*     */       
/* 235 */       ApiValidatorHelper.validateParameter(counterSignerSetInfo.getCounterSignerSetMemberInfos());
/* 236 */       List<CounterSignerInfo> counterSignerInfos = counterSignerSetInfo.getCounterSignerSetMemberInfos();
/* 237 */       int numberOfRecipients = counterSignerInfos.size();
/*     */       
/* 239 */       for (CounterSignerInfo counterSignerInfo : counterSignerInfos) {
/* 240 */         ApiValidatorHelper.validateRecipientSetInfos(counterSignerInfo.getEmail(), null, numberOfRecipients);
/*     */       }
/* 242 */       ApiValidatorHelper.validateParameter(counterSignerSetInfo.getCounterSignerSetRole());
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\WidgetsApiValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */