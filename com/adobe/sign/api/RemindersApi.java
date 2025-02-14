/*     */ package com.adobe.sign.api;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;

/*     */ import javax.ws.rs.core.MultivaluedMap;

/*     */ 
/*     */ import com.adobe.sign.model.reminders.ReminderCreationInfo;
/*     */ import com.adobe.sign.model.reminders.ReminderCreationResult;
/*     */ import com.adobe.sign.utils.ApiClient;
/*     */ import com.adobe.sign.utils.ApiException;
/*     */ import com.adobe.sign.utils.Context;
/*     */ import com.adobe.sign.utils.Pair;
/*     */ import com.adobe.sign.utils.TypeRef;
/*     */ import com.adobe.sign.utils.validator.ApiValidatorHelper;
/*     */ import com.adobe.sign.utils.validator.RemindersApiValidator;
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
/*     */ public class RemindersApi
/*     */ {
/*     */   private ApiClient apiClient;
/*  32 */   private final String CONTENT_TYPE = "Content-Type";
/*  33 */   private final String ACCEPT = "Accept";
/*  34 */   private final String ACCESS_TOKEN = "Access-Token";
/*  35 */   private final String X_API_USER = "x-api-user";
/*     */   
/*     */   public RemindersApi() {
/*  38 */     this.apiClient = Context.getDefaultApiClient();
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReminderCreationResult createReminder(MultivaluedMap headers, ReminderCreationInfo reminderCreationInfo) throws ApiException {
/*  57 */     ApiValidatorHelper.validateHeaderParams(headers);
/*     */ 
/*     */     
/*  60 */     RemindersApiValidator.createReminderValidator(reminderCreationInfo);
/*     */ 
/*     */     
/*  63 */     String path = "/reminders".replaceAll("\\{format\\}", "json");
/*     */     
/*  65 */     Object postBody = reminderCreationInfo;
/*  66 */     byte[] postBinaryBody = null;
/*     */     
/*  68 */     Map<String, String> headerParams = new HashMap<>();
/*  69 */     List<String> acceptsList = new ArrayList<>();
/*  70 */     List<String> contentTypesList = new ArrayList<>();
/*     */     
/*  72 */     acceptsList.add("application/json");
/*     */     
/*  74 */     Set<String> keys = headers.keySet();
/*     */     
/*  76 */     for (String key : keys) {
/*  77 */       String value = this.apiClient.parameterToString(headers.get(key));
/*  78 */       if (key.equalsIgnoreCase("Content-Type")) {
/*  79 */         contentTypesList.add(value); continue;
/*     */       } 
/*  81 */       if (key.equalsIgnoreCase("Accept")) {
/*  82 */         acceptsList.add(value); continue;
/*     */       } 
/*  84 */       if (key.equalsIgnoreCase("Access-Token")) {
/*  85 */         headerParams.put("Access-Token", value); continue;
/*     */       } 
/*  87 */       if (key.equalsIgnoreCase("x-api-user")) {
/*  88 */         headerParams.put("x-api-user", value);
/*     */       }
/*     */     } 
/*     */     
/*  92 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/*  94 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/*  96 */     String[] accepts = new String[acceptsList.size()];
/*  97 */     accepts = acceptsList.<String>toArray(accepts);
/*     */     
/*  99 */     String[] contentTypes = new String[contentTypesList.size()];
/* 100 */     contentTypes = contentTypesList.<String>toArray(contentTypes);
/*     */     
/* 102 */     String acceptHeader = this.apiClient.selectHeaderAccept(accepts);
/*     */     
/* 104 */     String contentType = this.apiClient.selectHeaderContentType(contentTypes);
/*     */     
/* 106 */     TypeRef<ReminderCreationResult> returnType = new TypeRef<ReminderCreationResult>() {  };
/* 107 */     return (ReminderCreationResult)this.apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, acceptHeader, contentType, returnType, true);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\api\RemindersApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */