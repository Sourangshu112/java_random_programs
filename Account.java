public class Account
{
    double balance;
    int acctno;
    void getValues(int acno,double bal)
    {
        acctno = acno;
        balance = bal;
    }
    double calcInterest(double rate, double bal)
    {
        double intr = (bal*rate*1)/100;
        return intr;
    }
    /*
    void updateBalance(double amt,double rate)
    {
        double intrst = calcInterest(rate,amt);
        System.out.println("Initial balance :"+amt);
        amt = amt + intrst;
        System.out.println("Interest earned :"+intrst);
        System.out.println("Updated balance :"+amt);
    }
    */
    void updateBalance(Account ac,double rate)
    {
        double intrst = calcInterest(rate,ac.balance);
        System.out.println("Initial balance :"+ac.balance);
        ac. balance = ac.balance + intrst;
        System.out.println("Interest earned :"+intrst);
        System.out.println("Updated balance :"+ac.balance);
    }
    void display()
    {
        System.out.println("Account No :"+acctno);
        System.out.println("Balance :"+balance);
    }
    public static void main(String[] args)
    {
        Account ac1 = new Account();
        ac1.getValues(1203,34000);
        ac1.updateBalance(ac1,7.5);
        ac1.display();
    }
}
