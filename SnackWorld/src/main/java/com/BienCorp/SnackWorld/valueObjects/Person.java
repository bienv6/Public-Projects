package com.BienCorp.SnackWorld.valueObjects;

public class Person
{
	private String	firstName;
	private String	lastName;
	private int		numberOfChildren;
	private boolean	married;
	private Address	address;

	public Person()
	{

	}

	public Person(String firstName, String lastName, int numberOfChildren, boolean married, Address address)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberOfChildren = numberOfChildren;
		this.married = married;
		this.address = address;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setNumberOfChildren(int numberOfChildren)
	{
		this.numberOfChildren = numberOfChildren;
	}

	public int getNumberOfChildren()
	{
		return numberOfChildren;
	}

	public boolean isMarried()
	{
		return married;
	}

	public void setMarried(boolean married)
	{
		this.married = married;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

}
