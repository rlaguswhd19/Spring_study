package com.hj.spring;


import java.io.File;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{
	
	@Autowired
	ApplicationContext resourceLoader;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(resourceLoader.getClass());
		
		Resource resource = resourceLoader.getResource("classpath:test.txt");
		System.out.println(resource.getClass());
		
		System.out.println(resource.exists());
		System.out.println(resource.getDescription());
		File file = resource.getFile();
		System.out.println(Files.readAllLines(file.toPath()));
	}
}
