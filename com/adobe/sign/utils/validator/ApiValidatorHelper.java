/*     */ package com.adobe.sign.utils.validator;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Date;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ import org.apache.commons.validator.routines.EmailValidator;
/*     */ import org.apache.commons.validator.routines.UrlValidator;

/*     */ 
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
/*     */ public class ApiValidatorHelper
/*     */ {
/*     */   private static final String X_API_USER_USER_ID_FORMAT_BEGINNING = "userid:";
/*     */   private static final String X_API_USER_EMAIL_ID_FORMAT_BEGINNING = "email:";
/*     */   private static final String ACCESS_TOKEN_KEY = "Access-Token";
/*     */   private static final String X_API_USER_KEY = "x-api-user";
/*     */   
/*     */   public static void validateHeaderParams(MultivaluedMap headerParams) throws ApiException {
/*  48 */     Set<String> keys = headerParams.keySet();
/*  49 */     boolean accessToken = false;
/*     */     
/*  51 */     for (String key : keys) {
/*  52 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  53 */         validateAccessToken(headerParams.get(key));
/*  54 */         accessToken = true; continue;
/*     */       } 
/*  56 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  57 */         validatexApiHeader(headerParams.get(key));
/*     */       }
/*     */     } 
/*  60 */     if (!accessToken) {
/*  61 */       throw new ApiException(SdkErrorCodes.NO_ACCESS_TOKEN_HEADER);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateRequiredParameters(ArrayList<String> paramList) throws ApiException {
/*  72 */     for (String param : paramList) {
/*  73 */       validateParameter(param);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> void validateParameter(T param) throws ApiException {
/*  83 */     validateParameter(param, SdkErrorCodes.MISSING_REQUIRED_PARAM);
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
/*     */   public static <T> void validateParameter(T param, SdkErrorCodes sdkErrorCode) throws ApiException {
/*  95 */     if (param == null) {
/*  96 */       throw new ApiException(sdkErrorCode);
/*     */     }
/*  98 */     if (param instanceof java.util.List && (new ArrayList(Arrays.asList(new Object[] { param }))).isEmpty()) {
/*  99 */       throw new ApiException(sdkErrorCode);
/*     */     }
/* 101 */     if (param instanceof String && StringUtil.isEmpty((String)param)) {
/* 102 */       throw new ApiException(sdkErrorCode);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateId(String id, SdkErrorCodes sdkErrorCode) throws ApiException {
/* 114 */     validateParameter(id, sdkErrorCode);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateEmailParamater(String email) throws ApiException {
/* 124 */     if (!EmailValidator.getInstance().isValid(email)) {
/* 125 */       throw new ApiException(SdkErrorCodes.INVALID_EMAIL);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateVersionId(String versionId) throws ApiException {
/* 135 */     if (versionId == null) {
/*     */       return;
/*     */     }
/* 138 */     if (versionId.length() == 0) {
/* 139 */       throw new ApiException(SdkErrorCodes.INVALID_VERSION_ID);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateParticipantEmail(String participantEmail) throws ApiException {
/* 149 */     if (participantEmail == null) {
/*     */       return;
/*     */     }
/* 152 */     if (!EmailValidator.getInstance().isValid(participantEmail)) {
/* 153 */       throw new ApiException(SdkErrorCodes.INVALID_PARTICIPANT);
/*     */     }
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateFileInfo(Object documentUrl, String libraryDocumentId, String libraryDocumentName, String transientDocumentId, String url) throws ApiException {
/* 173 */     int count = ((documentUrl != null) ? 1 : 0) + (
/* 174 */       StringUtil.isEmpty(libraryDocumentId) ? 0 : 1) + (
/* 175 */       StringUtil.isEmpty(libraryDocumentName) ? 0 : 1) + (
/* 176 */       StringUtil.isEmpty(transientDocumentId) ? 0 : 1);
/*     */     
/* 178 */     if (count != 1) {
/* 179 */       throw new ApiException(SdkErrorCodes.INVALID_FILE_INFO);
/*     */     }
/* 181 */     if (!StringUtil.isEmpty(url)) {
/* 182 */       validateUrlParameter(url, 
/* 183 */           SdkErrorCodes.URL_INVALID);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validatePostSignOptions(String redirectUrl, Integer redirectDelay) throws ApiException {
/* 195 */     if (StringUtil.isEmpty(redirectUrl)) {
/* 196 */       throw new ApiException(SdkErrorCodes.EMPTY_REDIRECT_URL);
/*     */     }
/* 198 */     if (redirectDelay != null && redirectDelay.intValue() < 0) {
/* 199 */       throw new ApiException(SdkErrorCodes.INVALID_REDIRECT_DELAY);
/*     */     }
/* 201 */     if (!UrlValidator.getInstance().isValid(redirectUrl)) {
/* 202 */       throw new ApiException(SdkErrorCodes.INVALID_REDIRECT_URL);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateVersionIdAndParticipantEmail(String versionId, String participantEmail) throws ApiException {
/* 210 */     validateVersionId(versionId);
/* 211 */     validateParticipantEmail(participantEmail);
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
/*     */   public static void validateRecipientSetInfos(String email, String fax, int numberOfRecipients) throws ApiException {
/* 223 */     if (StringUtil.isEmpty(fax) && StringUtil.isEmpty(email)) {
/* 224 */       throw new ApiException(SdkErrorCodes.MISSING_REQUIRED_PARAM);
/*     */     }
/* 226 */     if (!StringUtil.isEmpty(fax) && !StringUtil.isEmpty(email)) {
/* 227 */       throw new ApiException(SdkErrorCodes.INVALID_ARGUMENTS);
/*     */     }
/* 229 */     if (!StringUtil.isEmpty(fax) && numberOfRecipients > 1) {
/* 230 */       throw new ApiException(SdkErrorCodes.INVALID_ARGUMENTS);
/*     */     }
/* 232 */     if (email != null)
/* 233 */       validateEmailParamater(email); 
/* 234 */     if (fax != null) {
/* 235 */       validateParameter(fax);
/*     */     }
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
/*     */   public static void validateWorkflowRecipientSetInfos(String email, String fax, int numberOfRecipients) throws ApiException {
/* 248 */     if (StringUtil.isEmpty(fax) && StringUtil.isEmpty(email))
/* 249 */       throw new ApiException(SdkErrorCodes.MIN_ADDRESSES_NOT_MET); 
/* 250 */     validateRecipientSetInfos(email, fax, numberOfRecipients);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateUrlParameter(String url, SdkErrorCodes sdkErrorCode) throws ApiException {
/* 261 */     UrlValidator urlValidator = new UrlValidator(8L);
/* 262 */     if (!urlValidator.isValid(url)) {
/* 263 */       throw new ApiException(sdkErrorCode);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateStartAndEndDatesParameter(Date startDate, Date endDate) throws ApiException {
/* 274 */     validateParameter(startDate, 
/* 275 */         SdkErrorCodes.INVALID_DATE);
/* 276 */     validateParameter(endDate, 
/* 277 */         SdkErrorCodes.INVALID_DATE);
/*     */     
/* 279 */     if (endDate.before(startDate)) {
/* 280 */       throw new ApiException(SdkErrorCodes.INVALID_DATE);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void validateAccessToken(Object accessToken) throws ApiException {
/* 287 */     if (accessToken == null) {
/* 288 */       throw new ApiException(SdkErrorCodes.NO_ACCESS_TOKEN_HEADER);
/*     */     }
/* 290 */     String accessTokenValue = accessToken.toString();
/* 291 */     if (accessTokenValue.length() == 0) {
/* 292 */       throw new ApiException(SdkErrorCodes.INVALID_ACCESS_TOKEN);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void validatexApiHeader(Object xApiHeader) throws ApiException {
/* 300 */     if (xApiHeader == null) {
/*     */       return;
/*     */     }
/* 303 */     String xApiHeaderValue = xApiHeader.toString();
/* 304 */     if (xApiHeaderValue.length() == 0 || (
/* 305 */       !xApiHeaderValue.contains("email:") && !xApiHeaderValue.contains("userid:")))
/* 306 */       throw new ApiException(SdkErrorCodes.INVALID_X_API_USER_HEADER); 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\ApiValidatorHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */