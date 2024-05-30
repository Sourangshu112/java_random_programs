import java.util.Scanner;
class Selection
{
    public void exSelSort()
    {
        int A[] = new int[10];
        int Unsort[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int i, j, small, tmp, pos;
        System.out.println("Enter 10 numbers");
        for(i = 0 ; i < 10 ; i++)
             A[i] = sc.nextInt();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("The unsorted array -->");
        for(i=0 ; i < 10 ; i++)
             System.out.print(A[i] + " , ");
             
        for(i = 0; i < A.length ; i++)
        {
            small = A[i];
            pos = i;
            for(j = i + 1 ; j < (A.length - 1) ; j++)
            {
                if(A[j] < small)
                {
                    small = A[j];
                    pos = j;
                }
            }
            tmp = A[i];
            A[i] = A[pos];
            A[pos] = tmp;
        }
        
        System.out.println("");
        System.out.println("Array in increasing order is -->");
        for(i = 0 ; i < 10 ; i++ )
             System.out.print(A[i] + " , ");
    }
}