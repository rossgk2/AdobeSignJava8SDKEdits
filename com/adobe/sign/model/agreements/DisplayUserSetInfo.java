/*    */ package com.adobe.sign.model.agreements;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;

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
/*    */ public class DisplayUserSetInfo
/*    */ {
/* 30 */   private List<DisplayUserInfo> displayUserSetMemberInfos = new ArrayList<>();
/* 31 */   private String displayUserSetName = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Displays the info about user set")
/*    */   @JsonProperty("displayUserSetMemberInfos")
/*    */   public List<DisplayUserInfo> getDisplayUserSetMemberInfos() {
/* 40 */     return this.displayUserSetMemberInfos;
/*    */   }
/*    */   public void setDisplayUserSetMemberInfos(List<DisplayUserInfo> displayUserSetMemberInfos) {
/* 43 */     this.displayUserSetMemberInfos = displayUserSetMemberInfos;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("The name of the display user set. Returned only, if the API caller is the sender of agreement.")
/*    */   @JsonProperty("displayUserSetName")
/*    */   public String getDisplayUserSetName() {
/* 53 */     return this.displayUserSetName;
/*    */   }
/*    */   public void setDisplayUserSetName(String displayUserSetName) {
/* 56 */     this.displayUserSetName = displayUserSetName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     StringBuilder sb = new StringBuilder();
/* 64 */     sb.append("class DisplayUserSetInfo {\n");
/*    */     
/* 66 */     sb.append("    displayUserSetMemberInfos: ").append(StringUtil.toIndentedString(this.displayUserSetMemberInfos)).append("\n");
/* 67 */     sb.append("    displayUserSetName: ").append(StringUtil.toIndentedString(this.displayUserSetName)).append("\n");
/* 68 */     sb.append("}");
/* 69 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\DisplayUserSetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */