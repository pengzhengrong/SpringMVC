package action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class loginAction {

	private dao.login login;
	@RequestMapping("index")
	public String login(String name,HttpServletRequest request ,ModelMap model){
		login = new dao.login();
		boolean flag = login.isLogin(name);
		System.out.println(flag);
		return "login/login";
	}
}
