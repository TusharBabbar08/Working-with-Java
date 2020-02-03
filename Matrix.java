import java.util.*;
import java.lang.Math;
class Matrix
{
int[][] mat;
int rows, cols;

public Matrix(int r, int c)
{
	rows=r;
	cols=c;
	mat=new int[rows][cols];
	System.out.println("Taking Input as elements from the user");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<rows;++i)
		for(int j=0;j<cols;++j)
			this.mat[i][j]=sc.nextInt();
}

public void show()
{
	System.out.println("Displaying the matrix");
	for(int i=0;i<rows;++i){
		for(int j=0;j<cols;++j)
		{ 
			System.out.print(this.mat[i][j]+"\t");
		}
		System.out.println();
	}
}

public boolean isSparse()
{	
	int c=0;
	for(int i=0;i<rows;++i){
		for(int j=0;j<cols;++j){
			if(this.mat[i][j]==0)
				++c;
			else
				continue;
		}
	}
	if(c > (rows*cols)/2)
		return true;
	else
		return false;
	}
			
public static void main(String args[])
{	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the dimensions for the matrix");
	int r1= s.nextInt();
	int c1=s.nextInt();
	Matrix m1=new Matrix(r1,c1);
	m1.show();
	boolean x= m1.isSparse();
	if(x==true)
		System.out.println("The matrix is a Sparse Matrix");
	if(x==false)
		System.out.println("Not a Sparse matrix ");
		

}


}

	