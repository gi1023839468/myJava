import java.io.*;
import java.util.*;

class TestAccount{
	public static void main (String [] args) throws IOException {
		BufferedReader data = 
				new BufferedReader(new InputStreamReader(System.in));
		
		Account check = new Checking();																//create check object
		Account saving = new Savings();																//create saving object
		System.out.print("How many dollars do you want to deposit to Checking Account? :");	
		String input = data.readLine();																//get user input
		check.deposit(Double.parseDouble(input));													//Deposit to checking account
		
		System.out.print("How many dollars do you want to withdraw from Checking Account? :");
		input = data.readLine();																	//get user input
		check.withdraw(Double.parseDouble(input));													//Withdraw from checking account
		
		System.out.print("\nHow many dollars do you want to deposit to Savings Account? :");
		input = data.readLine();																	//get user input
		saving.deposit(Double.parseDouble(input));													//Deposit to savings account
		
		System.out.print("How many dollars do you want to withdraw from Savings Account? :");
		input = data.readLine();																	//get user input
		saving.withdraw(Double.parseDouble(input));													//Withdraw from savings account

		System.out.println("\nPrint the Checking account information:");
		System.out.println(check);																	//print checking infomation
		System.out.println("\nPrint the Savings account information:");
		System.out.println(saving);																	//print savings infomation
	}
}
