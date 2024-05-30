public class libraryfunction4
{
     void main()
    {
        Short age = Short.valueOf("35");
        Integer salary = Integer.valueOf("2400");
        Float height = Float.valueOf("1.78");
        Double weight = Double.valueOf("72.6");
        double b = weight/(height*height);
        System.out.println(age+" takes home "+salary);
        System.out.println("bmi : " +b);
    }
}
