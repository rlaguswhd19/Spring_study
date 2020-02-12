package com.hj.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{

//	@Autowired
//	Single single;
//	
//	@Autowired
//	Proto proto;
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println(single.getProto());
//		System.out.println(proto);
		System.out.println(applicationContext.getBean(Proto.class));
		System.out.println(applicationContext.getBean(Proto.class));
		System.out.println(applicationContext.getBean(Proto.class));
		System.out.println();
		
		System.out.println(applicationContext.getBean(Single.class));
		System.out.println(applicationContext.getBean(Single.class));
		System.out.println(applicationContext.getBean(Single.class));
		
		System.out.println("proto by single");
		
		System.out.println(applicationContext.getBean(Single.class).getProto());
		System.out.println(applicationContext.getBean(Single.class).getProto());
		System.out.println(applicationContext.getBean(Single.class).getProto());
		
	}

}
