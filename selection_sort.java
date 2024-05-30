import java.util.Scanner;
public class selection_sort
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int k=0 ; k<n ; k++)
        {
            System.out.println("Enter an integer");
            a[k] = sc.nextInt();
        }
        //selection sorting
        int i,j,tmp,pos,small;
        for(i=0 ; i<n ; i++)
        {
            small = a[i];
            pos = i;
            for(j=(i+1) ; j<n ; j++)
            {
                if(a[j] < small)
                {
                    small = a[j];
                    pos = j;
                }
            }
            tmp = a[i];
            a[i] = a[pos];
            a[pos] = tmp;
        }
        //output
        System.out.println("Assending order :- ");
        for(int k=0 ; k<n ; k++)
        {
            System.out.print(a[k]+" ,");
        }
    }
}