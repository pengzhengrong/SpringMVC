package dao.impl;

import org.springframework.context.annotation.Bean;

import dao.LoginDao;

public class LoginDaoImpl implements LoginDao {

	@Override
	@Bean
	public boolean isLogin(String name) {
		// TODO Auto-generated method stub
		if(name.equals("jack"))
			return true;
		return false;
	}

}
