import java.util.*;
import java.lang.Math;
class Prime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number you want to check for Prime: ");
		int p=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=p/2;++i)
		{
			if(p%i==0)
			{
				flag=false;
				break;
			}
			else
				continue;
		}
		if(flag==true)
			System.out.println(" "+p+" is a Prime Number.");
		else
			System.out.println(" "+p+" is not a Prime Number.");
		
	}
}