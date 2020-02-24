package com.exceptions;
import java.lang.reflect.*;
class Sample
{
private String messageTxt="Welcome";
}

class Order
{
public static void main(String [] args) throws Exception
{
	System.setSecurityManager(new SecurityManager());
	Class sClass=Sample.class;
	Field messageField=sClass.getDeclaredField("messageTxt");
	messageField.setAccessible(true);
	System.out.println("messageText= "+messageField.get(new Sample()));
}
}