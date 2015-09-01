package service.impl;

import org.aspectj.lang.annotation.Pointcut;

import service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello";
	}

}
