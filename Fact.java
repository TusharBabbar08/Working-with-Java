import java.util.*;
class Fact
{
	public int fact(int x)
	{	
		if(x==1)
			return 1;
		else
		{
			return fact(x-1)*x;
		}
	}
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		Fact r=new Fact();
		int y=r.fact(5);
		System.out.print(y);
	}
}