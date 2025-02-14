/*    */ package com.adobe.sign.model.search;
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
/*    */ public class AgreementAssetEventGetResponse
/*    */ {
/* 30 */   private List<DocumentEventForUser> events = new ArrayList<>();
/* 31 */   private String nextPageCursor = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
/*    */   @JsonProperty("events")
/*    */   public List<DocumentEventForUser> getEvents() {
/* 40 */     return this.events;
/*    */   }
/*    */   public void setEvents(List<DocumentEventForUser> events) {
/* 43 */     this.events = events;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The page cursor of the next page to be fetched. If the next page cursor is blank then the given page is the last page")
/*    */   @JsonProperty("nextPageCursor")
/*    */   public String getNextPageCursor() {
/* 53 */     return this.nextPageCursor;
/*    */   }
/*    */   public void setNextPageCursor(String nextPageCursor) {
/* 56 */     this.nextPageCursor = nextPageCursor;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     StringBuilder sb = new StringBuilder();
/* 64 */     sb.append("class AgreementAssetEventGetResponse {\n");
/*    */     
/* 66 */     sb.append("    events: ").append(StringUtil.toIndentedString(this.events)).append("\n");
/* 67 */     sb.append("    nextPageCursor: ").append(StringUtil.toIndentedString(this.nextPageCursor)).append("\n");
/* 68 */     sb.append("}");
/* 69 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\search\AgreementAssetEventGetResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */