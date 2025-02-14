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
/*     */ 
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class RecipientSetInfo
/*     */ {
/*     */   private String privateMessage;
/*     */   private List<RecipientInfo> recipientSetMemberInfos;
/*     */   private String recipientSetName;
/*     */   
/*     */   public RecipientSetInfo() {
/*  31 */     this.privateMessage = null;
/*  32 */     this.recipientSetMemberInfos = new ArrayList<>();
/*  33 */     this.recipientSetName = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  58 */     this.recipientSetRole = null;
/*  59 */     this.securityOptions = new ArrayList<>();
/*  60 */     this.signingOrder = null;
/*     */   }
/*     */   private RecipientSetRoleEnum recipientSetRole; private List<RecipientSecurityOption> securityOptions; private Integer signingOrder; public enum RecipientSetRoleEnum {
/*     */     SIGNER("SIGNER"), APPROVER("APPROVER"), ACCEPTOR("ACCEPTOR"), CERTIFIED_RECIPIENT("CERTIFIED_RECIPIENT"), DELEGATE_TO_ACCEPTOR("DELEGATE_TO_ACCEPTOR"),
/*     */     DELEGATE_TO_CERTIFIED_RECIPIENT("DELEGATE_TO_CERTIFIED_RECIPIENT"),
/*     */     FORM_FILLER("FORM_FILLER"),
/*     */     DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"),
/*     */     DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER"); private String value; RecipientSetRoleEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty("Private message for the recipients in the set")
/*     */   @JsonProperty("privateMessage")
/*  69 */   public String getPrivateMessage() { return this.privateMessage; }
/*     */   
/*     */   public void setPrivateMessage(String privateMessage) {
/*  72 */     this.privateMessage = privateMessage;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Information about the members of the recipient set")
/*     */   @JsonProperty("recipientSetMemberInfos")
/*     */   public List<RecipientInfo> getRecipientSetMemberInfos() {
/*  82 */     return this.recipientSetMemberInfos;
/*     */   }
/*     */   public void setRecipientSetMemberInfos(List<RecipientInfo> recipientSetMemberInfos) {
/*  85 */     this.recipientSetMemberInfos = recipientSetMemberInfos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Specify the name of Recipient set. Maximum no of characters in recipient set name is restricted to 255.")
/*     */   @JsonProperty("recipientSetName")
/*     */   public String getRecipientSetName() {
/*  95 */     return this.recipientSetName;
/*     */   }
/*     */   public void setRecipientSetName(String recipientSetName) {
/*  98 */     this.recipientSetName = recipientSetName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Specify the role of recipient set")
/*     */   @JsonProperty("recipientSetRole")
/*     */   public RecipientSetRoleEnum getRecipientSetRole() {
/* 108 */     return this.recipientSetRole;
/*     */   }
/*     */   public void setRecipientSetRole(RecipientSetRoleEnum recipientSetRole) {
/* 111 */     this.recipientSetRole = recipientSetRole;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Security options that apply to the recipient")
/*     */   @JsonProperty("securityOptions")
/*     */   public List<RecipientSecurityOption> getSecurityOptions() {
/* 121 */     return this.securityOptions;
/*     */   }
/*     */   public void setSecurityOptions(List<RecipientSecurityOption> securityOptions) {
/* 124 */     this.securityOptions = securityOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Index indicating sequential signing group (specify for hybrid routing)")
/*     */   @JsonProperty("signingOrder")
/*     */   public Integer getSigningOrder() {
/* 134 */     return this.signingOrder;
/*     */   }
/*     */   public void setSigningOrder(Integer signingOrder) {
/* 137 */     this.signingOrder = signingOrder;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 144 */     StringBuilder sb = new StringBuilder();
/* 145 */     sb.append("class RecipientSetInfo {\n");
/*     */     
/* 147 */     sb.append("    privateMessage: ").append(StringUtil.toIndentedString(this.privateMessage)).append("\n");
/* 148 */     sb.append("    recipientSetMemberInfos: ").append(StringUtil.toIndentedString(this.recipientSetMemberInfos)).append("\n");
/* 149 */     sb.append("    recipientSetName: ").append(StringUtil.toIndentedString(this.recipientSetName)).append("\n");
/* 150 */     sb.append("    recipientSetRole: ").append(StringUtil.toIndentedString(this.recipientSetRole)).append("\n");
/* 151 */     sb.append("    securityOptions: ").append(StringUtil.toIndentedString(this.securityOptions)).append("\n");
/* 152 */     sb.append("    signingOrder: ").append(StringUtil.toIndentedString(this.signingOrder)).append("\n");
/* 153 */     sb.append("}");
/* 154 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\RecipientSetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */