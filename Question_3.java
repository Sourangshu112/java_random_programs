import java.util.Scanner;
public class Question_3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char a[] = new char[10];
        System.out.println("Enter 10 characters");
        for(int i=0 ; i<10 ; i++)
             a[i] = sc.next().charAt(0);
        //uppercase
        int c1=0,c2=0;
        for(int i=0 ; i<10 ; i++)
        {     
            if(Character.isUpperCase(a[i]))
                c1++;
        }
        System.out.println("There are " +c1+" no. of uppercase letters");
        //vowels
        for(int i=0 ; i<10 ; i++)
        {     
            if(a[i]=='A' || a[i]=='E'|| a[i]=='I'|| a[i]=='O'|| a[i]=='U'|| a[i]=='a'|| a[i]=='e'|| a[i]=='i' || a[i]=='o' || a[i]=='u')
                c2++;
        }
        System.out.println("There are " +c2+" no. of vowels letters");
    }
}