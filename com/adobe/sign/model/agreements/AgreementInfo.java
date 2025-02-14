/*     */ package com.adobe.sign.model.agreements;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class AgreementInfo {
/*     */   private String agreementId;
/*     */   private List<DocumentHistoryEvent> events;
/*     */   private Date expiration;
/*     */   private String latestVersionId;
/*     */   private String locale;
/*     */   private String message;
/*     */   private Boolean modifiable;
/*     */   private String name;
/*     */   private List<NextParticipantSetInfo> nextParticipantSetInfos;
/*     */   private List<ParticipantSetInfo> participantSetInfos;
/*     */   private List<SecurityOptionsEnum> securityOptions;
/*     */   private StatusEnum status;
/*     */   private Boolean vaultingEnabled;
/*     */   
/*     */   public enum SecurityOptionsEnum {
/*     */     OPEN_PROTECTED("OPEN_PROTECTED"),
/*     */     OTHER("OTHER");
/*     */     private String value;
/*     */     
/*     */     SecurityOptionsEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return this.value;
/*     */     }
/*     */   }
/*     */   
/*  33 */   public AgreementInfo() { this.agreementId = null;
/*  34 */     this.events = new ArrayList<>();
/*  35 */     this.expiration = null;
/*  36 */     this.latestVersionId = null;
/*  37 */     this.locale = null;
/*  38 */     this.message = null;
/*  39 */     this.modifiable = null;
/*  40 */     this.name = null;
/*  41 */     this.nextParticipantSetInfos = new ArrayList<>();
/*  42 */     this.participantSetInfos = new ArrayList<>();
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
/*  60 */     this.securityOptions = new ArrayList<>();
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
/*  93 */     this.status = null;
/*  94 */     this.vaultingEnabled = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A resource identifier that can be used to uniquely identify the agreement resource in other apis")
/*     */   @JsonProperty("agreementId")
/*     */   public String getAgreementId() {
/* 103 */     return this.agreementId;
/*     */   }
/*     */   public enum StatusEnum {
/* 106 */     OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"), WAITING_FOR_REVIEW("WAITING_FOR_REVIEW"), SIGNED("SIGNED"), APPROVED("APPROVED"), ABORTED("ABORTED"), DOCUMENT_LIBRARY("DOCUMENT_LIBRARY"), WIDGET("WIDGET"), EXPIRED("EXPIRED"), ARCHIVED("ARCHIVED"), PREFILL("PREFILL"), AUTHORING("AUTHORING"), WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"), WAITING_FOR_VERIFICATION("WAITING_FOR_VERIFICATION"), WIDGET_WAITING_FOR_VERIFICATION("WIDGET_WAITING_FOR_VERIFICATION"), WAITING_FOR_PAYMENT("WAITING_FOR_PAYMENT"), OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"), OTHER("OTHER"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setAgreementId(String agreementId) { this.agreementId = agreementId; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
/*     */   @JsonProperty("events")
/*     */   public List<DocumentHistoryEvent> getEvents() {
/* 116 */     return this.events;
/*     */   }
/*     */   public void setEvents(List<DocumentHistoryEvent> events) {
/* 119 */     this.events = events;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The date after which the document can no longer be signed, if an expiration date is configured. The value is nil if an expiration date is not set for the document")
/*     */   @JsonProperty("expiration")
/*     */   public Date getExpiration() {
/* 129 */     return this.expiration;
/*     */   }
/*     */   public void setExpiration(Date expiration) {
/* 132 */     this.expiration = expiration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "An ID which uniquely identifies the current version of the document")
/*     */   @JsonProperty("latestVersionId")
/*     */   public String getLatestVersionId() {
/* 142 */     return this.latestVersionId;
/*     */   }
/*     */   public void setLatestVersionId(String latestVersionId) {
/* 145 */     this.latestVersionId = latestVersionId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The locale associated with this agreement - for example, en_US or fr_FR")
/*     */   @JsonProperty("locale")
/*     */   public String getLocale() {
/* 155 */     return this.locale;
/*     */   }
/*     */   public void setLocale(String locale) {
/* 158 */     this.locale = locale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The message associated with the document that the sender has provided")
/*     */   @JsonProperty("message")
/*     */   public String getMessage() {
/* 168 */     return this.message;
/*     */   }
/*     */   public void setMessage(String message) {
/* 171 */     this.message = message;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about whether the agreement can be modified")
/*     */   @JsonProperty("modifiable")
/*     */   public Boolean getModifiable() {
/* 181 */     return this.modifiable;
/*     */   }
/*     */   public void setModifiable(Boolean modifiable) {
/* 184 */     this.modifiable = modifiable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the document, specified by the sender")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 194 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 197 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about who needs to act next for this document - for example, if the agreement is in status OUT_FOR_SIGNATURE or OUT_FOR_APPROVAL, this will be the next signer or approver. If the AgreementStatus is a terminal state, this array is empty")
/*     */   @JsonProperty("nextParticipantSetInfos")
/*     */   public List<NextParticipantSetInfo> getNextParticipantSetInfos() {
/* 207 */     return this.nextParticipantSetInfos;
/*     */   }
/*     */   public void setNextParticipantSetInfos(List<NextParticipantSetInfo> nextParticipantSetInfos) {
/* 210 */     this.nextParticipantSetInfos = nextParticipantSetInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about all the participant sets of this document")
/*     */   @JsonProperty("participantSetInfos")
/*     */   public List<ParticipantSetInfo> getParticipantSetInfos() {
/* 220 */     return this.participantSetInfos;
/*     */   }
/*     */   public void setParticipantSetInfos(List<ParticipantSetInfo> participantSetInfos) {
/* 223 */     this.participantSetInfos = participantSetInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Security information about the document that specifies whether or not a password is required to view and sign the document")
/*     */   @JsonProperty("securityOptions")
/*     */   public List<SecurityOptionsEnum> getSecurityOptions() {
/* 233 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
/* 236 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The current status of the document")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 246 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 249 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Whether vaulting was enabled for the agreement")
/*     */   @JsonProperty("vaultingEnabled")
/*     */   public Boolean getVaultingEnabled() {
/* 259 */     return this.vaultingEnabled;
/*     */   }
/*     */   public void setVaultingEnabled(Boolean vaultingEnabled) {
/* 262 */     this.vaultingEnabled = vaultingEnabled;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 269 */     StringBuilder sb = new StringBuilder();
/* 270 */     sb.append("class AgreementInfo {\n");
/*     */     
/* 272 */     sb.append("    agreementId: ").append(StringUtil.toIndentedString(this.agreementId)).append("\n");
/* 273 */     sb.append("    events: ").append(StringUtil.toIndentedString(this.events)).append("\n");
/* 274 */     sb.append("    expiration: ").append(StringUtil.toIndentedString(this.expiration)).append("\n");
/* 275 */     sb.append("    latestVersionId: ").append(StringUtil.toIndentedString(this.latestVersionId)).append("\n");
/* 276 */     sb.append("    locale: ").append(StringUtil.toIndentedString(this.locale)).append("\n");
/* 277 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 278 */     sb.append("    modifiable: ").append(StringUtil.toIndentedString(this.modifiable)).append("\n");
/* 279 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 280 */     sb.append("    nextParticipantSetInfos: ").append(StringUtil.toIndentedString(this.nextParticipantSetInfos)).append("\n");
/* 281 */     sb.append("    participantSetInfos: ").append(StringUtil.toIndentedString(this.participantSetInfos)).append("\n");
/* 282 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 283 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 284 */     sb.append("    vaultingEnabled: ").append(StringUtil.toIndentedString(this.vaultingEnabled)).append("\n");
/* 285 */     sb.append("}");
/* 286 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\AgreementInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */