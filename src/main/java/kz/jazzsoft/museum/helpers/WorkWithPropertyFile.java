package kz.jazzsoft.museum.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Created by dima on 28.10.16.
 */
public class WorkWithPropertyFile {


	public static Properties loadProperties() {
		List<String> sources = Arrays.asList(
				".",
				"./src/main/resources",
				System.getProperty("user.home", "") + File.separator + "/museum",
				"c:\\TestMuseum\\",
				"/Users/dima/Desktop/Мои Доки/JAVA/testMuseum/src/main/resources/"
		);
		Properties properties = new Properties();
		List<IOException> exceptions = new ArrayList<>(sources.size());
		for (String source : sources) {
			try (FileInputStream fis = new FileInputStream(new File(source, "config.properties"))) {
				properties.load(fis);
				return properties;
			} catch (IOException e) {
				exceptions.add(e);
			}
		}
		for (IOException exception : exceptions) {
			exception.printStackTrace();
		}
		return properties;
	}

}
