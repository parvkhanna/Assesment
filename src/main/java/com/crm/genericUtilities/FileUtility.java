package com.crm.genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getProppertyKeyValue(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IpathConstant.PROPERTY_FILEPATH);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}

}
