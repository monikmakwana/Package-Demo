package PersonPack;
import FlatPack.*;
import java.util.*;
import java.lang.*;
public class Person
{
	int pidno;
	String name;
	Flat f;
	Person()
	{
		pidno=0;
		name=null;
		f=null;
	}
	public Person(int x,String y,Flat z)
	{
		pidno=x;
		name=y;
		f=z;
	}
	public void display()
	{
		System.out.println("Person ID Number : "+pidno);
		System.out.println("Name : "+name);
		f.displayflatinfo();
	}
	public void displayownershipinfo(int a)
	{
		if(pidno==a)
		{
			display();
		}
	}
}