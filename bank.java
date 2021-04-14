import java.util.*;
class AccountOpen
{
	String name;
	int accno;
	double balance;
	void new1(String nm,int an,double bal)
	{
		name=nm;
		accno=an;
		balance=bal;
	}
	void deposit(double amt)
	{
		balance=balance+amt;
		System.out.println("Amount deposited="+amt);
	}
	void withdraw(double amt)
	{

		balance=balance-amt;
		System.out.println("Withdrawl amount="+amt);
		
	}
	void balance()
	{
		System.out.println("Balance="+balance);
	}
}
public class bank
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Axis Bank");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Acc no,Name,Initial amount");
		int a;
		String b;
		double c;
		a=sc.nextInt();
		b=sc.next();
		c=sc.nextDouble();
		AccountOpen ac=new AccountOpen();
		ac.new1(b,a,c);
		System.out.println("You have successfully created account in this bank");
		int genpin;
		int n,m;
		double amt;
		System.out.println("Please Generate your atm pin");
		genpin=sc.nextInt();
		System.out.println("Your pin is generated successfully");
		System.out.println("Welcome to ATM");
		System.out.println("Please insert your card");
		System.out.println("Enter your choice:");
		System.out.println("1)card inserted");
		System.out.println("2)card not inserted");
		m=sc.nextInt();
		switch(m)
		{
			case 1:System.out.println("Card entered successfully");break;
			case 2:System.out.println("Card not inserted properly,Retry");System.exit(0);
		}
		int pin;
		System.out.println("Please enter your Pin Number:");
		pin=sc.nextInt();
		if(pin==genpin)
		{
			System.out.println("Enter your choice:");
			System.out.println("1)Deposit");
			System.out.println("2)Withdrawl");
			System.out.println("3)Balance");
			n=sc.nextInt();
			while(n<=4)
			{
				switch(n)
				{
					case 1:System.out.println("Enter the amount to deposit:");
				  		    ac.deposit(amt=sc.nextInt());
				  		    System.out.print(ac.balance);
				  		    break;
			    	case 2:System.out.println("Enter the amount to withdraw:");
					   	    ac.withdraw(amt=sc.nextInt());
					   	    if(ac.balance<=1000)
								System.out.println("Insufficient Balance");
							else
								System.out.println(ac.balance);
					   	    break;
					case 3:System.out.println("Enter the amount to deposit:");
					        ac.balance();break;
					case 4:System.exit(0);
				}
				System.out.println("Enter your choice:");
				n=sc.nextInt();
			}
		}
		else
		{
			System.out.println("Pin number not matched");
		}
	}
}