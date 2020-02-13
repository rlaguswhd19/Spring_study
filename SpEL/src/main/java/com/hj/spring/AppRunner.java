package com.hj.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Value("#{1+1}")
	int value;

	@Value("#{'hello ' + 'world'}")
	String greeting;
	
	@Value("#{1 eq 1}")
	boolean trueorFalse;
	
	@Value("${my.value}")
	String myvalue;
	
	@Value("#{${my.value} eq 100}")
	String istrue;
	
	@Value("#{sample.data}")
	int bean;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(value);
		System.out.println(greeting);
		System.out.println(trueorFalse);
		System.out.println(myvalue);
		System.out.println(istrue);
		System.out.println(bean);
	}
}
