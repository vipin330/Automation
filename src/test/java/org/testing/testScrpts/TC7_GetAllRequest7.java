package org.testing.testScrpts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilites.PropertiesHandle;
import org.testng.annotations.Test;

public class TC7_GetAllRequest7 {
	@Test
	public void testCase7() throws IOException
	{

	Properties pr = PropertiesHandle.loadPropertiesFile("../JanAPIFW/URI.properties");
	HTTPMethods http = new HTTPMethods(pr);
	http.getAllMethod("Real_Time_GetAll");
}
}