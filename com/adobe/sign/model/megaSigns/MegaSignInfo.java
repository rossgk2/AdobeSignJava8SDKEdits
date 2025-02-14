/*     */ package com.adobe.sign.model.megaSigns;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
/*     */ 
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class MegaSignInfo {
/*     */   private List<DocumentHistoryEvent> events;
/*     */   private Date expiration;
/*     */   private String locale;
/*     */   private String megaSignId;
/*     */   private String message;
/*     */   private String latestVersionId;
/*     */   private String name;
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
/*  31 */   public MegaSignInfo() { this.events = new ArrayList<>();
/*  32 */     this.expiration = null;
/*  33 */     this.locale = null;
/*  34 */     this.megaSignId = null;
/*  35 */     this.message = null;
/*  36 */     this.latestVersionId = null;
/*  37 */     this.name = null;
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
/*  85 */     this.status = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
/*     */   @JsonProperty("events")
/*     */   public List<DocumentHistoryEvent> getEvents() {
/*  94 */     return this.events;
/*     */   }
/*     */   public enum StatusEnum {
/*  97 */     WAITING_FOR_MY_SIGNATURE("WAITING_FOR_MY_SIGNATURE"), WAITING_FOR_MY_APPROVAL("WAITING_FOR_MY_APPROVAL"), WAITING_FOR_MY_DELEGATION("WAITING_FOR_MY_DELEGATION"), OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"), OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"), SIGNED("SIGNED"), APPROVED("APPROVED"), RECALLED("RECALLED"), WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"), ARCHIVED("ARCHIVED"), FORM("FORM"), EXPIRED("EXPIRED"), WIDGET("WIDGET"), WAITING_FOR_AUTHORING("WAITING_FOR_AUTHORING"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setEvents(List<DocumentHistoryEvent> events) { this.events = events; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The date after which the document can no longer be signed, if an expiration date is configured. The value is nil if an expiration date is not set for the document")
/*     */   @JsonProperty("expiration")
/*     */   public Date getExpiration() {
/* 107 */     return this.expiration;
/*     */   }
/*     */   public void setExpiration(Date expiration) {
/* 110 */     this.expiration = expiration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The locale associated with this agreement - for example, en_US or fr_FR")
/*     */   @JsonProperty("locale")
/*     */   public String getLocale() {
/* 120 */     return this.locale;
/*     */   }
/*     */   public void setLocale(String locale) {
/* 123 */     this.locale = locale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Unique identifier of the MegaSign parent agreement")
/*     */   @JsonProperty("megaSignId")
/*     */   public String getMegaSignId() {
/* 133 */     return this.megaSignId;
/*     */   }
/*     */   public void setMegaSignId(String megaSignId) {
/* 136 */     this.megaSignId = megaSignId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The message associated with the document that the sender has provided")
/*     */   @JsonProperty("message")
/*     */   public String getMessage() {
/* 146 */     return this.message;
/*     */   }
/*     */   public void setMessage(String message) {
/* 149 */     this.message = message;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A version ID which uniquely identifies the current version of the agreement")
/*     */   @JsonProperty("latestVersionId")
/*     */   public String getLatestVersionId() {
/* 159 */     return this.latestVersionId;
/*     */   }
/*     */   public void setLatestVersionId(String latestVersionId) {
/* 162 */     this.latestVersionId = latestVersionId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the document, specified by the sender")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 172 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 175 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Security information about the document that specifies whether or not a password is required to view and sign the document")
/*     */   @JsonProperty("securityOptions")
/*     */   public List<SecurityOptionsEnum> getSecurityOptions() {
/* 185 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
/* 188 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Current status of the MegaSign parent agreement from the perspective of the user")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 198 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 201 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 208 */     StringBuilder sb = new StringBuilder();
/* 209 */     sb.append("class MegaSignInfo {\n");
/*     */     
/* 211 */     sb.append("    events: ").append(StringUtil.toIndentedString(this.events)).append("\n");
/* 212 */     sb.append("    expiration: ").append(StringUtil.toIndentedString(this.expiration)).append("\n");
/* 213 */     sb.append("    locale: ").append(StringUtil.toIndentedString(this.locale)).append("\n");
/* 214 */     sb.append("    megaSignId: ").append(StringUtil.toIndentedString(this.megaSignId)).append("\n");
/* 215 */     sb.append("    message: ").append(StringUtil.toIndentedString(this.message)).append("\n");
/* 216 */     sb.append("    latestVersionId: ").append(StringUtil.toIndentedString(this.latestVersionId)).append("\n");
/* 217 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 218 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 219 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 220 */     sb.append("}");
/* 221 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\MegaSignInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */