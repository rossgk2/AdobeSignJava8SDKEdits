/*    */ package com.adobe.sign.model.agreements;
/*    */ 
/*    */ import com.adobe.sign.utils.StringUtil;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;

/*    */ import io.swagger.annotations.ApiModel;
/*    */ import io.swagger.annotations.ApiModelProperty;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ApiModel(description = "")
/*    */ public class ExternalId
/*    */ {
/* 28 */   private String group = null;
/* 29 */   private String id = null;
/* 30 */   private String namespace = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("An arbitrary value from your system, which can be specified at sending time and then later returned or queried")
/*    */   @JsonProperty("group")
/*    */   public String getGroup() {
/* 39 */     return this.group;
/*    */   }
/*    */   public void setGroup(String group) {
/* 42 */     this.group = group;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("An arbitrary value from your system, which can be specified at sending time and then later returned or queried")
/*    */   @JsonProperty("id")
/*    */   public String getId() {
/* 52 */     return this.id;
/*    */   }
/*    */   public void setId(String id) {
/* 55 */     this.id = id;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("Only supported value for the ExternalID namespace at this time is API_OTHER")
/*    */   @JsonProperty("namespace")
/*    */   public String getNamespace() {
/* 65 */     return this.namespace;
/*    */   }
/*    */   public void setNamespace(String namespace) {
/* 68 */     this.namespace = namespace;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 75 */     StringBuilder sb = new StringBuilder();
/* 76 */     sb.append("class ExternalId {\n");
/*    */     
/* 78 */     sb.append("    group: ").append(StringUtil.toIndentedString(this.group)).append("\n");
/* 79 */     sb.append("    id: ").append(StringUtil.toIndentedString(this.id)).append("\n");
/* 80 */     sb.append("    namespace: ").append(StringUtil.toIndentedString(this.namespace)).append("\n");
/* 81 */     sb.append("}");
/* 82 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\ExternalId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */