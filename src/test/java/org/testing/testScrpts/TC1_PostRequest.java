package org.testing.testScrpts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilites.JsonHandle;
import org.testing.utilites.PropertiesHandle;
import org.testing.utilites.jsonParsingUsingJsonPath;
import org.testing.utilites.jsonReplacement;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class TC1_PostRequest {
	public static String returnIdValue;
	@Test
	public void testcase1() throws IOException {
		Properties pr = PropertiesHandle.loadPropertiesFile("../JanAPIFW/URI.properties");
		String jsonRequestBody =JsonHandle.readjsondata("../JanAPIFW/src/test/java/org/testing/resources/inputRequest.json");
		
		Random r = new Random();
		Integer idValue=r.nextInt();
		
		
		jsonRequestBody=jsonReplacement.assignValue(jsonRequestBody,"id",idValue.toString());
		
		HTTPMethods http = new HTTPMethods(pr);
		Response resObj = http.postmethod(jsonRequestBody, "QA_URI1");
		returnIdValue = jsonParsingUsingJsonPath.doParsing("id" , resObj);
	}

}
