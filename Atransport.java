import java.util.Scanner;
public class Atransport
{
    String name;//to store the name of the customer
    int w;//to store the weight of the parcel
    int charge;// to store total charge
    int m;// to update the weight
    Atransport()
    {
        name = "";
        w = 0;
        charge = 0;
        m = 0;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        name = sc.nextLine();
        System.out.println("Enter the weight of the parcel");
        w = sc.nextInt();
    }
    void calculate()
    {
        if(w <= 10)
        {
            m = w; 
            charge = m * 25;
        }
        else if(w > 10 && w <= 30)
        {
            m = w;
            m = m - 10;
            charge = (m * 20) + (10 * 25);
        }
        else
        {
            m = w;
            m = m - 10;
            m = m - 20;
            charge = (m * 10) + (20 * 20) + (10 * 25);
        }
        charge = charge + (charge * 5/100); //A surpass charge of 5%
    }
    void print()
    {
        System.out.println("Name \t Weight \t Bill amount");
        System.out.println("---- \t ------ \t -----------");
        System.out.println(name+"\t  "+w+"\t \t "+charge); 
    }
    public void main()
    {
        Atransport ob1 = new Atransport();
        ob1.accept();
        ob1.calculate();
        ob1.print();
    }
}