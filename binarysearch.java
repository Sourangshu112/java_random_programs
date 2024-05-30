import java.util.Scanner;
public class binarysearch
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n  = sc.nextInt();
        System.out.println("enter 20 no. is assending order");
        int a[] = new int[n];
        for(int i = 0; i < n ; i++)
           a[i] = sc.nextInt();
        int beg,end,mid,flag =0,s;
        beg = 0;
        end = n-1;
        mid=0;
        System.out.println("enter the no. to be searched");
        s = sc.nextInt();
        while(beg <= end)
        {
            mid = (beg+end)/2;
            if(s < a[mid])
               end = mid-1;
            else if(s > a[mid])
               beg = mid+1;
            else
            {    
                flag =1;
                break;
            }
        }
        if(flag == 1)
        System.out.println("Seach element " +a[mid]+" is in "+(mid+1)+" position");
        else
        System.out.println("Element not found");
    }
}