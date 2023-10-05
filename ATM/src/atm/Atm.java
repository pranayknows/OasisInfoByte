package atm;

import java.util.Scanner;

public class Atm {
     
	public static int IntegerInput(int limit){
		int input = 0 ;
		boolean flag = false ;
		while (!flag){
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				flag = true ;	
				if ( flag && input > limit || input < 1){
					System.out.println("choose the number between 1 to " + limit);
					flag = false;
					
				}
				
			}catch(Exception e){
				System.out.println("Enter only Integer value ");
				flag = false;
			}
			
		};
		
		return input;
	}
		public static void main(String[] args) {
			System.out.println("\n-----Welcome to ATM System ---\n");
			System.out.println("1.Register\n2.Exit");
			System.out.println("choose the options-");
			int choice=IntegerInput(2);
			
			if(choice==1)
			{
				Bankaccount BA = new Bankaccount();
				BA.registration();
				while(true)
				{
					System.out.println("\n1.Login\n2.Exit");
					System.out.println("Choose the options for login and exit");
					int c=IntegerInput(2);
					if(c==1) {
						if(BA.login()) {
							System.out.println(" \n*****Welcome Back "+BA.accountName+"*****");
							boolean isCompleted = false;
							while(!isCompleted) {
								System.out.println("\n1.TransactionsHistory \n2.Withdraw \n3.Depsoit \n4.Transfer \n5.BalanceEnquiry \n6.Quit ");	
								System.out.print("Enter Your Choice - ");
								int a = IntegerInput(6);
								switch(a) {
								case 1:
									BA.TransactionsHistory();
									break;
								case 2:                                                         
									BA.Withdraw();
									break;
								case 3:
									BA.Depsoit();
									break;
								case 4:
									BA.Transfer();
									break;	
								case 5:
									BA.BalanceEnquiry();
									break;	
								case 6:
									System.out.println("\nThankyou !");
									System.exit(0);
								}
								}
							}
						}
					else{
						System.out.println("Thankyou!");
						System.exit(0);
					}
					
					}
				}
			else {
				System.out.println("Thankyou!");
				System.exit(0);
				
			}
			}
	
}
