package com.tnsif.dayeight.interfaces.instanceofinterface;

public class Executor {

public static void main (String[] args)	{	
Phone p1=ProjectFactory.createPhone("Samsung");
p1.call();
p1.sms();
p1=ProjectFactory.createPhone("Jio");
p1.call();
p1.sms();

}
}