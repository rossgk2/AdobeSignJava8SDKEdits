/*     */ package com.adobe.sign.model.workflows;

import java.util.Date;

import com.adobe.sign.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*     */ 
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class UserWorkflow {
/*     */   private Date created;
/*     */   private String description;
/*     */   private String displayName;
/*     */   private String name;
/*     */   private ScopeEnum scope;
/*     */   private String scopeId;
/*     */   private StatusEnum status;
/*     */   private String workflowId;
/*     */   
/*     */   public enum ScopeEnum {
/*     */     ACCOUNT("ACCOUNT"),
/*     */     GROUP("GROUP");
/*     */     private String value;
/*     */     
/*     */     ScopeEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return this.value;
/*     */     }
/*     */   }
/*     */   
/*  29 */   public UserWorkflow() { this.created = null;
/*  30 */     this.description = null;
/*  31 */     this.displayName = null;
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
/*  50 */     this.scope = null;
/*  51 */     this.scopeId = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     this.status = null;
/*  71 */     this.workflowId = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The day on which the workflow was created")
/*     */   @JsonProperty("created")
/*     */   public Date getCreated() {
/*  80 */     return this.created;
/*     */   }
/*     */   public enum StatusEnum {
/*  83 */     ACTIVE("ACTIVE"), DRAFT("DRAFT"), HIDDEN("HIDDEN"); private String value; StatusEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setCreated(Date created) { this.created = created; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Description provided for this workflow at the time of its creation")
/*     */   @JsonProperty("description")
/*     */   public String getDescription() {
/*  93 */     return this.description;
/*     */   }
/*     */   public void setDescription(String description) {
/*  96 */     this.description = description;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The display name of the workflow.")
/*     */   @JsonProperty("displayName")
/*     */   public String getDisplayName() {
/* 106 */     return this.displayName;
/*     */   }
/*     */   public void setDisplayName(String displayName) {
/* 109 */     this.displayName = displayName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the workflow.")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 119 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 122 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The workflow scope (ACCOUNT or GROUP or OTHER)")
/*     */   @JsonProperty("scope")
/*     */   public ScopeEnum getScope() {
/* 132 */     return this.scope;
/*     */   }
/*     */   public void setScope(ScopeEnum scope) {
/* 135 */     this.scope = scope;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Identifier of scope. Currently it is applicable for scope GROUP only and the value will be groupId.")
/*     */   @JsonProperty("scopeId")
/*     */   public String getScopeId() {
/* 145 */     return this.scopeId;
/*     */   }
/*     */   public void setScopeId(String scopeId) {
/* 148 */     this.scopeId = scopeId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The workflow status (ACTIVE or DRAFT or OTHER)")
/*     */   @JsonProperty("status")
/*     */   public StatusEnum getStatus() {
/* 158 */     return this.status;
/*     */   }
/*     */   public void setStatus(StatusEnum status) {
/* 161 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The unique identifier of a workflow")
/*     */   @JsonProperty("workflowId")
/*     */   public String getWorkflowId() {
/* 171 */     return this.workflowId;
/*     */   }
/*     */   public void setWorkflowId(String workflowId) {
/* 174 */     this.workflowId = workflowId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 181 */     StringBuilder sb = new StringBuilder();
/* 182 */     sb.append("class UserWorkflow {\n");
/*     */     
/* 184 */     sb.append("    created: ").append(StringUtil.toIndentedString(this.created)).append("\n");
/* 185 */     sb.append("    description: ").append(StringUtil.toIndentedString(this.description)).append("\n");
/* 186 */     sb.append("    displayName: ").append(StringUtil.toIndentedString(this.displayName)).append("\n");
/* 187 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 188 */     sb.append("    scope: ").append(StringUtil.toIndentedString(this.scope)).append("\n");
/* 189 */     sb.append("    scopeId: ").append(StringUtil.toIndentedString(this.scopeId)).append("\n");
/* 190 */     sb.append("    status: ").append(StringUtil.toIndentedString(this.status)).append("\n");
/* 191 */     sb.append("    workflowId: ").append(StringUtil.toIndentedString(this.workflowId)).append("\n");
/* 192 */     sb.append("}");
/* 193 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\workflows\UserWorkflow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */