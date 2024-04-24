package org.testing.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

//input parameter ----JsonFilePath
//purpose of this method---read the json data
// output parameter--- json Data in String form
public class JsonHandle {

	public static String readjsondata(String filePath) throws FileNotFoundException
	{
		File f = new File(filePath);//Connection establish
		FileInputStream fi = new FileInputStream(f); //stream object
		JSONTokener js = new JSONTokener(fi); //tokener object
		JSONObject j = new JSONObject(js);//jsonobject object
		return j.toString();
	}
}
