package PFPack;
import PersonPack.Person;
import FlatPack.Flat;
import java.util.*;
import java.lang.*;
public class PFDemo
{
	public static void main(String args[])
	{
		Person p;
		Flat ff;
		int pn,fn,nob;
		String name,aname;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Person ID No : ");
		pn=sc.nextInt();
		System.out.print("Enter Name : ");
		name=sc.next();
		System.out.print("Enter Apartment Name : ");
		aname=sc.next();
		System.out.print("Enter Flat Number : ");
		fn=sc.nextInt();
		System.out.print("Enter Number of Bedrooms : ");
		nob=sc.nextInt();
		System.out.println("\n\n");
		ff=new Flat(aname,fn,nob);
		p=new Person(pn,name,ff);
		p.displayownershipinfo(pn);
	}
}
