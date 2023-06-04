package com.jsp.springboot.webApplication.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginContoller {

//	private Logger logger= LoggerFactory.getLogger(getClass());
//	logger.debug("My name is {}", name);
//	logger.info("My name is {}", name);
//	logger.warn("My name is {}", name);	

//	@RequestMapping("login")
//	public String loginPage(@RequestParam String name, ModelMap model) {
//		model.put("name", name);
//		
//		return "login";
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		model.put("name", getLoggedInUsername());
		return "welcome";
	}
	
	
	public String getLoggedInUsername() {
		Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

}
