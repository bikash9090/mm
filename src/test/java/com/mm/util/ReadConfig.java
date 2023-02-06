package com.mm.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;

	public ReadConfig() {

		String path = System.getProperty("user.dir") + "\\Config\\config.properties";

		try (FileInputStream input = new FileInputStream(path)) {
			prop = new Properties();
			prop.load(input);

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("IO Exception occured!");
		}
	}

	public String getUrl() {

		return prop.getProperty("Url");
	}

	public String getUsername() {

		return prop.getProperty("Username");
	}

	public String getPassword() {

		return prop.getProperty("Password");
	}

	public String getBrowser() {

		return prop.getProperty("Browser");
	}
	
	public String getInstantPageUrl() {
		return prop.getProperty("insPageUrl");
	}

}
