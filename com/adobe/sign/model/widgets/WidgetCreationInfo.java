/*     */ package com.adobe.sign.model.widgets;
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
/*     */ @ApiModel(description = "")
/*     */ public class WidgetCreationInfo
/*     */ {
/*     */   private Boolean authoringRequested;
/*     */   private String callbackInfo;
/*     */   private List<CounterSignerSetInfo> counterSignerSetInfos;
/*     */   private List<WidgetFileInfo> fileInfos;
/*     */   private List<WidgetFileInfo> formFieldLayerTemplates;
/*     */   private String locale;
/*     */   private List<WidgetMergefieldInfo> mergeFieldInfo;
/*     */   
/*     */   public WidgetCreationInfo() {
/*  36 */     this.authoringRequested = null;
/*  37 */     this.callbackInfo = null;
/*  38 */     this.counterSignerSetInfos = new ArrayList<>();
/*  39 */     this.fileInfos = new ArrayList<>();
/*  40 */     this.formFieldLayerTemplates = new ArrayList<>();
/*  41 */     this.locale = null;
/*  42 */     this.mergeFieldInfo = new ArrayList<>();
/*  43 */     this.name = null;
/*  44 */     this.securityOptions = null;
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
/*  62 */     this.signatureFlow = null;
/*  63 */     this.vaultingInfo = null;
/*  64 */     this.widgetAuthFailureInfo = null;
/*  65 */     this.widgetCompletionInfo = null;
/*  66 */     this.widgetSignerSecurityOptions = null;
/*     */   } private String name; private WidgetSecurityOption securityOptions; private SignatureFlowEnum signatureFlow; private WidgetVaultingInfo vaultingInfo; private WidgetCompletionInfo widgetAuthFailureInfo; private WidgetCompletionInfo widgetCompletionInfo; private WidgetSignerSecurityOption widgetSignerSecurityOptions; public enum SignatureFlowEnum { SENDER_SIGNATURE_NOT_REQUIRED("SENDER_SIGNATURE_NOT_REQUIRED"),
/*     */     SENDER_SIGNS_LAST("SENDER_SIGNS_LAST"); private String value; SignatureFlowEnum(String value) {
/*     */       this.value = value;
/*     */     } public String toString() {
/*     */       return this.value;
/*     */     } } @ApiModelProperty("Indicates that authoring is requested prior to sending the document")
/*     */   @JsonProperty("authoringRequested")
/*     */   public Boolean getAuthoringRequested() {
/*  75 */     return this.authoringRequested;
/*     */   }
/*     */   public void setAuthoringRequested(Boolean authoringRequested) {
/*  78 */     this.authoringRequested = authoringRequested;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A publicly accessible url to which Adobe Sign will do an HTTP GET operation every time there is a new agreement event. HTTP authentication is supported using standard embedded syntax - i.e. http://username:password@your.server.com/path/to/file. Adobe Sign can also ping your system using HTTP PUT with the final signed PDF. Please contact support@echosign.com if you wish to use this option.")
/*     */   @JsonProperty("callbackInfo")
/*     */   public String getCallbackInfo() {
/*  88 */     return this.callbackInfo;
/*     */   }
/*     */   public void setCallbackInfo(String callbackInfo) {
/*  91 */     this.callbackInfo = callbackInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A list of one or more counter signers provided in the form of counter signer set.")
/*     */   @JsonProperty("counterSignerSetInfos")
/*     */   public List<CounterSignerSetInfo> getCounterSignerSetInfos() {
/* 101 */     return this.counterSignerSetInfos;
/*     */   }
/*     */   public void setCounterSignerSetInfos(List<CounterSignerSetInfo> counterSignerSetInfos) {
/* 104 */     this.counterSignerSetInfos = counterSignerSetInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A list of one or more files (or references to files) that will be used to create the widget. If more than one file is provided, they will be combined before the widget is created. Library documents are not permitted. Note: Only one of the four parameters in every FileInfo object must be specified")
/*     */   @JsonProperty("fileInfos")
/*     */   public List<WidgetFileInfo> getFileInfos() {
/* 114 */     return this.fileInfos;
/*     */   }
/*     */   public void setFileInfos(List<WidgetFileInfo> fileInfos) {
/* 117 */     this.fileInfos = fileInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified")
/*     */   @JsonProperty("formFieldLayerTemplates")
/*     */   public List<WidgetFileInfo> getFormFieldLayerTemplates() {
/* 127 */     return this.formFieldLayerTemplates;
/*     */   }
/*     */   public void setFormFieldLayerTemplates(List<WidgetFileInfo> formFieldLayerTemplates) {
/* 130 */     this.formFieldLayerTemplates = formFieldLayerTemplates;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The locale associated with this widget - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the widget creator")
/*     */   @JsonProperty("locale")
/*     */   public String getLocale() {
/* 140 */     return this.locale;
/*     */   }
/*     */   public void setLocale(String locale) {
/* 143 */     this.locale = locale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported")
/*     */   @JsonProperty("mergeFieldInfo")
/*     */   public List<WidgetMergefieldInfo> getMergeFieldInfo() {
/* 153 */     return this.mergeFieldInfo;
/*     */   }
/*     */   public void setMergeFieldInfo(List<WidgetMergefieldInfo> mergeFieldInfo) {
/* 156 */     this.mergeFieldInfo = mergeFieldInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the widget that will be used to identify it, in emails and on the website")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 166 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 169 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Sets optional secondary security parameters for your widget")
/*     */   @JsonProperty("securityOptions")
/*     */   public WidgetSecurityOption getSecurityOptions() {
/* 179 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(WidgetSecurityOption securityOptions) {
/* 182 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Selects the workflow you would like to use - whether the sender needs to sign before the recipient, after the recipient, or not at all. The possible values for this variable are SENDER_SIGNATURE_NOT_REQUIRED or SENDER_SIGNS_LAST")
/*     */   @JsonProperty("signatureFlow")
/*     */   public SignatureFlowEnum getSignatureFlow() {
/* 192 */     return this.signatureFlow;
/*     */   }
/*     */   public void setSignatureFlow(SignatureFlowEnum signatureFlow) {
/* 195 */     this.signatureFlow = signatureFlow;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Sets the vaulting properties that allows Adobe Sign to securely store documents with a vault provider")
/*     */   @JsonProperty("vaultingInfo")
/*     */   public WidgetVaultingInfo getVaultingInfo() {
/* 205 */     return this.vaultingInfo;
/*     */   }
/*     */   public void setVaultingInfo(WidgetVaultingInfo vaultingInfo) {
/* 208 */     this.vaultingInfo = vaultingInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("URL and associated properties for the error page the user will be taken after failing to authenticate")
/*     */   @JsonProperty("widgetAuthFailureInfo")
/*     */   public WidgetCompletionInfo getWidgetAuthFailureInfo() {
/* 218 */     return this.widgetAuthFailureInfo;
/*     */   }
/*     */   public void setWidgetAuthFailureInfo(WidgetCompletionInfo widgetAuthFailureInfo) {
/* 221 */     this.widgetAuthFailureInfo = widgetAuthFailureInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("URL and associated properties for the success page the user will be taken to after filling out the widget")
/*     */   @JsonProperty("widgetCompletionInfo")
/*     */   public WidgetCompletionInfo getWidgetCompletionInfo() {
/* 231 */     return this.widgetCompletionInfo;
/*     */   }
/*     */   public void setWidgetCompletionInfo(WidgetCompletionInfo widgetCompletionInfo) {
/* 234 */     this.widgetCompletionInfo = widgetCompletionInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Security options that apply to widget signers")
/*     */   @JsonProperty("widgetSignerSecurityOptions")
/*     */   public WidgetSignerSecurityOption getWidgetSignerSecurityOptions() {
/* 244 */     return this.widgetSignerSecurityOptions;
/*     */   }
/*     */   public void setWidgetSignerSecurityOptions(WidgetSignerSecurityOption widgetSignerSecurityOptions) {
/* 247 */     this.widgetSignerSecurityOptions = widgetSignerSecurityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 254 */     StringBuilder sb = new StringBuilder();
/* 255 */     sb.append("class WidgetCreationInfo {\n");
/*     */     
/* 257 */     sb.append("    authoringRequested: ").append(StringUtil.toIndentedString(this.authoringRequested)).append("\n");
/* 258 */     sb.append("    callbackInfo: ").append(StringUtil.toIndentedString(this.callbackInfo)).append("\n");
/* 259 */     sb.append("    counterSignerSetInfos: ").append(StringUtil.toIndentedString(this.counterSignerSetInfos)).append("\n");
/* 260 */     sb.append("    fileInfos: ").append(StringUtil.toIndentedString(this.fileInfos)).append("\n");
/* 261 */     sb.append("    formFieldLayerTemplates: ").append(StringUtil.toIndentedString(this.formFieldLayerTemplates)).append("\n");
/* 262 */     sb.append("    locale: ").append(StringUtil.toIndentedString(this.locale)).append("\n");
/* 263 */     sb.append("    mergeFieldInfo: ").append(StringUtil.toIndentedString(this.mergeFieldInfo)).append("\n");
/* 264 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 265 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 266 */     sb.append("    signatureFlow: ").append(StringUtil.toIndentedString(this.signatureFlow)).append("\n");
/* 267 */     sb.append("    vaultingInfo: ").append(StringUtil.toIndentedString(this.vaultingInfo)).append("\n");
/* 268 */     sb.append("    widgetAuthFailureInfo: ").append(StringUtil.toIndentedString(this.widgetAuthFailureInfo)).append("\n");
/* 269 */     sb.append("    widgetCompletionInfo: ").append(StringUtil.toIndentedString(this.widgetCompletionInfo)).append("\n");
/* 270 */     sb.append("    widgetSignerSecurityOptions: ").append(StringUtil.toIndentedString(this.widgetSignerSecurityOptions)).append("\n");
/* 271 */     sb.append("}");
/* 272 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetCreationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */