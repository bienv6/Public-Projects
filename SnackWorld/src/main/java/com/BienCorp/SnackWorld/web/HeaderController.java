package com.BienCorp.SnackWorld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("headers")
public class HeaderController
{
	private final static String HEADERS = "headers";

	@GetMapping
	ModelAndView onWindows(@RequestHeader("user-agent") String userAgent)
	{
		return new ModelAndView(HEADERS, "onWindows", userAgent.toLowerCase().contains("windows"));
	}
}
