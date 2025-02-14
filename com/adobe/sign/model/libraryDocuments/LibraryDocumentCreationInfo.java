/*     */ package com.adobe.sign.model.libraryDocuments;
import java.util.ArrayList;
/*     */ import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.utils.StringUtil;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class LibraryDocumentCreationInfo {
/*     */   private List<FileInfo> fileInfos;
/*     */   private LibrarySharingModeEnum librarySharingMode;
/*     */   private List<LibraryTemplateTypesEnum> libraryTemplateTypes;
/*     */   private String name;
/*     */   
/*     */   public enum LibrarySharingModeEnum {
/*     */     USER("USER"),
/*     */     GROUP("GROUP"),
/*     */     ACCOUNT("ACCOUNT");
/*     */     private String value;
/*     */     
/*     */     LibrarySharingModeEnum(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     public String toString() {
/*     */       return this.value;
/*     */     }
/*     */   }
/*     */   
/*  30 */   public LibraryDocumentCreationInfo() { this.fileInfos = new ArrayList<>();
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
/*  49 */     this.librarySharingMode = null;
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
/*  67 */     this.libraryTemplateTypes = new ArrayList<>();
/*  68 */     this.name = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified")
/*     */   @JsonProperty("fileInfos")
/*     */   public List<FileInfo> getFileInfos() {
/*  77 */     return this.fileInfos;
/*     */   }
/*     */   public enum LibraryTemplateTypesEnum {
/*  80 */     DOCUMENT("DOCUMENT"), FORM_FIELD_LAYER("FORM_FIELD_LAYER"); private String value; LibraryTemplateTypesEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setFileInfos(List<FileInfo> fileInfos) { this.fileInfos = fileInfos; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Specifies who should have access to this library document")
/*     */   @JsonProperty("librarySharingMode")
/*     */   public LibrarySharingModeEnum getLibrarySharingMode() {
/*  90 */     return this.librarySharingMode;
/*     */   }
/*     */   public void setLibrarySharingMode(LibrarySharingModeEnum librarySharingMode) {
/*  93 */     this.librarySharingMode = librarySharingMode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "A list of one or more library template types")
/*     */   @JsonProperty("libraryTemplateTypes")
/*     */   public List<LibraryTemplateTypesEnum> getLibraryTemplateTypes() {
/* 103 */     return this.libraryTemplateTypes;
/*     */   }
/*     */   public void setLibraryTemplateTypes(List<LibraryTemplateTypesEnum> libraryTemplateTypes) {
/* 106 */     this.libraryTemplateTypes = libraryTemplateTypes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the agreement that will be used to identify it, in emails and on the website")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 116 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 119 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 126 */     StringBuilder sb = new StringBuilder();
/* 127 */     sb.append("class LibraryDocumentCreationInfo {\n");
/*     */     
/* 129 */     sb.append("    fileInfos: ").append(StringUtil.toIndentedString(this.fileInfos)).append("\n");
/* 130 */     sb.append("    librarySharingMode: ").append(StringUtil.toIndentedString(this.librarySharingMode)).append("\n");
/* 131 */     sb.append("    libraryTemplateTypes: ").append(StringUtil.toIndentedString(this.libraryTemplateTypes)).append("\n");
/* 132 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 133 */     sb.append("}");
/* 134 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\libraryDocuments\LibraryDocumentCreationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */