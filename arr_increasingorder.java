import java.util.Scanner;
public class arr_increasingorder
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int unsort[] = new int[10];
        int i, c, tmp ,pos=0 ,small;
        
        //input in array
        System.out.println("Enter 10 numbers");
        for(i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        //sorting in array
        for(i = 0; i < arr.length; i++)
        {
            for(c = i + 1; c < (arr.length - 1); c++)
            {
                small = arr[i];
                pos = i;
                if(arr[c] < small)
                {
                    small = arr[c];
                    pos = c;
                }
            }
            tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
        }
        
        //printing
        for(i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
