import java.util.*;
import java.lang.*;
public class Tech_number
{
    int no,count,result;
    String st;
    boolean truth;
    public void main()
    {
        no = input();
        count = coverting(in);
        result = operation(count,no);
        truth = check(result,no);
        if (truth == true)
            System.ou.println("It is a tech number");
        else
            System.ou.println("It is not a tech number");
    }
    public int input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which has a even number of digits");
        int a = nextInt();
        return a;
    }
    public String converting(int b)
    {
         String st_temp = Integer.ToString(b);
         int c = st_temp.length();
         return c;
    }
    public int operation(int d,int e)
    {
        int f,g,h=0,i;
        int tempo = 1;
        int split = d/2;
        for(int j = 1; j <= d; j++)
        {
            tempo = tempo * 10;
        }
        while(split != 0)
        {
            f = e/tempo;
            g = e%tempo;
            e = g;
            split --;
            h = h*10+f;
        }
        i =(e + h)*(e + h);
        return i;
    }
    public boolean check(int k,int l)
    {
        if (k == l)
            return true;
        else
            return false;
    }
}