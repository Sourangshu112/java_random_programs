import java.util.Scanner;
public class sirtestQ1
{
    public void main()
    {
        double temp[] = new double[20];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<20;i++)
        {
            System.out.println("Enter a temp in degree farenheiht");
            temp[i]=sc.nextDouble();
        }
        //conversion
        double tempC[] = new double[20];
        for(int i=0;i<20;i++)
             tempC[i] = 5*(temp[i] - 32)/9;
        //print
        for(int i=0;i<20;i++)
        {
            System.out.print("temp in degree celcius -> ");
            System.out.println(tempC[i]);
        }
    }
}