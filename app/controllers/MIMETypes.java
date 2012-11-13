package controllers;

public final class MIMETypes
{
    // prevents instantiation
    private MIMETypes() {}
    
    /**
     * LSP supported file types
     */
    // Documents
    public static final String DOC = "application/msword";
    public static final String DOCX = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
    public static final String PDF = "application/pdf"; // IPP supported
    public static final String ODT = "application/vnd.oasis.opendocument.text, application/x-vnd.oasis.opendocument.text";
    // Images
    public static final String JPG = "image/jpeg"; // IPP supported
    public static final String GIF = "image/gif"; // IPP supported
    public static final String TIFF = "image/tiff"; // IPP supported
    public static final String ODG = "application/vnd.oasis.opendocument.graphics";
    // Presentations
    public static final String PPT = "application/vnd.ms-powerpoint";
    public static final String PPTX = "application/vnd.openxmlformats-officedocument.presentationml.presentation";
    public static final String ODP = "application/vnd.oasis.opendocument.presentation";
    // Text
    public static final String TXT = "text/plain";
    public static final String RTF = "application/rtf";
    public static final String HTML = "text/html"; // IPP supported
    // Spreadsheets
    public static final String XLS = "application/vnd.ms-excel";
    public static final String XLSX = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    public static final String ODS = "application/vnd.oasis.opendocument.spreadsheet";

    /**
     * IPP supported file types
     */
    // Documents
    // Images
    public static final String BMP = "image/bmp";
    public static final String PNG = "image/png";
    // Presentations
    // Text
    // Spreadsheets
}
