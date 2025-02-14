/*     */ package com.adobe.sign.utils;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.Proxy;
/*     */ import java.net.URL;
/*     */ import java.net.URLEncoder;
/*     */ import java.text.DateFormat;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.TimeZone;

/*     */ import javax.ws.rs.core.MediaType;
/*     */ import javax.ws.rs.core.Response;

/*     */ 
/*     */ import com.adobe.sign.model.baseUris.BaseUriInfo;
/*     */ import com.fasterxml.jackson.databind.ObjectMapper;
/*     */ import com.sun.jersey.api.client.Client;
/*     */ import com.sun.jersey.api.client.ClientHandler;
/*     */ import com.sun.jersey.api.client.ClientResponse;
/*     */ import com.sun.jersey.api.client.WebResource;
/*     */ import com.sun.jersey.api.client.config.ClientConfig;
/*     */ import com.sun.jersey.api.client.config.DefaultClientConfig;
/*     */ import com.sun.jersey.api.client.filter.ClientFilter;
/*     */ import com.sun.jersey.api.client.filter.LoggingFilter;
/*     */ import com.sun.jersey.client.urlconnection.HttpURLConnectionFactory;
/*     */ import com.sun.jersey.client.urlconnection.URLConnectionClientHandler;
/*     */ import com.sun.jersey.multipart.BodyPart;
/*     */ import com.sun.jersey.multipart.FormDataMultiPart;
/*     */ import com.sun.jersey.multipart.file.FileDataBodyPart;
/*     */ 
/*     */ public class ApiClient {
/*  41 */   private Map<String, Client> hostMap = new HashMap<>();
/*  42 */   private Map<String, String> defaultHeaderMap = new HashMap<>();
/*     */   private boolean debugging = false;
/*  44 */   private String envHostName = "https://secure.na1.adobesign.us";
/*  45 */   private String subPath = "/api/rest/v5";
/*     */   private boolean queryBaseUrl = true;
/*  47 */   private JSON json = new JSON();
/*     */   
/*     */   private int statusCode;
/*     */   
/*     */   private Map<String, List<String>> responseHeaders;
/*     */   
/*     */   private DateFormat dateFormat;
/*     */ 
/*     */   
/*     */   public ApiClient() {
/*  57 */     this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
/*     */ 
/*     */     
/*  60 */     this.dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/*     */ 
/*     */     
/*  63 */     setUserAgent("Adobe Sign Java SDK 1.0");
/*     */   }
/*     */ 
/*     */   
/*     */   public String getBaseUri() {
/*  68 */     if (this.queryBaseUrl) {
/*  69 */       return null;
/*     */     }
/*  71 */     return this.envHostName;
/*     */   }
/*     */   
/*     */   public void setBaseUri(String baseUri) {
/*  75 */     this.envHostName = baseUri;
/*  76 */     this.queryBaseUrl = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEnvHostName() {
/*  83 */     return this.envHostName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnvHostName(String hostName) {
/*  90 */     if (hostName != null && hostName.length() > 0) {
/*  91 */       this.envHostName = hostName;
/*  92 */       this.queryBaseUrl = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStatusCode() {
/*  99 */     return this.statusCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, List<String>> getResponseHeaders() {
/* 106 */     return this.responseHeaders;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserAgent(String userAgent) {
/* 113 */     addDefaultHeader("User-Agent", 
/* 114 */         userAgent);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addDefaultHeader(String key, String value) {
/* 125 */     this.defaultHeaderMap.put(key, 
/* 126 */         value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDebugging() {
/* 133 */     return this.debugging;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDebugging(boolean debugging) {
/* 142 */     this.debugging = debugging;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateFormat getDateFormat() {
/* 149 */     return this.dateFormat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDateFormat(DateFormat dateFormat) {
/* 156 */     this.dateFormat = dateFormat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date parseDate(String str) {
/*     */     try {
/* 164 */       return this.dateFormat.parse(str);
/*     */     }
/* 166 */     catch (ParseException e) {
/* 167 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String formatDate(Date date) {
/* 175 */     return this.dateFormat.format(date);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String parameterToString(Object param) {
/* 182 */     if (param == null) {
/* 183 */       return "";
/*     */     }
/* 185 */     if (param instanceof Date) {
/* 186 */       return formatDate((Date)param);
/*     */     }
/* 188 */     if (param instanceof Collection) {
/* 189 */       StringBuilder b = new StringBuilder();
/* 190 */       for (Object o : param) {
/* 191 */         if (b.length() > 0) {
/* 192 */           b.append(",");
/*     */         }
/* 194 */         b.append(String.valueOf(o));
/*     */       } 
/* 196 */       return b.toString();
/*     */     } 
/*     */     
/* 199 */     return String.valueOf(param);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Pair> parameterToPairs(String collectionFormat, String name, Object value) {
/* 209 */     List<Pair> params = new ArrayList<>();
/*     */ 
/*     */     
/* 212 */     if (name == null || name.isEmpty() || value == null) {
/* 213 */       return params;
/*     */     }
/* 215 */     Collection valueCollection = null;
/* 216 */     if (value instanceof Collection) {
/* 217 */       valueCollection = (Collection)value;
/*     */     } else {
/*     */       
/* 220 */       params.add(new Pair(name, 
/* 221 */             parameterToString(value)));
/* 222 */       return params;
/*     */     } 
/*     */     
/* 225 */     if (valueCollection.isEmpty()) {
/* 226 */       return params;
/*     */     }
/*     */ 
/*     */     
/* 230 */     collectionFormat = (collectionFormat == null || collectionFormat.isEmpty()) ? "csv" : collectionFormat;
/*     */ 
/*     */     
/* 233 */     if (collectionFormat.equals("multi")) {
/* 234 */       for (Object item : valueCollection) {
/* 235 */         params.add(new Pair(name, 
/* 236 */               parameterToString(item)));
/*     */       }
/*     */       
/* 239 */       return params;
/*     */     } 
/*     */     
/* 242 */     String delimiter = ",";
/*     */     
/* 244 */     if (collectionFormat.equals("csv")) {
/* 245 */       delimiter = ",";
/*     */     }
/* 247 */     else if (collectionFormat.equals("ssv")) {
/* 248 */       delimiter = " ";
/*     */     }
/* 250 */     else if (collectionFormat.equals("tsv")) {
/* 251 */       delimiter = "\t";
/*     */     }
/* 253 */     else if (collectionFormat.equals("pipes")) {
/* 254 */       delimiter = "|";
/*     */     } 
/*     */     
/* 257 */     StringBuilder sb = new StringBuilder();
/* 258 */     for (Object item : valueCollection) {
/* 259 */       sb.append(delimiter);
/* 260 */       sb.append(parameterToString(item));
/*     */     } 
/*     */     
/* 263 */     params.add(new Pair(name, 
/* 264 */           sb.substring(1)));
/*     */     
/* 266 */     return params;
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
/*     */   public String selectHeaderAccept(String[] accepts) {
/* 279 */     if (accepts.length == 0) return null; 
/* 280 */     if (StringUtil.containsIgnoreCase(accepts, 
/* 281 */         "application/json"))
/* 282 */       return "application/json"; 
/* 283 */     return StringUtil.join(accepts, 
/* 284 */         ",");
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
/*     */   public String selectHeaderContentType(String[] contentTypes) {
/* 298 */     if (contentTypes.length == 0) {
/* 299 */       return "application/json";
/*     */     }
/* 301 */     if (StringUtil.containsIgnoreCase(contentTypes, 
/* 302 */         "application/json"))
/* 303 */       return "application/json"; 
/* 304 */     return contentTypes[0];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String escapeString(String str) {
/*     */     try {
/* 312 */       return URLEncoder.encode(str, 
/* 313 */           "utf8").replaceAll("\\+", 
/* 314 */           "%20");
/*     */     }
/* 316 */     catch (UnsupportedEncodingException e) {
/* 317 */       return str;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String serialize(Object obj, String contentType) throws ApiException {
/* 327 */     if (contentType.startsWith("application/json")) {
/* 328 */       return this.json.serialize(obj);
/*     */     }
/*     */     
/* 331 */     throw new ApiException(400, 
/* 332 */         "can not serialize object into Content-Type: " + contentType);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T deserialize(ClientResponse response, TypeRef returnType) throws ApiException {
/* 341 */     String body, contentType = null;
/* 342 */     List<String> contentTypes = (List<String>)response.getHeaders().get("Content-Type");
/* 343 */     if (contentTypes != null && !contentTypes.isEmpty())
/* 344 */       contentType = contentTypes.get(0); 
/* 345 */     if (contentType == null) {
/* 346 */       throw new ApiException(500, 
/* 347 */           "missing Content-Type in response");
/*     */     }
/*     */     
/* 350 */     if (response.hasEntity()) {
/* 351 */       body = (String)response.getEntity(String.class);
/*     */     } else {
/* 353 */       body = "";
/*     */     } 
/* 355 */     if (contentType.startsWith("application/json"))
/*     */     {
/* 357 */       return this.json.deserialize(body, 
/* 358 */           returnType);
/*     */     }
/* 360 */     if (returnType.getType().equals(String.class))
/*     */     {
/* 362 */       return (T)body;
/*     */     }
/*     */     
/* 365 */     throw new ApiException(500, 
/* 366 */         "Content type \"" + contentType + "\" is not supported for type: " + returnType.getType());
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
/*     */   private ClientResponse getAPIResponse(String baseUrl, String path, String method, List<Pair> queryParams, Object body, byte[] binaryBody, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType) throws ApiException {
/*     */     WebResource.Builder builder;
/* 381 */     if (body != null && binaryBody != null) {
/* 382 */       throw new ApiException(500, 
/* 383 */           "either body or binaryBody must be null");
/*     */     }
/*     */     
/* 386 */     Client client = getClient(baseUrl);
/*     */     
/* 388 */     StringBuilder b = new StringBuilder();
/* 389 */     b.append("?");
/* 390 */     if (queryParams != null) {
/* 391 */       for (Pair queryParam : queryParams) {
/* 392 */         if (!queryParam.getName().isEmpty()) {
/* 393 */           b.append(escapeString(queryParam.getName()));
/* 394 */           b.append("=");
/* 395 */           b.append(escapeString(queryParam.getValue()));
/* 396 */           b.append("&");
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 401 */     String querystring = b.substring(0, b.length() - 1);
/*     */ 
/*     */     
/* 404 */     if (accept == null) {
/* 405 */       builder = client.resource(String.valueOf(baseUrl) + path + querystring).getRequestBuilder();
/*     */     } else {
/* 407 */       builder = client.resource(String.valueOf(baseUrl) + path + querystring).accept(new String[] { accept });
/*     */     } 
/* 409 */     for (String key : headerParams.keySet()) {
/* 410 */       builder = (WebResource.Builder)builder.header(key, headerParams.get(key));
/*     */     }
/* 412 */     for (String key : this.defaultHeaderMap.keySet()) {
/* 413 */       if (!headerParams.containsKey(key)) {
/* 414 */         builder = (WebResource.Builder)builder.header(key, this.defaultHeaderMap.get(key));
/*     */       }
/*     */     } 
/*     */     
/* 418 */     String encodedFormParams = null;
/* 419 */     if (contentType.startsWith("multipart/form-data")) {
/* 420 */       FormDataMultiPart mp = new FormDataMultiPart();
/* 421 */       for (Map.Entry<String, Object> param : formParams.entrySet()) {
/* 422 */         if (param.getValue() instanceof File) {
/* 423 */           File file = (File)param.getValue();
/* 424 */           mp.bodyPart((BodyPart)new FileDataBodyPart(param.getKey(), 
/* 425 */                 file, 
/* 426 */                 MediaType.MULTIPART_FORM_DATA_TYPE));
/*     */           continue;
/*     */         } 
/* 429 */         mp.field(param.getKey(), 
/* 430 */             parameterToString(param.getValue()), 
/* 431 */             MediaType.MULTIPART_FORM_DATA_TYPE);
/*     */       } 
/*     */       
/* 434 */       body = mp;
/*     */     }
/* 436 */     else if (contentType.startsWith("application/x-www-form-urlencoded")) {
/* 437 */       encodedFormParams = getXWWWFormUrlencodedParams(formParams);
/*     */     } 
/* 439 */     ClientResponse response = null;
/*     */     
/* 441 */     if ("GET".equals(method)) {
/* 442 */       response = (ClientResponse)builder.get(ClientResponse.class);
/*     */     }
/* 444 */     else if ("POST".equals(method)) {
/* 445 */       if (encodedFormParams != null) {
/* 446 */         response = (ClientResponse)((WebResource.Builder)builder.type(contentType)).post(ClientResponse.class, 
/* 447 */             encodedFormParams);
/*     */       }
/* 449 */       else if (body == null) {
/* 450 */         if (binaryBody == null) {
/* 451 */           response = (ClientResponse)builder.post(ClientResponse.class, 
/* 452 */               null);
/*     */         } else {
/* 454 */           response = (ClientResponse)((WebResource.Builder)builder.type(contentType)).post(ClientResponse.class, 
/* 455 */               binaryBody);
/*     */         } 
/* 457 */       } else if (body instanceof FormDataMultiPart) {
/* 458 */         response = (ClientResponse)((WebResource.Builder)builder.type(contentType)).post(ClientResponse.class, 
/* 459 */             body);
/*     */       } else {
/*     */         
/* 462 */         response = (ClientResponse)((WebResource.Builder)builder.type(contentType)).post(ClientResponse.class, 
/* 463 */             serialize(body, 
/* 464 */               contentType));
/*     */       }
/*     */     
/* 467 */     } else if ("PUT".equals(method)) {
/* 468 */       if (encodedFormParams != null) {
/* 469 */         response = (ClientResponse)((WebResource.Builder)builder.type(contentType)).put(ClientResponse.class, 
/* 470 */             encodedFormParams);
/*     */       }
/* 472 */       else if (body == null) {
/* 473 */         if (binaryBody == null) {
/* 474 */           response = (ClientResponse)builder.put(ClientResponse.class, 
/* 475 */               null);
/*     */         } else {
/* 477 */           response = (ClientResponse)((WebResource.Builder)builder.type(contentType)).put(ClientResponse.class, 
/* 478 */               binaryBody);
/*     */         } 
/*     */       } else {
/* 481 */         response = (ClientResponse)((WebResource.Builder)builder.type(contentType)).put(ClientResponse.class, 
/* 482 */             serialize(body, contentType));
/*     */       }
/*     */     
/* 485 */     } else if ("DELETE".equals(method)) {
/* 486 */       if (encodedFormParams != null) {
/* 487 */         response = (ClientResponse)((WebResource.Builder)builder.type(contentType)).delete(ClientResponse.class, 
/* 488 */             encodedFormParams);
/*     */       }
/* 490 */       else if (body == null) {
/* 491 */         if (binaryBody == null) {
/* 492 */           response = (ClientResponse)builder.delete(ClientResponse.class);
/*     */         } else {
/* 494 */           response = (ClientResponse)((WebResource.Builder)builder.type(contentType)).delete(ClientResponse.class, 
/* 495 */               binaryBody);
/*     */         } 
/*     */       } else {
/* 498 */         response = (ClientResponse)((WebResource.Builder)builder.type(contentType)).delete(ClientResponse.class, 
/* 499 */             serialize(body, contentType));
/*     */       } 
/*     */     } else {
/*     */       
/* 503 */       throw new ApiException(500, 
/* 504 */           "unknown method type " + method);
/*     */     } 
/* 506 */     return response;
/*     */   }
/*     */ 
/*     */   
/*     */   private String getBaseUrl(String accessToken) throws ApiException {
/* 511 */     String baseUrl = String.valueOf(this.envHostName) + this.subPath;
/* 512 */     String path = "/base_uris".replaceAll("\\{format\\}", 
/* 513 */         "json");
/* 514 */     Map<String, String> headerParams = new HashMap<>();
/* 515 */     if (accessToken != null) {
/* 516 */       headerParams.put("Access-Token", 
/* 517 */           parameterToString(accessToken));
/*     */     }
/* 519 */     List<Pair> queryParams = new ArrayList<>();
/*     */     
/* 521 */     Map<String, Object> formParams = new HashMap<>();
/*     */     
/* 523 */     String[] accepts = {
/* 524 */         "application/json"
/*     */       };
/* 526 */     String acceptHeader = selectHeaderAccept(accepts);
/*     */     
/* 528 */     String[] contentTypes = new String[0];
/*     */ 
/*     */     
/* 531 */     String contentType = selectHeaderContentType(contentTypes);
/*     */     
/* 533 */     TypeRef<BaseUriInfo> returnType = new TypeRef<BaseUriInfo>() {
/*     */       
/*     */       };
/* 536 */     ClientResponse response = getAPIResponse(baseUrl, 
/* 537 */         path, 
/* 538 */         "GET", 
/* 539 */         queryParams, 
/* 540 */         null, 
/* 541 */         null, 
/* 542 */         headerParams, 
/* 543 */         formParams, 
/* 544 */         acceptHeader, 
/* 545 */         contentType);
/*     */     
/* 547 */     if (response.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL) {
/* 548 */       BaseUriInfo baseUriInfo = deserialize(response, 
/* 549 */           returnType);
/* 550 */       return baseUriInfo.getApiAccessPoint();
/*     */     } 
/* 552 */     return this.envHostName;
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
/*     */   public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body, byte[] binaryBody, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, TypeRef returnType, boolean addSubPath) throws ApiException {
/* 582 */     String baseUrl = this.envHostName;
/* 583 */     if (this.queryBaseUrl) {
/* 584 */       baseUrl = getBaseUrl(headerParams.get("Access-Token"));
/*     */     }
/*     */     
/* 587 */     if (addSubPath) {
/* 588 */       baseUrl = String.valueOf(baseUrl) + this.subPath;
/*     */     }
/* 590 */     ClientResponse response = getAPIResponse(baseUrl, 
/* 591 */         path, 
/* 592 */         method, 
/* 593 */         queryParams, 
/* 594 */         body, 
/* 595 */         binaryBody, 
/* 596 */         headerParams, 
/* 597 */         formParams, 
/* 598 */         accept, 
/* 599 */         contentType);
/*     */     
/* 601 */     this.statusCode = response.getStatusInfo().getStatusCode();
/* 602 */     this.responseHeaders = (Map<String, List<String>>)response.getHeaders();
/*     */     
/* 604 */     if (response.getStatusInfo() == ClientResponse.Status.NO_CONTENT) {
/* 605 */       return null;
/*     */     }
/* 607 */     if (response.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL) {
/* 608 */       if (returnType == null) {
/* 609 */         return null;
/*     */       }
/* 611 */       System.out.println("RESPONSE:" + response);
/* 612 */       return deserialize(response, 
/* 613 */           returnType);
/*     */     } 
/*     */ 
/*     */     
/* 617 */     String message = "error";
/* 618 */     String respBody = null;
/*     */     
/* 620 */     if (addSubPath) {
/* 621 */       throwApiException(message, response, respBody, RestException.class);
/*     */     } else {
/*     */       
/* 624 */       throwApiException(message, response, respBody, OAuthException.class);
/*     */     } 
/*     */     
/* 627 */     return null;
/*     */   }
/*     */   
/*     */   private <T> void throwApiException(String message, ClientResponse response, String respBody, Class<T> clazz) throws ApiException {
/* 631 */     T exception = null;
/* 632 */     if (response.hasEntity()) {
/*     */       try {
/* 634 */         message = String.valueOf(response.getEntity(String.class));
/* 635 */         exception = getRestException(message, clazz);
/*     */       }
/* 637 */       catch (RuntimeException runtimeException) {
/*     */ 
/*     */       
/* 640 */       } catch (IOException iOException) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 645 */     String code = null;
/* 646 */     if (exception instanceof OAuthException) {
/* 647 */       code = ((OAuthException)exception).getCode();
/* 648 */       message = ((OAuthException)exception).getMessage();
/*     */     } else {
/*     */       
/* 651 */       code = ((RestException)exception).getCode();
/* 652 */       message = ((RestException)exception).getMessage();
/*     */     } 
/*     */     
/* 655 */     throw new ApiException(response.getStatusInfo().getStatusCode(), 
/* 656 */         message, 
/* 657 */         code, 
/* 658 */         response.getHeaders(), 
/* 659 */         respBody);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] invokeBinaryAPI(String path, String method, List<Pair> queryParams, Object body, byte[] binaryBody, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, boolean addSubPath) throws ApiException {
/* 687 */     String baseUrl = this.envHostName;
/* 688 */     if (this.queryBaseUrl) {
/* 689 */       baseUrl = getBaseUrl(headerParams.get("Access-Token"));
/*     */     }
/*     */     
/* 692 */     if (addSubPath) {
/* 693 */       baseUrl = String.valueOf(baseUrl) + this.subPath;
/*     */     }
/* 695 */     ClientResponse response = getAPIResponse(baseUrl, 
/* 696 */         path, 
/* 697 */         method, 
/* 698 */         queryParams, 
/* 699 */         body, 
/* 700 */         binaryBody, 
/* 701 */         headerParams, 
/* 702 */         formParams, 
/* 703 */         accept, 
/* 704 */         contentType);
/*     */     
/* 706 */     if (response.getStatusInfo() == ClientResponse.Status.NO_CONTENT) {
/* 707 */       return null;
/*     */     }
/* 709 */     if (response.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL) {
/* 710 */       if (response.hasEntity()) {
/* 711 */         DataInputStream stream = new DataInputStream(response.getEntityInputStream());
/* 712 */         byte[] data = new byte[response.getLength()];
/*     */         try {
/* 714 */           stream.readFully(data);
/*     */         }
/* 716 */         catch (IOException ex) {
/* 717 */           throw new ApiException(500, 
/* 718 */               "Error obtaining binary response data");
/*     */         } 
/* 720 */         return data;
/*     */       } 
/*     */       
/* 723 */       return new byte[0];
/*     */     } 
/*     */ 
/*     */     
/* 727 */     String message = "error";
/*     */     
/* 729 */     RestException exception = null;
/* 730 */     if (response.hasEntity()) {
/*     */       try {
/* 732 */         message = String.valueOf(response.getEntity(String.class));
/* 733 */         exception = getRestException(message, RestException.class);
/*     */       }
/* 735 */       catch (RuntimeException runtimeException) {
/*     */ 
/*     */       
/* 738 */       } catch (IOException iOException) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 743 */     throw new ApiException(response.getStatusInfo().getStatusCode(), 
/* 744 */         (exception == null) ? null : exception.getCode(), 
/* 745 */         (exception == null) ? message : exception.getMessage());
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
/*     */   private <T> T getRestException(String message, Class<T> clazz) throws IOException {
/* 759 */     ObjectMapper mapper = new ObjectMapper();
/* 760 */     return (T)mapper.readValue(message, 
/* 761 */         clazz);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String getXWWWFormUrlencodedParams(Map<String, Object> formParams) {
/* 768 */     StringBuilder formParamBuilder = new StringBuilder();
/*     */     
/* 770 */     for (Map.Entry<String, Object> param : formParams.entrySet()) {
/* 771 */       String keyStr = param.getKey();
/* 772 */       String valueStr = parameterToString(param.getValue());
/*     */       try {
/* 774 */         formParamBuilder.append(URLEncoder.encode(param.getKey(), 
/* 775 */               "utf8"))
/* 776 */           .append("=")
/* 777 */           .append(URLEncoder.encode(valueStr, 
/* 778 */               "utf8"));
/* 779 */         formParamBuilder.append("&");
/*     */       }
/* 781 */       catch (UnsupportedEncodingException unsupportedEncodingException) {}
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 786 */     String encodedFormParams = formParamBuilder.toString();
/* 787 */     if (encodedFormParams.endsWith("&")) {
/* 788 */       encodedFormParams = encodedFormParams.substring(0, 
/* 789 */           encodedFormParams.length() - 1);
/*     */     }
/*     */     
/* 792 */     return encodedFormParams;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Client getClient(String baseUrl) {
/* 799 */     if (!this.hostMap.containsKey(baseUrl)) {
/* 800 */       DefaultClientConfig defaultClientConfig = new DefaultClientConfig();
/* 801 */       Client client = new Client((ClientHandler)new URLConnectionClientHandler(
/* 802 */             new HttpURLConnectionFactory() {
/* 803 */               Proxy p = null;
/*     */ 
/*     */               
/*     */               public HttpURLConnection getHttpURLConnection(URL url) throws IOException {
/* 807 */                 if (this.p == null) {
/* 808 */                   if (System.getProperties().containsKey("http.proxyHost")) {
/* 809 */                     this.p = new Proxy(Proxy.Type.HTTP, 
/* 810 */                         new InetSocketAddress(
/* 811 */                           System.getProperty("http.proxyHost"), 
/* 812 */                           Integer.getInteger("http.proxyPort", 80).intValue()));
/*     */                   } else {
/* 814 */                     this.p = Proxy.NO_PROXY;
/*     */                   } 
/*     */                 }
/* 817 */                 return (HttpURLConnection)url.openConnection(this.p);
/*     */               }
/* 819 */             }), (ClientConfig)defaultClientConfig);
/* 820 */       if (this.debugging)
/* 821 */         client.addFilter((ClientFilter)new LoggingFilter()); 
/* 822 */       this.hostMap.put(baseUrl, 
/* 823 */           client);
/*     */     } 
/* 825 */     return this.hostMap.get(baseUrl);
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sig\\utils\ApiClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */