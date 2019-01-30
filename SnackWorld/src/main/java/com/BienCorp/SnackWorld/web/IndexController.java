package com.BienCorp.SnackWorld.web;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BienCorp.SnackWorld.valueObjects.Address;
import com.BienCorp.SnackWorld.valueObjects.Person;

@Controller
@RequestMapping("/")
public class IndexController
{
	@GetMapping
	ModelAndView index(@CookieValue(name = "lastVisited", required = false) String lastVisited,
	        HttpServletResponse response)
	{
		String message = "";
		int hour = LocalTime.now().getHour();
		if (hour < 12)
		{
			message = "good morning";
		}
		else if (hour < 18)
		{
			message = "good afternoon";
		}
		else
		{
			message = "good evening";
		}
		Cookie cookie = new Cookie("lastVisited", LocalDateTime.now().toString());
		cookie.setMaxAge(31000);
		response.addCookie(cookie);
		ModelAndView modelAndView = new ModelAndView("index", "message", message);
		modelAndView.addObject("greeting", "SnackWorld wishes you a");
		modelAndView.addObject("manager", new Person("Donanld", "Trump", 4, true,
		        new Address("Pennsylvania Ave", "1400", "Washington DC", "33333")));
		return modelAndView;
	}
}
