package com.BienCorp.SnackWorld.web;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BienCorp.SnackWorld.valueObjects.Snack;

@Controller
@RequestMapping("snacks")
public class SnackController
{
	private final static String		SNACKS_VIEW	= "snacks";
	private final static String		SNACK_VIEW	= "snack";
	private static final String		PRICES_VIEW	= null;
	private final Map<Long, Snack>	snackList	= new LinkedHashMap<>();

	@GetMapping
	ModelAndView snacks()
	{
		snackList.put(1L, new Snack(1, "Plantain Chips", BigDecimal.valueOf(1.55), false));
		snackList.put(2L, new Snack(2, "Chips Ahoy Cookies", BigDecimal.valueOf(1.55), false));
		snackList.put(3L, new Snack(3, "Hot Fries", BigDecimal.valueOf(1.55), true));
		snackList.put(4L, new Snack(4, "Doritos", BigDecimal.valueOf(1.55), true));

		return new ModelAndView(SNACKS_VIEW, "snacks", snackList);
	}

	@GetMapping("{id}")
	ModelAndView snack(@PathVariable long id)
	{
		return new ModelAndView(SNACK_VIEW, "snack", snackList.get(id));
	}

	@GetMapping("prices")
	ModelAndView snackPrices()
	{
		return new ModelAndView(PRICES_VIEW, "prices",
		        snackList.values().stream().map(snack -> snack.getPrice()).distinct().collect(Collectors.toSet()));
	}

	@GetMapping(params = "price")
	ModelAndView snacksWithPrice(double price)
	{
		return new ModelAndView(PRICES_VIEW, "snacks", snackList.values().stream()
		        .filter(snack -> snack.getPrice().equals(price)).collect(Collectors.toList())).addObject("price",
		                price);

	}
}
