import java.io.*;
class Q14
{
	public void again()throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number again : ");
		int c=Integer.parseInt(b.readLine());
		System.out.println("The number's value is : " + c);
	}

	
public static void main(String args[])throws IOException
{
	Q14 o=new Q14();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a,b,n,num;
	try
	{
		System.out.print("Enter first number : ");
		a=Integer.parseInt(br.readLine());
		num=a;
		while(num!=0)
		{
			n=num%10;
			if(n<0||n>9)
			{
				throw new NumberFormatException();
			}
			num=num/10;
		}
		System.out.println("First number's value is : "+ a);
	}
	catch(NumberFormatException ex)
	{
		System.out.println(ex.getMessage());
		System.out.println("Number format wrong...Input must be between 0-9."+ex);
		o.again();
	}
	try
	{
		System.out.print("Enter second number : ");
		b=Integer.parseInt(br.readLine());
		num=b;
		while(num!=0)
		{
			n=num%10;
			if(n<0||n>9)
			{
				throw new NumberFormatException();
			}
			num=num/10;
		}
		System.out.println("Second number's value is : "+ b);
	}
	catch(NumberFormatException ex)
	{
		System.out.println("Number format wrong...Input must be between 0-9."+ex);
		System.out.println(ex.getMessage());
		o.again();
	}
}
}


