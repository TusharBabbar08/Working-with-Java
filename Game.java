import java.util.*;
import java.lang.Math;
class Game
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 1 for Rock \n Enter 2 for Scissors \n Enter 3 for Paper : ");
    int ch=sc.nextInt();
    Random random = new Random();
    int rand = 0;
    int c=0,d=0;
    while(c!=3 && d!=3)
    {
    while (true)
    {
        rand = random.nextInt(4);
        if(rand !=0) break;
    }
        int a=rand;
    switch(ch)
    {
        case 1: if(a==1)
                 continue;
                if(a==2)
                {
                    System.out.println("You win this chance ----- Rocks beats Scissors.  ");
                    ++c;
                }
                if(a==3)
                {
                    System.out.println("You lost this chance ---- Paper beats Rock.  ");
                    ++d;
                }
                break;
        case 2: if(a==1)
                {
                    System.out.println("You lost this chance ---- Rock beats Scissors.  ");
                    ++d;
                }
                if(a==2)
                    continue;
                if(a==3)
                {
                    System.out.println("You win this chance ----- Scissors beats Paper.  ");
                    ++c;
                }
                break;
        case 3: if(a==1)
                {
                    System.out.println("You won this chance ---- Paper beats Rock.  ");
                    ++c;
                }
                if(a==2)
                {
                        System.out.println("You lost this chance ----- Scissors beats Paper.  ");
                    ++d;
                }
                if(a==3)
                    continue;
                    break;
    }
    }
        
    if(c>d)
        System.out.println("You Destroyed the Computer . \n All hail Rock/Paper/Scissors  Champion.......");
    else
        System.out.println("Dont worry buddy , we will beat the Computer next time.");
}
}
