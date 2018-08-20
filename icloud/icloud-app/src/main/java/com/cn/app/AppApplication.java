package com.cn.app;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableScheduling
@ServletComponentScan
@SpringBootApplication
@EnableTransactionManagement
@ImportResource("classpath:dubbo-consumer.xml")
public class AppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AppApplication.class);
        application.setRegisterShutdownHook(false);
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AppApplication.class);
	}
}
