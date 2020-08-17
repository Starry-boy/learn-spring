package com.ratel.learn.lifeCycleCallback;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author ratel
 * @date 2020/8/17
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
//		可以获取环境变量
		ConfigurableEnvironment environment = context.getEnvironment();
//		指定当前运行环境
		environment.setActiveProfiles("dev");
		context.close();
	}
}
