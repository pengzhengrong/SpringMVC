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
		System.out.println("�е�...");
	}

	public void afterPoint() {
		// TODO Auto-generated method stub
		System.out.println("after-return�е��...");
	}

	public void beforePoint() {
		// TODO Auto-generated method stub
		System.out.println("�е�ǰ...");
	}

	public void doExceptionPoint() {
		// TODO Auto-generated method stub
		System.out.println("�е��쳣...");
	}

	public void aroundPoint() {
		// TODO Auto-generated method stub
		System.out.println("�����е�...");
	}

	public void finallyPoint() {
		// TODO Auto-generated method stub
		System.out.println("after�����е�...���ܷ����Ƿ�ִ�гɹ�!");
	}

}
