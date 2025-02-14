/*     */ package com.adobe.sign.model.agreements;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.utils.StringUtil;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;

/*     */ import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
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
/*     */ @ApiModel(description = "")
/*     */ public class DocumentCreationInfo
/*     */ {
/*     */   private String callbackInfo;
/*     */   private List<String> ccs;
/*     */   private Integer daysUntilSigningDeadline;
/*     */   private ExternalId externalId;
/*     */   private List<FileInfo> fileInfos;
/*     */   private List<FileInfo> formFieldLayerTemplates;
/*     */   private List<RequestFormField> formFields;
/*     */   private String locale;
/*     */   private List<MergefieldInfo> mergeFieldInfo;
/*     */   private String message;
/*     */   
/*     */   public DocumentCreationInfo() {
/*  37 */     this.callbackInfo = null;
/*  38 */     this.ccs = new ArrayList<>();
/*  39 */     this.daysUntilSigningDeadline = null;
/*  40 */     this.externalId = null;
/*  41 */     this.fileInfos = new ArrayList<>();
/*  42 */     this.formFieldLayerTemplates = new ArrayList<>();
/*  43 */     this.formFields = new ArrayList<>();
/*  44 */     this.locale = null;
/*  45 */     this.mergeFieldInfo = new ArrayList<>();
/*  46 */     this.message = null;
/*  47 */     this.name = null;
/*  48 */     this.postSignOptions = null;
/*  49 */     this.recipientSetInfos = new ArrayList<>();
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
/*  75 */     this.reminderFrequency = null;
/*  76 */     this.securityOptions = null;
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
/*  98 */     this.signatureFlow = null;
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
/* 116 */     this.signatureType = null;
/* 117 */     this.vaultingInfo = null;
/*     */   }
/*     */   private String name;
/*     */   private PostSignOptions postSignOptions;
/*     */   private List<RecipientSetInfo> recipientSetInfos;
/*     */   private ReminderFrequencyEnum reminderFrequency;
/*     */   private SecurityOption securityOptions; private SignatureFlowEnum signatureFlow; private SignatureTypeEnum signatureType; private VaultingInfo vaultingInfo; public enum ReminderFrequencyEnum {
/*     */     DAILY_UNTIL_SIGNED("DAILY_UNTIL_SIGNED"), WEEKLY_UNTIL_SIGNED("WEEKLY_UNTIL_SIGNED"), WEEKDAILY_UNTIL_SIGNED("WEEKDAILY_UNTIL_SIGNED"), EVERY_OTHER_DAY_UNTIL_SIGNED("EVERY_OTHER_DAY_UNTIL_SIGNED"), EVERY_THIRD_DAY_UNTIL_SIGNED("EVERY_THIRD_DAY_UNTIL_SIGNED"), EVERY_FIFTH_DAY_UNTIL_SIGNED("EVERY_FIFTH_DAY_UNTIL_SIGNED"), NONE_SET(""); private String value; ReminderFrequencyEnum(String value) { this.value = value; } public String toString() { if (this.value.equals("")) return "NONE_SET";  return this.value; } } public enum SignatureFlowEnum {
/*     */     SENDER_SIGNATURE_NOT_REQUIRED("SENDER_SIGNATURE_NOT_REQUIRED"), SENDER_SIGNS_LAST("SENDER_SIGNS_LAST"), SENDER_SIGNS_FIRST("SENDER_SIGNS_FIRST"), SEQUENTIAL("SEQUENTIAL"), PARALLEL("PARALLEL"), SENDER_SIGNS_ONLY("SENDER_SIGNS_ONLY"); private String value; SignatureFlowEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum SignatureTypeEnum {
/* 126 */     ESIGN("ESIGN"), WRITTEN("WRITTEN"); private String value; SignatureTypeEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty("A publicly accessible url to which Adobe Sign will do an HTTP GET operation every time there is a new agreement event. HTTP authentication is supported using standard embedded syntax - i.e. http://username:password@your.server.com/path/to/file. Adobe Sign can also ping your system using HTTP PUT with the final signed PDF. Please contact support@echosign.com if you wish to use this option.") @JsonProperty("callbackInfo") public String getCallbackInfo() { return this.callbackInfo; }
/*     */   
/*     */   public void setCallbackInfo(String callbackInfo) {
/* 129 */     this.callbackInfo = callbackInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file")
/*     */   @JsonProperty("ccs")
/*     */   public List<String> getCcs() {
/* 139 */     return this.ccs;
/*     */   }
/*     */   public void setCcs(List<String> ccs) {
/* 142 */     this.ccs = ccs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The number of days that remain before the document expires. You cannot sign the document after it expires")
/*     */   @JsonProperty("daysUntilSigningDeadline")
/*     */   public Integer getDaysUntilSigningDeadline() {
/* 152 */     return this.daysUntilSigningDeadline;
/*     */   }
/*     */   public void setDaysUntilSigningDeadline(Integer daysUntilSigningDeadline) {
/* 155 */     this.daysUntilSigningDeadline = daysUntilSigningDeadline;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A unique identifier for your transaction from an external system. You can use the ExternalID to search for your transaction through API")
/*     */   @JsonProperty("externalId")
/*     */   public ExternalId getExternalId() {
/* 165 */     return this.externalId;
/*     */   }
/*     */   public void setExternalId(ExternalId externalId) {
/* 168 */     this.externalId = externalId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified")
/*     */   @JsonProperty("fileInfos")
/*     */   public List<FileInfo> getFileInfos() {
/* 178 */     return this.fileInfos;
/*     */   }
/*     */   public void setFileInfos(List<FileInfo> fileInfos) {
/* 181 */     this.fileInfos = fileInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified")
/*     */   @JsonProperty("formFieldLayerTemplates")
/*     */   public List<FileInfo> getFormFieldLayerTemplates() {
/* 191 */     return this.formFieldLayerTemplates;
/*     */   }
/*     */   public void setFormFieldLayerTemplates(List<FileInfo> formFieldLayerTemplates) {
/* 194 */     this.formFieldLayerTemplates = formFieldLayerTemplates;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Information of form fields of an agreement. PDF_SIGNATURE inputType field is currently not supported")
/*     */   @JsonProperty("formFields")
/*     */   public List<RequestFormField> getFormFields() {
/* 204 */     return this.formFields;
/*     */   }
/*     */   public void setFormFields(List<RequestFormField> formFields) {
/* 207 */     this.formFields = formFields;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender")
/*     */   @JsonProperty("locale")
/*     */   public String getLocale() {
/* 217 */     return this.locale;
/*     */   }
/*     */   public void setLocale(String locale) {
/* 220 */     this.locale = locale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported")
/*     */   @JsonProperty("mergeFieldInfo")
/*     */   public List<MergefieldInfo> getMergeFieldInfo() {
/* 230 */     return this.mergeFieldInfo;
/*     */   }
/*     */   public void setMergeFieldInfo(List<MergefieldInfo> mergeFieldInfo) {
/* 233 */     this.mergeFieldInfo = mergeFieldInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("An optional message to the recipients, describing what is being sent or why their signature is required")
/*     */   @JsonProperty("message")
/*     */   public String getMessage() {
/* 243 */     return this.message;
/*     */   }
/*     */   public void setMessage(String message) {
/* 246 */     this.message = message;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the agreement that will be used to identify it, in emails and on the website")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 256 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 259 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("URL and associated properties for the success page the user will be taken to after completing the signing process")
/*     */   @JsonProperty("postSignOptions")
/*     */   public PostSignOptions getPostSignOptions() {
/* 269 */     return this.postSignOptions;
/*     */   }
/*     */   public void setPostSignOptions(PostSignOptions postSignOptions) {
/* 272 */     this.postSignOptions = postSignOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A list of one or more recipient sets. A recipient set may have one or more recipients. If any member of the recipient set signs, the agreement is considered signed by the recipient set. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document. This limit includes the sender if the signature of the sender is also required. Note: If signatureFlow is set to SENDER_SIGNS_ONLY, this parameter is optional")
/*     */   @JsonProperty("recipientSetInfos")
/*     */   public List<RecipientSetInfo> getRecipientSetInfos() {
/* 282 */     return this.recipientSetInfos;
/*     */   }
/*     */   public void setRecipientSetInfos(List<RecipientSetInfo> recipientSetInfos) {
/* 285 */     this.recipientSetInfos = recipientSetInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Optional parameter that sets how often you want to send reminders to the recipients. The possible values are DAILY_UNTIL_SIGNED or WEEKLY_UNTIL_SIGNED")
/*     */   @JsonProperty("reminderFrequency")
/*     */   public ReminderFrequencyEnum getReminderFrequency() {
/* 295 */     return this.reminderFrequency;
/*     */   }
/*     */   public void setReminderFrequency(ReminderFrequencyEnum reminderFrequency) {
/* 298 */     this.reminderFrequency = reminderFrequency;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Sets optional secondary security parameters for your document")
/*     */   @JsonProperty("securityOptions")
/*     */   public SecurityOption getSecurityOptions() {
/* 308 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(SecurityOption securityOptions) {
/* 311 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Selects the workflow you would like to use - whether the sender needs to sign only, before the recipient, after the recipient, or not at all. The possible values for this variable are SENDER_SIGNATURE_NOT_REQUIRED, SENDER_SIGNS_LAST, SENDER_SIGNS_FIRST, SEQUENTIAL, PARALLEL or SENDER_SIGNS_ONLY. Note: leave unspecified for hybrid routing")
/*     */   @JsonProperty("signatureFlow")
/*     */   public SignatureFlowEnum getSignatureFlow() {
/* 321 */     return this.signatureFlow;
/*     */   }
/*     */   public void setSignatureFlow(SignatureFlowEnum signatureFlow) {
/* 324 */     this.signatureFlow = signatureFlow;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Specifies the type of signature you would like to request - written or e-signature. The possible values are ESIGN or WRITTEN")
/*     */   @JsonProperty("signatureType")
/*     */   public SignatureTypeEnum getSignatureType() {
/* 334 */     return this.signatureType;
/*     */   }
/*     */   public void setSignatureType(SignatureTypeEnum signatureType) {
/* 337 */     this.signatureType = signatureType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider")
/*     */   @JsonProperty("vaultingInfo")
/*     */   public VaultingInfo getVaultingInfo() {
/* 347 */     return this.vaultingInfo;
/*     */   }
/*     */   public void setVaultingInfo(VaultingInfo vaultingInfo) {
/* 350 */     this.vaultingInfo = vaultingInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 357 */     StringBuilder sb = new StringBuilder();
/* 358 */     sb.append("class DocumentCreationInfo {\n");
/*     */     
/* 360 */     sb.append("    callbackInfo: ").append(StringUtil.toIndentedString(this.callbackInfo)).append("\n");
/* 361 */     sb.append("    ccs: ").append(StringUtil.toIndentedString(this.ccs)).append("\n");
/* 362 */     sb.append("    daysUntilSigningDeadline: ").append(StringUtil.toIndentedString(this.daysUntilSigningDeadline)).append("\n");
/* 363 */     sb.append("    externalId: ").append(StringUtil.toIndentedString(this.externalId)).append("\n");
/* 364 */     sb.append("    fileInfos: ").append(StringUtil.toIndentedString(this.fileInfos)).append("\n");
/* 365 */     sb.append("    formFieldLayerTemplates: ").append(StringUtil.toIndentedString(this.formFieldLayerTemplates)).append("\n");
/* 366 */     sb.append("    formFields: ").append(StringUtil.toIndentedString(this.formFields)).append("\n");
/* 367 */     sb.append("    locale: ").append(StringUtil.toIndentedString(this.locale)).append("\n");
/* 368 */     sb.append("    mergeFieldInfo: ").append(StringUtil.toIndentedString(this.mergeFieldInfo)).append("\n");
/* 369 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 370 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 371 */     sb.append("    postSignOptions: ").append(StringUtil.toIndentedString(this.postSignOptions)).append("\n");
/* 372 */     sb.append("    recipientSetInfos: ").append(StringUtil.toIndentedString(this.recipientSetInfos)).append("\n");
/* 373 */     sb.append("    reminderFrequency: ").append(StringUtil.toIndentedString(this.reminderFrequency)).append("\n");
/* 374 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 375 */     sb.append("    signatureFlow: ").append(StringUtil.toIndentedString(this.signatureFlow)).append("\n");
/* 376 */     sb.append("    signatureType: ").append(StringUtil.toIndentedString(this.signatureType)).append("\n");
/* 377 */     sb.append("    vaultingInfo: ").append(StringUtil.toIndentedString(this.vaultingInfo)).append("\n");
/* 378 */     sb.append("}");
/* 379 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\DocumentCreationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */