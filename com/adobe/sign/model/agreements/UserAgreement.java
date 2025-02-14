/*     */ package com.adobe.sign.model.agreements;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
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
/*     */ public class UserAgreement
/*     */ {
/*     */   private String agreementId;
/*     */   private Date displayDate;
/*     */   private List<DisplayUserSetInfo> displayUserSetInfos;
/*     */   private Boolean esign;
/*     */   
/*     */   public UserAgreement() {
/*  31 */     this.agreementId = null;
/*  32 */     this.displayDate = null;
/*  33 */     this.displayUserSetInfos = new ArrayList<>();
/*  34 */     this.esign = null;
/*  35 */     this.latestVersionId = null;
/*  36 */     this.name = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  66 */     this.status = null;
/*     */   }
/*     */   private String latestVersionId; private String name; private StatusEnum status; public enum StatusEnum {
/*     */     WAITING_FOR_MY_SIGNATURE("WAITING_FOR_MY_SIGNATURE"), WAITING_FOR_MY_APPROVAL("WAITING_FOR_MY_APPROVAL"), WAITING_FOR_MY_DELEGATION("WAITING_FOR_MY_DELEGATION"), OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"), OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"), SIGNED("SIGNED"), APPROVED("APPROVED"), RECALLED("RECALLED"), WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"), ARCHIVED("ARCHIVED"),
/*     */     FORM("FORM"),
/*     */     EXPIRED("EXPIRED"),
/*     */     WIDGET("WIDGET"),
/*     */     WAITING_FOR_AUTHORING("WAITING_FOR_AUTHORING"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty(required = true, value = "The unique identifier of the agreement")
/*     */   @JsonProperty("agreementId")
/*  75 */   public String getAgreementId() { return this.agreementId; }
/*     */   
/*     */   public void setAgreementId(String agreementId) {
/*  78 */     this.agreementId = agreementId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The display date for the agreement")
/*     */   @JsonProperty("displayDate")
/*     */   public Date getDisplayDate() {
/*  88 */     return this.displayDate;
/*     */   }
/*     */   public void setDisplayDate(Date displayDate) {
/*  91 */     this.displayDate = displayDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The most relevant current user set for the agreement. It is typically the next signer if the agreement is from the current user, or the sender if received from another user")
/*     */   @JsonProperty("displayUserSetInfos")
/*     */   public List<DisplayUserSetInfo> getDisplayUserSetInfos() {
/* 101 */     return this.displayUserSetInfos;
/*     */   }
/*     */   public void setDisplayUserSetInfos(List<DisplayUserSetInfo> displayUserSetInfos) {
/* 104 */     this.displayUserSetInfos = displayUserSetInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "True if this is an e-sign document")
/*     */   @JsonProperty("esign")
/*     */   public Boolean getEsign() {
/* 114 */     return this.esign;
/*     */   }
/*     */   public void setEsign(Boolean esign) {
/* 117 */     this.esign = esign;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A version ID which uniquely identifies the current version of the agreement")
/*     */   @JsonProperty("latestVersionId")
/*     */   public String getLatestVersionId() {
/* 127 */     return this.latestVersionId;
/*     */   }
/*     */   public void setLatestVersionId(String latestVersionId) {
/* 130 */     this.latestVersionId = latestVersionId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Name of the Agreement")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 140 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 143 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The current status of the document from the perspective of the user")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 153 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 156 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 163 */     StringBuilder sb = new StringBuilder();
/* 164 */     sb.append("class UserAgreement {\n");
/*     */     
/* 166 */     sb.append("    agreementId: ").append(StringUtil.toIndentedString(this.agreementId)).append("\n");
/* 167 */     sb.append("    displayDate: ").append(StringUtil.toIndentedString(this.displayDate)).append("\n");
/* 168 */     sb.append("    displayUserSetInfos: ").append(StringUtil.toIndentedString(this.displayUserSetInfos)).append("\n");
/* 169 */     sb.append("    esign: ").append(StringUtil.toIndentedString(this.esign)).append("\n");
/* 170 */     sb.append("    latestVersionId: ").append(StringUtil.toIndentedString(this.latestVersionId)).append("\n");
/* 171 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 172 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 173 */     sb.append("}");
/* 174 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\UserAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */