package org.testing.testScrpts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilites.PropertiesHandle;
import org.testng.annotations.Test;

public class TC8_GetParticularRequest8 {
	@Test
	public void testCase8() throws IOException
	{
		Properties pr = PropertiesHandle.loadPropertiesFile("../JanAPIFW/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		http.GetParticularMethod("Real_Time_GetParticular", TC1_PostRequest.returnIdValue);

	}

}
