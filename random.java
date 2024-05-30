public class random
{
    public void main()
    {
        int max = 90,min = 65;
        int range = max - min + 1;
        int rand = (int)(Math.random( )*range + min);
        char ch = (char)rand;
        System.out.print(ch);
        char bh = 'A',ah = 'A',dh = 'A',eh = 'A';
        for(;;)
        {
            if (rand == 72)
            break;
            else
            {
               for(int i = 1;i<=100000;i++);
               System.out.println("\f");
               rand = (int)(Math.random( )*range + min);
               ch = (char)rand;
               System.out.print(ch);
            }
        }
        for(;;)
        {
            if (rand == 69)
            break;
            else
            {
               for(int i = 1;i<=100000;i++);
               System.out.println("\f");
               rand = (int)(Math.random( )*range + min);
               bh = (char)rand;
               System.out.print(ch+" "+bh);
            }
        }
        for(;;)
        {
            if (rand == 76)
            break;
            else
            {
               for(int i = 1;i<=100000;i++);
               System.out.println("\f");
               rand = (int)(Math.random( )*range + min);
               ah = (char)rand;
               System.out.print(ch+" "+bh+" "+ah);
            }
        }
        for(;;)
        {
            rand = (int)(Math.random( )*range + min);
            if (rand == 76)
            break;
            else
            {
               for(int i = 1;i<=100000;i++);
               System.out.println("\f");
               rand = (int)(Math.random( )*range + min);
               dh = (char)rand;
               System.out.print(ch+" "+bh+" "+ah+" "+dh);
            }
        }
        for(;;)
        {
            if (rand == 79)
            break;
            else
            {
               for(int i = 1;i<=100000;i++);
               System.out.println("\f");
               rand = (int)(Math.random( )*range + min);
               eh = (char)rand;
               System.out.print(ch+" "+bh+" "+ah+" "+dh+" "+eh);
            }
        }
    } }
