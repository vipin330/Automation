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

import io.restassured.response.Response;

public class TC6_PostRequest6 {
@Test
	public void testCase6() throws IOException
	{
		Properties pr = PropertiesHandle.loadPropertiesFile("../JanAPIFW/URI.properties");
		String jsonRequestBody =JsonHandle.readjsondata("../JanAPIFW/src/test/java/org/testing/resources/inputRequestForRealAPI.json");
		
		
		HTTPMethods http = new HTTPMethods(pr);
		Response resObj = http.postmethod(jsonRequestBody, "Real_Time_URI_Post");
	}
	}


