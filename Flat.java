package FlatPack;
public class Flat
{
	String aname;
	int fno,nob;
	public Flat()
	{
		aname=null;
		fno=0;
		nob=0;
	}
	public Flat(String a,int b,int c)
	{
		aname=a;
		fno=b;
		nob=c;
	}
	public void displayflatinfo()
	{
		System.out.println("Apartment Name : "+aname);
		System.out.println("Flat Number : "+fno);
		System.out.println("Number of Bedrooms : "+nob);
	}
}