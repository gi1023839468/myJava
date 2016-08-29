import java.io.*;
class P2 {
	public static void main (String [] args) throws IOException {
		BufferedReader stdin =
				new BufferedReader (new InputStreamReader (System.in));
		String [] input = stdin.readLine().split(" ");
		int id;
		double interest,balance;
		id = Integer.parseInt(input[0]);
		balance = Double.parseDouble(input [1]);
		interest = Double.parseDouble(input [2]);
		
		Account account = new Account (id,balance,interest);
		System.out.println("Current Account: id: " + account.get_id() + " balance: " + account.get_balance() + " InterestRate (%): " + account.get_annualInterestRate());
		
		System.out.println("How much to withdraw? :");
		String amount = stdin.readLine();
		account.withdraw (Double.parseDouble(amount));
		System.out.println("Current balance: " + account.get_balance());
		
		System.out.println("How much to deposit? :");
		amount = stdin.readLine();
		account.deposit (Double.parseDouble(amount));
		System.out.println("Current balance: " + account.get_balance());
		System.out.println("Account Date Created: " + account.get_date() + ", Monthly Interest Rate (%) : " + account.getMonthlyInterest());
	}
}