import java.io.*;
class Q6
{
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int arr[]=new int[5];
	int sum=0;
	System.out.println(" Enter the 5 values ");
	for (int i=0;i<arr.length;++i)
		arr[i]=Integer.parseInt(br.readLine());
	for(int j=0;j<5;++j)
		sum +=arr[j];
	double avg = sum/5.0;
	int c=0;
	System.out.println(" The avg is : " + avg);

	System.out.println(" The following values are greater than the calculated avg : ");
	for (int k=0;k<5;++k)
	{
		if(arr[k]>avg)
		{
			++c;
			System.out.println(arr[k]);
		}
	}
	System.out.print("\n \t"+c+" values are greater than the avg.");
}
}
