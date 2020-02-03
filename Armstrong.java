import java.util.*;
import java.lang.Math;
class Q7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit of numbers : \n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
			arr[i]=sc.nextInt();
		int c=0;
		String x="";
		for (int j=0;j<n;++j)
		{
			int z=arr[j];
			x=Integer.toString(arr[j]);
			int copy=z;
			int sum=0;
			int len=x.length();
			for (int k=0;k<len;++k)
			{
				int a=copy%10;
				double result=Math.pow(a,3);
				sum=sum + (int)(result);
				copy = copy/10;
			}
			if(sum==z)
			{
				System.out.print( sum + " is Armstrong. \n");
				c++;
			}
		}
		System.out.println(" Total matches are : " + c );
	}
}

				
			