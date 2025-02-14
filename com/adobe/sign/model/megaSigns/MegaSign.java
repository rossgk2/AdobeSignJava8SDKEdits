/*     */ package com.adobe.sign.model.megaSigns;
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
/*     */ 
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class MegaSign
/*     */ {
/*     */   private Date displayDate;
/*     */   private Boolean esign;
/*     */   private String megaSignId;
/*     */   
/*     */   public MegaSign() {
/*  29 */     this.displayDate = null;
/*  30 */     this.esign = null;
/*  31 */     this.megaSignId = null;
/*  32 */     this.name = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  62 */     this.status = null;
/*     */   }
/*     */   private String name; private StatusEnum status; public enum StatusEnum {
/*     */     WAITING_FOR_MY_SIGNATURE("WAITING_FOR_MY_SIGNATURE"), WAITING_FOR_MY_APPROVAL("WAITING_FOR_MY_APPROVAL"), WAITING_FOR_MY_DELEGATION("WAITING_FOR_MY_DELEGATION"), OUT_FOR_SIGNATURE("OUT_FOR_SIGNATURE"), OUT_FOR_APPROVAL("OUT_FOR_APPROVAL"), SIGNED("SIGNED"), APPROVED("APPROVED"), RECALLED("RECALLED"), WAITING_FOR_FAXIN("WAITING_FOR_FAXIN"), ARCHIVED("ARCHIVED"),
/*     */     FORM("FORM"),
/*     */     EXPIRED("EXPIRED"),
/*     */     WIDGET("WIDGET"),
/*     */     WAITING_FOR_AUTHORING("WAITING_FOR_AUTHORING"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty(required = true, value = "The display date for the MegaSign parent agreement")
/*     */   @JsonProperty("displayDate")
/*  71 */   public Date getDisplayDate() { return this.displayDate; }
/*     */   
/*     */   public void setDisplayDate(Date displayDate) {
/*  74 */     this.displayDate = displayDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "True if this is an e-sign document")
/*     */   @JsonProperty("esign")
/*     */   public Boolean getEsign() {
/*  84 */     return this.esign;
/*     */   }
/*     */   public void setEsign(Boolean esign) {
/*  87 */     this.esign = esign;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Unique identifier of the MegaSign parent agreement")
/*     */   @JsonProperty("megaSignId")
/*     */   public String getMegaSignId() {
/*  97 */     return this.megaSignId;
/*     */   }
/*     */   public void setMegaSignId(String megaSignId) {
/* 100 */     this.megaSignId = megaSignId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Name of the MegaSign parent agreement")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 110 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 113 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Current status of the MegaSign parent agreement from the perspective of the user")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 123 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 126 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 133 */     StringBuilder sb = new StringBuilder();
/* 134 */     sb.append("class MegaSign {\n");
/*     */     
/* 136 */     sb.append("    displayDate: ").append(StringUtil.toIndentedString(this.displayDate)).append("\n");
/* 137 */     sb.append("    esign: ").append(StringUtil.toIndentedString(this.esign)).append("\n");
/* 138 */     sb.append("    megaSignId: ").append(StringUtil.toIndentedString(this.megaSignId)).append("\n");
/* 139 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 140 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 141 */     sb.append("}");
/* 142 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\megaSigns\MegaSign.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */