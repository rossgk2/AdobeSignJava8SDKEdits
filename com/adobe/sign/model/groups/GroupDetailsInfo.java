/*     */ package com.adobe.sign.model.groups;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class GroupDetailsInfo
/*     */ {
/*  31 */   private Date dateCreated = null;
/*  32 */   private List<UserInfo> groupAdmins = new ArrayList<>();
/*  33 */   private String groupId = null;
/*  34 */   private String groupName = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Date of creation of the group")
/*     */   @JsonProperty("dateCreated")
/*     */   public Date getDateCreated() {
/*  43 */     return this.dateCreated;
/*     */   }
/*     */   public void setDateCreated(Date dateCreated) {
/*  46 */     this.dateCreated = dateCreated;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The list of admins of the group.")
/*     */   @JsonProperty("groupAdmins")
/*     */   public List<UserInfo> getGroupAdmins() {
/*  56 */     return this.groupAdmins;
/*     */   }
/*     */   public void setGroupAdmins(List<UserInfo> groupAdmins) {
/*  59 */     this.groupAdmins = groupAdmins;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Unique identifier of the group")
/*     */   @JsonProperty("groupId")
/*     */   public String getGroupId() {
/*  69 */     return this.groupId;
/*     */   }
/*     */   public void setGroupId(String groupId) {
/*  72 */     this.groupId = groupId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Name of the group")
/*     */   @JsonProperty("groupName")
/*     */   public String getGroupName() {
/*  82 */     return this.groupName;
/*     */   }
/*     */   public void setGroupName(String groupName) {
/*  85 */     this.groupName = groupName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  92 */     StringBuilder sb = new StringBuilder();
/*  93 */     sb.append("class GroupDetailsInfo {\n");
/*     */     
/*  95 */     sb.append("    dateCreated: ").append(StringUtil.toIndentedString(this.dateCreated)).append("\n");
/*  96 */     sb.append("    groupAdmins: ").append(StringUtil.toIndentedString(this.groupAdmins)).append("\n");
/*  97 */     sb.append("    groupId: ").append(StringUtil.toIndentedString(this.groupId)).append("\n");
/*  98 */     sb.append("    groupName: ").append(StringUtil.toIndentedString(this.groupName)).append("\n");
/*  99 */     sb.append("}");
/* 100 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\groups\GroupDetailsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */