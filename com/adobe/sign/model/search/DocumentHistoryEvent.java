/*     */ package com.adobe.sign.model.search;
/*     */ import java.util.Date;

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
/*     */ @ApiModel(description = "")
/*     */ public class DocumentHistoryEvent
/*     */ {
/*     */   private String actingUserEmail;
/*     */   private String actingUserIpAddress;
/*     */   private String comment;
/*     */   private Date date;
/*     */   private String description;
/*     */   private DeviceLocation deviceLocation;
/*     */   
/*     */   public DocumentHistoryEvent() {
/*  30 */     this.actingUserEmail = null;
/*  31 */     this.actingUserIpAddress = null;
/*  32 */     this.comment = null;
/*  33 */     this.date = null;
/*  34 */     this.description = null;
/*  35 */     this.deviceLocation = null;
/*  36 */     this.participantEmail = null;
/*  37 */     this.synchronizationId = null;
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
/*  90 */     this.type = null;
/*  91 */     this.vaultEventId = null;
/*  92 */     this.versionId = null;
/*     */   }
/*     */   private String participantEmail; private String synchronizationId; private TypeEnum type; private String vaultEventId; private String versionId; public enum TypeEnum {
/*     */     CREATED("CREATED"), UPLOADED_BY_SENDER("UPLOADED_BY_SENDER"), FAXED_BY_SENDER("FAXED_BY_SENDER"), AGREEMENT_MODIFIED("AGREEMENT_MODIFIED"), USER_ACK_AGREEMENT_MODIFIED("USER_ACK_AGREEMENT_MODIFIED"), PRESIGNED("PRESIGNED"), SIGNED("SIGNED"), ESIGNED("ESIGNED"), DIGSIGNED("DIGSIGNED"), APPROVED("APPROVED"), OFFLINE_SYNC("OFFLINE_SYNC"), FAXIN_RECEIVED("FAXIN_RECEIVED"), SIGNATURE_REQUESTED("SIGNATURE_REQUESTED"), APPROVAL_REQUESTED("APPROVAL_REQUESTED"), RECALLED("RECALLED"), REJECTED("REJECTED"), EXPIRED("EXPIRED"), EXPIRED_AUTOMATICALLY("EXPIRED_AUTOMATICALLY"), SHARED("SHARED"), EMAIL_VIEWED("EMAIL_VIEWED"), AUTO_CANCELLED_CONVERSION_PROBLEM("AUTO_CANCELLED_CONVERSION_PROBLEM"), SIGNER_SUGGESTED_CHANGES("SIGNER_SUGGESTED_CHANGES"), SENDER_CREATED_NEW_REVISION("SENDER_CREATED_NEW_REVISION"), PASSWORD_AUTHENTICATION_FAILED("PASSWORD_AUTHENTICATION_FAILED"), KBA_AUTHENTICATION_FAILED("KBA_AUTHENTICATION_FAILED"), KBA_AUTHENTICATED("KBA_AUTHENTICATED"), WEB_IDENTITY_AUTHENTICATED("WEB_IDENTITY_AUTHENTICATED"), WEB_IDENTITY_SPECIFIED("WEB_IDENTITY_SPECIFIED"), EMAIL_BOUNCED("EMAIL_BOUNCED"), WIDGET_ENABLED("WIDGET_ENABLED"), WIDGET_DISABLED("WIDGET_DISABLED"), DELEGATED("DELEGATED"), AUTO_DELEGATED("AUTO_DELEGATED"),
/*     */     REPLACED_SIGNER("REPLACED_SIGNER"),
/*     */     VAULTED("VAULTED"),
/*     */     DOCUMENTS_DELETED("DOCUMENTS_DELETED"),
/*     */     OTHER("OTHER"); private String value; TypeEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty(required = true, value = "Email address of the user that initiated the event")
/*     */   @JsonProperty("actingUserEmail")
/* 101 */   public String getActingUserEmail() { return this.actingUserEmail; }
/*     */   
/*     */   public void setActingUserEmail(String actingUserEmail) {
/* 104 */     this.actingUserEmail = actingUserEmail;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The IP address of the user that initiated the event")
/*     */   @JsonProperty("actingUserIpAddress")
/*     */   public String getActingUserIpAddress() {
/* 114 */     return this.actingUserIpAddress;
/*     */   }
/*     */   public void setActingUserIpAddress(String actingUserIpAddress) {
/* 117 */     this.actingUserIpAddress = actingUserIpAddress;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The event comment. For RECALLED or REJECTED, the reason given by the user that initiates the event. For DELEGATE or SHARE, the message from the acting user to the participant")
/*     */   @JsonProperty("comment")
/*     */   public String getComment() {
/* 127 */     return this.comment;
/*     */   }
/*     */   public void setComment(String comment) {
/* 130 */     this.comment = comment;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The date of the audit event")
/*     */   @JsonProperty("date")
/*     */   public Date getDate() {
/* 140 */     return this.date;
/*     */   }
/*     */   public void setDate(Date date) {
/* 143 */     this.date = date;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A description of the audit event")
/*     */   @JsonProperty("description")
/*     */   public String getDescription() {
/* 153 */     return this.description;
/*     */   }
/*     */   public void setDescription(String description) {
/* 156 */     this.description = description;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Location of the device that created the event (This value may be null due to limited privileges)")
/*     */   @JsonProperty("deviceLocation")
/*     */   public DeviceLocation getDeviceLocation() {
/* 166 */     return this.deviceLocation;
/*     */   }
/*     */   public void setDeviceLocation(DeviceLocation deviceLocation) {
/* 169 */     this.deviceLocation = deviceLocation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Email address of the user that initiated the event")
/*     */   @JsonProperty("participantEmail")
/*     */   public String getParticipantEmail() {
/* 179 */     return this.participantEmail;
/*     */   }
/*     */   public void setParticipantEmail(String participantEmail) {
/* 182 */     this.participantEmail = participantEmail;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("A unique identifier linking offline events to synchronization events (specified for offline signing events and synchronization events, else null)")
/*     */   @JsonProperty("synchronizationId")
/*     */   public String getSynchronizationId() {
/* 192 */     return this.synchronizationId;
/*     */   }
/*     */   public void setSynchronizationId(String synchronizationId) {
/* 195 */     this.synchronizationId = synchronizationId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Type of the document event")
/*     */   @JsonProperty("type")
/*     */   public TypeEnum getType() {
/* 205 */     return this.type;
/*     */   }
/*     */   public void setType(TypeEnum type) {
/* 208 */     this.type = type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The identifier assigned by the vault provider for the vault event (if vaulted, otherwise null)")
/*     */   @JsonProperty("vaultEventId")
/*     */   public String getVaultEventId() {
/* 218 */     return this.vaultEventId;
/*     */   }
/*     */   public void setVaultEventId(String vaultEventId) {
/* 221 */     this.vaultEventId = vaultEventId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "An ID which uniquely identifies the version of the document associated with this audit event")
/*     */   @JsonProperty("versionId")
/*     */   public String getVersionId() {
/* 231 */     return this.versionId;
/*     */   }
/*     */   public void setVersionId(String versionId) {
/* 234 */     this.versionId = versionId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 241 */     StringBuilder sb = new StringBuilder();
/* 242 */     sb.append("class DocumentHistoryEvent {\n");
/*     */     
/* 244 */     sb.append("    actingUserEmail: ").append(StringUtil.toIndentedString(this.actingUserEmail)).append("\n");
/* 245 */     sb.append("    actingUserIpAddress: ").append(StringUtil.toIndentedString(this.actingUserIpAddress)).append("\n");
/* 246 */     sb.append("    comment: ").append(StringUtil.toIndentedString(this.comment)).append("\n");
/* 247 */     sb.append("    date: ").append(StringUtil.toIndentedString(this.date)).append("\n");
/* 248 */     sb.append("    description: ").append(StringUtil.toIndentedString(this.description)).append("\n");
/* 249 */     sb.append("    deviceLocation: ").append(StringUtil.toIndentedString(this.deviceLocation)).append("\n");
/* 250 */     sb.append("    participantEmail: ").append(StringUtil.toIndentedString(this.participantEmail)).append("\n");
/* 251 */     sb.append("    synchronizationId: ").append(StringUtil.toIndentedString(this.synchronizationId)).append("\n");
/* 252 */     sb.append("    type: ").append(StringUtil.toIndentedString(this.type)).append("\n");
/* 253 */     sb.append("    vaultEventId: ").append(StringUtil.toIndentedString(this.vaultEventId)).append("\n");
/* 254 */     sb.append("    versionId: ").append(StringUtil.toIndentedString(this.versionId)).append("\n");
/* 255 */     sb.append("}");
/* 256 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\search\DocumentHistoryEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */