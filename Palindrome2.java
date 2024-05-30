import java.util.Scanner;
public class Palindrome2
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a multidigit number");
        int a = sc.nextInt();
        int c = reverse(a);
        if (c == a)
        System.out.println("It is a palindrome number");
        else
        System.out.println("it is not a palindrome number");
    }
    public int reverse(int n)
    {
        int d,q,r=0;
        while(n>0)
        {
            q=n/10;
            d=n%10;
            r=r*10+d;
            n=q;
        }
        return r;
    }
}
