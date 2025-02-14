/*     */ package com.adobe.sign.utils;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.util.Date;
/*     */ import java.util.Properties;
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
/*     */ public class TestData
/*     */ {
/*  22 */   private static final String CONFIG_PATH = String.valueOf(ApiUtils.getSdkAbsolutePath()) + "src/test/java/com/adobe/sign/resources/config.properties";
/*  23 */   private static Properties properties = ApiUtils.getProperties(CONFIG_PATH);
/*     */   
/*     */   private static final String FALSE = "false";
/*     */   
/*     */   private static final String MINUS_ONE = "-1";
/*     */   
/*     */   private static final String ACCESS_TOKEN_KEY = "accessToken";
/*     */   
/*     */   private static final String NULL_PARAM_KEY = "nullParam";
/*     */   private static final String EMPTY_PARAM_KEY = "emptyParam";
/*     */   private static final String X_API_HEADER_KEY = "xApiHeader";
/*     */   private static final String X_USER_EMAIL_KEY = "xUserEmail";
/*     */   private static final String GROUP_NAME_SUFFIX_KEY = "groupNameSuffix";
/*     */   private static final String GROUP_NAME_KEY = "groupName";
/*     */   private static final String MODIFIED_GROUP_NAME_KEY = "modifiedGroupName";
/*     */   private static final String FIRST_NAME_KEY = "firstName";
/*     */   private static final String LAST_NAME_KEY = "LastName";
/*     */   private static final String EMAIL_PREFIX_KEY = "emailPrefix";
/*     */   private static final String EMAIL_DOMAIN_KEY = "emailDomain";
/*     */   private static final String USER_EMAIL_KEY = "userEmail";
/*     */   private static final String MODIFIED_FIRST_NAME_KEY = "modifiedFirstName";
/*     */   private static final String INVALID_KEY = "invalidEmail";
/*     */   private static final String START_PAGE_KEY = "startPage";
/*     */   private static final String END_PAGE_KEY = "endPage";
/*     */   private static final String IMAGE_SIZE_KEY = "imageSize";
/*     */   private static final String VERSION_ID_KEY = "versionId";
/*     */   private static final String POST_EMAIL_KEY = "postEmail";
/*     */   private static final String POST_FAX_KEY = "postFax";
/*     */   private static final String REDIRECT_URL_KEY = "redirectURL";
/*     */   private static final String PARTICPANT_EMAIL_KEY = "participantEmail";
/*     */   private static final String AGREEMENT_NAME_PREFIX_KEY = "agreementNamePrefix";
/*     */   private static final String AGREEMENT_NAME_KEY = "agreementName";
/*     */   private static final String AGREEMENT_QUERY_KEY = "agreementQuery";
/*     */   private static final String AGREEMENT_EXTERNAL_ID_KEY = "agreementExternalId";
/*     */   private static final String AGREEMENT_EXTERNAL_GROUP_KEY = "agreementExternalGroup";
/*     */   private static final String AGREEMENT_EXTERNAL_NAMESPACE_KEY = "agreementExternalNamespace";
/*     */   private static final String AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT_KEY = "agreementSupportingDocumentContentFormat";
/*     */   private static final String INVALID_URL_KEY = "invalidUrl";
/*     */   private static final String INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO_KEY = "includeSupportingDocumentsPagesInfo";
/*     */   private static final String INCLUDE_SUPPORTING_DOCUMENTS_IMAGE_URLS_KEY = "includeSupportingDocumentsImageURLs";
/*     */   private static final String ATTACH_SUPPORTING_DOCUMENTS_KEY = "attachSupportingDocuments";
/*     */   private static final String AUDIT_REPORT_KEY = "auditReport";
/*     */   private static final String SHOW_IMAGE_AVAILIBILITY_KEY = "showImageAvailability";
/*     */   private static final String PRIVATE_MESSAGE_KEY = "privateMessage";
/*     */   private static final String INVALID_REDIRECT_DELAY_KEY = "invalidRedirectDelay";
/*     */   private static final String LIBRARY_DOCUMENT_NAME_KEY = "libraryDocumentName";
/*     */   private static final String LIBRARY_DOCUMENT_NAME_PREFIX_KEY = "libraryDocumentNamePrefix";
/*     */   private static final String TRANSIENT_DOCUMENT_NAME_KEY = "transientDocumentName";
/*     */   private static final String SAMPLE_FILE_KEY = "sampleFile";
/*     */   private static final String NO_EXTENSION_FILE_KEY = "noExtensionFile";
/*     */   private static final String VALID_MIME_KEY = "validMime";
/*     */   private static final String EMPTY_MIME_KEY = "emptyMime";
/*     */   private static final String WIDGET_NAME_KEY = "widgetName";
/*     */   private static final String WIDGET_NAME_PREFIX_KEY = "widgetNamePrefix";
/*     */   private static final String WIDGET_UPDATE_MESSAGE_KEY = "widgetUpdateMessage";
/*     */   private static final String MEGASIGN_NAME_KEY = "megaSignName";
/*     */   private static final String MEGASIGN_NAME_PREFIX_KEY = "megaSignNamePrefix";
/*     */   private static final String MEGASIGN_QUERY_KEY = "megaSignQuery";
/*     */   private static final String ACCEPT_KEY = "accept";
/*     */   private static final String GROUP_ID_KEY = "groupId";
/*     */   private static final String WORKFLOW_ID_KEY = "workflowId";
/*     */   private static final String INCLUDE_DRAFT_WORKFLOWS_KEY = "includeDraftWorkflows";
/*     */   private static final String WORKFLOW_RECIPIENT_INFO_NAME_KEY = "workflowRecipientName";
/*     */   private static final String daysBeforeCurrentDate = "daysBeforeCurrentDate";
/*     */   private static final String pageSize = "pageSize";
/*     */   private static final String REDIRECT_URI_KEY = "redirectUri";
/*     */   private static final String STATE_KEY = "state";
/*     */   private static final String CLIENT_ID_KEY = "clientId";
/*     */   private static final String CLIENT_SECRET_KEY = "clientSecret";
/*     */   private static final String ACCESS_TOKEN_GRANT_TYPE_KEY = "accessTokenGrantType";
/*     */   private static final String REFRESH_TOKEN_GRANT_TYPE_KEY = "refreshTokenGrantType";
/*     */   private static final String RESPONSE_TYPE_KEY = "responseType";
/*     */   private static final String RETRY_COUNT_KEY = "retryCount";
/*     */   private static final String ENV_HOST_NAME_KEY = "envHostName";
/*  97 */   public static final String ACCESS_TOKEN = properties.getProperty("accessToken").equals("null") ? null : properties.getProperty("accessToken");
/*     */   
/*  99 */   public static final String NULL_PARAM = properties.getProperty("nullParam").equals("null") ? null : properties.getProperty("nullParam");
/* 100 */   public static final String EMPTY_PARAM = properties.getProperty("emptyParam").equals("null") ? null : properties.getProperty("emptyParam");
/*     */   
/* 102 */   public static final String X_API_HEADER = properties.getProperty("xApiHeader").equals("null") ? null : properties.getProperty("xApiHeader");
/* 103 */   public static final String X_USER_EMAIL = properties.getProperty("xUserEmail").equals("null") ? null : properties.getProperty("xUserEmail");
/* 104 */   public static final String ENV_HOST_NAME = properties.getProperty("envHostName").equals("null") ? null : properties.getProperty("envHostName");
/*     */   
/* 106 */   public static final String RETRY_COUNT = properties.getProperty("retryCount").equals("null") ? null : properties.getProperty("retryCount");
/*     */ 
/*     */   
/* 109 */   public static final String GROUP_NAME_PREFIX = properties.getProperty("groupNameSuffix").equals("null") ? null : properties.getProperty("groupNameSuffix");
/* 110 */   public static final String GROUP_NAME = properties.getProperty("groupName").equals("null") ? null : properties.getProperty("groupName");
/*     */   
/* 112 */   public static final String MODIFIED_GROUP_NAME = properties.getProperty("modifiedGroupName").equals("null") ? null : properties.getProperty("modifiedGroupName");
/*     */ 
/*     */   
/* 115 */   public static final String FIRST_NAME = properties.getProperty("firstName").equals("null") ? null : properties.getProperty("firstName");
/* 116 */   public static final String LAST_NAME = properties.getProperty("LastName").equals("null") ? null : properties.getProperty("LastName");
/* 117 */   public static final String EMAIL = properties.getProperty("emailPrefix").equals("null") ? null : properties.getProperty("emailPrefix");
/* 118 */   public static final String EMAIL_DOMAIN = properties.getProperty("emailDomain").equals("null") ? null : properties.getProperty("emailDomain");
/* 119 */   public static final String USER_EMAIL = properties.getProperty("userEmail").equals("null") ? null : properties.getProperty("userEmail");
/* 120 */   public static final String MODIFIED_FIRST_NAME = properties.getProperty("modifiedFirstName").equals("null") ? null : properties.getProperty("modifiedFirstName");
/* 121 */   public static final String INVALID_EMAIL = properties.getProperty("invalidEmail").equals("null") ? null : properties.getProperty("invalidEmail");
/*     */ 
/*     */ 
/*     */   
/* 125 */   public static final int START_PAGE = Integer.parseInt(properties.getProperty("startPage").equals("null") ? "-1" : properties.getProperty("startPage"));
/* 126 */   public static final int END_PAGE = Integer.parseInt(properties.getProperty("endPage").equals("null") ? "-1" : properties.getProperty("endPage"));
/*     */   
/* 128 */   public static String IMAGE_SIZE = properties.getProperty("imageSize").equals("null") ? null : properties.getProperty("imageSize");
/* 129 */   public static final String VERSION_ID = properties.getProperty("versionId").equals("null") ? null : properties.getProperty("versionId");
/*     */   
/* 131 */   public static final String POST_EMAIL = properties.getProperty("postEmail").equals("null") ? null : properties.getProperty("postEmail");
/* 132 */   public static final String POST_FAX = properties.getProperty("postFax").equals("null") ? null : properties.getProperty("postFax");
/* 133 */   public static final String REDIRECT_URL = properties.getProperty("redirectURL").equals("null") ? null : properties.getProperty("redirectURL");
/* 134 */   public static final String PARTICIPANT_EMAIL = properties.getProperty("participantEmail").equals("null") ? null : properties.getProperty("participantEmail");
/* 135 */   public static final String AGREEMENT_NAME_PREFIX = properties.getProperty("agreementNamePrefix").equals("null") ? null : properties.getProperty("agreementNamePrefix");
/* 136 */   public static final String AGREEMENT_NAME = properties.getProperty("agreementName").equals("null") ? null : properties.getProperty("agreementName");
/* 137 */   public static final String AGREEMENT_QUERY = properties.getProperty("agreementQuery").equals("null") ? null : properties.getProperty("agreementQuery");
/* 138 */   public static final String AGREEMENT_EXTERNAL_ID = properties.getProperty("agreementExternalId").equals("null") ? null : properties.getProperty("agreementExternalId");
/* 139 */   public static final String AGREEMENT_EXTERNAL_GROUP = properties.getProperty("agreementExternalGroup").equals("null") ? null : properties.getProperty("agreementExternalGroup");
/* 140 */   public static final String AGREEMENT_EXTERNAL_NAMESPACE = properties.getProperty("agreementExternalNamespace").equals("null") ? null : properties.getProperty("agreementExternalNamespace");
/* 141 */   public static final String AGREEMENT_SUPPORTING_DOCUMENT_CONTENT_FORMAT = properties.getProperty("agreementSupportingDocumentContentFormat").equals("null") ? null : properties.getProperty("agreementSupportingDocumentContentFormat");
/* 142 */   public static final String INVALID_URL = properties.getProperty("invalidUrl").equals("null") ? null : properties.getProperty("invalidUrl");
/*     */   
/* 144 */   public static final boolean INCLUDE_SUPPORTING_DOCUMENTS_PAGES_INFO = Boolean.parseBoolean(properties.getProperty("includeSupportingDocumentsPagesInfo").equals("null") ? "false" : properties.getProperty("includeSupportingDocumentsPagesInfo"));
/* 145 */   public static final boolean INCLUDE_SUPPORTING_DOCUMENT_IMAGE_URLS = Boolean.parseBoolean(properties.getProperty("includeSupportingDocumentsImageURLs").equals("null") ? "false" : properties.getProperty("includeSupportingDocumentsImageURLs"));
/* 146 */   public static final boolean ATTACH_SUPPORTING_DOCUMENTS = Boolean.parseBoolean(properties.getProperty("attachSupportingDocuments").equals("null") ? "false" : properties.getProperty("attachSupportingDocuments"));
/* 147 */   public static final boolean AUDIT_REPORT = Boolean.parseBoolean(properties.getProperty("auditReport").equals("null") ? "false" : properties.getProperty("auditReport"));
/* 148 */   public static final boolean SHOW_IMAGE_AVAILIBILITY = Boolean.parseBoolean(properties.getProperty("showImageAvailability").equals("null") ? "false" : properties.getProperty("showImageAvailability"));
/*     */   
/* 150 */   public static final String PRIVATE_MESSAGE = properties.getProperty("privateMessage").equals("null") ? null : properties.getProperty("privateMessage");
/* 151 */   public static final int INVALID_REDIRECT_DELAY = Integer.parseInt(properties.getProperty("invalidRedirectDelay").equals("null") ? "-1" : properties.getProperty("invalidRedirectDelay"));
/*     */ 
/*     */   
/* 154 */   public static final String LIBRARY_DOCUMENT_NAME = properties.getProperty("libraryDocumentName").equals("null") ? null : properties.getProperty("libraryDocumentName");
/* 155 */   public static final String LIBRARY_DOCUMENT_NAME_PREFIX = properties.getProperty("libraryDocumentNamePrefix").equals("null") ? null : properties.getProperty("libraryDocumentNamePrefix");
/*     */ 
/*     */   
/* 158 */   public static final String TRANSIENT_DOCUMENT_NAME = properties.getProperty("transientDocumentName").equals("null") ? null : properties.getProperty("transientDocumentName");
/* 159 */   public static final File SAMPLE_FILE = new File(properties.getProperty("sampleFile").equals("null") ? null : (String.valueOf(ApiUtils.getSdkAbsolutePath()) + properties.getProperty("sampleFile")));
/* 160 */   public static final File NO_EXTENSION_FILE = new File(properties.getProperty("noExtensionFile").equals("null") ? null : properties.getProperty("noExtensionFile"));
/* 161 */   public static final String VALID_MIME = properties.getProperty("validMime").equals("null") ? null : properties.getProperty("validMime");
/* 162 */   public static final String EMPTY_MIME = properties.getProperty("emptyMime").equals("null") ? null : properties.getProperty("emptyMime");
/*     */ 
/*     */   
/* 165 */   public static final String WIDGET_NAME = properties.getProperty("widgetName").equals("null") ? null : properties.getProperty("widgetName");
/* 166 */   public static final String WIDGET_NAME_PREFIX = properties.getProperty("widgetNamePrefix").equals("null") ? null : properties.getProperty("widgetNamePrefix");
/* 167 */   public static final String WIDGET_UPDATE_MESSAGE = properties.getProperty("widgetUpdateMessage").equals("null") ? null : properties.getProperty("widgetUpdateMessage");
/*     */   
/* 169 */   public static final String MEGASIGN_NAME = properties.getProperty("megaSignName").equals("null") ? null : properties.getProperty("megaSignName");
/* 170 */   public static final String MEGASIGN_NAME_PREFIX = properties.getProperty("megaSignNamePrefix").equals("null") ? null : properties.getProperty("megaSignNamePrefix");
/* 171 */   public static final String MEGASIGN_QUERY = properties.getProperty("megaSignQuery").equals("null") ? null : properties.getProperty("megaSignQuery");
/* 172 */   public static final String ACCEPT = properties.getProperty("accept").equals("null") ? null : properties.getProperty("accept");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 177 */   public static final int DAYS_BEFORE_CURRENT_DATE = Integer.parseInt(properties.getProperty("daysBeforeCurrentDate").equals("null") ? "-1" : properties.getProperty("daysBeforeCurrentDate"));
/* 178 */   public static final Date STATIC_START_DATE = ApiUtils.getDate(-DAYS_BEFORE_CURRENT_DATE);
/* 179 */   public static final Date STATIC_END_DATE = ApiUtils.getDate(0);
/*     */   
/* 181 */   public static final int PAGE_SIZE = Integer.parseInt(properties.getProperty("pageSize").equals("null") ? "-1" : properties.getProperty("pageSize"));
/*     */ 
/*     */   
/* 184 */   public static final boolean INCLUDE_DRAFT_WORKFLOWS = Boolean.parseBoolean(properties.getProperty("includeDraftWorkflows").equals("null") ? "false" : properties.getProperty("includeDraftWorkflows"));
/* 185 */   public static final String GROUP_ID = properties.getProperty("groupId").equals("null") ? null : properties.getProperty("groupId");
/* 186 */   public static final String WORKFLOW_ID = properties.getProperty("workflowId").equals("null") ? null : properties.getProperty("workflowId");
/* 187 */   public static final String WORKFLOW_RECIPIENT_INFO_NAME = properties.getProperty("workflowRecipientName").equals("null") ? null : properties.getProperty("workflowRecipientName");
/*     */ 
/*     */   
/* 190 */   public static final String REDIRECT_URI = properties.getProperty("redirectUri").equals("null") ? null : properties.getProperty("redirectUri");
/* 191 */   public static final String STATE = properties.getProperty("state").equals("null") ? null : properties.getProperty("state");
/* 192 */   public static final String CLIENT_ID = properties.getProperty("clientId").equals("null") ? null : properties.getProperty("clientId");
/* 193 */   public static final String CLIENT_SECRET = properties.getProperty("clientSecret").equals("null") ? null : properties.getProperty("clientSecret");
/* 194 */   public static final String ACCESS_TOKEN_GRANT_TYPE = properties.getProperty("accessTokenGrantType").equals("null") ? null : properties.getProperty("accessTokenGrantType");
/* 195 */   public static final String REFRESH_TOKEN_GRANT_TYPE = properties.getProperty("refreshTokenGrantType").equals("null") ? null : properties.getProperty("refreshTokenGrantType");
/* 196 */   public static final String RESPONSE_TYPE = properties.getProperty("responseType").equals("null") ? null : properties.getProperty("responseType");
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\TestData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */