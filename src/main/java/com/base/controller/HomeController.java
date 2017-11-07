package com.base.controller;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import utils.DateUtils;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) {
		 Cookie cookie =new Cookie("index", "index success");
		 response.addCookie(cookie);
		 modelMap.put("thisTime", DateUtils.format(new Date()));
		 return "index";
	}

}
