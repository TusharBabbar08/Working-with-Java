import java.io.*;
class ExeptionHandler
{
	public static void main(String[] args)
	 {
	 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 	try
	 	{
	 		
	 		Charlie();
	 		Delta();
	 		Aplha();
	 		Bravo();


	 	}
	 	catch(ArithmeticException ae)
	 	{
	 		System.out.println(ae.getMessage());
	 	}
	 	catch(IOException ioe)
	 	{
	 		System.out.println(ioe);
	 		System.out.println(ioe.getMessage());
	 	}
	 	catch(NumberFormatException nfe)
	 	{
	 		System.out.println(nfe.getMessage());
	 	}
	 	catch(StringIndexOutOfBoundsException sioe)
	 	{
	 		System.out.println(sioe.getMessage());
	 	}
		
	}
	static void Charlie()throws ArithmeticException
	{
		throw new ArithmeticException("/ by zer0");
	}
	static void Delta()throws IOException
	{
		throw new IOException(" Wrong Input");
	}
	static void Aplha()throws NumberFormatException
	{
		throw new NumberFormatException(" String cannot be type casted to int"); 
	}
	static void Bravo()throws StringIndexOutOfBoundsException
	{
		throw new StringIndexOutOfBoundsException("Wrong Length");
	}
}