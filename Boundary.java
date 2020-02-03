import java.util.*;
class Boundary
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("\nEnter the Dimension of the matrix\n:");
	int m=sc.nextInt();
	int n=sc.nextInt();
	int sum=0,c=0;
	int a[][]=new int[m][n];
	System.out.print("\n__Boudary__\n\n");
	for(int i=0;i<m;++i)
	{
		for(int j=0;j<n;++j)
		{
			if(i==0||i==m-1||j==0||j==n-1)
				{
					a[i][j]=++c;
					sum+=a[i][j];
				}
				else
					a[i][j]=0;
		}
	}
	for(int i=0;i<m;++i)
	{
		for(int j=0;j<n;++j)
		{
			System.out.print(a[i][j]+"  ");
		}
	System.out.println();
	}
	System.out.println();
System.out.println("The sum of border elements is: "+sum+"\n");

}
}
