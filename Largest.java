import java.io.*;
class Largest
{
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int h=0;
	System.out.print("Enter a limit: ");
	int n=Integer.parseInt(br.readLine());
	for (int i=0; i<=n-1; ++i)
	{
			System.out.print("Enter a number: ");
			int a=Integer.parseInt(br.readLine());
			if(a>h)
				h=a;
	}
	System.out.println("The highest number is : " + h);
}
}

	