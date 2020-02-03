import java.io.*;
interface Rectangle
{
	void rectarea(double l, double b);
}
interface Triangle
{
	void triarea(double b,double h);
}
class Multiple implements Rectangle,Triangle
{
	double rec,tri;
	public void rectarea(double l, double b)
	{
		rec=l*b;
		System.out.println("Area of rectangle is : " + rec);
	}
	
	public void triarea(double b, double h)
	{
		tri=0.5*h*b;
		System.out.println("Area of triangle is : " + tri);
	}
}
class Q10
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double l,b;
		System.out.print("Enter the length of rectangle : ");
		l=Double.parseDouble(br.readLine());
		System.out.print("Enter the breadth of rectangle : ");
		b=Double.parseDouble(br.readLine());
		Rectangle ob=new Multiple();
		ob.rectarea(l,b);
		double base,ht;
		System.out.print("Enter the height of triangle : ");
		ht=Double.parseDouble(br.readLine());
		System.out.print("Enter the base of triangle : ");
		base=Double.parseDouble(br.readLine());
		Triangle ob1=new Multiple();
		ob1.triarea(base,ht);
	}
}

	