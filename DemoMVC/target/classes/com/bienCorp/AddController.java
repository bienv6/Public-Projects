package com.bienCorp;

import org.springframework.stereotype.Controller;
import org.springframwork.web.bind.annotation.RequestMapping;

@Controller
public class AddController 
{
	@RequestMapping("/add")
	public String add() 
	{
		return "Welcome.jsp";
	}

}
