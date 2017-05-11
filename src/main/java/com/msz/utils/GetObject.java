package main.java.com.msz.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class GetObject {
	public static ApplicationContext setUp(){
		return new FileSystemXmlApplicationContext("classpath:main/resources/config/spring/applicationContext.xml");
	}
}
