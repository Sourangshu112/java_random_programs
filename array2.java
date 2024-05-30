public class array2
{
    public void calculate()
    {
        float marks [] [] = {{40,40,40},{50,50,50},{70,70,70},{80,80,80}};
        float total [] = new float [4];
        char grade [] = new char [4];
        float avg;
        int i,j;
        for(i=0;i<4;i++)
        {
            total[i] = 0;
            for(j=0;j<3;j++)
                total[i] += marks[i][j];
            avg = total[i]/3;
            if(avg < 45.0)
               grade[i]='D';
            else if(avg < 60.0)
               grade[i]='C';
            else if(avg < 70.0)
               grade[i]='B';
            else
               grade[i]='A';
        }
        for(i=0;i<4;i++)
        {
            System.out.println("Student"+(i+1));
            System.out.println("Total marks = "+total[i]);
            System.out.println("\tGrade = "+grade[i]);
        }
    }
}    