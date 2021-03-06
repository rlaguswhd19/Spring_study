package com.hj.spring;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {
	
	@EventListener
	@Async
	public void handle(MyEvent myEvent) {
		System.out.println(Thread.currentThread());
		System.out.println("Another " + myEvent.getData());
	}
}
