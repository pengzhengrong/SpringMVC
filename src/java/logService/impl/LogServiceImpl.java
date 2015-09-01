package logService.impl;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import logService.LogService;
public class LogServiceImpl implements LogService{

	public void cutPoint() {
		// TODO Auto-generated method stub
		System.out.println("切点...");
	}

	public void afterPoint() {
		// TODO Auto-generated method stub
		System.out.println("after-return切点后...");
	}

	public void beforePoint() {
		// TODO Auto-generated method stub
		System.out.println("切点前...");
	}

	public void doExceptionPoint() {
		// TODO Auto-generated method stub
		System.out.println("切点异常...");
	}

	public void aroundPoint() {
		// TODO Auto-generated method stub
		System.out.println("环绕切点...");
	}

	public void finallyPoint() {
		// TODO Auto-generated method stub
		System.out.println("after最终切点...不管方法是否执行成功!");
	}

}
