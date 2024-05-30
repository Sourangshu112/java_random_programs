import java.util.Scanner;
public class SirtestQ3
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of students");
        int n = sc.nextInt();
        String name[] = new String[n];
        int totalmarks[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of student");
            name[i] = sc.next()+sc.nextLine();
            System.out.println("Enter total marks of the student");
            totalmarks[i] = sc.nextInt();
        }
        double avg=0,sum=0;
        for(int i=0;i<n;i++)
            sum += totalmarks[i];
        avg = sum/n;
        System.out.println("Average marks of "+n+" students are "+avg);
        
        for(int i=0;i<n;i++)
        {
            double dev[] = new double[n];
            dev[i] = avg-totalmarks[i];
            System.out.println("Deviation of "+name[i]+" is "+dev[i]);
        }
    }
}