/*     */ package com.adobe.sign.model.agreements;
import java.util.ArrayList;
import java.util.List;

/*     */ 
/*     */ import com.adobe.sign.utils.StringUtil;
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ 
/*     */ @ApiModel(description = "")
/*     */ public class RequestFormField {
/*     */   private AlignmentEnum alignment;
/*     */   private AnyOrAllEnum anyOrAll;
/*     */   private String backgroundColor;
/*     */   private String borderColor;
/*     */   private BorderStyleEnum borderStyle;
/*     */   private Float borderWidth;
/*     */   private String calculatedExpression;
/*     */   private List<FormFieldCondition> conditions;
/*     */   private ContentTypeEnum contentType;
/*     */   private String defaultValue;
/*     */   private String displayFormat;
/*     */   private DisplayFormatTypeEnum displayFormatType;
/*     */   private String displayLabel;
/*     */   private String fontColor;
/*     */   private String fontName;
/*     */   private Float fontSize;
/*     */   private FormatEnum format;
/*     */   private String formatData;
/*     */   private Boolean hidden;
/*     */   private List<String> hiddenOptions;
/*     */   private InputTypeEnum inputType;
/*     */   private List<FormFieldLocation> locations;
/*     */   private Boolean masked;
/*     */   private String maskingText;
/*     */   private Integer maxLength;
/*     */   private Double maxNumberValue;
/*     */   private Integer minLength;
/*     */   private Double minNumberValue;
/*     */   private String name;
/*     */   private RadioCheckTypeEnum radioCheckType;
/*     */   private Boolean readOnly;
/*     */   private Integer recipientIndex;
/*     */   private String regularExpression;
/*     */   private Boolean required;
/*     */   private ShowOrHideEnum showOrHide;
/*     */   private String specialErrMsg;
/*     */   private String specialFormula;
/*     */   private String tooltip;
/*     */   private List<String> visibleOptions;
/*     */   
/*  49 */   public RequestFormField() { this.alignment = null;
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
/*  67 */     this.anyOrAll = null;
/*  68 */     this.backgroundColor = null;
/*  69 */     this.borderColor = null;
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
/*  90 */     this.borderStyle = null;
/*  91 */     this.borderWidth = null;
/*  92 */     this.calculatedExpression = null;
/*  93 */     this.conditions = new ArrayList<>();
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
/* 125 */     this.contentType = null;
/* 126 */     this.defaultValue = null;
/* 127 */     this.displayFormat = null;
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
/* 146 */     this.displayFormatType = null;
/* 147 */     this.displayLabel = null;
/* 148 */     this.fontColor = null;
/* 149 */     this.fontName = null;
/* 150 */     this.fontSize = null;
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
/* 194 */     this.format = null;
/* 195 */     this.formatData = null;
/* 196 */     this.hidden = null;
/* 197 */     this.hiddenOptions = new ArrayList<>();
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
/* 227 */     this.inputType = null;
/* 228 */     this.locations = new ArrayList<>();
/* 229 */     this.masked = null;
/* 230 */     this.maskingText = null;
/* 231 */     this.maxLength = null;
/* 232 */     this.maxNumberValue = null;
/* 233 */     this.minLength = null;
/* 234 */     this.minNumberValue = null;
/* 235 */     this.name = null;
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
/* 257 */     this.radioCheckType = null;
/* 258 */     this.readOnly = null;
/* 259 */     this.recipientIndex = null;
/* 260 */     this.regularExpression = null;
/* 261 */     this.required = null;
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
/* 281 */     this.showOrHide = null;
/* 282 */     this.specialErrMsg = null;
/* 283 */     this.specialFormula = null;
/* 284 */     this.tooltip = null;
/* 285 */     this.visibleOptions = new ArrayList<>(); }
/*     */   public enum AlignmentEnum {
/*     */     LEFT("LEFT"), RIGHT("RIGHT"), CENTER("CENTER");
/*     */     private String value;
/*     */     AlignmentEnum(String value) { this.value = value; }
/*     */     public String toString() { return this.value; } }
/*     */   public enum AnyOrAllEnum {
/*     */     ALL("ALL"), ANY("ANY"); private String value; AnyOrAllEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum BorderStyleEnum {
/*     */     SOLID("SOLID"), DASHED("DASHED"), BEVELED("BEVELED"), INSET("INSET"), UNDERLINE("UNDERLINE"); private String value; BorderStyleEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum ContentTypeEnum {
/* 294 */     DATA("DATA"), SIGNATURE_BLOCK("SIGNATURE_BLOCK"), SIGNATURE("SIGNATURE"), SIGNER_NAME("SIGNER_NAME"), SIGNER_FIRST_NAME("SIGNER_FIRST_NAME"), SIGNER_LAST_NAME("SIGNER_LAST_NAME"), SIGNER_INITIALS("SIGNER_INITIALS"), SIGNER_EMAIL("SIGNER_EMAIL"), SIGNER_TITLE("SIGNER_TITLE"), SIGNER_COMPANY("SIGNER_COMPANY"), SIGNATURE_DATE("SIGNATURE_DATE"), AGREEMENT_NAME("AGREEMENT_NAME"), AGREEMENT_MESSAGE("AGREEMENT_MESSAGE"), TRANSACTION_ID("TRANSACTION_ID"), SIGNATURE_STAMP("SIGNATURE_STAMP"), CALC("CALC"); private String value; ContentTypeEnum(String value) { this.value = value; } public String toString() { return this.value; } } @ApiModelProperty("Alignment of the text.") @JsonProperty("alignment") public AlignmentEnum getAlignment() { return this.alignment; } public enum DisplayFormatTypeEnum {
/*     */     DEFAULT("DEFAULT"), DATE("DATE"), NUMBER("NUMBER"); private String value; DisplayFormatTypeEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum FormatEnum {
/*     */     CUSTOM("CUSTOM"), DATE("DATE"), DATE_CUSTOM("DATE_CUSTOM"), DATE_DD_MM_YY("DATE_DD_MM_YY"), DATE_DD_MM_YYYY("DATE_DD_MM_YYYY"), DATE_MM_DD_YY("DATE_MM_DD_YY"), DATE_MM_DD_YYYY("DATE_MM_DD_YYYY"), DATE_MM_YY("DATE_MM_YY"), EMAIL("EMAIL"), FORMULA("FORMULA"), MONEY("MONEY"), MONEY_UK("MONEY_UK"), NONE("NONE"), NUMBER("NUMBER"), PERCENT("PERCENT"), PHONE("PHONE"), PHONE_UK("PHONE_UK"), SOCIAL_SEC("SOCIAL_SEC"), SPECIAL("SPECIAL"), STRING("STRING"), STRING_ALPHA("STRING_ALPHA"), STRING_ALPHANUM("STRING_ALPHANUM"), STRING_NUM("STRING_NUM"), TIME("TIME"), XFA_PICTURE("XFA_PICTURE"), ZIP("ZIP"), ZIP4("ZIP4"), ZIP_UK("ZIP_UK"); private String value; FormatEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum InputTypeEnum {
/* 297 */     TEXT_FIELD("TEXT_FIELD"), MULTILINE("MULTILINE"), PASSWORD("PASSWORD"), RADIO("RADIO"), CHECKBOX("CHECKBOX"), DROP_DOWN("DROP_DOWN"), LISTBOX("LISTBOX"), SIGNATURE("SIGNATURE"), PDF_SIGNATURE("PDF_SIGNATURE"), BUTTON("BUTTON"), BLOCK("BLOCK"), FILE_CHOOSER("FILE_CHOOSER"), COMB("COMB"), UNSUPPORTED("UNSUPPORTED"); private String value; InputTypeEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum RadioCheckTypeEnum { CIRCLE("CIRCLE"), CHECK("CHECK"), CROSS("CROSS"), DIAMOND("DIAMOND"), SQUARE("SQUARE"), STAR("STAR"); private String value; RadioCheckTypeEnum(String value) { this.value = value; } public String toString() { return this.value; } } public enum ShowOrHideEnum { SHOW("SHOW"), HIDE("HIDE"), DISABLE("DISABLE"), ENABLE("ENABLE"); private String value; ShowOrHideEnum(String value) { this.value = value; } public String toString() { return this.value; } } public void setAlignment(AlignmentEnum alignment) { this.alignment = alignment; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("It indicates if any one of the conditions or all of them have to be true.")
/*     */   @JsonProperty("anyOrAll")
/*     */   public AnyOrAllEnum getAnyOrAll() {
/* 307 */     return this.anyOrAll;
/*     */   }
/*     */   public void setAnyOrAll(AnyOrAllEnum anyOrAll) {
/* 310 */     this.anyOrAll = anyOrAll;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Background color of the form field in RGB or HEX format")
/*     */   @JsonProperty("backgroundColor")
/*     */   public String getBackgroundColor() {
/* 320 */     return this.backgroundColor;
/*     */   }
/*     */   public void setBackgroundColor(String backgroundColor) {
/* 323 */     this.backgroundColor = backgroundColor;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Color of the border of the field in RGB or HEX format")
/*     */   @JsonProperty("borderColor")
/*     */   public String getBorderColor() {
/* 333 */     return this.borderColor;
/*     */   }
/*     */   public void setBorderColor(String borderColor) {
/* 336 */     this.borderColor = borderColor;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Style of the border of the field.")
/*     */   @JsonProperty("borderStyle")
/*     */   public BorderStyleEnum getBorderStyle() {
/* 346 */     return this.borderStyle;
/*     */   }
/*     */   public void setBorderStyle(BorderStyleEnum borderStyle) {
/* 349 */     this.borderStyle = borderStyle;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Width of the border of the field in pixels")
/*     */   @JsonProperty("borderWidth")
/*     */   public Float getBorderWidth() {
/* 359 */     return this.borderWidth;
/*     */   }
/*     */   public void setBorderWidth(Float borderWidth) {
/* 362 */     this.borderWidth = borderWidth;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Expression to calculate value of the form field")
/*     */   @JsonProperty("calculatedExpression")
/*     */   public String getCalculatedExpression() {
/* 372 */     return this.calculatedExpression;
/*     */   }
/*     */   public void setCalculatedExpression(String calculatedExpression) {
/* 375 */     this.calculatedExpression = calculatedExpression;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Conditions to be evaluated which decides the visibility of the form field in association with showOrHide property")
/*     */   @JsonProperty("conditions")
/*     */   public List<FormFieldCondition> getConditions() {
/* 385 */     return this.conditions;
/*     */   }
/*     */   public void setConditions(List<FormFieldCondition> conditions) {
/* 388 */     this.conditions = conditions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Content Type of the form field.")
/*     */   @JsonProperty("contentType")
/*     */   public ContentTypeEnum getContentType() {
/* 398 */     return this.contentType;
/*     */   }
/*     */   public void setContentType(ContentTypeEnum contentType) {
/* 401 */     this.contentType = contentType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Default value of the form field")
/*     */   @JsonProperty("defaultValue")
/*     */   public String getDefaultValue() {
/* 411 */     return this.defaultValue;
/*     */   }
/*     */   public void setDefaultValue(String defaultValue) {
/* 414 */     this.defaultValue = defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Format of the value of the field to be displayed based on the displayFormatType property.")
/*     */   @JsonProperty("displayFormat")
/*     */   public String getDisplayFormat() {
/* 424 */     return this.displayFormat;
/*     */   }
/*     */   public void setDisplayFormat(String displayFormat) {
/* 427 */     this.displayFormat = displayFormat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Format type of the text field.")
/*     */   @JsonProperty("displayFormatType")
/*     */   public DisplayFormatTypeEnum getDisplayFormatType() {
/* 437 */     return this.displayFormatType;
/*     */   }
/*     */   public void setDisplayFormatType(DisplayFormatTypeEnum displayFormatType) {
/* 440 */     this.displayFormatType = displayFormatType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Display label attached to the field")
/*     */   @JsonProperty("displayLabel")
/*     */   public String getDisplayLabel() {
/* 450 */     return this.displayLabel;
/*     */   }
/*     */   public void setDisplayLabel(String displayLabel) {
/* 453 */     this.displayLabel = displayLabel;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Font color of the form field in RGB or HEX format")
/*     */   @JsonProperty("fontColor")
/*     */   public String getFontColor() {
/* 463 */     return this.fontColor;
/*     */   }
/*     */   public void setFontColor(String fontColor) {
/* 466 */     this.fontColor = fontColor;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Font name of the form field")
/*     */   @JsonProperty("fontName")
/*     */   public String getFontName() {
/* 476 */     return this.fontName;
/*     */   }
/*     */   public void setFontName(String fontName) {
/* 479 */     this.fontName = fontName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Font size of the form field in points")
/*     */   @JsonProperty("fontSize")
/*     */   public Float getFontSize() {
/* 489 */     return this.fontSize;
/*     */   }
/*     */   public void setFontSize(Float fontSize) {
/* 492 */     this.fontSize = fontSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Format of the form field")
/*     */   @JsonProperty("format")
/*     */   public FormatEnum getFormat() {
/* 502 */     return this.format;
/*     */   }
/*     */   public void setFormat(FormatEnum format) {
/* 505 */     this.format = format;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The format of data in text field")
/*     */   @JsonProperty("formatData")
/*     */   public String getFormatData() {
/* 515 */     return this.formatData;
/*     */   }
/*     */   public void setFormatData(String formatData) {
/* 518 */     this.formatData = formatData;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("true if the field is hidden, else false")
/*     */   @JsonProperty("hidden")
/*     */   public Boolean getHidden() {
/* 528 */     return this.hidden;
/*     */   }
/*     */   public void setHidden(Boolean hidden) {
/* 531 */     this.hidden = hidden;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Text values which are hidden in a drop down form field")
/*     */   @JsonProperty("hiddenOptions")
/*     */   public List<String> getHiddenOptions() {
/* 541 */     return this.hiddenOptions;
/*     */   }
/*     */   public void setHiddenOptions(List<String> hiddenOptions) {
/* 544 */     this.hiddenOptions = hiddenOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Input type of the form field")
/*     */   @JsonProperty("inputType")
/*     */   public InputTypeEnum getInputType() {
/* 554 */     return this.inputType;
/*     */   }
/*     */   public void setInputType(InputTypeEnum inputType) {
/* 557 */     this.inputType = inputType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "All locations in a document where the form field is placed")
/*     */   @JsonProperty("locations")
/*     */   public List<FormFieldLocation> getLocations() {
/* 567 */     return this.locations;
/*     */   }
/*     */   public void setLocations(List<FormFieldLocation> locations) {
/* 570 */     this.locations = locations;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("true if the input entered by the signer has to be masked (like password), else false")
/*     */   @JsonProperty("masked")
/*     */   public Boolean getMasked() {
/* 580 */     return this.masked;
/*     */   }
/*     */   public void setMasked(Boolean masked) {
/* 583 */     this.masked = masked;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Text to mask the masked form field")
/*     */   @JsonProperty("maskingText")
/*     */   public String getMaskingText() {
/* 593 */     return this.maskingText;
/*     */   }
/*     */   public void setMaskingText(String maskingText) {
/* 596 */     this.maskingText = maskingText;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Maximum length of the input text field in terms of no. of characters")
/*     */   @JsonProperty("maxLength")
/*     */   public Integer getMaxLength() {
/* 606 */     return this.maxLength;
/*     */   }
/*     */   public void setMaxLength(Integer maxLength) {
/* 609 */     this.maxLength = maxLength;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Upper bound of the number that can be entered by the signer")
/*     */   @JsonProperty("maxNumberValue")
/*     */   public Double getMaxNumberValue() {
/* 619 */     return this.maxNumberValue;
/*     */   }
/*     */   public void setMaxNumberValue(Double maxNumberValue) {
/* 622 */     this.maxNumberValue = maxNumberValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Minimum length of the input text field in terms of no. of characters")
/*     */   @JsonProperty("minLength")
/*     */   public Integer getMinLength() {
/* 632 */     return this.minLength;
/*     */   }
/*     */   public void setMinLength(Integer minLength) {
/* 635 */     this.minLength = minLength;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Lower bound of the number that can be entered by the signer")
/*     */   @JsonProperty("minNumberValue")
/*     */   public Double getMinNumberValue() {
/* 645 */     return this.minNumberValue;
/*     */   }
/*     */   public void setMinNumberValue(Double minNumberValue) {
/* 648 */     this.minNumberValue = minNumberValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty(required = true, value = "The name of the form field")
/*     */   @JsonProperty("name")
/*     */   public String getName() {
/* 658 */     return this.name;
/*     */   }
/*     */   public void setName(String name) {
/* 661 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("The type of radio button (if field is radio button, identified by inputType).")
/*     */   @JsonProperty("radioCheckType")
/*     */   public RadioCheckTypeEnum getRadioCheckType() {
/* 671 */     return this.radioCheckType;
/*     */   }
/*     */   public void setRadioCheckType(RadioCheckTypeEnum radioCheckType) {
/* 674 */     this.radioCheckType = radioCheckType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("true if it is a read-only field, else false")
/*     */   @JsonProperty("readOnly")
/*     */   public Boolean getReadOnly() {
/* 684 */     return this.readOnly;
/*     */   }
/*     */   public void setReadOnly(Boolean readOnly) {
/* 687 */     this.readOnly = readOnly;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Index of recipient, starting from 1, in recipients list passed in the request")
/*     */   @JsonProperty("recipientIndex")
/*     */   public Integer getRecipientIndex() {
/* 697 */     return this.recipientIndex;
/*     */   }
/*     */   public void setRecipientIndex(Integer recipientIndex) {
/* 700 */     this.recipientIndex = recipientIndex;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Regular expression validation of the form field")
/*     */   @JsonProperty("regularExpression")
/*     */   public String getRegularExpression() {
/* 710 */     return this.regularExpression;
/*     */   }
/*     */   public void setRegularExpression(String regularExpression) {
/* 713 */     this.regularExpression = regularExpression;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("true if it is a mandatory field to be filled by the signer, else false")
/*     */   @JsonProperty("required")
/*     */   public Boolean getRequired() {
/* 723 */     return this.required;
/*     */   }
/*     */   public void setRequired(Boolean required) {
/* 726 */     this.required = required;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Action to show/hide the form field is to be taken on the basis of evaluation of conditions.")
/*     */   @JsonProperty("showOrHide")
/*     */   public ShowOrHideEnum getShowOrHide() {
/* 736 */     return this.showOrHide;
/*     */   }
/*     */   public void setShowOrHide(ShowOrHideEnum showOrHide) {
/* 739 */     this.showOrHide = showOrHide;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Error message to be shown to the signer if filled value does not match the validations of the form field")
/*     */   @JsonProperty("specialErrMsg")
/*     */   public String getSpecialErrMsg() {
/* 749 */     return this.specialErrMsg;
/*     */   }
/*     */   public void setSpecialErrMsg(String specialErrMsg) {
/* 752 */     this.specialErrMsg = specialErrMsg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Formula used to calculate the value of the form field")
/*     */   @JsonProperty("specialFormula")
/*     */   public String getSpecialFormula() {
/* 762 */     return this.specialFormula;
/*     */   }
/*     */   public void setSpecialFormula(String specialFormula) {
/* 765 */     this.specialFormula = specialFormula;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Text that appears while hovering over the field")
/*     */   @JsonProperty("tooltip")
/*     */   public String getTooltip() {
/* 775 */     return this.tooltip;
/*     */   }
/*     */   public void setTooltip(String tooltip) {
/* 778 */     this.tooltip = tooltip;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("Text values which are visible in a drop down form field")
/*     */   @JsonProperty("visibleOptions")
/*     */   public List<String> getVisibleOptions() {
/* 788 */     return this.visibleOptions;
/*     */   }
/*     */   public void setVisibleOptions(List<String> visibleOptions) {
/* 791 */     this.visibleOptions = visibleOptions;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 798 */     StringBuilder sb = new StringBuilder();
/* 799 */     sb.append("class RequestFormField {\n");
/*     */     
/* 801 */     sb.append("    alignment: ").append(StringUtil.toIndentedString(this.alignment)).append("\n");
/* 802 */     sb.append("    anyOrAll: ").append(StringUtil.toIndentedString(this.anyOrAll)).append("\n");
/* 803 */     sb.append("    backgroundColor: ").append(StringUtil.toIndentedString(this.backgroundColor)).append("\n");
/* 804 */     sb.append("    borderColor: ").append(StringUtil.toIndentedString(this.borderColor)).append("\n");
/* 805 */     sb.append("    borderStyle: ").append(StringUtil.toIndentedString(this.borderStyle)).append("\n");
/* 806 */     sb.append("    borderWidth: ").append(StringUtil.toIndentedString(this.borderWidth)).append("\n");
/* 807 */     sb.append("    calculatedExpression: ").append(StringUtil.toIndentedString(this.calculatedExpression)).append("\n");
/* 808 */     sb.append("    conditions: ").append(StringUtil.toIndentedString(this.conditions)).append("\n");
/* 809 */     sb.append("    contentType: ").append(StringUtil.toIndentedString(this.contentType)).append("\n");
/* 810 */     sb.append("    defaultValue: ").append(StringUtil.toIndentedString(this.defaultValue)).append("\n");
/* 811 */     sb.append("    displayFormat: ").append(StringUtil.toIndentedString(this.displayFormat)).append("\n");
/* 812 */     sb.append("    displayFormatType: ").append(StringUtil.toIndentedString(this.displayFormatType)).append("\n");
/* 813 */     sb.append("    displayLabel: ").append(StringUtil.toIndentedString(this.displayLabel)).append("\n");
/* 814 */     sb.append("    fontColor: ").append(StringUtil.toIndentedString(this.fontColor)).append("\n");
/* 815 */     sb.append("    fontName: ").append(StringUtil.toIndentedString(this.fontName)).append("\n");
/* 816 */     sb.append("    fontSize: ").append(StringUtil.toIndentedString(this.fontSize)).append("\n");
/* 817 */     sb.append("    format: ").append(StringUtil.toIndentedString(this.format)).append("\n");
/* 818 */     sb.append("    formatData: ").append(StringUtil.toIndentedString(this.formatData)).append("\n");
/* 819 */     sb.append("    hidden: ").append(StringUtil.toIndentedString(this.hidden)).append("\n");
/* 820 */     sb.append("    hiddenOptions: ").append(StringUtil.toIndentedString(this.hiddenOptions)).append("\n");
/* 821 */     sb.append("    inputType: ").append(StringUtil.toIndentedString(this.inputType)).append("\n");
/* 822 */     sb.append("    locations: ").append(StringUtil.toIndentedString(this.locations)).append("\n");
/* 823 */     sb.append("    masked: ").append(StringUtil.toIndentedString(this.masked)).append("\n");
/* 824 */     sb.append("    maskingText: ").append(StringUtil.toIndentedString(this.maskingText)).append("\n");
/* 825 */     sb.append("    maxLength: ").append(StringUtil.toIndentedString(this.maxLength)).append("\n");
/* 826 */     sb.append("    maxNumberValue: ").append(StringUtil.toIndentedString(this.maxNumberValue)).append("\n");
/* 827 */     sb.append("    minLength: ").append(StringUtil.toIndentedString(this.minLength)).append("\n");
/* 828 */     sb.append("    minNumberValue: ").append(StringUtil.toIndentedString(this.minNumberValue)).append("\n");
/* 829 */     sb.append("    name: ").append(StringUtil.toIndentedString(this.name)).append("\n");
/* 830 */     sb.append("    radioCheckType: ").append(StringUtil.toIndentedString(this.radioCheckType)).append("\n");
/* 831 */     sb.append("    readOnly: ").append(StringUtil.toIndentedString(this.readOnly)).append("\n");
/* 832 */     sb.append("    recipientIndex: ").append(StringUtil.toIndentedString(this.recipientIndex)).append("\n");
/* 833 */     sb.append("    regularExpression: ").append(StringUtil.toIndentedString(this.regularExpression)).append("\n");
/* 834 */     sb.append("    required: ").append(StringUtil.toIndentedString(this.required)).append("\n");
/* 835 */     sb.append("    showOrHide: ").append(StringUtil.toIndentedString(this.showOrHide)).append("\n");
/* 836 */     sb.append("    specialErrMsg: ").append(StringUtil.toIndentedString(this.specialErrMsg)).append("\n");
/* 837 */     sb.append("    specialFormula: ").append(StringUtil.toIndentedString(this.specialFormula)).append("\n");
/* 838 */     sb.append("    tooltip: ").append(StringUtil.toIndentedString(this.tooltip)).append("\n");
/* 839 */     sb.append("    visibleOptions: ").append(StringUtil.toIndentedString(this.visibleOptions)).append("\n");
/* 840 */     sb.append("}");
/* 841 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\ross.grogankaylor\OneDrive - Perficient, Inc\Desktop\GigaSign1.3\RELEASE GIGASIGN\GigaSign_lib\ModifiedAdobeSDK-PROXY-OLD.jar!\com\adobe\sign\model\agreements\RequestFormField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */