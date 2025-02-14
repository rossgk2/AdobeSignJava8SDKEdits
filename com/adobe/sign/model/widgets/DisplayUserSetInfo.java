/*    */ package com.adobe.sign.model.widgets;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Displays the info about user set")
/*    */   @JsonProperty("displayUserSetMemberInfos")
/*    */   public List<DisplayUserInfo> getDisplayUserSetMemberInfos() {
/* 39 */     return this.displayUserSetMemberInfos;
/*    */   }
/*    */   public void setDisplayUserSetMemberInfos(List<DisplayUserInfo> displayUserSetMemberInfos) {
/* 42 */     this.displayUserSetMemberInfos = displayUserSetMemberInfos;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     StringBuilder sb = new StringBuilder();
/* 50 */     sb.append("class DisplayUserSetInfo {\n");
/*    */     
/* 52 */     sb.append("    displayUserSetMemberInfos: ").append(StringUtil.toIndentedString(this.displayUserSetMemberInfos)).append("\n");
/* 53 */     sb.append("}");
/* 54 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\DisplayUserSetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */