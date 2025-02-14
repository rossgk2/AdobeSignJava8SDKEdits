/*     */ package com.adobe.sign.model.libraryDocuments;
import java.util.ArrayList;
/*     */ 
/*     */ import java.util.List;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class LibraryDocumentInfo {
/*     */   private List<LibDocumentHistoryEvent> events;
/*     */   private String libraryDocumentId;
/*     */   private String locale;
/*     */   private String message;
/*     */   private String latestVersionId;
/*     */   private String name;
/*     */   private List<LibDocParticipantInfo> participants;
/*     */   private List<SecurityOptionsEnum> securityOptions;
/*     */   private StatusEnum status;
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
/*  31 */   public LibraryDocumentInfo() { this.events = new ArrayList<>();
/*  32 */     this.libraryDocumentId = null;
/*  33 */     this.locale = null;
/*  34 */     this.message = null;
/*  35 */     this.latestVersionId = null;
/*  36 */     this.name = null;
/*  37 */     this.participants = new ArrayList<>();
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
/*  55 */     this.securityOptions = new ArrayList<>();
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
/*  88 */     this.status = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
/*     */   @JsonProperty("events")
/*     */   public List<LibDocumentHistoryEvent> getEvents() {
/*  97 */     return this.events;
/*     */   }
/*     */   public enum StatusEnum {
/* 100 */     OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"), WAITING_FOR_REVIEW("WAITING_FOR_REVIEW"), SIGNED("SIGNED"), APPROVED("APPROVED"), ABORTED("ABORTED"), DOCUMENT_LIBRARY("DOCUMENT_LIBRARY"), WIDGET("WIDGET"), EXPIRED("EXPIRED"), ARCHIVED("ARCHIVED"), PREFILL("PREFILL"), AUTHORING("AUTHORING"), WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"), WAITING_FOR_VERIFICATION("WAITING_FOR_VERIFICATION"), WIDGET_WAITING_FOR_VERIFICATION("WIDGET_WAITING_FOR_VERIFICATION"), WAITING_FOR_PAYMENT("WAITING_FOR_PAYMENT"), OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"), OTHER("OTHER"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setEvents(List<LibDocumentHistoryEvent> events) { this.events = events; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A resource identifier that can be used to uniquely identify the library document in other apis")
/*     */   @JsonProperty("libraryDocumentId")
/*     */   public String getLibraryDocumentId() {
/* 110 */     return this.libraryDocumentId;
/*     */   }
/*     */   public void setLibraryDocumentId(String libraryDocumentId) {
/* 113 */     this.libraryDocumentId = libraryDocumentId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The locale associated with this agreement - for example, en_US or fr_FR")
/*     */   @JsonProperty("locale")
/*     */   public String getLocale() {
/* 123 */     return this.locale;
/*     */   }
/*     */   public void setLocale(String locale) {
/* 126 */     this.locale = locale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The message associated with the document that the sender has provided")
/*     */   @JsonProperty("message")
/*     */   public String getMessage() {
/* 136 */     return this.message;
/*     */   }
/*     */   public void setMessage(String message) {
/* 139 */     this.message = message;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A version ID which uniquely identifies the current version of the agreement")
/*     */   @JsonProperty("latestVersionId")
/*     */   public String getLatestVersionId() {
/* 149 */     return this.latestVersionId;
/*     */   }
/*     */   public void setLatestVersionId(String latestVersionId) {
/* 152 */     this.latestVersionId = latestVersionId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the document, specified by the sender")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 162 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 165 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about all the participants of this document")
/*     */   @JsonProperty("participants")
/*     */   public List<LibDocParticipantInfo> getParticipants() {
/* 175 */     return this.participants;
/*     */   }
/*     */   public void setParticipants(List<LibDocParticipantInfo> participants) {
/* 178 */     this.participants = participants;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Security information about the document that specifies whether or not a password is required to view and sign the document")
/*     */   @JsonProperty("securityOptions")
/*     */   public List<SecurityOptionsEnum> getSecurityOptions() {
/* 188 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
/* 191 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The current status of the document")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 201 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 204 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 211 */     StringBuilder sb = new StringBuilder();
/* 212 */     sb.append("class LibraryDocumentInfo {\n");
/*     */     
/* 214 */     sb.append("    events: ").append(StringUtil.toIndentedString(this.events)).append("\n");
/* 215 */     sb.append("    libraryDocumentId: ").append(StringUtil.toIndentedString(this.libraryDocumentId)).append("\n");
/* 216 */     sb.append("    locale: ").append(StringUtil.toIndentedString(this.locale)).append("\n");
/* 217 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 218 */     sb.append("    latestVersionId: ").append(StringUtil.toIndentedString(this.latestVersionId)).append("\n");
/* 219 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 220 */     sb.append("    participants: ").append(StringUtil.toIndentedString(this.participants)).append("\n");
/* 221 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 222 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 223 */     sb.append("}");
/* 224 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\libraryDocuments\LibraryDocumentInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */