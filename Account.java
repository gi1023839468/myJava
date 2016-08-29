import java.util.*;
class Account{
	int id;
	double balance;
	double annualInterestRate;
	Date dateCreated;
	
	public Account () {
		balance = 0;
		annualInterestRate = 0;
		id = 0;
		dateCreated =new Date ();
	}
	
	public Account (int User_id, double Money_balance, double annualRate) {
		id = User_id;
		balance = Money_balance;
		annualInterestRate = annualRate;
		dateCreated =new Date ();
	}
	
	public int get_id () {
		return id;
	}
	public void set_id (int User_id) {
		id = User_id;
	}
	public double get_balance () {
		return balance;
	}
	public void set_balance (double Money_balance) {
		balance = Money_balance;
	}
	public double get_annualInterestRate () {
		return annualInterestRate;
	}
	public void set_annualInterestRate (double InterestRate) {
		annualInterestRate = InterestRate;
	}
	public Date get_date () {
		return dateCreated;
	}
	public double getMonthlyInterest() {
		return annualInterestRate /= 12;
	}
	public double withdraw (double amount) {
		balance -= amount;
		return balance;
	}
	public void deposit (double amount) {
		balance += amount;
	}
	public void deposit (int amount) {
		balance += amount;
	}
	public String toString (){
		return "The current balance is: " + Double.toString(get_balance()) + ".\nThe monthly interest is: " + Double.toString(getMonthlyInterest()) + ".\nThe data created at: " + get_date().toString();
	}
}