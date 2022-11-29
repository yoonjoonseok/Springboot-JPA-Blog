package com.yjs.blog.test;

import java.io.IOException;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		String result = "hello";
		return result;
	}
	
	public String crawling(String url) throws IOException {
		String result = "";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yjsyg\\Desktop\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		//driver.get(url);
		//String html = driver.getPageSource();
	    //Document doc = Jsoup.parse(html);
		//Elements ele = doc.select("form#frmView");
		//result = ele.select("input[type=hidden]").attr("set_goods_stock");
		driver.quit();
		return "1";
	}
}
