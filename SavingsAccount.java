/**
 * Author:       Luna Delgado
 * Date:         xx/xx/xxxx
 * File:         SavingsAccount.java
 * Description:  
 */
package assignment3;

import java.util.*;

/**
 * @author Owner
 *
 */
public class SavingsAccount {

	int id;
	double balance, annualIntRate;
	Date dateEstablished;

	

SavingsAccount() {
	id = 0;
	balance = 0;
	annualIntRate = 0;
	dateEstablished = new Date();
}

public SavingsAccount(int idNum, double intBalance, double annIntRate) {
	
	id = idNum;
	balance = intBalance;
	annualIntRate = annIntRate;
	dateEstablished = new Date();
}

public int getId() {
	
	return id;
}

public double getBalance() {
	
	return balance;
}

public double getAnnualIntRate() {

return annualIntRate;
}

public void setId(int idNum) {
	
	id = idNum;
}

public void setBalance(double intBalance) {
	
	balance = intBalance;
}

public void setAnnualIntRate(double AnnIntRate) {
	
	annualIntRate = AnnIntRate;
}

public Date getDateEstablished() {
	
	return dateEstablished;
}

public double getWeeklyIntRate() {
	double weeklyIntRate;
	
	weeklyIntRate = (annualIntRate/100) / 52;
	
	weeklyIntRate = balance * weeklyIntRate;
	
	return weeklyIntRate;
}

public void deposit(double bal) {
	
	balance = balance + bal;
}


}
