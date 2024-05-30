import java.util.Scanner;
public class Emirp
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a prime number");
        int a = sc.nextInt();
        int b = prime(a);
        if ( b == 0 )
            System.out.println("It is a emirp number");
        else
            System.out.println("It is not a emirp number");
    }
    public int prime(int n)
    {
        int n2 = n;
        int d,q,rnum =0;
        while(n2 > 0)
        {
            q = n2/10;
            d = n2%10;
            rnum = rnum*10+d;
            n2=q;
        }
        int x;
        int l = rnum/2;
        for(x=2;x<=l;x++)
        {
            if(rnum % x == 0)
            break;
        }
        if(x>l)
          return 0;
        else
          return 1;
    }
}