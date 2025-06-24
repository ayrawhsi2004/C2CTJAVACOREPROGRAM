
	package com.tnsif.dayeight.interfaces.instanceofinterface;
	public class ProjectFactory{
	public static Phone createPhone(String company) {
	if (company.equalsIgnoreCase("Samsung"))
		return new Samsung ();
	
	else if (company.equalsIgnoreCase("Jio"))
	return new Jio();
	return null;
	
		}

	
	}

