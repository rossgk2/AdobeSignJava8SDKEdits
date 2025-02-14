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
/*    */ @ApiModel(description = "")
/*    */ public class CounterSignerSetInfo
/*    */ {
/*    */   private List<CounterSignerInfo> counterSignerSetMemberInfos;
/*    */   
/*    */   public CounterSignerSetInfo() {
/* 30 */     this.counterSignerSetMemberInfos = new ArrayList<>();
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
/*    */     
/* 50 */     this.counterSignerSetRole = null;
/*    */   }
/*    */   private CounterSignerSetRoleEnum counterSignerSetRole; public enum CounterSignerSetRoleEnum {
/*    */     SIGNER("SIGNER"),
/*    */     APPROVER("APPROVER"),
/*    */     DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"),
/*    */     DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER"); private String value; CounterSignerSetRoleEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty(required = true, value = "Information about the members of the counter signer set, currently we support only one member")
/*    */   @JsonProperty("counterSignerSetMemberInfos")
/*    */   public List<CounterSignerInfo> getCounterSignerSetMemberInfos() {
/* 59 */     return this.counterSignerSetMemberInfos;
/*    */   }
/*    */   public void setCounterSignerSetMemberInfos(List<CounterSignerInfo> counterSignerSetMemberInfos) {
/* 62 */     this.counterSignerSetMemberInfos = counterSignerSetMemberInfos;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "Specify the role of counter signer set")
/*    */   @JsonProperty("counterSignerSetRole")
/*    */   public CounterSignerSetRoleEnum getCounterSignerSetRole() {
/* 72 */     return this.counterSignerSetRole;
/*    */   }
/*    */   public void setCounterSignerSetRole(CounterSignerSetRoleEnum counterSignerSetRole) {
/* 75 */     this.counterSignerSetRole = counterSignerSetRole;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 82 */     StringBuilder sb = new StringBuilder();
/* 83 */     sb.append("class CounterSignerSetInfo {\n");
/*    */     
/* 85 */     sb.append("    counterSignerSetMemberInfos: ").append(StringUtil.toIndentedString(this.counterSignerSetMemberInfos)).append("\n");
/* 86 */     sb.append("    counterSignerSetRole: ").append(StringUtil.toIndentedString(this.counterSignerSetRole)).append("\n");
/* 87 */     sb.append("}");
/* 88 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\widgets\CounterSignerSetInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */