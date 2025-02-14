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
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class ParticipantInfo
/*     */ {
/*     */   private List<ParticipantSetInfo> alternateParticipants;
/*     */   private String company;
/*     */   private String email;
/*     */   private String name;
/*     */   
/*     */   public ParticipantInfo() {
/*  30 */     this.alternateParticipants = new ArrayList<>();
/*  31 */     this.company = null;
/*  32 */     this.email = null;
/*  33 */     this.name = null;
/*  34 */     this.participantId = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  56 */     this.title = null;
/*     */   }
/*     */   private String participantId; private List<SecurityOptionsEnum> securityOptions; private String title; public enum SecurityOptionsEnum {
/*     */     PASSWORD("PASSWORD"),
/*     */     WEB_IDENTITY("WEB_IDENTITY"),
/*     */     KBA("KBA"),
/*     */     PHONE("PHONE"),
/*     */     OTHER("OTHER"); private String value; SecurityOptionsEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty("All the child participants of the current participant. The possible values for the status of these participants are, SHARE and DELEGATE")
/*     */   @JsonProperty("alternateParticipants")
/*  65 */   public List<ParticipantSetInfo> getAlternateParticipants() { return this.alternateParticipants; }
/*     */   
/*     */   public void setAlternateParticipants(List<ParticipantSetInfo> alternateParticipants) {
/*  68 */     this.alternateParticipants = alternateParticipants;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The company of the participant, if available")
/*     */   @JsonProperty("company")
/*     */   public String getCompany() {
/*  78 */     return this.company;
/*     */   }
/*     */   public void setCompany(String company) {
/*  81 */     this.company = company;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The email address of the participant")
/*     */   @JsonProperty("email")
/*     */   public String getEmail() {
/*  91 */     return this.email;
/*     */   }
/*     */   public void setEmail(String email) {
/*  94 */     this.email = email;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The name of the participant, if available")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 104 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 107 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The unique identifier of the participant")
/*     */   @JsonProperty("participantId")
/*     */   public String getParticipantId() {
/* 117 */     return this.participantId;
/*     */   }
/*     */   public void setParticipantId(String participantId) {
/* 120 */     this.participantId = participantId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Security options that apply to the participant")
/*     */   @JsonProperty("securityOptions")
/*     */   public List<SecurityOptionsEnum> getSecurityOptions() {
/* 130 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
/* 133 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The title of the participant, if available")
/*     */   @JsonProperty("title")
/*     */   public String getTitle() {
/* 143 */     return this.title;
/*     */   }
/*     */   public void setTitle(String title) {
/* 146 */     this.title = title;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 153 */     StringBuilder sb = new StringBuilder();
/* 154 */     sb.append("class ParticipantInfo {\n");
/*     */     
/* 156 */     sb.append("    alternateParticipants: ").append(StringUtil.toIndentedString(this.alternateParticipants)).append("\n");
/* 157 */     sb.append("    company: ").append(StringUtil.toIndentedString(this.company)).append("\n");
/* 158 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 159 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 160 */     sb.append("    participantId: ").append(StringUtil.toIndentedString(this.participantId)).append("\n");
/* 161 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 162 */     sb.append("    title: ").append(StringUtil.toIndentedString(this.title)).append("\n");
/* 163 */     sb.append("}");
/* 164 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\ParticipantInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */