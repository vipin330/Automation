package org.testing.testSteps;

import java.util.Properties;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods {
	
	Properties pr; //global
	public HTTPMethods(Properties pr) {
		this.pr =pr;
	
	}
	
	
public Response postmethod(String requestbody, String URIKeyName)
{
	String uriValue = pr.getProperty(URIKeyName);
	Response res =
	given()
	.contentType(ContentType.JSON)
	.body(requestbody)
	.when()
	.post(uriValue);
	System.out.println("Status code is"+res.statusCode());
	System.out.println("Response data is");
	System.out.println(res.asString());
	return res;
}

public Response putmethod(String requestbody, String URIKeyName, String endPointValue)
{
	String uriValue = pr.getProperty(URIKeyName)+"/"+endPointValue;
	Response res =
	given()
	.contentType(ContentType.JSON)
	.body(requestbody)
	.when()
	.put(uriValue);
	System.out.println("Status code is"+res.statusCode());
	System.out.println("Response data is");
	System.out.println(res.asString());
	return res;
}



 public void getAllMethod(String URIKeyName)

	
{	
	String uriValue = pr.getProperty(URIKeyName);
	Response res =
	given()
	.contentType(ContentType.JSON)
	.when()
	.get(uriValue);
	System.out.println("Status code is"+res.statusCode());
	System.out.println("Response data is");
	System.out.println(res.asString());
}

 
 
 
 
 public void GetParticularMethod(String URIKeyName, String endPoint)

	
 {	
 	String uriValue = pr.getProperty(URIKeyName)+"/"+endPoint;
 	Response res =
 	given()
 	.contentType(ContentType.JSON)
 	.when()
 	.get(uriValue);
 	System.out.println("Status code is"+res.statusCode());
 	System.out.println("Response data is");
 	System.out.println(res.asString());
 }

 public void deleteParticularMethod(String URIKeyName, String endPoint)

	
 {	
 	String uriValue = pr.getProperty(URIKeyName)+"/"+endPoint;
 	Response res =
 	given()
 	.contentType(ContentType.JSON)
 	.when()
 	.delete(uriValue);
 	System.out.println("Status code is"+res.statusCode());
 	System.out.println("Response data is");
 	System.out.println(res.asString());
 }

 
 
}
