package cn.it.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//一次性加载属性文件中全部的属性
	@Autowired
	private Environment environment; 
	
	//单个的属性注入
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	@GetMapping("/hello")
	public String hello(){
		
		//在控制台输出.
		System.out.println("name:" + environment.getProperty("name"));
		System.out.println("url:" + environment.getProperty("url"));
		
		System.out.println("单次获取:name===" + name);
		System.out.println("单次获取:url===" + url);
		System.out.println("中文8爱迪生");
		return "哈喽Hello SpringBoot!";
	}
}
