package cn.it.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 代表为SpringBoot应用的运行主类
public class Application {
	public static void main(String[] args) {
		/** 第一种方式： 运行SpringBoot应用 */
		System.out.println("jvm中文输出测试------------->");
		//SpringApplication.run(Application.class, args);
		
		/** 第二种方式： 运行SpringBoot应用去掉Banner */
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		/** 关闭Banner */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
		
		System.out.println("jvm中文输出测试------------->");
	}
}
