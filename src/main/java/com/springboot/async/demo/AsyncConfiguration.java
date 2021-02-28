package com.springboot.async.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/*
 * @Configuration
 * Indicates that a class declares one or more @Bean methods and 
 * may be processed by the Spring container to generate bean definitions and 
 * service requests for those beans at runtime
 * @EnableAsync
 * Spring’s ability to run @Async methods in a background thread pool.
 */
@Configuration
@EnableAsync
public class AsyncConfiguration {

	@Bean("asyncExcecutor")
	public Executor asyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(3);
		executor.setMaxPoolSize(3);
		executor.setQueueCapacity(100);
		executor.setThreadNamePrefix("AsynchThread-");
        executor.initialize();
        return executor;
		
	}
}
