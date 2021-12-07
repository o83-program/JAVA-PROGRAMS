import java.util.Scanner;
import java.lang.Math;
class Bank
{
    String name;
    int acc_no;
    float bal,si;
    void accept()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println();
        System.out.println("enter the name of the account holder:");
        name=scan.nextLine();
        System.out.println("enter the account number:");
        acc_no=scan.nextInt();
        System.out.println("enter the account balance:");
        bal=scan.nextFloat();
    }
    void display()
    {
        System.out.println();
        System.out.println("details");
        System.out.println("Name:"+name+"\n Account number:"+acc_no+"\n balance"+bal);
    }
    void deposit()
    {
        System.out.println();
        Scanner scan=new Scanner(System.in);
        System.out.println("do you want to deposit yes or no?:");
        int d=scan.nextInt();
        if(d==1)
        System.out.println("enter the amount to be deposited:");
        int amt=scan.nextInt();
        bal=bal+amt;
        System.out.println("availabe balance:"+bal);
    }
}
    class Current extends Bank
    {
        float service_charge=100;
        void cheque()
        {
            System.out.println("\n cheque service is availabe");
        }
        void withdrawal()
        {
            float amount;
            Scanner Scan=new Scanner(System.in);
            System.out.println("minimum balance=rs10000");
            System.out.println("enter the amount to be withdrwan");
            amount=Scan.nextFloat();
            if(amount>bal)
            {
                System.out.println("balance id insufficient");
            }
                else
                {
                    bal=bal-amount;
                }
                    if(bal<10000)
                    {
                        bal=bal-service_charge;
                        System.out.println("service charge is added"+service_charge);
                        System.out.println("available balance is:"+bal);
                        
                    }
                    else
                    {
                        System.out.println("withdrawal"+amount);
                        System.out.println("available balance="+bal);
                    }
                
                
            }
        
    }
    class Savings extends Bank
    {
        void cheque()
        {
            System.out.println("\n no cheque services:");
        }
        void simple_interest()
        {
            System.out.println();
            Scanner Scan=new Scanner(System.in);
            System.out.println("enter the rate of interest");
            int r=Scan.nextInt();
            System.out.println("enter the number of times interest applied");
            int n=Scan.nextInt();
            System.out.println("enter the time:");
            int t=Scan.nextInt();
            si=bal*(1+(r/n));
            System.out.println("simple interest is:"+(Math.pow(si,n*t)));
            
        }
        void withdrawal()
        {
            float amount;
            Scanner Scan=new Scanner(System.in);
            System.out.println("no minimum balance required");
            System.out.println("enter the amount to be withdrawn:");
            amount=Scan.nextFloat();
            if(amount>bal)
            System.out.println("balance insufficient");
            else
            {
                bal=bal-amount;
                System.out.println("withdrawal" +amount);
                System.out.println("\n available balance:");
                
            }
        }
        
    }
    public class Main
    {
        public static void main(String args[])
        {
            Savings obj1=new Savings();
            Current obj2=new Current();
            System.out.println("1 savings");
            System.out.println("2 current");
            System.out.println("enter your choice:");
            Scanner Scan=new Scanner(System.in);
            int ch=Scan.nextInt();
            switch(ch)
            {
                case 1:obj1=new Savings();
                        obj1.accept();
                        obj1.display();
                        obj1.cheque();
                        obj1.deposit();
                        obj1.simple_interest();
                        obj1.withdrawal();
                        break;
                case 2:obj2=new Current();
                        obj2.accept();
                        obj2.display();
                        obj2.cheque();
                        obj2.deposit();
                        obj2.withdrawal();
                        break;
                        default:System.out.println("\n invalid input");
            }
        }
    }
            