/*    */ package com.adobe.sign.api.Groups;
/*    */ import org.junit.Assert;
/*    */ import org.junit.BeforeClass;
/*    */ import org.junit.Rule;
/*    */ import org.junit.Test;

/*    */ 
/*    */ import com.adobe.sign.api.GroupsApi;
/*    */ import com.adobe.sign.utils.ApiException;
/*    */ import com.adobe.sign.utils.ApiUtils;
/*    */ import com.adobe.sign.utils.GroupUtils;
/*    */ import com.adobe.sign.utils.Retry;
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
/*    */ 
/*    */ public class DeleteGroupApiTest
/*    */ {
/* 34 */   private static String groupId = null;
/* 35 */   private static GroupsApi groupsApi = null;
/*    */ 
/*    */   
/*    */   @Rule
/* 39 */   public Retry retry = new Retry();
/*    */   
/*    */   @BeforeClass
/*    */   public static void setup() throws ApiException {
/* 43 */     ApiUtils.configureProperty();
/* 44 */     groupId = GroupUtils.createGroup(ApiUtils.getGroupName());
/* 45 */     groupsApi = GroupUtils.getGroupsApi();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Test
/*    */   public void testDeleteGroup() throws ApiException {
/*    */     try {
/* 56 */       groupsApi.deleteGroup(ApiUtils.getValidHeaderParams(), 
/* 57 */           groupId);
/*    */     }
/* 59 */     catch (ApiException e) {
/* 60 */       Assert.fail(ApiUtils.getMessage(e));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Groups\DeleteGroupApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */