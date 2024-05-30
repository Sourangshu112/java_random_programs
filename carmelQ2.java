import java.util.Scanner;
public class carmelQ2
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        String s;
        char v[] = {'a','e','i','o','u'};
        System.out.println("Enter a string");
        s = sc.nextLine();
        int i,j,n,flag = 0;
        String temp ="";
        n = s.length();
        for(i = 0;i < n;i++)
        {
            for(j = 0; j < 5; j++)
            {
                if(s.charAt(i) == v[j])
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                temp = temp+s.charAt(i);
            flag =0;
        }
        System.out.println(temp);
    }
}