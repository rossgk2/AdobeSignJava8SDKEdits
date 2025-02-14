/*     */ package com.adobe.sign.model.workflows;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class WorkflowDescription {
/*     */   private WorkflowDefaultParams agreementNameInfo;
/*     */   private WorkflowDefaultParams authoringInfo;
/*     */   private List<CCsListInfoDescription> ccsListInfo;
/*     */   private Date created;
/*     */   private String description;
/*     */   private String displayName;
/*     */   private ExpirationFieldInfoDescription expirationInfo;
/*     */   private List<FileInfosDescription> fileInfos;
/*     */   private LocaleFieldInfoDescription localeInfo;
/*     */   private List<MergeFieldInfoDescription> mergeFieldsInfo;
/*     */   private WorkflowDefaultParams messageInfo;
/*     */   private Date modified;
/*     */   private String name;
/*     */   private PasswordFieldInfoDescription passwordInfo;
/*     */   private List<RecipientsListInfoDescription> recipientsListInfo;
/*     */   private ScopeEnum scope;
/*     */   private String scopeId;
/*     */   private StatusEnum status;
/*     */   
/*     */   public enum ScopeEnum {
/*     */     ACCOUNT("ACCOUNT"),
/*     */     GROUP("GROUP");
/*     */     private String value;
/*     */     
/*     */     ScopeEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return this.value;
/*     */     }
/*     */   }
/*     */   
/*  38 */   public WorkflowDescription() { this.agreementNameInfo = null;
/*  39 */     this.authoringInfo = null;
/*  40 */     this.ccsListInfo = new ArrayList<>();
/*  41 */     this.created = null;
/*  42 */     this.description = null;
/*  43 */     this.displayName = null;
/*  44 */     this.expirationInfo = null;
/*  45 */     this.fileInfos = new ArrayList<>();
/*  46 */     this.localeInfo = null;
/*  47 */     this.mergeFieldsInfo = new ArrayList<>();
/*  48 */     this.messageInfo = null;
/*  49 */     this.modified = null;
/*  50 */     this.name = null;
/*  51 */     this.passwordInfo = null;
/*  52 */     this.recipientsListInfo = new ArrayList<>();
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
/*  70 */     this.scope = null;
/*  71 */     this.scopeId = null;
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
/*  90 */     this.status = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about name field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
/*     */   @JsonProperty("agreementNameInfo")
/*     */   public WorkflowDefaultParams getAgreementNameInfo() {
/*  99 */     return this.agreementNameInfo;
/*     */   }
/*     */   public enum StatusEnum {
/* 102 */     ACTIVE("ACTIVE"), DRAFT("DRAFT"), HIDDEN("HIDDEN"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setAgreementNameInfo(WorkflowDefaultParams agreementNameInfo) { this.agreementNameInfo = agreementNameInfo; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about authoringRequested field in SendDocumentInteractiveOptions input field in the agreement creation request when using the API to create an agreement in a workflow")
/*     */   @JsonProperty("authoringInfo")
/*     */   public WorkflowDefaultParams getAuthoringInfo() {
/* 112 */     return this.authoringInfo;
/*     */   }
/*     */   public void setAuthoringInfo(WorkflowDefaultParams authoringInfo) {
/* 115 */     this.authoringInfo = authoringInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about CCList input field in the agreement creation request when using the API to create an agreement in a workflow")
/*     */   @JsonProperty("ccsListInfo")
/*     */   public List<CCsListInfoDescription> getCcsListInfo() {
/* 125 */     return this.ccsListInfo;
/*     */   }
/*     */   public void setCcsListInfo(List<CCsListInfoDescription> ccsListInfo) {
/* 128 */     this.ccsListInfo = ccsListInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The day on which the workflow was created")
/*     */   @JsonProperty("created")
/*     */   public Date getCreated() {
/* 138 */     return this.created;
/*     */   }
/*     */   public void setCreated(Date created) {
/* 141 */     this.created = created;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Description provided for this workflow at the time of its creation")
/*     */   @JsonProperty("description")
/*     */   public String getDescription() {
/* 151 */     return this.description;
/*     */   }
/*     */   public void setDescription(String description) {
/* 154 */     this.description = description;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The display name of the workflow.")
/*     */   @JsonProperty("displayName")
/*     */   public String getDisplayName() {
/* 164 */     return this.displayName;
/*     */   }
/*     */   public void setDisplayName(String displayName) {
/* 167 */     this.displayName = displayName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about daysUntilSigningDeadline field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
/*     */   @JsonProperty("expirationInfo")
/*     */   public ExpirationFieldInfoDescription getExpirationInfo() {
/* 177 */     return this.expirationInfo;
/*     */   }
/*     */   public void setExpirationInfo(ExpirationFieldInfoDescription expirationInfo) {
/* 180 */     this.expirationInfo = expirationInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about FileInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
/*     */   @JsonProperty("fileInfos")
/*     */   public List<FileInfosDescription> getFileInfos() {
/* 190 */     return this.fileInfos;
/*     */   }
/*     */   public void setFileInfos(List<FileInfosDescription> fileInfos) {
/* 193 */     this.fileInfos = fileInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about locale field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
/*     */   @JsonProperty("localeInfo")
/*     */   public LocaleFieldInfoDescription getLocaleInfo() {
/* 203 */     return this.localeInfo;
/*     */   }
/*     */   public void setLocaleInfo(LocaleFieldInfoDescription localeInfo) {
/* 206 */     this.localeInfo = localeInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about customFieldInfos in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
/*     */   @JsonProperty("mergeFieldsInfo")
/*     */   public List<MergeFieldInfoDescription> getMergeFieldsInfo() {
/* 216 */     return this.mergeFieldsInfo;
/*     */   }
/*     */   public void setMergeFieldsInfo(List<MergeFieldInfoDescription> mergeFieldsInfo) {
/* 219 */     this.mergeFieldsInfo = mergeFieldsInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about message field in DocumentCreationInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
/*     */   @JsonProperty("messageInfo")
/*     */   public WorkflowDefaultParams getMessageInfo() {
/* 229 */     return this.messageInfo;
/*     */   }
/*     */   public void setMessageInfo(WorkflowDefaultParams messageInfo) {
/* 232 */     this.messageInfo = messageInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The day on which the workflow was last modified")
/*     */   @JsonProperty("modified")
/*     */   public Date getModified() {
/* 242 */     return this.modified;
/*     */   }
/*     */   public void setModified(Date modified) {
/* 245 */     this.modified = modified;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the workflow.")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 255 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 258 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about openPassword field in SecurityOptions input field in the agreement creation request when using the API to create an agreement in a workflow")
/*     */   @JsonProperty("passwordInfo")
/*     */   public PasswordFieldInfoDescription getPasswordInfo() {
/* 268 */     return this.passwordInfo;
/*     */   }
/*     */   public void setPasswordInfo(PasswordFieldInfoDescription passwordInfo) {
/* 271 */     this.passwordInfo = passwordInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about RecepientsInfo input field in the agreement creation request when using the API to create an agreement in a workflow")
/*     */   @JsonProperty("recipientsListInfo")
/*     */   public List<RecipientsListInfoDescription> getRecipientsListInfo() {
/* 281 */     return this.recipientsListInfo;
/*     */   }
/*     */   public void setRecipientsListInfo(List<RecipientsListInfoDescription> recipientsListInfo) {
/* 284 */     this.recipientsListInfo = recipientsListInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The workflow scope (ACCOUNT or GROUP or OTHER)")
/*     */   @JsonProperty("scope")
/*     */   public ScopeEnum getScope() {
/* 294 */     return this.scope;
/*     */   }
/*     */   public void setScope(ScopeEnum scope) {
/* 297 */     this.scope = scope;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Identifier of scope. Currently it is applicable for scope GROUP only and the value will be groupId.")
/*     */   @JsonProperty("scopeId")
/*     */   public String getScopeId() {
/* 307 */     return this.scopeId;
/*     */   }
/*     */   public void setScopeId(String scopeId) {
/* 310 */     this.scopeId = scopeId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The workflow status (ACTIVE or DRAFT or OTHER)")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 320 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 323 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 330 */     StringBuilder sb = new StringBuilder();
/* 331 */     sb.append("class WorkflowDescription {\n");
/*     */     
/* 333 */     sb.append("    agreementNameInfo: ").append(StringUtil.toIndentedString(this.agreementNameInfo)).append("\n");
/* 334 */     sb.append("    authoringInfo: ").append(StringUtil.toIndentedString(this.authoringInfo)).append("\n");
/* 335 */     sb.append("    ccsListInfo: ").append(StringUtil.toIndentedString(this.ccsListInfo)).append("\n");
/* 336 */     sb.append("    created: ").append(StringUtil.toIndentedString(this.created)).append("\n");
/* 337 */     sb.append("    description: ").append(StringUtil.toIndentedString(this.description)).append("\n");
/* 338 */     sb.append("    displayName: ").append(StringUtil.toIndentedString(this.displayName)).append("\n");
/* 339 */     sb.append("    expirationInfo: ").append(StringUtil.toIndentedString(this.expirationInfo)).append("\n");
/* 340 */     sb.append("    fileInfos: ").append(StringUtil.toIndentedString(this.fileInfos)).append("\n");
/* 341 */     sb.append("    localeInfo: ").append(StringUtil.toIndentedString(this.localeInfo)).append("\n");
/* 342 */     sb.append("    mergeFieldsInfo: ").append(StringUtil.toIndentedString(this.mergeFieldsInfo)).append("\n");
/* 343 */     sb.append("    messageInfo: ").append(StringUtil.toIndentedString(this.messageInfo)).append("\n");
/* 344 */     sb.append("    modified: ").append(StringUtil.toIndentedString(this.modified)).append("\n");
/* 345 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 346 */     sb.append("    passwordInfo: ").append(StringUtil.toIndentedString(this.passwordInfo)).append("\n");
/* 347 */     sb.append("    recipientsListInfo: ").append(StringUtil.toIndentedString(this.recipientsListInfo)).append("\n");
/* 348 */     sb.append("    scope: ").append(StringUtil.toIndentedString(this.scope)).append("\n");
/* 349 */     sb.append("    scopeId: ").append(StringUtil.toIndentedString(this.scopeId)).append("\n");
/* 350 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 351 */     sb.append("}");
/* 352 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\WorkflowDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */