import java.util.*;
import java.lang.*;
class BankAccount
{
    private String Accountholdername;
    private String Accountnumber;
    private long balance;
    Scanner read=new Scanner(System.in);
    BankAccount(String Accountholdername,String Accountnumber,long balance)
    {
        this.Accountholdername=Accountholdername;
        this.Accountnumber=Accountnumber;
        this.balance=0;
        System.out.println("Account created successfully");
    }
    public void deposit()
    {
        System.out.print("Enter the amount to deposit:");
        long amount=read.nextLong();
        if(amount >0)
        {
            balance+=amount;
            System.out.println(amount+ " deposited. Current balance is "+balance+"/-");
        }
        else
        {
            System.out.println("Invalid amount. Enter a positive value");
        }   
    }
    public void withdraw()
    { 
        System.out.print("Enter the amount to withdraw:");
        long amount=read.nextLong();
        if(amount >0)
        {
            if(amount > balance)
            {
                System.out.println("Insufficient balance");
            }
            else
            {
                balance-=amount;
                System.out.println("With drew amount "+amount+" Current balance is:"+balance+"/-");
            }  
        }     
        else
        {
            System.out.println("Invalid amount. Enter a positive value");
        } 
    }
    public void display()
    {
        System.out.println("Account Holder: " + Accountholdername);
        System.out.println("Account Number: " + Accountnumber);
        System.out.println("Current Balance: " + balance+"/-");
    }    
}
class Main
{
    public static void main(String[] args)
    {       
        Scanner read=new Scanner(System.in);
        System.out.println("Enter account holder name:");
        String name=read.nextLine();
        System.out.println("Enter account number:");
        String accnum=read.nextLine();
        BankAccount b=new BankAccount(name,accnum,0);
        while(true)
        {
            System.out.println("-----Services provided-----");
            System.out.println("1.Deposit\n2.withdraw\n3.display\n4.exit");
            int choice=read.nextInt();
            if(choice==1)
            {
                b.deposit();
            }
            else if(choice==2)
            {
                b.withdraw();
            }
            else if(choice==3)
            {
                b.display();
            }
            else
            {
                break;
            }
        }
    }
}