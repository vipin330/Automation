package org.testing.testScrpts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilites.JsonHandle;
import org.testing.utilites.PropertiesHandle;
import org.testing.utilites.jsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest {
	@Test
public void testCase4() throws IOException
{
	Properties pr = PropertiesHandle.loadPropertiesFile("../JanAPIFW/URI.properties");
	String jsonRequestBody =JsonHandle.readjsondata("../JanAPIFW/src/test/java/org/testing/resources/inputRequestforUpdate.json");
	
	
	jsonRequestBody=jsonReplacement.assignValue(jsonRequestBody,"id",TC1_PostRequest.returnIdValue);
	
	HTTPMethods http = new HTTPMethods(pr);
	Response resObj = http.putmethod(jsonRequestBody, "QA_URI1",TC1_PostRequest.returnIdValue);
	
}
}
