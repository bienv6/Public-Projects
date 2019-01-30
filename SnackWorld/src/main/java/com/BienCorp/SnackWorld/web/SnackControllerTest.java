package com.BienCorp.SnackWorld.web;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class SnackControllerTest
{
	private SnackController controller;

	@Before
	public void Before()
	{
		controller = new SnackController();
	}

	@Test
	public void snacksIsAssociatedWithSnacksJsp()
	{
		ModelAndView modelAndView = controller.snacks();
		assertEquals("snacks", modelAndView.getViewName());
	}

	@Test
	public void snackIsAssociatedWithSnackJsp()
	{
		ModelAndView modelAndView = controller.snack(1);
		assertEquals("snack", modelAndView.getViewName());
	}

	/*
	 * @Test public void snacksPassesAllSnacks() { ModelAndView modelAndView =
	 * controller.snacks();
	 * assertTrue(modelAndView.getModel().containsKey("snacks")); }
	 */
	/*
	 * @Test public void snackPassesASnack() { ModelAndView modelAndView =
	 * controller.snack(1);
	 * assertTrue(modelAndView.getModel().containsKey("snack")); }
	 */
}
