/*     */ package com.adobe.sign.model.libraryDocuments;
import java.util.ArrayList;
import java.util.Date;
/*     */ import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.utils.StringUtil;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class DocumentLibraryItem {
/*     */   private String libraryDocumentId;
/*     */   private List<LibraryTemplateTypesEnum> libraryTemplateTypes;
/*     */   private Date modifiedDate;
/*     */   private String name;
/*     */   private ScopeEnum scope;
/*     */   
/*     */   public enum LibraryTemplateTypesEnum {
/*     */     DOCUMENT("DOCUMENT"),
/*     */     FORM_FIELD_LAYER("FORM_FIELD_LAYER");
/*     */     private String value;
/*     */     
/*     */     LibraryTemplateTypesEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return this.value;
/*     */     }
/*     */   }
/*     */   
/*  30 */   public DocumentLibraryItem() { this.libraryDocumentId = null;
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
/*  48 */     this.libraryTemplateTypes = new ArrayList<>();
/*  49 */     this.modifiedDate = null;
/*  50 */     this.name = null;
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
/*  69 */     this.scope = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The unique identifier of the library document used when sending the document to be signed")
/*     */   @JsonProperty("libraryDocumentId")
/*     */   public String getLibraryDocumentId() {
/*  78 */     return this.libraryDocumentId;
/*     */   }
/*     */   public enum ScopeEnum {
/*  81 */     PERSONAL("PERSONAL"), SHARED("SHARED"), GLOBAL("GLOBAL"); private String value; ScopeEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setLibraryDocumentId(String libraryDocumentId) { this.libraryDocumentId = libraryDocumentId; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A list of one or more library template types")
/*     */   @JsonProperty("libraryTemplateTypes")
/*     */   public List<LibraryTemplateTypesEnum> getLibraryTemplateTypes() {
/*  91 */     return this.libraryTemplateTypes;
/*     */   }
/*     */   public void setLibraryTemplateTypes(List<LibraryTemplateTypesEnum> libraryTemplateTypes) {
/*  94 */     this.libraryTemplateTypes = libraryTemplateTypes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The day on which the library document was last modified")
/*     */   @JsonProperty("modifiedDate")
/*     */   public Date getModifiedDate() {
/* 104 */     return this.modifiedDate;
/*     */   }
/*     */   public void setModifiedDate(Date modifiedDate) {
/* 107 */     this.modifiedDate = modifiedDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the library document")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 117 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 120 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The scope of visibility of the library document")
/*     */   @JsonProperty("scope")
/*     */   public ScopeEnum getScope() {
/* 130 */     return this.scope;
/*     */   }
/*     */   public void setScope(ScopeEnum scope) {
/* 133 */     this.scope = scope;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 140 */     StringBuilder sb = new StringBuilder();
/* 141 */     sb.append("class DocumentLibraryItem {\n");
/*     */     
/* 143 */     sb.append("    libraryDocumentId: ").append(StringUtil.toIndentedString(this.libraryDocumentId)).append("\n");
/* 144 */     sb.append("    libraryTemplateTypes: ").append(StringUtil.toIndentedString(this.libraryTemplateTypes)).append("\n");
/* 145 */     sb.append("    modifiedDate: ").append(StringUtil.toIndentedString(this.modifiedDate)).append("\n");
/* 146 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 147 */     sb.append("    scope: ").append(StringUtil.toIndentedString(this.scope)).append("\n");
/* 148 */     sb.append("}");
/* 149 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\libraryDocuments\DocumentLibraryItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */