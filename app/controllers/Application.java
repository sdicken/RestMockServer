package controllers;

import java.util.Date;

import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }
  
  public static Result Home()
  {
      return ok();
  }
    
  public static Result ListDocuments(String userName)
  {
      if(userName.equals("sdicken"))
      {
          response().setContentType("application/json");
          response().setHeader(ACCEPT, "AQIC5wM2LY4Sfcx1mTOwfDw0gu5r0zM9l-EbjjV7UnfHXow.*AAJTSQACMDIAAlMxAAIwMw..*");
          response().setHeader(ACCEPT, "application/json");
          return ok(populateFakeDocuments());
      }
      else if(userName.equals("nodocs"))
      {
          response().setContentType("application/json");
          response().setHeader(ACCEPT, "AQIC5wM2LY4Sfcx1mTOwfDw0gu5r0zM9l-EbjjV7UnfHXow.*AAJTSQACMDIAAlMxAAIwMw..*");
          response().setHeader(ACCEPT, "application/json");
          return ok(createEmptyJsonArray());
      }
      else
      {
          return badRequest();
      }
  }
  
  private static ArrayNode createEmptyJsonArray()
  {
      return JsonNodeFactory.instance.arrayNode();
  }
  
  private static ArrayNode populateFakeDocuments()
  {
      ArrayNode array = JsonNodeFactory.instance.arrayNode();
      
      array.add(createFakeDocument("DOC.doc", MIMETypes.DOC));
      array.add(createFakeDocument("DOCX.docx", MIMETypes.DOCX));
      array.add(createFakeDocument("PDF.pdf", MIMETypes.PDF));
      array.add(createFakeDocument("ODT.odt", MIMETypes.ODT));
      array.add(createFakeDocument("JPG.jpg", MIMETypes.JPG));
      array.add(createFakeDocument("GIF.gif", MIMETypes.GIF));
      array.add(createFakeDocument("TIFF.tiff", MIMETypes.TIFF));
      array.add(createFakeDocument("PPT.ppt", MIMETypes.PPT));
      array.add(createFakeDocument("PPTX.pptx", MIMETypes.PPTX));
      array.add(createFakeDocument("ODP.odp", MIMETypes.ODP));
      array.add(createFakeDocument("TXT.txt", MIMETypes.TXT));
      array.add(createFakeDocument("RTF.rtf", MIMETypes.RTF));
      array.add(createFakeDocument("HTML.html", MIMETypes.HTML));
      array.add(createFakeDocument("XLS.xls", MIMETypes.XLS));
      array.add(createFakeDocument("XLSX.xlsx", MIMETypes.XLSX));
      array.add(createFakeDocument("ODS.ods", MIMETypes.ODS));
      
      return array;
  }
  
  private static ObjectNode createFakeDocument(String filename, String mimeType)
  {
      ObjectNode result = Json.newObject();
      
      result.put(JSONDocumentFields.PAGE_COUNT, 2);
      result.put(JSONDocumentFields.PRINT_STATUS, "DEPRECATED");
      result.put(JSONDocumentFields.N_UP, 1);
      result.put(JSONDocumentFields.CONVERSION_STATUS, "CONVERSION_SUCCESS");
      result.put(JSONDocumentFields.ID, 1);
      result.put(JSONDocumentFields.TITLE, "test");
      result.put(JSONDocumentFields.COPIES, 1);
      result.put(JSONDocumentFields.SOURCE, "web");
      result.put(JSONDocumentFields.EMAIL, "");
      result.put(JSONDocumentFields.COLOR, true);
      result.put(JSONDocumentFields.PRIORITY, 0);
      result.put(JSONDocumentFields.DESCRIPTION, "");
      result.put(JSONDocumentFields.USER_ID, "sdicken");
      result.put(JSONDocumentFields.FILENAME, filename);
      result.put(JSONDocumentFields.UPLOAD_DATE, new Date().getTime());
      result.put(JSONDocumentFields.MIMETYPE, mimeType);
      result.put(JSONDocumentFields.DUPLEX, "off");
      
      return result;
  }
}