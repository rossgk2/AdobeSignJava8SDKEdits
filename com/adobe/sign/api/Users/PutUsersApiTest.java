/*     */ package com.adobe.sign.api.Users;
/*     */ import java.util.Arrays;

/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.UsersApi;
/*     */ import com.adobe.sign.model.users.UserDetailsInfo;
/*     */ import com.adobe.sign.model.users.UserModificationInfo;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
/*     */ import com.adobe.sign.utils.UserUtils;
/*     */ import com.adobe.sign.utils.validator.SdkErrorCodes;
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
/*     */ public class PutUsersApiTest
/*     */ {
/*  40 */   private static UsersApi usersApi = null;
/*  41 */   private static String userId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  45 */   public Retry retry = new Retry();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  54 */     ApiUtils.configureProperty();
/*  55 */     userId = UserUtils.createUser(ApiUtils.getUserEmail());
/*  56 */     usersApi = UserUtils.getUsersApi();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testNullAndEmptyAccessToken() throws ApiException {
/*  68 */     UserModificationInfo userModificationInfo = new UserModificationInfo();
/*     */     
/*     */     try {
/*  71 */       usersApi.modifyUser(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  72 */           userId, 
/*  73 */           userModificationInfo);
/*     */     }
/*  75 */     catch (ApiException e) {
/*  76 */       Assert.assertTrue(e.getMessage(), 
/*  77 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  81 */       usersApi.modifyUser(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  82 */           userId, 
/*  83 */           userModificationInfo);
/*     */     }
/*  85 */     catch (ApiException e) {
/*  86 */       Assert.assertTrue(e.getMessage(), 
/*  87 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testInvalidXApiUser() throws ApiException {
/*  99 */     UserModificationInfo userModificationInfo = new UserModificationInfo();
/*     */     
/*     */     try {
/* 102 */       usersApi.modifyUser(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 103 */           userId, 
/* 104 */           userModificationInfo);
/*     */     }
/* 106 */     catch (ApiException e) {
/* 107 */       Assert.assertTrue(e.getMessage(), 
/* 108 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testNullAndInvalidUserId() throws ApiException {
/* 121 */     UserDetailsInfo userDetailsInfo = usersApi.getUserDetail(ApiUtils.getValidHeaderParams(), 
/* 122 */         userId);
/*     */     
/*     */     try {
/* 125 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(TestData.NULL_PARAM, 
/* 126 */           userDetailsInfo.getFirstName(), 
/* 127 */           userDetailsInfo.getLastName(), 
/* 128 */           userDetailsInfo.getEmail(), 
/* 129 */           userDetailsInfo.getGroupId(), 
/* 130 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 131 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 132 */           TestData.NULL_PARAM, 
/* 133 */           userModificationInfo);
/*     */     }
/* 135 */     catch (ApiException e) {
/* 136 */       Assert.assertTrue(e.getMessage(), 
/* 137 */           SdkErrorCodes.INVALID_USER_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 141 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(TestData.EMPTY_PARAM, 
/* 142 */           userDetailsInfo.getFirstName(), 
/* 143 */           userDetailsInfo.getLastName(), 
/* 144 */           userDetailsInfo.getEmail(), 
/* 145 */           userDetailsInfo.getGroupId(), 
/* 146 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 147 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 148 */           TestData.EMPTY_PARAM, 
/* 149 */           userModificationInfo);
/*     */     }
/* 151 */     catch (ApiException e) {
/* 152 */       Assert.assertTrue(e.getMessage(), 
/* 153 */           SdkErrorCodes.INVALID_USER_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
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
/*     */   @Test
/*     */   public void testNullAndInvalidParams() throws ApiException {
/* 167 */     UserDetailsInfo userDetailsInfo = usersApi.getUserDetail(ApiUtils.getValidHeaderParams(), 
/* 168 */         userId);
/*     */     
/*     */     try {
/* 171 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId, 
/* 172 */           TestData.NULL_PARAM, 
/* 173 */           userDetailsInfo.getLastName(), 
/* 174 */           userDetailsInfo.getEmail(), 
/* 175 */           userDetailsInfo.getGroupId(), 
/* 176 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 177 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 178 */           userId, 
/* 179 */           userModificationInfo);
/*     */     }
/* 181 */     catch (ApiException e) {
/* 182 */       Assert.assertTrue(e.getMessage(), 
/* 183 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 187 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId, 
/* 188 */           TestData.EMPTY_PARAM, 
/* 189 */           userDetailsInfo.getLastName(), 
/* 190 */           userDetailsInfo.getEmail(), 
/* 191 */           userDetailsInfo.getGroupId(), 
/* 192 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 193 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 194 */           userId, 
/* 195 */           userModificationInfo);
/*     */     }
/* 197 */     catch (ApiException e) {
/* 198 */       Assert.assertTrue(e.getMessage(), 
/* 199 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 203 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId, 
/* 204 */           userDetailsInfo.getFirstName(), 
/* 205 */           TestData.NULL_PARAM, 
/* 206 */           userDetailsInfo.getEmail(), 
/* 207 */           userDetailsInfo.getGroupId(), 
/* 208 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 209 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 210 */           userId, 
/* 211 */           userModificationInfo);
/*     */     }
/* 213 */     catch (ApiException e) {
/* 214 */       Assert.assertTrue(e.getMessage(), 
/* 215 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     try {
/* 218 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId, 
/* 219 */           userDetailsInfo.getFirstName(), 
/* 220 */           TestData.EMPTY_PARAM, 
/* 221 */           userDetailsInfo.getEmail(), 
/* 222 */           userDetailsInfo.getGroupId(), 
/* 223 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 224 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 225 */           userId, 
/* 226 */           userModificationInfo);
/*     */     }
/* 228 */     catch (ApiException e) {
/* 229 */       Assert.assertTrue(e.getMessage(), 
/* 230 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     try {
/* 233 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId, 
/* 234 */           userDetailsInfo.getFirstName(), 
/* 235 */           userDetailsInfo.getLastName(), 
/* 236 */           TestData.NULL_PARAM, 
/* 237 */           userDetailsInfo.getGroupId(), 
/* 238 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 239 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 240 */           userId, 
/* 241 */           userModificationInfo);
/*     */     }
/* 243 */     catch (ApiException e) {
/* 244 */       Assert.assertTrue(e.getMessage(), 
/* 245 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     try {
/* 248 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId, 
/* 249 */           userDetailsInfo.getFirstName(), 
/* 250 */           userDetailsInfo.getLastName(), 
/* 251 */           TestData.EMPTY_PARAM, 
/* 252 */           userDetailsInfo.getGroupId(), 
/* 253 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 254 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 255 */           userId, 
/* 256 */           userModificationInfo);
/*     */     }
/* 258 */     catch (ApiException e) {
/* 259 */       Assert.assertTrue(e.getMessage(), 
/* 260 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 264 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId, 
/* 265 */           userDetailsInfo.getFirstName(), 
/* 266 */           userDetailsInfo.getLastName(), 
/* 267 */           TestData.INVALID_EMAIL, 
/* 268 */           userDetailsInfo.getGroupId(), 
/* 269 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 270 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 271 */           userId, 
/* 272 */           userModificationInfo);
/*     */     }
/* 274 */     catch (ApiException e) {
/* 275 */       Assert.assertTrue(e.getMessage(), 
/* 276 */           SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 281 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId, 
/* 282 */           userDetailsInfo.getFirstName(), 
/* 283 */           userDetailsInfo.getLastName(), 
/* 284 */           userDetailsInfo.getEmail(), 
/* 285 */           TestData.NULL_PARAM, 
/* 286 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 287 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 288 */           userId, 
/* 289 */           userModificationInfo);
/*     */     }
/* 291 */     catch (ApiException e) {
/* 292 */       Assert.assertTrue(e.getMessage(), 
/* 293 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 297 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId, 
/* 298 */           userDetailsInfo.getFirstName(), 
/* 299 */           userDetailsInfo.getLastName(), 
/* 300 */           userDetailsInfo.getEmail(), 
/* 301 */           TestData.EMPTY_PARAM, 
/* 302 */           Arrays.asList(new UserModificationInfo.RolesEnum[] { UserModificationInfo.RolesEnum.NORMAL_USER }));
/* 303 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 304 */           userId, 
/* 305 */           userModificationInfo);
/*     */     }
/* 307 */     catch (ApiException e) {
/* 308 */       Assert.assertTrue(e.getMessage(), 
/* 309 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     try {
/* 312 */       UserModificationInfo userModificationInfo = UserUtils.getUserModificationInfo(userId, 
/* 313 */           userDetailsInfo.getFirstName(), 
/* 314 */           userDetailsInfo.getLastName(), 
/* 315 */           userDetailsInfo.getEmail(), 
/* 316 */           userDetailsInfo.getGroupId(), 
/* 317 */           null);
/* 318 */       usersApi.modifyUser(ApiUtils.getValidHeaderParams(), 
/* 319 */           userId, 
/* 320 */           userModificationInfo);
/*     */     }
/* 322 */     catch (ApiException e) {
/* 323 */       Assert.assertTrue(e.getMessage(), 
/* 324 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Users\PutUsersApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */