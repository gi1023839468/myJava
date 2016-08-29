class Savings extends Account{						//Savings is a subclass of Account
	public Savings (){								//no arg constructor
		super();									//run superclass constructor
	}
	public double withdraw (double amount) {		//Override method of withdraw
		if (amount <= balance) {
			balance -= amount;
		}
		else {
			System.out.println("Savings Account Withdraw Error: Insufficient Funds!");
		}
		return balance;
	}
}