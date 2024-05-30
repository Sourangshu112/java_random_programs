import java.util.Scanner;
public class ifstatement
{
   public void main()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a character");
       char ch = sc.next().charAt(0);
       if (ch == 'R')
       System.out.println("Ram  Mohan Mission High School");
    }
}
