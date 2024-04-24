package org.testing.utilites;

import io.restassured.response.Response;

public class jsonParsingUsingJsonPath {

	public static String doParsing(String jsonpath, Response res)
	{
	
		String extractedValue = res.jsonPath().get(jsonpath);
		return extractedValue;
		
		
	}
	
}
