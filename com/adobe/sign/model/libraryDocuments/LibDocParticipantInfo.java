/*     */ package com.adobe.sign.model.libraryDocuments;
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
/*     */ public class LibDocParticipantInfo
/*     */ {
/*     */   private List<LibDocParticipantInfo> alternateParticipants;
/*     */   private String company;
/*     */   private String email;
/*     */   private String name;
/*     */   private List<RolesEnum> roles;
/*     */   
/*     */   public LibDocParticipantInfo() {
/*  30 */     this.alternateParticipants = new ArrayList<>();
/*  31 */     this.company = null;
/*  32 */     this.email = null;
/*  33 */     this.name = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     this.status = null;
/* 117 */     this.title = null;
/*     */   }
/*     */   private List<SecurityOptionsEnum> securityOptions;
/*     */   private StatusEnum status;
/*     */   private String title;
/*     */   public enum RolesEnum {
/*     */     SENDER("SENDER"), SIGNER("SIGNER"), APPROVER("APPROVER"), DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"), DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER"), CC("CC"), DELEGATE("DELEGATE"), SHARE("SHARE"), OTHER("OTHER");
/*     */     private String value; RolesEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum SecurityOptionsEnum {
/*     */     PASSWORD("PASSWORD"), WEB_IDENTITY("WEB_IDENTITY"), KBA("KBA"), PHONE("PHONE"), OTHER("OTHER"); private String value; SecurityOptionsEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum StatusEnum {
/* 126 */     WAITING_FOR_MY_SIGNATURE("WAITING_FOR_MY_SIGNATURE"), WAITING_FOR_MY_APPROVAL("WAITING_FOR_MY_APPROVAL"), WAITING_FOR_MY_DELEGATION("WAITING_FOR_MY_DELEGATION"), OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"), SIGNED("SIGNED"), APPROVED("APPROVED"), RECALLED("RECALLED"), HIDDEN("HIDDEN"), NOT_YET_VISIBLE("NOT_YET_VISIBLE"), WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"), ARCHIVED("ARCHIVED"), UNKNOWN("UNKNOWN"), PARTIAL("PARTIAL"), FORM("FORM"), WAITING_FOR_AUTHORING("WAITING_FOR_AUTHORING"), OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"), WIDGET("WIDGET"), EXPIRED("EXPIRED"), WAITING_FOR_MY_REVIEW("WAITING_FOR_MY_REVIEW"), IN_REVIEW("IN_REVIEW"), OTHER("OTHER"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty("All the child participants of the current participant. The possible values for the status of these participants are, SHARE and DELEGATE") @JsonProperty("alternateParticipants") public List<LibDocParticipantInfo> getAlternateParticipants() { return this.alternateParticipants; }
/*     */   
/*     */   public void setAlternateParticipants(List<LibDocParticipantInfo> alternateParticipants) {
/* 129 */     this.alternateParticipants = alternateParticipants;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The company of the participant, if available")
/*     */   @JsonProperty("company")
/*     */   public String getCompany() {
/* 139 */     return this.company;
/*     */   }
/*     */   public void setCompany(String company) {
/* 142 */     this.company = company;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The email address of the participant")
/*     */   @JsonProperty("email")
/*     */   public String getEmail() {
/* 152 */     return this.email;
/*     */   }
/*     */   public void setEmail(String email) {
/* 155 */     this.email = email;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The name of the participant, if available")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 165 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 168 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The current roles of the participant. A participant can have one or more roles")
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
/*     */   @ApiModelProperty(required = true, value = "The status of the participant with respect to the document")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 204 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 207 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The title of the participant, if available")
/*     */   @JsonProperty("title")
/*     */   public String getTitle() {
/* 217 */     return this.title;
/*     */   }
/*     */   public void setTitle(String title) {
/* 220 */     this.title = title;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 227 */     StringBuilder sb = new StringBuilder();
/* 228 */     sb.append("class LibDocParticipantInfo {\n");
/*     */     
/* 230 */     sb.append("    alternateParticipants: ").append(StringUtil.toIndentedString(this.alternateParticipants)).append("\n");
/* 231 */     sb.append("    company: ").append(StringUtil.toIndentedString(this.company)).append("\n");
/* 232 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 233 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 234 */     sb.append("    roles: ").append(StringUtil.toIndentedString(this.roles)).append("\n");
/* 235 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 236 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 237 */     sb.append("    title: ").append(StringUtil.toIndentedString(this.title)).append("\n");
/* 238 */     sb.append("}");
/* 239 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\libraryDocuments\LibDocParticipantInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */