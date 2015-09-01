package service;

import org.springframework.stereotype.Service;

@Service
public class GoodMorning {

	public String say(){
		System.out.println("good morning£¡");
		return "good Morning!";
	}
}
