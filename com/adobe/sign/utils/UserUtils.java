/*     */ package com.adobe.sign.utils;
/*     */ import java.util.List;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ import org.junit.Assert;

/*     */ 
/*     */ import com.adobe.sign.api.UsersApi;
/*     */ import com.adobe.sign.model.users.UserCreationInfo;
/*     */ import com.adobe.sign.model.users.UserCreationResponse;
/*     */ import com.adobe.sign.model.users.UserInfo;
/*     */ import com.adobe.sign.model.users.UserModificationInfo;
/*     */ import com.adobe.sign.model.users.UsersInfo;
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
/*     */ public class UserUtils
/*     */ {
/*  29 */   private static UsersApi usersApi = new UsersApi();
/*  30 */   private static MultivaluedMap headers = ApiUtils.getValidHeaderParams();
/*     */   
/*     */   public static String getResourceId(String email) throws ApiException {
/*  33 */     String userId = null;
/*     */     
/*  35 */     UsersInfo userInfos = usersApi.getUsers(headers, 
/*  36 */         TestData.X_USER_EMAIL);
/*     */     
/*  38 */     List<UserInfo> userInfoList = userInfos.getUserInfoList();
/*     */     
/*  40 */     for (UserInfo userInfo : userInfoList) {
/*  41 */       if (userInfo.getEmail().equalsIgnoreCase(email)) {
/*  42 */         userId = userInfo.getUserId();
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*  47 */     if (userId == null) {
/*  48 */       userId = createUser(TestData.ACCESS_TOKEN, 
/*  49 */           TestData.FIRST_NAME, 
/*  50 */           TestData.LAST_NAME, 
/*  51 */           email, 
/*  52 */           TestData.X_API_HEADER);
/*     */     }
/*  54 */     return userId;
/*     */   }
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
/*     */   public static String createUser(String accessToken, String firstName, String lastName, String email, String xApiUser) throws ApiException {
/*  67 */     UserCreationInfo userCreationInfo = getUserCreationInfo(firstName, lastName, email);
/*     */     
/*  69 */     UserCreationResponse userCreationResponse = usersApi.createUser(headers, 
/*  70 */         userCreationInfo);
/*  71 */     Assert.assertNotNull(userCreationResponse);
/*  72 */     Assert.assertNotNull(userCreationResponse.getUserId());
/*  73 */     return userCreationResponse.getUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String createUser(String email) throws ApiException {
/*  79 */     return createUser(TestData.ACCESS_TOKEN, 
/*  80 */         TestData.FIRST_NAME, 
/*  81 */         TestData.LAST_NAME, 
/*  82 */         email, 
/*  83 */         TestData.X_API_HEADER);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static UserCreationInfo getUserCreationInfo(String firstName, String lastName, String email) throws ApiException {
/*  94 */     UserCreationInfo userCreationInfo = new UserCreationInfo();
/*  95 */     userCreationInfo.setFirstName(firstName);
/*  96 */     userCreationInfo.setLastName(lastName);
/*  97 */     userCreationInfo.setEmail(email);
/*     */     
/*  99 */     return userCreationInfo;
/*     */   }
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
/*     */   public static UserModificationInfo getUserModificationInfo(String userId, String firstName, String lastName, String email, String groupId, List<UserModificationInfo.RolesEnum> roles) throws ApiException {
/* 114 */     UserModificationInfo userModificationInfo = new UserModificationInfo();
/* 115 */     userModificationInfo.setFirstName(firstName);
/* 116 */     userModificationInfo.setLastName(lastName);
/* 117 */     userModificationInfo.setEmail(email);
/* 118 */     userModificationInfo.setGroupId(groupId);
/* 119 */     userModificationInfo.setRoles(roles);
/* 120 */     return userModificationInfo;
/*     */   }
/*     */   
/*     */   public static UsersApi getUsersApi() {
/* 124 */     return usersApi;
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\UserUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */