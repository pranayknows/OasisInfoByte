package atm;

import java.util.Scanner;

public class Bankaccount {

	
	String accountName;
	String accountNumber;
	String userName;
	String password;
	float  balance = 20000f;
	int  transactions=0;
	String transactionHistory="";
	
	
	private static int IntegerInput(int i) {
		
		return 0;
	}
	public void registration() {
		System.out.println("Enter your name :");
		Scanner s = new Scanner(System.in);
		this.accountName=s.nextLine();
		
		System.out.println("Enter Your Account Number for registration");
		this.accountNumber=s.nextLine();
		
		System.out.println("set Username :");
		this.userName=s.nextLine();
		
		System.out.println("set Password :");
		this.password=s.nextLine();
		
		System.out.println("Thankyou for registartion");
	}
	
	
	
	public void Withdraw() {
		System.out.println("Enter Amount to withdraw");
		Scanner s = new Scanner(System.in);

		float withdrawAmount=s.nextFloat();
		
		try {
			if(balance>withdrawAmount)
			{
				balance=balance-withdrawAmount;
				transactions++;
				System.out.println("Withdrawal successful");
				String p="Rs "+withdrawAmount+ " Withdrawed\n";
				transactionHistory = transactionHistory.concat(p);
			}
			else {
				System.out.println("/nInsufficient Balance ");
			}
		}
		catch(Exception e)
		{
			
		}
		
	}
	public void BalanceEnquiry() {
		System.out.println(" \n"+balance+ "Rs");
	}
	
	public boolean login() {
	boolean islogin = false ;
	Scanner  s = new Scanner(System.in);
	if(!islogin) {
		
	    int count =0;
		System.out.println("Enter your Username: ");
		String Username =s.nextLine();
		if(userName.equals(Username) && count<3)
    	{
	        while(!islogin) {
	        	System.out.println("Enter your Password : ");
	        	String Password =s.nextLine();
	        	if(password.equals(Password))
	        	{
	        		System.out.println("Login Successful");
	        		islogin=true;
	        	}
	        	else {
	        		System.out.println("Incorrect Password");
	        		count++;
	        	}
	        }
    	}
		else{
			System.out.println("Incorrect username");
			count++;
		}
	}
	return islogin;
	
	}
	public void Depsoit() {
		System.out.println("Enter Amount to deposit");
		Scanner s = new Scanner(System.in);
		float amount = s.nextFloat();
		try {
			if(amount<=100000f)
			{
				balance=balance+amount;
				System.out.println("Deposit Success");
				String st="Rs "+amount+ " Deposited \n";
				transactionHistory=transactionHistory.concat(st);
				
			}
			else {
				System.out.println("Sorry !! You can only deposit 100000 through atm ");
			}
		}catch(Exception e) {
			
		}
	}
		public void Transfer() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Receipent Name : ");
			String Receipent = s.nextLine();
			System.out.println("Enter Amount to Transfer : ");
			float amount = s.nextFloat();
			
			
			try {
				if(balance >=amount) {
					if(balance<=50000f)
					{
						transactions++;
						balance=balance-amount;
						System.out.println("Transfer succesful to "+Receipent);
						String st="Rs "+amount+" Transfer to "+Receipent +"\n";
						transactionHistory= transactionHistory.concat(st);
						
					}
				    else {
					System.out.println("You can transfer upto 50000.00 !!");
				    }
			}else {
				System.out.println("Insufficient Balanced !!");
			}
			
		}
			catch(Exception e) {
				
			}
		}
			
		 public void TransactionsHistory(){
				if(transactions == 0 ){
					System.out.println("Empty ");
					
				}else{
					System.out.println("\n " + transactionHistory);
					
				}
	}
}
