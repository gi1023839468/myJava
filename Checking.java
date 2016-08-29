class Checking extends Account{						//Checking is a subclass of Account
	final double Limit;
	public Checking (){								//no arg constructor
		super();									//run superclass constructor
		Limit = 5000;								//it has a limit for overdraft 5000 dollars.
	}
	public double withdraw (double amount) {		//Override method of withdraw
		if (amount <= (balance + Limit)){
			balance -= amount;
		}
		else{
			System.out.println("Check Account Withdraw Error: Insufficient Funds!");
		}
		return balance;
	}
}