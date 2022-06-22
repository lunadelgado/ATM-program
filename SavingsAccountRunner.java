/**
 * Author:       Luna Delgado
 * Date:         xx/xx/xxxx
 * File:         SavingsAccountRunner.java
 * Description:  
 */
package assignment3;

import java.util.*;

/**
 * @author Owner
 *
 */
public class SavingsAccountRunner {

	public static void main (String[] args){
	
		Scanner input = new Scanner(System.in);
		
		int id, selection;
		double balance, annualIntRate, deposit;
		
		System.out.println("Welcome to your Savings Account App!b\n");
		
		System.out.println("Enter your account number: ");
		id = input.nextInt();
		
		System.out.println("Enter your initial balance: ");
		balance = input.nextDouble();
		
		System.out.println("Enter your annual interest rate: ");
		annualIntRate = input.nextDouble();
		
		SavingsAccount acc1 = new SavingsAccount(id, balance, annualIntRate);
		selection = 0;
		
		while (selection != 4) {
			
			System.out.println("\n\n==============================\n");
			System.out.println("=       OPTIONS BELOW        =");
			System.out.println("\n==============================\n");
			System.out.println("\n1. Deposit\n");		
			System.out.println("\n2. View Weekly Interest Rate\n");
			System.out.println("\n3. View Account Details\n");
			System.out.println("\n4. Exit\n");
			System.out.println("\nEnter your selection: ");
			selection = input.nextInt();
		
			if (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
				System.out.println("\nINVALID SELECTION - TRY AGAIN! \n");
			}
				else if (selection == 1) {
					System.out.println("\nEnter your deposit amount: ");
					deposit = input.nextDouble();
					while(deposit <=0) {
						System.out.println("\nInvalid number, deposit must be greater than 0.");
						System.out.println("\nEnter your deposit amount: ");
						deposit = input.nextDouble();
					}
					acc1.deposit(deposit);
					System.out.println("\nNew Balance: $" + acc1.getBalance());
				}
					else if (selection == 2) {
						System.out.println("\nYour Weekly Interest Amount is $ " + acc1.getWeeklyIntRate());	
					}
						else if (selection == 3) {
							System.out.println("\nAccount ID: " + acc1.getId());
							System.out.println("\nAcccount Creation Date/Time: " + acc1.getDateEstablished());
							System.out.println("\nBalance: $" + acc1.getBalance());
							System.out.println("\nWeekly Interest Rate: $" + acc1.getWeeklyIntRate());
						}
							else {
								System.out.println("Thank you - Goodbye!");

							}
			
			
			
			
		}
	

		
		
		
		
	
		
	}
}

/*while(Option!=4){


	sysout "options below "
	sysout "options below "
	sysout "options below "
	sysout "enter selection "
	
	scanner scanner = new scanner
	scannerin()
	
	if its 1{
		
	}
if its 2{
		
	}
if its 3{
	
}
if its 4{
	option=4
}
else {
	try again
}


}
*/