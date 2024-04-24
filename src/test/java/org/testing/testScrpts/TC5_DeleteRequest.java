package org.testing.testScrpts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilites.PropertiesHandle;
import org.testng.annotations.Test;

public class TC5_DeleteRequest {
	@Test
	public void testCase5() throws IOException
	{
		Properties pr = PropertiesHandle.loadPropertiesFile("../JanAPIFW/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		http.deleteParticularMethod("QA_URI1", TC1_PostRequest.returnIdValue);

	}

}
