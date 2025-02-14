/*     */ package com.adobe.sign.model.widgets;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class WidgetPersonalizationInfo
/*     */ {
/*  29 */   private Boolean allowManualVerification = null;
/*  30 */   private String comment = null;
/*  31 */   private String email = null;
/*  32 */   private Date expiration = null;
/*  33 */   private Boolean reusable = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Not used at this time")
/*     */   @JsonProperty("allowManualVerification")
/*     */   public Boolean getAllowManualVerification() {
/*  42 */     return this.allowManualVerification;
/*     */   }
/*     */   public void setAllowManualVerification(Boolean allowManualVerification) {
/*  45 */     this.allowManualVerification = allowManualVerification;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Comment describing how the API caller established the identity of the signer - will appear in the audit trail.")
/*     */   @JsonProperty("comment")
/*     */   public String getComment() {
/*  55 */     return this.comment;
/*     */   }
/*     */   public void setComment(String comment) {
/*  58 */     this.comment = comment;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The email address of the person who will be receiving this widget")
/*     */   @JsonProperty("email")
/*     */   public String getEmail() {
/*  68 */     return this.email;
/*     */   }
/*     */   public void setEmail(String email) {
/*  71 */     this.email = email;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Expiration date for the personalization of this widget. After this date, the identity of the signer will not be assumed by Adobe Sign.")
/*     */   @JsonProperty("expiration")
/*     */   public Date getExpiration() {
/*  81 */     return this.expiration;
/*     */   }
/*     */   public void setExpiration(Date expiration) {
/*  84 */     this.expiration = expiration;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Should the intended signer be allowed to sign this widget more than once")
/*     */   @JsonProperty("reusable")
/*     */   public Boolean getReusable() {
/*  94 */     return this.reusable;
/*     */   }
/*     */   public void setReusable(Boolean reusable) {
/*  97 */     this.reusable = reusable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 104 */     StringBuilder sb = new StringBuilder();
/* 105 */     sb.append("class WidgetPersonalizationInfo {\n");
/*     */     
/* 107 */     sb.append("    allowManualVerification: ").append(StringUtil.toIndentedString(this.allowManualVerification)).append("\n");
/* 108 */     sb.append("    comment: ").append(StringUtil.toIndentedString(this.comment)).append("\n");
/* 109 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 110 */     sb.append("    expiration: ").append(StringUtil.toIndentedString(this.expiration)).append("\n");
/* 111 */     sb.append("    reusable: ").append(StringUtil.toIndentedString(this.reusable)).append("\n");
/* 112 */     sb.append("}");
/* 113 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetPersonalizationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */