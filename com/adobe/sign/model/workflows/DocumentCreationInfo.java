/*     */ package com.adobe.sign.model.workflows;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class DocumentCreationInfo
/*     */ {
/*     */   private String callbackInfo;
/*     */   private List<CcsInfo> ccs;
/*     */   private Integer daysUntilSigningDeadline;
/*     */   private List<CustomWorkflowFileInfo> fileInfos;
/*     */   private List<FileInfo> formFieldLayerTemplates;
/*     */   private List<WorkflowBasedFormField> formFields;
/*     */   private String locale;
/*     */   private List<MergefieldInfo> mergeFieldInfo;
/*     */   
/*     */   public DocumentCreationInfo() {
/*  38 */     this.callbackInfo = null;
/*  39 */     this.ccs = new ArrayList<>();
/*  40 */     this.daysUntilSigningDeadline = null;
/*  41 */     this.fileInfos = new ArrayList<>();
/*  42 */     this.formFieldLayerTemplates = new ArrayList<>();
/*  43 */     this.formFields = new ArrayList<>();
/*  44 */     this.locale = null;
/*  45 */     this.mergeFieldInfo = new ArrayList<>();
/*  46 */     this.message = null;
/*  47 */     this.name = null;
/*  48 */     this.postSignOptions = null;
/*  49 */     this.recipientsListInfo = new ArrayList<>();
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
/*  67 */     this.reminderFrequency = null;
/*  68 */     this.securityOptions = null;
/*  69 */     this.vaultingInfo = null;
/*     */   } private String message; private String name; private PostSignOptions postSignOptions; private List<RecipientsInfo> recipientsListInfo; private ReminderFrequencyEnum reminderFrequency; private SecurityOption securityOptions; private VaultingInfo vaultingInfo; public enum ReminderFrequencyEnum { DAILY_UNTIL_SIGNED("DAILY_UNTIL_SIGNED"),
/*     */     WEEKLY_UNTIL_SIGNED("WEEKLY_UNTIL_SIGNED"); private String value; ReminderFrequencyEnum(String value) {
/*     */       this.value = value;
/*     */     } public String toString() {
/*     */       return this.value;
/*     */     } } @ApiModelProperty("A publicly accessible url to which Adobe Sign will do an HTTP GET operation every time there is a new agreement event. HTTP authentication is supported using standard embedded syntax - i.e. http://username:password@your.server.com/path/to/file. Adobe Sign can also ping your system using HTTP PUT with the final signed PDF. Please contact support@echosign.com if you wish to use this option.")
/*     */   @JsonProperty("callbackInfo")
/*     */   public String getCallbackInfo() {
/*  78 */     return this.callbackInfo;
/*     */   }
/*     */   public void setCallbackInfo(String callbackInfo) {
/*  81 */     this.callbackInfo = callbackInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file")
/*     */   @JsonProperty("ccs")
/*     */   public List<CcsInfo> getCcs() {
/*  91 */     return this.ccs;
/*     */   }
/*     */   public void setCcs(List<CcsInfo> ccs) {
/*  94 */     this.ccs = ccs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The number of days that remain before the document expires. You cannot sign the document after it expires")
/*     */   @JsonProperty("daysUntilSigningDeadline")
/*     */   public Integer getDaysUntilSigningDeadline() {
/* 104 */     return this.daysUntilSigningDeadline;
/*     */   }
/*     */   public void setDaysUntilSigningDeadline(Integer daysUntilSigningDeadline) {
/* 107 */     this.daysUntilSigningDeadline = daysUntilSigningDeadline;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified")
/*     */   @JsonProperty("fileInfos")
/*     */   public List<CustomWorkflowFileInfo> getFileInfos() {
/* 117 */     return this.fileInfos;
/*     */   }
/*     */   public void setFileInfos(List<CustomWorkflowFileInfo> fileInfos) {
/* 120 */     this.fileInfos = fileInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified")
/*     */   @JsonProperty("formFieldLayerTemplates")
/*     */   public List<FileInfo> getFormFieldLayerTemplates() {
/* 130 */     return this.formFieldLayerTemplates;
/*     */   }
/*     */   public void setFormFieldLayerTemplates(List<FileInfo> formFieldLayerTemplates) {
/* 133 */     this.formFieldLayerTemplates = formFieldLayerTemplates;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Information of form fields of an agreement. PDF_SIGNATURE inputType field is currently not supported")
/*     */   @JsonProperty("formFields")
/*     */   public List<WorkflowBasedFormField> getFormFields() {
/* 143 */     return this.formFields;
/*     */   }
/*     */   public void setFormFields(List<WorkflowBasedFormField> formFields) {
/* 146 */     this.formFields = formFields;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender")
/*     */   @JsonProperty("locale")
/*     */   public String getLocale() {
/* 156 */     return this.locale;
/*     */   }
/*     */   public void setLocale(String locale) {
/* 159 */     this.locale = locale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported")
/*     */   @JsonProperty("mergeFieldInfo")
/*     */   public List<MergefieldInfo> getMergeFieldInfo() {
/* 169 */     return this.mergeFieldInfo;
/*     */   }
/*     */   public void setMergeFieldInfo(List<MergefieldInfo> mergeFieldInfo) {
/* 172 */     this.mergeFieldInfo = mergeFieldInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("An optional message to the recipients, describing what is being sent or why their signature is required")
/*     */   @JsonProperty("message")
/*     */   public String getMessage() {
/* 182 */     return this.message;
/*     */   }
/*     */   public void setMessage(String message) {
/* 185 */     this.message = message;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the agreement that will be used to identify it, in emails and on the website")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 195 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 198 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("URL and associated properties for the success page the user will be taken to after completing the signing process")
/*     */   @JsonProperty("postSignOptions")
/*     */   public PostSignOptions getPostSignOptions() {
/* 208 */     return this.postSignOptions;
/*     */   }
/*     */   public void setPostSignOptions(PostSignOptions postSignOptions) {
/* 211 */     this.postSignOptions = postSignOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A list of one or more recipients. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document. This limit includes the sender if the signature of the sender is also required")
/*     */   @JsonProperty("recipientsListInfo")
/*     */   public List<RecipientsInfo> getRecipientsListInfo() {
/* 221 */     return this.recipientsListInfo;
/*     */   }
/*     */   public void setRecipientsListInfo(List<RecipientsInfo> recipientsListInfo) {
/* 224 */     this.recipientsListInfo = recipientsListInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Optional parameter that sets how often you want to send reminders to the recipients. The possible values are DAILY_UNTIL_SIGNED or WEEKLY_UNTIL_SIGNED")
/*     */   @JsonProperty("reminderFrequency")
/*     */   public ReminderFrequencyEnum getReminderFrequency() {
/* 234 */     return this.reminderFrequency;
/*     */   }
/*     */   public void setReminderFrequency(ReminderFrequencyEnum reminderFrequency) {
/* 237 */     this.reminderFrequency = reminderFrequency;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Sets optional secondary security parameters for your document")
/*     */   @JsonProperty("securityOptions")
/*     */   public SecurityOption getSecurityOptions() {
/* 247 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(SecurityOption securityOptions) {
/* 250 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider")
/*     */   @JsonProperty("vaultingInfo")
/*     */   public VaultingInfo getVaultingInfo() {
/* 260 */     return this.vaultingInfo;
/*     */   }
/*     */   public void setVaultingInfo(VaultingInfo vaultingInfo) {
/* 263 */     this.vaultingInfo = vaultingInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 270 */     StringBuilder sb = new StringBuilder();
/* 271 */     sb.append("class DocumentCreationInfo {\n");
/*     */     
/* 273 */     sb.append("    callbackInfo: ").append(StringUtil.toIndentedString(this.callbackInfo)).append("\n");
/* 274 */     sb.append("    ccs: ").append(StringUtil.toIndentedString(this.ccs)).append("\n");
/* 275 */     sb.append("    daysUntilSigningDeadline: ").append(StringUtil.toIndentedString(this.daysUntilSigningDeadline)).append("\n");
/* 276 */     sb.append("    fileInfos: ").append(StringUtil.toIndentedString(this.fileInfos)).append("\n");
/* 277 */     sb.append("    formFieldLayerTemplates: ").append(StringUtil.toIndentedString(this.formFieldLayerTemplates)).append("\n");
/* 278 */     sb.append("    formFields: ").append(StringUtil.toIndentedString(this.formFields)).append("\n");
/* 279 */     sb.append("    locale: ").append(StringUtil.toIndentedString(this.locale)).append("\n");
/* 280 */     sb.append("    mergeFieldInfo: ").append(StringUtil.toIndentedString(this.mergeFieldInfo)).append("\n");
/* 281 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 282 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 283 */     sb.append("    postSignOptions: ").append(StringUtil.toIndentedString(this.postSignOptions)).append("\n");
/* 284 */     sb.append("    recipientsListInfo: ").append(StringUtil.toIndentedString(this.recipientsListInfo)).append("\n");
/* 285 */     sb.append("    reminderFrequency: ").append(StringUtil.toIndentedString(this.reminderFrequency)).append("\n");
/* 286 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 287 */     sb.append("    vaultingInfo: ").append(StringUtil.toIndentedString(this.vaultingInfo)).append("\n");
/* 288 */     sb.append("}");
/* 289 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\DocumentCreationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */