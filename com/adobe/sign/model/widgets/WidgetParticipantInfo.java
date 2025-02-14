/*     */ package com.adobe.sign.model.widgets;
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
/*     */ public class WidgetParticipantInfo
/*     */ {
/*     */   private String company;
/*     */   private String email;
/*     */   private String name;
/*     */   
/*     */   public WidgetParticipantInfo() {
/*  29 */     this.company = null;
/*  30 */     this.email = null;
/*  31 */     this.name = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  52 */     this.securityOptions = new ArrayList<>();
/*  53 */     this.title = null;
/*     */   }
/*     */   private List<SecurityOptionsEnum> securityOptions; private String title; public enum SecurityOptionsEnum {
/*     */     PASSWORD("PASSWORD"),
/*     */     WEB_IDENTITY("WEB_IDENTITY"),
/*     */     KBA("KBA"),
/*     */     PHONE("PHONE"),
/*     */     OTHER("OTHER"); private String value; SecurityOptionsEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty("The company of the participant, if available")
/*     */   @JsonProperty("company")
/*  62 */   public String getCompany() { return this.company; }
/*     */   
/*     */   public void setCompany(String company) {
/*  65 */     this.company = company;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The email address of the participant")
/*     */   @JsonProperty("email")
/*     */   public String getEmail() {
/*  75 */     return this.email;
/*     */   }
/*     */   public void setEmail(String email) {
/*  78 */     this.email = email;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The name of the participant, if available")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/*  88 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/*  91 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Security options that apply to the participant")
/*     */   @JsonProperty("securityOptions")
/*     */   public List<SecurityOptionsEnum> getSecurityOptions() {
/* 101 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
/* 104 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The title of the participant, if available")
/*     */   @JsonProperty("title")
/*     */   public String getTitle() {
/* 114 */     return this.title;
/*     */   }
/*     */   public void setTitle(String title) {
/* 117 */     this.title = title;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 124 */     StringBuilder sb = new StringBuilder();
/* 125 */     sb.append("class WidgetParticipantInfo {\n");
/*     */     
/* 127 */     sb.append("    company: ").append(StringUtil.toIndentedString(this.company)).append("\n");
/* 128 */     sb.append("    email: ").append(StringUtil.toIndentedString(this.email)).append("\n");
/* 129 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 130 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 131 */     sb.append("    title: ").append(StringUtil.toIndentedString(this.title)).append("\n");
/* 132 */     sb.append("}");
/* 133 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\WidgetParticipantInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */