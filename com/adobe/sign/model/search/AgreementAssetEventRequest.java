/*     */ package com.adobe.sign.model.search;
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
/*     */ @ApiModel(description = "")
/*     */ public class AgreementAssetEventRequest
/*     */ {
/*     */   private Date endDate;
/*     */   private List<FilterEventsEnum> filterEvents;
/*     */   private Boolean onlyShowLatestEvent;
/*     */   
/*     */   public AgreementAssetEventRequest() {
/*  30 */     this.endDate = null;
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
/*  83 */     this.filterEvents = new ArrayList<>();
/*  84 */     this.onlyShowLatestEvent = null;
/*  85 */     this.pageSize = null;
/*  86 */     this.startDate = null;
/*     */   }
/*     */   private Integer pageSize; private Date startDate; public enum FilterEventsEnum {
/*     */     CREATED("CREATED"), UPLOADED_BY_SENDER("UPLOADED_BY_SENDER"), FAXED_BY_SENDER("FAXED_BY_SENDER"), AGREEMENT_MODIFIED("AGREEMENT_MODIFIED"), USER_ACK_AGREEMENT_MODIFIED("USER_ACK_AGREEMENT_MODIFIED"), PRESIGNED("PRESIGNED"), SIGNED("SIGNED"), ESIGNED("ESIGNED"), DIGSIGNED("DIGSIGNED"), APPROVED("APPROVED"), OFFLINE_SYNC("OFFLINE_SYNC"), FAXIN_RECEIVED("FAXIN_RECEIVED"), SIGNATURE_REQUESTED("SIGNATURE_REQUESTED"), APPROVAL_REQUESTED("APPROVAL_REQUESTED"), RECALLED("RECALLED"), REJECTED("REJECTED"), EXPIRED("EXPIRED"), EXPIRED_AUTOMATICALLY("EXPIRED_AUTOMATICALLY"), SHARED("SHARED"), EMAIL_VIEWED("EMAIL_VIEWED"), AUTO_CANCELLED_CONVERSION_PROBLEM("AUTO_CANCELLED_CONVERSION_PROBLEM"), SIGNER_SUGGESTED_CHANGES("SIGNER_SUGGESTED_CHANGES"), SENDER_CREATED_NEW_REVISION("SENDER_CREATED_NEW_REVISION"), PASSWORD_AUTHENTICATION_FAILED("PASSWORD_AUTHENTICATION_FAILED"), KBA_AUTHENTICATION_FAILED("KBA_AUTHENTICATION_FAILED"), KBA_AUTHENTICATED("KBA_AUTHENTICATED"), WEB_IDENTITY_AUTHENTICATED("WEB_IDENTITY_AUTHENTICATED"), WEB_IDENTITY_SPECIFIED("WEB_IDENTITY_SPECIFIED"), EMAIL_BOUNCED("EMAIL_BOUNCED"), WIDGET_ENABLED("WIDGET_ENABLED"), WIDGET_DISABLED("WIDGET_DISABLED"), DELEGATED("DELEGATED"), AUTO_DELEGATED("AUTO_DELEGATED"),
/*     */     REPLACED_SIGNER("REPLACED_SIGNER"),
/*     */     VAULTED("VAULTED"),
/*     */     DOCUMENTS_DELETED("DOCUMENTS_DELETED"),
/*     */     OTHER("OTHER"); private String value; FilterEventsEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty(required = true, value = "The end of the date range for which events will be returned. Date should be mentioned in YYYY-MM-DDTHH:MM:SS format")
/*     */   @JsonProperty("endDate")
/*  95 */   public Date getEndDate() { return this.endDate; }
/*     */   
/*     */   public void setEndDate(Date endDate) {
/*  98 */     this.endDate = endDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("If filterEvents are specified, only those event types will be returned. If filterEvents are not specified, all event types will be returned.The Agreement Event type should be given in form of array like [\"ESIGNED\",\"SIGNED\"]")
/*     */   @JsonProperty("filterEvents")
/*     */   public List<FilterEventsEnum> getFilterEvents() {
/* 108 */     return this.filterEvents;
/*     */   }
/*     */   public void setFilterEvents(List<FilterEventsEnum> filterEvents) {
/* 111 */     this.filterEvents = filterEvents;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("If true, only the latest event for any given agreement asset within the specified date range will be returned. If false, all events will be returned")
/*     */   @JsonProperty("onlyShowLatestEvent")
/*     */   public Boolean getOnlyShowLatestEvent() {
/* 121 */     return this.onlyShowLatestEvent;
/*     */   }
/*     */   public void setOnlyShowLatestEvent(Boolean onlyShowLatestEvent) {
/* 124 */     this.onlyShowLatestEvent = onlyShowLatestEvent;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Count of agreement asset events which will be returned in the response. Default page size for the response is 100. Maximum value of page size is 500")
/*     */   @JsonProperty("pageSize")
/*     */   public Integer getPageSize() {
/* 134 */     return this.pageSize;
/*     */   }
/*     */   public void setPageSize(Integer pageSize) {
/* 137 */     this.pageSize = pageSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The beginning of the date range for which events will be returned. Date should be mentioned in YYYY-MM-DDTHH:MM:SS format")
/*     */   @JsonProperty("startDate")
/*     */   public Date getStartDate() {
/* 147 */     return this.startDate;
/*     */   }
/*     */   public void setStartDate(Date startDate) {
/* 150 */     this.startDate = startDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 157 */     StringBuilder sb = new StringBuilder();
/* 158 */     sb.append("class AgreementAssetEventRequest {\n");
/*     */     
/* 160 */     sb.append("    endDate: ").append(StringUtil.toIndentedString(this.endDate)).append("\n");
/* 161 */     sb.append("    filterEvents: ").append(StringUtil.toIndentedString(this.filterEvents)).append("\n");
/* 162 */     sb.append("    onlyShowLatestEvent: ").append(StringUtil.toIndentedString(this.onlyShowLatestEvent)).append("\n");
/* 163 */     sb.append("    pageSize: ").append(StringUtil.toIndentedString(this.pageSize)).append("\n");
/* 164 */     sb.append("    startDate: ").append(StringUtil.toIndentedString(this.startDate)).append("\n");
/* 165 */     sb.append("}");
/* 166 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\search\AgreementAssetEventRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */