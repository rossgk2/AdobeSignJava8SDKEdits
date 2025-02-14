/*     */ package com.adobe.sign.utils.validator;
/*     */ 
/*     */ import javax.ws.rs.core.Response;
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
/*     */ public enum SdkErrorCodes
/*     */ {
/*  23 */   OK("", Response.Status.OK),
/*  24 */   EMPTY_REDIRECT_URL("If PostSignOptions are specified, the redirectUrl must not be empty", Response.Status.BAD_REQUEST),
/*  25 */   INVALID_ACCESS_TOKEN("Access token provided is invalid or has expired", Response.Status.UNAUTHORIZED),
/*  26 */   INVALID_ARGUMENTS("One or more arguments to the method are invalid", Response.Status.BAD_REQUEST),
/*  27 */   INVALID_DOCUMENT_ID("The Document ID specified is invalid", Response.Status.NOT_FOUND),
/*  28 */   INVALID_EMAIL("Email provided is invalid", Response.Status.BAD_REQUEST),
/*  29 */   INVALID_FILE_INFO("Invalid or no file info is provided", Response.Status.BAD_REQUEST),
/*  30 */   INVALID_LIBRARYDOCUMENT_NAME("The Library Document name specified is invalid", Response.Status.NOT_FOUND),
/*  31 */   INVALID_PARTICIPANT("The participant email specified is invalid", Response.Status.NOT_FOUND),
/*  32 */   INVALID_REDIRECT_DELAY("The redirectDelay specified in PostSignOptions must be nonnegative integer", Response.Status.BAD_REQUEST),
/*  33 */   INVALID_REDIRECT_URL("The redirectUrl specified in PostSignOptions is not a valid URL", Response.Status.BAD_REQUEST),
/*  34 */   INVALID_TRANSIENTDOCUMENT_ID("The Transient Document ID specified is invalid", Response.Status.NOT_FOUND),
/*  35 */   INVALID_X_API_USER_HEADER("Value provided in x-api-user header is in invalid format", Response.Status.BAD_REQUEST),
/*  36 */   INVALID_VERSION_ID("The Version ID specified is invalid", Response.Status.NOT_FOUND),
/*  37 */   MISSING_REQUIRED_PARAM("Required parameters are missing.", Response.Status.BAD_REQUEST),
/*  38 */   MIN_ADDRESSES_NOT_MET("Some fields minimum entries requirement is not met.", Response.Status.BAD_REQUEST),
/*  39 */   MUST_PROVIDE_EMAIL("Must provide email for user creation", Response.Status.BAD_REQUEST),
/*  40 */   NO_ACCESS_TOKEN_HEADER("Access token header not provided", Response.Status.UNAUTHORIZED),
/*  41 */   EMPTY_EXTERNALID_PARAMETER("ExternalId parameter can not be empty", Response.Status.BAD_REQUEST),
/*  42 */   INVALID_AGREEMENT_ID("The Agreement ID specified is invalid", Response.Status.NOT_FOUND),
/*  43 */   INVALID_PARTICIPANT_ID("The participant ID specified is invalid", Response.Status.NOT_FOUND),
/*  44 */   INVALID_PARTICIPANT_SET_ID("The participant set ID specified is invalid", Response.Status.NOT_FOUND),
/*  45 */   EMPTY_PRIVATE_MESSAGE("The message specified for the alternate participant addition cannot be empty", Response.Status.BAD_REQUEST),
/*  46 */   MUST_PROVIDE_VALID_AGREEMENT_STATUS("Must provide a valid agreement status", Response.Status.BAD_REQUEST),
/*  47 */   MUST_PROVIDE_VALID_USER_STATUS("Must provide a valid user status", Response.Status.BAD_REQUEST),
/*  48 */   RECIPIENT_SET_NOT_SUPPORTED("Recipient set with multiple recipients is not supported for a Mega Sign.", Response.Status.BAD_REQUEST),
/*  49 */   PRIVATE_MESSAGES_NOT_ENABLED("Sending private messages to recipients is not enabled for this user", Response.Status.FORBIDDEN),
/*  50 */   URL_INVALID("Provided document URL is invalid.", Response.Status.BAD_REQUEST),
/*  51 */   INVALID_GROUP_ID("The Group ID specified is invalid", Response.Status.NOT_FOUND),
/*  52 */   INVALID_GROUP_NAME("The group name provided is not valid or is already taken, group names must be a unique non-empty strings no longer than 255 characters.", Response.Status.BAD_REQUEST),
/*  53 */   INVALID_LIBRARYDOCUMENT_ID("The Library Document ID specified is invalid", Response.Status.NOT_FOUND),
/*  54 */   INVALID_MEGASIGN_ID("The Mega Sign ID specified is invalid", Response.Status.NOT_FOUND),
/*  55 */   INVALID_MEGASIGN_STATUS("Must provide a valid mega sign status.", Response.Status.BAD_REQUEST),
/*  56 */   MUST_PROVIDE_AGREEMENT_ID("Must provide an Agreement ID", Response.Status.BAD_REQUEST),
/*  57 */   INVALID_DATE("Date requested is invalid. Please check end date is greater than start date and range is not greater than 180 days", Response.Status.BAD_REQUEST),
/*  58 */   INVALID_PAGE_CURSOR("Page cursor provided is invalid", Response.Status.BAD_REQUEST),
/*  59 */   INVALID_SEARCH_ID("Search ID provided is invalid", Response.Status.NOT_FOUND),
/*  60 */   NO_FILE_NAME("Must provide file name", Response.Status.BAD_REQUEST),
/*  61 */   NO_FILE_CONTENT("Must provide file body", Response.Status.BAD_REQUEST),
/*  62 */   NO_MEDIA_TYPE("No media type specified", Response.Status.UNSUPPORTED_MEDIA_TYPE),
/*  63 */   INVALID_USER_ID("The User ID specified is invalid", Response.Status.NOT_FOUND),
/*  64 */   INVALID_RECIPIENT_EMAIL("Recipient email is missing or invalid", Response.Status.NOT_FOUND),
/*  65 */   INVALID_AGREEMENT_ASSET_ID("The Agreement Asset ID specified is invalid", Response.Status.BAD_REQUEST),
/*  66 */   INVALID_TARGET_VIEW("Invalid Target View", Response.Status.BAD_REQUEST),
/*  67 */   INVALID_SIGNATURE_FLOW("Only SENDER_SIGNATURE_NOT_REQUIRED and SENDER_SIGNS_LAST are permitted for widgets", Response.Status.BAD_REQUEST),
/*  68 */   INVALID_URL("The redirect URL is not valid", Response.Status.BAD_REQUEST),
/*  69 */   INVALID_WIDGET_ID("The Widget ID specified is invalid", Response.Status.NOT_FOUND),
/*  70 */   MUST_PROVIDE_VALID_WIDGET_STATUS("Must provide a valid widget status", Response.Status.BAD_REQUEST),
/*  71 */   NO_ACTION_SPECIFIED("Either a redirectUrl or a message is required", Response.Status.BAD_REQUEST),
/*  72 */   TOO_MANY_ACTIONS_SPECIFIED("Cannot specify both a redirectUrl and a message", Response.Status.BAD_REQUEST),
/*  73 */   INVALID_WORKFLOW_ID("The Workflow ID specified is invalid", Response.Status.NOT_FOUND),
/*  74 */   FILE_INFO_NAME_MISSING("Name is missing in FileInfo field", Response.Status.BAD_REQUEST),
/*  75 */   INVALID_REQUEST("The redirect_uri does not match configuration", Response.Status.BAD_REQUEST);
/*     */   
/*     */   private String message;
/*     */   private Response.Status status;
/*     */   
/*     */   SdkErrorCodes(String message, Response.Status status) {
/*  81 */     this.message = message;
/*  82 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMessage() {
/*  89 */     return this.message;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getHttpCode() {
/*  96 */     return this.status.getStatusCode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getApiCode() {
/* 103 */     return name();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\validator\SdkErrorCodes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */