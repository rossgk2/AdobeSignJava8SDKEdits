/*     */ package com.adobe.sign.model.megaSigns;

import java.util.ArrayList;
import java.util.List;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*     */ @ApiModel(description = "")
/*     */ public class MegaSignCreationInfo {
/*     */   private String callbackInfo;
/*     */   private List<String> ccs;
/*     */   private Integer daysUntilSigningDeadline;
/*     */   private ExternalId externalId;
/*     */   private List<FileInfo> fileInfos;
/*     */   private List<FileInfo> formFieldLayerTemplates;
/*     */   private String locale;
/*     */   private List<MergefieldInfo> mergeFieldInfo;
/*     */   private String mergeFileTransientId;
/*     */   private String message;
/*     */   private String name;
/*     */   private PostSignOptions postSignOptions;
/*     */   private List<RecipientSetInfo> recipientSetInfos;
/*     */   private ReminderFrequencyEnum reminderFrequency;
/*     */   private SecurityOption securityOptions;
/*     */   private SignatureTypeEnum signatureType;
/*     */   private VaultingInfo vaultingInfo;
/*     */   
/*     */   public enum ReminderFrequencyEnum {
/*     */     DAILY_UNTIL_SIGNED("DAILY_UNTIL_SIGNED"),
/*     */     WEEKLY_UNTIL_SIGNED("WEEKLY_UNTIL_SIGNED");
/*     */     private String value;
/*     */     
/*     */     ReminderFrequencyEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return this.value;
/*     */     }
/*     */   }
/*     */   
/*  36 */   public MegaSignCreationInfo() { this.callbackInfo = null;
/*  37 */     this.ccs = new ArrayList<>();
/*  38 */     this.daysUntilSigningDeadline = null;
/*  39 */     this.externalId = null;
/*  40 */     this.fileInfos = new ArrayList<>();
/*  41 */     this.formFieldLayerTemplates = new ArrayList<>();
/*  42 */     this.locale = null;
/*  43 */     this.mergeFieldInfo = new ArrayList<>();
/*  44 */     this.mergeFileTransientId = null;
/*  45 */     this.message = null;
/*  46 */     this.name = null;
/*  47 */     this.postSignOptions = null;
/*  48 */     this.recipientSetInfos = new ArrayList<>();
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
/*  66 */     this.reminderFrequency = null;
/*  67 */     this.securityOptions = null;
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
/*  85 */     this.signatureType = null;
/*  86 */     this.vaultingInfo = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A publicly accessible url to which Adobe Sign will do an HTTP GET operation every time there is a new agreement event. HTTP authentication is supported using standard embedded syntax - i.e. http://username:password@your.server.com/path/to/file. Adobe Sign can also ping your system using HTTP PUT with the final signed PDF. Please contact support@echosign.com if you wish to use this option.")
/*     */   @JsonProperty("callbackInfo")
/*     */   public String getCallbackInfo() {
/*  95 */     return this.callbackInfo;
/*     */   }
/*     */   public enum SignatureTypeEnum {
/*  98 */     ESIGN("ESIGN"), WRITTEN("WRITTEN"); private String value; SignatureTypeEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setCallbackInfo(String callbackInfo) { this.callbackInfo = callbackInfo; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A list of one or more email addresses that you want to copy on this transaction. The email addresses will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file")
/*     */   @JsonProperty("ccs")
/*     */   public List<String> getCcs() {
/* 108 */     return this.ccs;
/*     */   }
/*     */   public void setCcs(List<String> ccs) {
/* 111 */     this.ccs = ccs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The number of days that remain before the document expires. You cannot sign the document after it expires")
/*     */   @JsonProperty("daysUntilSigningDeadline")
/*     */   public Integer getDaysUntilSigningDeadline() {
/* 121 */     return this.daysUntilSigningDeadline;
/*     */   }
/*     */   public void setDaysUntilSigningDeadline(Integer daysUntilSigningDeadline) {
/* 124 */     this.daysUntilSigningDeadline = daysUntilSigningDeadline;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A unique identifier for your transaction from an external system. You can use the ExternalID to search for your transaction through API")
/*     */   @JsonProperty("externalId")
/*     */   public ExternalId getExternalId() {
/* 134 */     return this.externalId;
/*     */   }
/*     */   public void setExternalId(ExternalId externalId) {
/* 137 */     this.externalId = externalId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified")
/*     */   @JsonProperty("fileInfos")
/*     */   public List<FileInfo> getFileInfos() {
/* 147 */     return this.fileInfos;
/*     */   }
/*     */   public void setFileInfos(List<FileInfo> fileInfos) {
/* 150 */     this.fileInfos = fileInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified")
/*     */   @JsonProperty("formFieldLayerTemplates")
/*     */   public List<FileInfo> getFormFieldLayerTemplates() {
/* 160 */     return this.formFieldLayerTemplates;
/*     */   }
/*     */   public void setFormFieldLayerTemplates(List<FileInfo> formFieldLayerTemplates) {
/* 163 */     this.formFieldLayerTemplates = formFieldLayerTemplates;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender")
/*     */   @JsonProperty("locale")
/*     */   public String getLocale() {
/* 173 */     return this.locale;
/*     */   }
/*     */   public void setLocale(String locale) {
/* 176 */     this.locale = locale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported")
/*     */   @JsonProperty("mergeFieldInfo")
/*     */   public List<MergefieldInfo> getMergeFieldInfo() {
/* 186 */     return this.mergeFieldInfo;
/*     */   }
/*     */   public void setMergeFieldInfo(List<MergefieldInfo> mergeFieldInfo) {
/* 189 */     this.mergeFieldInfo = mergeFieldInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The merge file ID as returned from the transient document creation API. The merge file contains the details of all the Mega Sign recipients.")
/*     */   @JsonProperty("mergeFileTransientId")
/*     */   public String getMergeFileTransientId() {
/* 199 */     return this.mergeFileTransientId;
/*     */   }
/*     */   public void setMergeFileTransientId(String mergeFileTransientId) {
/* 202 */     this.mergeFileTransientId = mergeFileTransientId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("An optional message to the recipients, describing what is being sent or why their signature is required")
/*     */   @JsonProperty("message")
/*     */   public String getMessage() {
/* 212 */     return this.message;
/*     */   }
/*     */   public void setMessage(String message) {
/* 215 */     this.message = message;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the agreement that will be used to identify it, in emails and on the website")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 225 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 228 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("URL and associated properties for the success page the user will be taken to after completing the signing process")
/*     */   @JsonProperty("postSignOptions")
/*     */   public PostSignOptions getPostSignOptions() {
/* 238 */     return this.postSignOptions;
/*     */   }
/*     */   public void setPostSignOptions(PostSignOptions postSignOptions) {
/* 241 */     this.postSignOptions = postSignOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A list of one or more recipient sets. Currently a recipient set can have only one recipient.")
/*     */   @JsonProperty("recipientSetInfos")
/*     */   public List<RecipientSetInfo> getRecipientSetInfos() {
/* 251 */     return this.recipientSetInfos;
/*     */   }
/*     */   public void setRecipientSetInfos(List<RecipientSetInfo> recipientSetInfos) {
/* 254 */     this.recipientSetInfos = recipientSetInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Optional parameter that sets how often you want to send reminders to the recipients. The possible values are DAILY_UNTIL_SIGNED or WEEKLY_UNTIL_SIGNED")
/*     */   @JsonProperty("reminderFrequency")
/*     */   public ReminderFrequencyEnum getReminderFrequency() {
/* 264 */     return this.reminderFrequency;
/*     */   }
/*     */   public void setReminderFrequency(ReminderFrequencyEnum reminderFrequency) {
/* 267 */     this.reminderFrequency = reminderFrequency;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Sets optional secondary security parameters for your document")
/*     */   @JsonProperty("securityOptions")
/*     */   public SecurityOption getSecurityOptions() {
/* 277 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(SecurityOption securityOptions) {
/* 280 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Specifies the type of signature you would like to request - written or e-signature. The possible values are ESIGN or WRITTEN")
/*     */   @JsonProperty("signatureType")
/*     */   public SignatureTypeEnum getSignatureType() {
/* 290 */     return this.signatureType;
/*     */   }
/*     */   public void setSignatureType(SignatureTypeEnum signatureType) {
/* 293 */     this.signatureType = signatureType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider")
/*     */   @JsonProperty("vaultingInfo")
/*     */   public VaultingInfo getVaultingInfo() {
/* 303 */     return this.vaultingInfo;
/*     */   }
/*     */   public void setVaultingInfo(VaultingInfo vaultingInfo) {
/* 306 */     this.vaultingInfo = vaultingInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 313 */     StringBuilder sb = new StringBuilder();
/* 314 */     sb.append("class MegaSignCreationInfo {\n");
/*     */     
/* 316 */     sb.append("    callbackInfo: ").append(StringUtil.toIndentedString(this.callbackInfo)).append("\n");
/* 317 */     sb.append("    ccs: ").append(StringUtil.toIndentedString(this.ccs)).append("\n");
/* 318 */     sb.append("    daysUntilSigningDeadline: ").append(StringUtil.toIndentedString(this.daysUntilSigningDeadline)).append("\n");
/* 319 */     sb.append("    externalId: ").append(StringUtil.toIndentedString(this.externalId)).append("\n");
/* 320 */     sb.append("    fileInfos: ").append(StringUtil.toIndentedString(this.fileInfos)).append("\n");
/* 321 */     sb.append("    formFieldLayerTemplates: ").append(StringUtil.toIndentedString(this.formFieldLayerTemplates)).append("\n");
/* 322 */     sb.append("    locale: ").append(StringUtil.toIndentedString(this.locale)).append("\n");
/* 323 */     sb.append("    mergeFieldInfo: ").append(StringUtil.toIndentedString(this.mergeFieldInfo)).append("\n");
/* 324 */     sb.append("    mergeFileTransientId: ").append(StringUtil.toIndentedString(this.mergeFileTransientId)).append("\n");
/* 325 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 326 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 327 */     sb.append("    postSignOptions: ").append(StringUtil.toIndentedString(this.postSignOptions)).append("\n");
/* 328 */     sb.append("    recipientSetInfos: ").append(StringUtil.toIndentedString(this.recipientSetInfos)).append("\n");
/* 329 */     sb.append("    reminderFrequency: ").append(StringUtil.toIndentedString(this.reminderFrequency)).append("\n");
/* 330 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 331 */     sb.append("    signatureType: ").append(StringUtil.toIndentedString(this.signatureType)).append("\n");
/* 332 */     sb.append("    vaultingInfo: ").append(StringUtil.toIndentedString(this.vaultingInfo)).append("\n");
/* 333 */     sb.append("}");
/* 334 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\MegaSignCreationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */