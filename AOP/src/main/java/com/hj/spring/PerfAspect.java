package com.hj.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {
	//pjp = advice가 적용되는 대상
//	@Around("@annotation(PerfLogging)")
	@Around("bean(simpleEventService)")
	public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
		long begin = System.currentTimeMillis();
		
		//대상의 method가 실행
		Object retVal = pjp.proceed();
		
		System.out.println(System.currentTimeMillis()-begin);
		return retVal;
	}
	@Before("@annotation(PerfLogging)")
	public void hell() {
		System.out.println("hello");
	}
}
