/*    */ package com.adobe.sign.utils;
/*    */ import java.util.Date;

/*    */ import javax.ws.rs.core.MultivaluedMap;

/*    */ 
/*    */ import com.adobe.sign.api.SearchApi;
/*    */ import com.adobe.sign.model.search.AgreementAssetEventPostResponse;
/*    */ import com.adobe.sign.model.search.AgreementAssetEventRequest;
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
/*    */ public class SearchUtils
/*    */   extends ApiUtils
/*    */ {
/* 24 */   private static SearchApi searchApi = new SearchApi();
/* 25 */   private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();
/*    */   
/* 27 */   private static String searchId = null;
/*    */   
/* 29 */   private static String pageCursor = null;
/*    */ 
/*    */   
/*    */   public static String getResourceId() throws ApiException {
/* 33 */     createSearch(TestData.STATIC_START_DATE, 
/* 34 */         TestData.STATIC_END_DATE);
/* 35 */     return searchId;
/*    */   }
/*    */   
/*    */   public static String createSearch(Date startDate, Date endDate) throws ApiException {
/* 39 */     AgreementAssetEventRequest request = getAgreementAssetEventRequest(startDate, 
/* 40 */         endDate);
/* 41 */     AgreementAssetEventPostResponse response = searchApi.createAssetEvent(headers, 
/* 42 */         request);
/* 43 */     searchId = response.getSearchId();
/* 44 */     pageCursor = response.getCurrentPageCursor();
/*    */     
/* 46 */     return searchId;
/*    */   }
/*    */ 
/*    */   
/*    */   public static AgreementAssetEventRequest getAgreementAssetEventRequest(Date startDate, Date endDate) {
/* 51 */     AgreementAssetEventRequest request = new AgreementAssetEventRequest();
/* 52 */     request.setStartDate(startDate);
/* 53 */     request.setEndDate(endDate);
/*    */     
/* 55 */     return request;
/*    */   }
/*    */   
/*    */   public static SearchApi getSearchApi() {
/* 59 */     return searchApi;
/*    */   }
/*    */   
/*    */   public static String getPageCursor() {
/* 63 */     return pageCursor;
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\SearchUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */