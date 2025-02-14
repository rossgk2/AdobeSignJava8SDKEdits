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
/*     */ @ApiModel(description = "")
/*     */ public class ParticipantSetInfo
/*     */ {
/*     */   private String participantSetId;
/*     */   private List<ParticipantInfo> participantSetMemberInfos;
/*     */   private String participantSetName;
/*     */   private String privateMessage;
/*     */   private List<RolesEnum> roles;
/*     */   
/*     */   public ParticipantSetInfo() {
/*  30 */     this.participantSetId = null;
/*  31 */     this.participantSetMemberInfos = new ArrayList<>();
/*  32 */     this.participantSetName = null;
/*  33 */     this.privateMessage = null;
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
/*  58 */     this.roles = new ArrayList<>();
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
/*  79 */     this.securityOptions = new ArrayList<>();
/*  80 */     this.signingOrder = null;
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
/* 117 */     this.status = null;
/*     */   }
/*     */   private List<SecurityOptionsEnum> securityOptions;
/*     */   private Integer signingOrder;
/*     */   private StatusEnum status;
/*     */   public enum RolesEnum {
/*     */     SENDER("SENDER"), SIGNER("SIGNER"), APPROVER("APPROVER"), DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"), DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER"), CC("CC"), DELEGATE("DELEGATE"), SHARE("SHARE"), OTHER("OTHER");
/*     */     private String value; RolesEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum SecurityOptionsEnum {
/*     */     PASSWORD("PASSWORD"), WEB_IDENTITY("WEB_IDENTITY"), KBA("KBA"), PHONE("PHONE"), OTHER("OTHER"); private String value; SecurityOptionsEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum StatusEnum {
/* 126 */     WAITING_FOR_MY_SIGNATURE("WAITING_FOR_MY_SIGNATURE"), WAITING_FOR_MY_APPROVAL("WAITING_FOR_MY_APPROVAL"), WAITING_FOR_MY_DELEGATION("WAITING_FOR_MY_DELEGATION"), OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"), SIGNED("SIGNED"), APPROVED("APPROVED"), RECALLED("RECALLED"), HIDDEN("HIDDEN"), NOT_YET_VISIBLE("NOT_YET_VISIBLE"), WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"), ARCHIVED("ARCHIVED"), UNKNOWN("UNKNOWN"), PARTIAL("PARTIAL"), FORM("FORM"), WAITING_FOR_AUTHORING("WAITING_FOR_AUTHORING"), OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"), WIDGET("WIDGET"), EXPIRED("EXPIRED"), WAITING_FOR_MY_REVIEW("WAITING_FOR_MY_REVIEW"), IN_REVIEW("IN_REVIEW"), OTHER("OTHER"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty(required = true, value = "The unique identifier of the participant set") @JsonProperty("participantSetId") public String getParticipantSetId() { return this.participantSetId; }
/*     */   
/*     */   public void setParticipantSetId(String participantSetId) {
/* 129 */     this.participantSetId = participantSetId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about the members of the recipient set")
/*     */   @JsonProperty("participantSetMemberInfos")
/*     */   public List<ParticipantInfo> getParticipantSetMemberInfos() {
/* 139 */     return this.participantSetMemberInfos;
/*     */   }
/*     */   public void setParticipantSetMemberInfos(List<ParticipantInfo> participantSetMemberInfos) {
/* 142 */     this.participantSetMemberInfos = participantSetMemberInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The name of the participant set. Returned only, if the API caller is the sender of agreement")
/*     */   @JsonProperty("participantSetName")
/*     */   public String getParticipantSetName() {
/* 152 */     return this.participantSetName;
/*     */   }
/*     */   public void setParticipantSetName(String participantSetName) {
/* 155 */     this.participantSetName = participantSetName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Private message for the participants in the set")
/*     */   @JsonProperty("privateMessage")
/*     */   public String getPrivateMessage() {
/* 165 */     return this.privateMessage;
/*     */   }
/*     */   public void setPrivateMessage(String privateMessage) {
/* 168 */     this.privateMessage = privateMessage;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The current roles of the participant set. A participant set can have one or more roles")
/*     */   @JsonProperty("roles")
/*     */   public List<RolesEnum> getRoles() {
/* 178 */     return this.roles;
/*     */   }
/*     */   public void setRoles(List<RolesEnum> roles) {
/* 181 */     this.roles = roles;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Security options that apply to the participant")
/*     */   @JsonProperty("securityOptions")
/*     */   public List<SecurityOptionsEnum> getSecurityOptions() {
/* 191 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
/* 194 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Index indicating sequential signing group (specified for hybrid routing)")
/*     */   @JsonProperty("signingOrder")
/*     */   public Integer getSigningOrder() {
/* 204 */     return this.signingOrder;
/*     */   }
/*     */   public void setSigningOrder(Integer signingOrder) {
/* 207 */     this.signingOrder = signingOrder;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The status of the participant set with respect to the widget")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 217 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 220 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 227 */     StringBuilder sb = new StringBuilder();
/* 228 */     sb.append("class ParticipantSetInfo {\n");
/*     */     
/* 230 */     sb.append("    participantSetId: ").append(StringUtil.toIndentedString(this.participantSetId)).append("\n");
/* 231 */     sb.append("    participantSetMemberInfos: ").append(StringUtil.toIndentedString(this.participantSetMemberInfos)).append("\n");
/* 232 */     sb.append("    participantSetName: ").append(StringUtil.toIndentedString(this.participantSetName)).append("\n");
/* 233 */     sb.append("    privateMessage: ").append(StringUtil.toIndentedString(this.privateMessage)).append("\n");
/* 234 */     sb.append("    roles: ").append(StringUtil.toIndentedString(this.roles)).append("\n");
/* 235 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 236 */     sb.append("    signingOrder: ").append(StringUtil.toIndentedString(this.signingOrder)).append("\n");
/* 237 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 238 */     sb.append("}");
/* 239 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\ParticipantSetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */