import java.io.*;
import java.util.*;
class Q17
{
String rollno,name;
int m1,m2,m3;
double avg;

public void FileWriter()throws IOException
{
FileWriter f1=new FileWriter("Data1.txt",true);
StringBuffer str= new StringBuffer("\n___Student Details___");
str.append("\nRoll No: "+rollno);
str.append("\nName: "+name);
str.append("\nMarks1: "+m1);
str.append("\nMarks2: "+m2);
str.append("\nMarks3: "+m3);
str.append("\nAverage : "+avg);

	 
f1.write(str.toString());
f1.close();
}
	 
public void FileReader(String rn)throws IOException
{
FileReader f2=new FileReader("Data1.txt");
StringBuffer str= new StringBuffer("");
int i;
while((i=f2.read())!=-1)
     str.append((char)i);

f2.close();
find(str.toString(),rn);
}
public static void find(String str,String rn)
{
	String line[]=str.split("\\r?\\n");
	for(int i=1;i<line.length;i+=7)
	{
		if(!rn.equals(line[i++]))
		{
			i+=4;
			continue;
		}
		else
		{
			System.out.print("Roll Number: ");
			System.out.println(rn);
			System.out.print("Name: ");
			System.out.println(line[i++]);
			int mk1=Integer.parseInt(line[i++]);
			int mk2=Integer.parseInt(line[i++]);
			int mk3=Integer.parseInt(line[i++]);
			Avg(mk1,mk2,mk3);
		}
	}
}
public static void Avg(int a,int b,int c)
{
	System.out.println("Average Marks: "+ (a+b+c)/3.0);
}

public void Input()
{
Scanner sc=new Scanner(System.in);
System.out.print("\n Student Details");
System.out.print("\nRoll no: " );
this.rollno=sc.nextLine();
System.out.print("\nName: " );
this.name=sc.nextLine();
System.out.print("\nMarks1: ");
this.m1=sc.nextInt();
System.out.print("\nMarks2: ");
this.m2=sc.nextInt();
System.out.print("\nMarks3: ");
this.m3=sc.nextInt();
this.avg=(m1+m2+m3)/3.0;
System.out.print("Average Marks: "+this.avg);


}

public static void main(String args[])throws IOException
{
Q17 obj=new Q17();
obj.Input();
obj.FileWriter();
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter roll number to find marks: ");
String sk=sc.nextLine();
obj.FileReader(sk);
}
}

