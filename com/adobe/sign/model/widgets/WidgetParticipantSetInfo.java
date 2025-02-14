/*     */ package com.adobe.sign.model.widgets;

import java.util.ArrayList;
import java.util.List;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
/*     */ public class WidgetParticipantSetInfo { private List<WidgetParticipantInfo> participantSetMemberInfos; private List<RolesEnum> roles; private List<SecurityOptionsEnum> securityOptions; private StatusEnum status;
/*     */   public enum RolesEnum { SENDER("SENDER"),
/*     */     SIGNER("SIGNER"),
/*     */     APPROVER("APPROVER"),
/*     */     DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"),
/*     */     DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER"),
/*     */     CC("CC"),
/*     */     DELEGATE("DELEGATE"),
/*     */     SHARE("SHARE"),
/*     */     WIDGET_SIGNER("WIDGET_SIGNER"),
/*     */     OTHER("OTHER"); private String value;
/*     */     RolesEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     public String toString() {
/*     */       return this.value;
/*     */     } }
/*     */   public enum SecurityOptionsEnum { PASSWORD("PASSWORD"),
/*     */     WEB_IDENTITY("WEB_IDENTITY"),
/*     */     KBA("KBA"),
/*     */     PHONE("PHONE"),
/*     */     OTHER("OTHER"); private String value;
/*     */     SecurityOptionsEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     public String toString() {
/*     */       return this.value;
/*     */     } }
/*  30 */   public WidgetParticipantSetInfo() { this.participantSetMemberInfos = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  56 */     this.roles = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  77 */     this.securityOptions = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     this.status = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about the members of the recipient set")
/*     */   @JsonProperty("participantSetMemberInfos")
/*     */   public List<WidgetParticipantInfo> getParticipantSetMemberInfos() {
/* 123 */     return this.participantSetMemberInfos;
/*     */   }
/*     */   public enum StatusEnum {
/* 126 */     WAITING_FOR_MY_SIGNATURE("WAITING_FOR_MY_SIGNATURE"), WAITING_FOR_MY_APPROVAL("WAITING_FOR_MY_APPROVAL"), WAITING_FOR_MY_DELEGATION("WAITING_FOR_MY_DELEGATION"), OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"), SIGNED("SIGNED"), APPROVED("APPROVED"), RECALLED("RECALLED"), HIDDEN("HIDDEN"), NOT_YET_VISIBLE("NOT_YET_VISIBLE"), WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"), ARCHIVED("ARCHIVED"), UNKNOWN("UNKNOWN"), PARTIAL("PARTIAL"), FORM("FORM"), WAITING_FOR_AUTHORING("WAITING_FOR_AUTHORING"), OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"), WIDGET("WIDGET"), EXPIRED("EXPIRED"), WAITING_FOR_MY_REVIEW("WAITING_FOR_MY_REVIEW"), IN_REVIEW("IN_REVIEW"), OTHER("OTHER"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setParticipantSetMemberInfos(List<WidgetParticipantInfo> participantSetMemberInfos) { this.participantSetMemberInfos = participantSetMemberInfos; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The current roles of the participant set. A participant set can have one or more roles")
/*     */   @JsonProperty("roles")
/*     */   public List<RolesEnum> getRoles() {
/* 136 */     return this.roles;
/*     */   }
/*     */   public void setRoles(List<RolesEnum> roles) {
/* 139 */     this.roles = roles;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Security options that apply to the participant")
/*     */   @JsonProperty("securityOptions")
/*     */   public List<SecurityOptionsEnum> getSecurityOptions() {
/* 149 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
/* 152 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The status of the participant set with respect to the widget")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 162 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 165 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 172 */     StringBuilder sb = new StringBuilder();
/* 173 */     sb.append("class WidgetParticipantSetInfo {\n");
/*     */     
/* 175 */     sb.append("    participantSetMemberInfos: ").append(StringUtil.toIndentedString(this.participantSetMemberInfos)).append("\n");
/* 176 */     sb.append("    roles: ").append(StringUtil.toIndentedString(this.roles)).append("\n");
/* 177 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 178 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 179 */     sb.append("}");
/* 180 */     return sb.toString();
/*     */   } }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetParticipantSetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */