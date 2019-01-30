package com.BienCorp.SnackWorld.valueObjects;

import java.math.BigDecimal;

public class Snack
{
	long		id;
	String		name;
	BigDecimal	price;
	boolean		spicy;

	public Snack()
	{
	}

	public Snack(long id, String name, BigDecimal price, boolean spicy)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.spicy = spicy;
	}

	public Snack(String name, BigDecimal price, boolean spicy)
	{
		super();
		this.name = name;
		this.price = price;
		this.spicy = spicy;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public boolean isSpicy()
	{
		return spicy;
	}

	public void setSpicy(boolean spicy)
	{
		this.spicy = spicy;
	}

}
