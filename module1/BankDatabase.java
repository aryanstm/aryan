package module1;
import java.util.Scanner;

public class BankDatabase {
	private double amount;
	void deposit(double amount) {
		this.amount=this.amount+amount;
		
	}
	void withdraw(double amount)
	{
		if(amount>this.amount)
		{
			System.out.println("insufficient fund");
			
		}
		else
		{
			this.amount=this.amount-amount;
		}
	}
	double balanceAmount() {
		return this.amount;
	}
public static void main(String[] args)
{
	BankDatabase b= new BankDatabase();
	int n;
	Scanner sc= new Scanner(System.in);
	
	while(true)
	{
		System.out.println("Enter your choice: 1.Deposit,2.Withdraw,3.TotalBalance.4.For Exit");
		n=sc.nextInt();
		if(n==1) {
			System.out.println("Enter amount that you want to deposit");
			double amount=sc.nextDouble();
			b.deposit(amount);
		}
		else if(n==2) {
			System.out.println("Enter amount that you want to withdraw");
			double amount=sc.nextDouble();
			b.withdraw(amount);
		}
		else if(n==3)
		{
			
			System.out.println("total balance at this time is: "+ b.balanceAmount() );
			
		}
		else if(n==4)
		{
			break;
		}
		else
		{
			System.out.println("invalid choice");
		}
	}
}
}
