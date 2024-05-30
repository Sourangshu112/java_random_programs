import java.util.Scanner;
public class SirtestQ2
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sent = sc.nextLine();
        int n = sent.length();
        int countW = 1,countL =0;
        for(int i=0;i<n;i++)
           if(sent.charAt(i) == ' ')
              countW++;
        for( int j=0;j<n;j++)
        {
            if(sent.charAt(j) == ' ')
                continue;
            else
               countL++;
        }
        System.out.println("No.of Words "+countW);
        System.out.println("No.of Letters "+countL);
    }
}