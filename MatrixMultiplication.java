import java.util.Scanner;
 
class MatrixMultiplication
{
	public void display(int r,int c,int arr[][])
	{
		int modify[][]=arr;
		for(int i=0;i<r;++i)
			{
			for(int j=0;j<c;++j)
				{
					System.out.print(modify[i][j] + "\t");
				}
				System.out.println();
			}
	}
	
   public static void main(String args[])
   {
      int m, n, p, q, sum = 0, c, d, k;
	  MatrixMultiplication ob=new MatrixMultiplication();
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of first matrix");
      m = in.nextInt();
      n = in.nextInt();
 
      int first[][] = new int[m][n];
 
      System.out.println("Enter elements of first matrix");
 
      for (c = 0; c < m; c++)
         for (d = 0; d < n; d++)
            first[c][d] = in.nextInt();
 
      System.out.println("Enter the number of rows and columns of second matrix");
      p = in.nextInt();
      q = in.nextInt();
	  int second[][] = new int[p][q];
	  System.out.println("Enter elements of second matrix");
          for (c = 0; c < p; c++)
            for (d = 0; d < q; d++)
               second[c][d] = in.nextInt();
      if (first[0].length !=second.length )
         System.out.println("The matrices can't be multiplied with each other.");
      else
      {		
			System.out.println("First Matrix");
			ob.display(m,n,first);
			System.out.println("Second Matrix");
			ob.display(p,q,second);
         int multiply[][] = new int[m][q];
         for (c = 0; c < m; c++)
         {
            for (d = 0; d < q; d++)
            {  
               for (k = 0; k < p; k++)
               {
                  sum = sum + first[c][k]*second[k][d];
               }
 
               multiply[c][d] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Product of the matrices:");
 
         for (c = 0; c < m; c++)
         {
            for (d = 0; d < q; d++)
               System.out.print(multiply[c][d]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}