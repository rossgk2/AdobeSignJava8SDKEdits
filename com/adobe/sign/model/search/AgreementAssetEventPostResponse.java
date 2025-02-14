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
/*    */ public class AgreementAssetEventPostResponse
/*    */ {
/* 30 */   private String currentPageCursor = null;
/* 31 */   private List<DocumentEventForUser> events = new ArrayList<>();
/* 32 */   private String nextPageCursor = null;
/* 33 */   private String searchId = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The value of the page cursor corresponding to the current page")
/*    */   @JsonProperty("currentPageCursor")
/*    */   public String getCurrentPageCursor() {
/* 42 */     return this.currentPageCursor;
/*    */   }
/*    */   public void setCurrentPageCursor(String currentPageCursor) {
/* 45 */     this.currentPageCursor = currentPageCursor;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
/*    */   @JsonProperty("events")
/*    */   public List<DocumentEventForUser> getEvents() {
/* 55 */     return this.events;
/*    */   }
/*    */   public void setEvents(List<DocumentEventForUser> events) {
/* 58 */     this.events = events;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The page cursor of the next page to be fetched. If the next page cursor is blank then the given page is the last page")
/*    */   @JsonProperty("nextPageCursor")
/*    */   public String getNextPageCursor() {
/* 68 */     return this.nextPageCursor;
/*    */   }
/*    */   public void setNextPageCursor(String nextPageCursor) {
/* 71 */     this.nextPageCursor = nextPageCursor;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty(required = true, value = "The search Id corresponding to current search object. This searchId can be used in combination with pageCursors in the API to retrieve search results to fetch the result for further pages")
/*    */   @JsonProperty("searchId")
/*    */   public String getSearchId() {
/* 81 */     return this.searchId;
/*    */   }
/*    */   public void setSearchId(String searchId) {
/* 84 */     this.searchId = searchId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 91 */     StringBuilder sb = new StringBuilder();
/* 92 */     sb.append("class AgreementAssetEventPostResponse {\n");
/*    */     
/* 94 */     sb.append("    currentPageCursor: ").append(StringUtil.toIndentedString(this.currentPageCursor)).append("\n");
/* 95 */     sb.append("    events: ").append(StringUtil.toIndentedString(this.events)).append("\n");
/* 96 */     sb.append("    nextPageCursor: ").append(StringUtil.toIndentedString(this.nextPageCursor)).append("\n");
/* 97 */     sb.append("    searchId: ").append(StringUtil.toIndentedString(this.searchId)).append("\n");
/* 98 */     sb.append("}");
/* 99 */     return sb.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\search\AgreementAssetEventPostResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */