import java.io.*;
class Q5
{
	public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int arr[]= new int[10];
	System.out.println(" Enter the numbers ");
	for (int i=0;i<arr.length;++i)
		arr[i]=Integer.parseInt(br.readLine());
	System.out.print(" Enter the number to be checked with: ");
	int n=Integer.parseInt(br.readLine());
	int less=0,high=0,equal=0;
	for (int j=0; j<10 ; ++j)
	{
		if ( arr[j] < n )
			less++;
		else if(arr[j] > n)
			high++;
		else
			equal++;
	}
	System.out.println(" Less = "+less+"\nHigh = "+high+"\nEqual = "+equal);
}
}

	