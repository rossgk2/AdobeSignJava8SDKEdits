/*     */ package com.adobe.sign.api.Agreements;
/*     */ import org.junit.Assert;
/*     */ import org.junit.BeforeClass;
/*     */ import org.junit.Rule;
/*     */ import org.junit.Test;

/*     */ 
/*     */ import com.adobe.sign.api.AgreementsApi;
/*     */ import com.adobe.sign.model.agreements.AgreementInfo;
/*     */ import com.adobe.sign.model.agreements.AlternateParticipantInfo;
/*     */ import com.adobe.sign.model.agreements.AlternateParticipantResponse;
/*     */ import com.adobe.sign.model.agreements.ParticipantInfo;
/*     */ import com.adobe.sign.model.agreements.ParticipantSetInfo;
/*     */ import com.adobe.sign.utils.AgreementsUtils;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.ApiUtils;
/*     */ import com.adobe.sign.utils.Retry;
/*     */ import com.adobe.sign.utils.TestData;
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
/*     */ public class PostAgreementsAlternateParticipantsApiTest
/*     */ {
/*  40 */   private static AgreementsApi agreementsApi = null;
/*  41 */   private static String agreementId = null;
/*  42 */   private static String participantSetId = null;
/*  43 */   private static String participantId = null;
/*     */ 
/*     */   
/*     */   @Rule
/*  47 */   public Retry retry = new Retry();
/*     */   
/*     */   @BeforeClass
/*     */   public static void setup() throws ApiException {
/*  51 */     ApiUtils.configureProperty();
/*  52 */     agreementsApi = AgreementsUtils.getAgreementsApi();
/*  53 */     agreementId = AgreementsUtils.createAgreement(ApiUtils.getAgreementName());
/*     */     
/*  55 */     AgreementInfo agreementInfo = agreementsApi.getAgreementInfo(ApiUtils.getValidHeaderParams(), 
/*  56 */         agreementId);
/*     */     
/*  58 */     Assert.assertNotNull(agreementInfo);
/*  59 */     Assert.assertNotNull(agreementInfo.getParticipantSetInfos());
/*  60 */     ParticipantSetInfo participantInfo = agreementInfo.getParticipantSetInfos().get(0);
/*  61 */     participantSetId = participantInfo.getParticipantSetId();
/*     */     
/*  63 */     Assert.assertNotNull(participantInfo.getParticipantSetMemberInfos());
/*  64 */     participantId = ((ParticipantInfo)participantInfo.getParticipantSetMemberInfos().get(0)).getParticipantId();
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
/*  76 */     AlternateParticipantInfo updateInfo = new AlternateParticipantInfo();
/*     */     
/*     */     try {
/*  79 */       agreementsApi.createAlternateParticipant(ApiUtils.getNullAccessTokenHeaderParams(), 
/*  80 */           agreementId, 
/*  81 */           participantSetId, 
/*  82 */           participantId, 
/*  83 */           updateInfo);
/*     */     }
/*  85 */     catch (ApiException e) {
/*  86 */       Assert.assertTrue(e.getMessage(), 
/*  87 */           SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/*  91 */       agreementsApi.createAlternateParticipant(ApiUtils.getEmptyAccessTokenHeaderParams(), 
/*  92 */           agreementId, 
/*  93 */           participantSetId, 
/*  94 */           participantId, 
/*  95 */           updateInfo);
/*     */     }
/*  97 */     catch (ApiException e) {
/*  98 */       Assert.assertTrue(e.getMessage(), 
/*  99 */           SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidXApiUser() throws ApiException {
/* 112 */     AlternateParticipantInfo updateInfo = new AlternateParticipantInfo();
/*     */     
/*     */     try {
/* 115 */       agreementsApi.createAlternateParticipant(ApiUtils.getEmptyXApiUserHeaderParams(), 
/* 116 */           agreementId, 
/* 117 */           participantSetId, 
/* 118 */           participantId, 
/* 119 */           updateInfo);
/*     */     }
/* 121 */     catch (ApiException e) {
/* 122 */       Assert.assertTrue(e.getMessage(), 
/* 123 */           SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidAgreementId() throws ApiException {
/* 137 */     AlternateParticipantInfo updateInfo = new AlternateParticipantInfo();
/*     */     
/*     */     try {
/* 140 */       agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(), 
/* 141 */           TestData.EMPTY_PARAM, 
/* 142 */           participantSetId, 
/* 143 */           participantId, 
/* 144 */           updateInfo);
/*     */     }
/* 146 */     catch (ApiException e) {
/* 147 */       Assert.assertTrue(e.getMessage(), 
/* 148 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 152 */       agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(), 
/* 153 */           TestData.NULL_PARAM, 
/* 154 */           participantSetId, 
/* 155 */           participantId, 
/* 156 */           updateInfo);
/*     */     }
/* 158 */     catch (ApiException e) {
/* 159 */       Assert.assertTrue(e.getMessage(), 
/* 160 */           SdkErrorCodes.INVALID_AGREEMENT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 164 */       agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(), 
/* 165 */           agreementId, 
/* 166 */           participantSetId, 
/* 167 */           TestData.EMPTY_PARAM, 
/* 168 */           updateInfo);
/*     */     }
/* 170 */     catch (ApiException e) {
/* 171 */       Assert.assertTrue(e.getMessage(), 
/* 172 */           SdkErrorCodes.INVALID_PARTICIPANT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 176 */       agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(), 
/* 177 */           agreementId, 
/* 178 */           participantSetId, 
/* 179 */           TestData.NULL_PARAM, 
/* 180 */           updateInfo);
/*     */     }
/* 182 */     catch (ApiException e) {
/* 183 */       Assert.assertTrue(e.getMessage(), 
/* 184 */           SdkErrorCodes.INVALID_PARTICIPANT_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 188 */       agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(), 
/* 189 */           agreementId, 
/* 190 */           TestData.EMPTY_PARAM, 
/* 191 */           participantId, 
/* 192 */           updateInfo);
/*     */     }
/* 194 */     catch (ApiException e) {
/* 195 */       Assert.assertTrue(e.getMessage(), 
/* 196 */           SdkErrorCodes.INVALID_PARTICIPANT_SET_ID.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/*     */     try {
/* 200 */       agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(), 
/* 201 */           agreementId, 
/* 202 */           TestData.NULL_PARAM, 
/* 203 */           participantId, 
/* 204 */           updateInfo);
/*     */     }
/* 206 */     catch (ApiException e) {
/* 207 */       Assert.assertTrue(e.getMessage(), 
/* 208 */           SdkErrorCodes.INVALID_PARTICIPANT_SET_ID.getApiCode().equals(e.getApiCode()));
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
/*     */   public void testInvalidAlternateParticipantInfo() throws ApiException {
/* 222 */     AlternateParticipantInfo updateInfo = new AlternateParticipantInfo();
/* 223 */     updateInfo.setEmail(null);
/* 224 */     updateInfo.setPrivateMessage(TestData.PRIVATE_MESSAGE);
/*     */     
/*     */     try {
/* 227 */       agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(), 
/* 228 */           agreementId, 
/* 229 */           participantSetId, 
/* 230 */           participantId, 
/* 231 */           updateInfo);
/*     */     }
/* 233 */     catch (ApiException e) {
/* 234 */       Assert.assertTrue(e.getMessage(), 
/* 235 */           SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 238 */     updateInfo.setEmail(TestData.INVALID_EMAIL);
/*     */     
/*     */     try {
/* 241 */       agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(), 
/* 242 */           agreementId, 
/* 243 */           participantSetId, 
/* 244 */           participantId, 
/* 245 */           updateInfo);
/*     */     }
/* 247 */     catch (ApiException e) {
/* 248 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */     
/* 251 */     updateInfo.setEmail(TestData.POST_EMAIL);
/* 252 */     updateInfo.setPrivateMessage(TestData.EMPTY_PARAM);
/*     */     
/*     */     try {
/* 255 */       agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(), 
/* 256 */           agreementId, 
/* 257 */           participantSetId, 
/* 258 */           participantId, 
/* 259 */           updateInfo);
/*     */     }
/* 261 */     catch (ApiException e) {
/* 262 */       Assert.assertTrue(e.getMessage(), SdkErrorCodes.EMPTY_PRIVATE_MESSAGE.getApiCode().equals(e.getApiCode()));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Test
/*     */   public void testCreateAlternateParticipant() throws ApiException {
/* 273 */     AlternateParticipantInfo updateInfo = new AlternateParticipantInfo();
/* 274 */     updateInfo.setEmail(ApiUtils.getUserEmail());
/* 275 */     updateInfo.setPrivateMessage(TestData.PRIVATE_MESSAGE);
/*     */     
/*     */     try {
/* 278 */       AlternateParticipantResponse response = agreementsApi.createAlternateParticipant(ApiUtils.getValidHeaderParams(), 
/* 279 */           agreementId, 
/* 280 */           participantSetId, 
/* 281 */           participantId, 
/* 282 */           updateInfo);
/* 283 */       Assert.assertNotNull(response);
/* 284 */       Assert.assertNotNull(response.getParticipantId());
/*     */     }
/* 286 */     catch (ApiException e) {
/* 287 */       Assert.fail(ApiUtils.getMessage(e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\Agreements\PostAgreementsAlternateParticipantsApiTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */