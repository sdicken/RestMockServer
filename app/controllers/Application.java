package controllers;

import java.util.Date;

import org.codehaus.jackson.JsonNode;
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
      response().setContentType("application/json");
      response().setHeader(ACCEPT, "AQIC5wM2LY4Sfcx1mTOwfDw0gu5r0zM9l-EbjjV7UnfHXow.*AAJTSQACMDIAAlMxAAIwMw..*");
      response().setHeader(ACCEPT, "application/json");
      return ok(populateFakeDocuments());
  }
  
  private static ArrayNode populateFakeDocuments()
  {
      JsonNode json = request().body().asJson();
      ObjectNode result = Json.newObject();
      ArrayNode array = JsonNodeFactory.instance.arrayNode();
      
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
      result.put(JSONDocumentFields.FILENAME, "PDF.pdf");
      result.put(JSONDocumentFields.UPLOAD_DATE, new Date().getTime());
      result.put(JSONDocumentFields.MIMETYPE, "application/pdf");
      result.put(JSONDocumentFields.DUPLEX, "off");      
      
      array.add(result);
      
      return array;
  }
}