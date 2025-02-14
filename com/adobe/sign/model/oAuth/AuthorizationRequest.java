/*     */ package com.adobe.sign.model.oAuth;
/*     */ import java.util.ArrayList;

/*     */ 
/*     */ import com.adobe.sign.utils.StringUtil;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;

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
/*     */ 
/*     */ 
/*     */ public class AuthorizationRequest
/*     */ {
/*  23 */   private String clientId = null;
/*  24 */   private String redirectUri = null;
/*  25 */   private ArrayList<Scope> scopes = new ArrayList<>();
/*  26 */   private String state = null;
/*  27 */   private String responseType = null;
/*     */   
/*     */   public AuthorizationRequest(String clientId, String redirectUri, ArrayList<Scope> scopes, String state, String responseType) {
/*  30 */     this.clientId = clientId;
/*  31 */     this.redirectUri = redirectUri;
/*  32 */     this.scopes = scopes;
/*  33 */     this.state = state;
/*  34 */     this.responseType = responseType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Identifies the application configured on the OAuth Configuration page.")
/*     */   @JsonProperty("client_id")
/*     */   public String getClientId() {
/*  43 */     return this.clientId;
/*     */   }
/*     */   public void setClientId(String clientId) {
/*  46 */     this.clientId = clientId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The url where the end user will be redirected after successful completion of authorization.\nThis value must belong to the set of values specified on the OAuth Configuration page.")
/*     */   @JsonProperty("redirect_uri")
/*     */   public String getRedirectUri() {
/*  58 */     return this.redirectUri;
/*     */   }
/*     */   public void setRedirectUri(String redirectUri) {
/*  61 */     this.redirectUri = redirectUri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = false, value = "Value used by the client to maintain state between the request and callback.")
/*     */   @JsonProperty("state")
/*     */   public String getState() {
/*  71 */     return this.state;
/*     */   }
/*     */   public void setState(String state) {
/*  74 */     this.state = state;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "List of permissions required by the application on behalf of the user to access the resources.\n")
/*     */   @JsonProperty("scope")
/*     */   public ArrayList<Scope> getScopes() {
/*  84 */     return this.scopes;
/*     */   }
/*     */   public void setScopes(ArrayList<Scope> scopes) {
/*  87 */     this.scopes = scopes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "Value must always be \"code\".")
/*     */   @JsonProperty("response_type")
/*     */   public String getResponseType() {
/*  96 */     return this.responseType;
/*     */   }
/*     */   public void setResponseType(String responseType) {
/*  99 */     this.responseType = responseType;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 104 */     StringBuilder sb = new StringBuilder();
/* 105 */     sb.append("class AuthorizationRequest {\n");
/*     */     
/* 107 */     sb.append("    clientId: ").append(StringUtil.toIndentedString(this.clientId)).append("\n");
/* 108 */     sb.append("    redirectUri: ").append(StringUtil.toIndentedString(this.redirectUri)).append("\n");
/* 109 */     sb.append("    scopes: ").append(StringUtil.toIndentedString(this.scopes)).append("\n");
/* 110 */     sb.append("    state: ").append(StringUtil.toIndentedString(this.state)).append("\n");
/* 111 */     sb.append("    response_type: ").append(StringUtil.toIndentedString(this.responseType)).append("\n");
/*     */     
/* 113 */     sb.append("}");
/*     */ 
/*     */     
/* 116 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\oAuth\AuthorizationRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */