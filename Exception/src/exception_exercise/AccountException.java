package exception_exercise;

import exception_exercise.Account.OverdraftException;

//class 1
class Account{
	protected double balance;
	public Account() {}//define it for inner static class
	public Account(double init) {
		balance = init;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amt) {
		balance += amt;
	}
	public void withdraw(double amt) throws OverdraftException {
		if(amt>balance)
			throw new OverdraftException("your deficit is: ",amt-balance);
		//使用throw 不用写else了，因为会被抛出
		balance -= amt;
	}
	
	//inner class
	//default: visible in the same package
	class OverdraftException extends Exception{
		private double deficit;
		public OverdraftException() {}
		public OverdraftException(String msg,double deficit) {
			super(msg);	
			this.deficit = deficit;
		}
		public double getDeficit() {
			return deficit;
		}
	}
	
}

//class 2
class CheckingAccount extends Account{
	//Implicit super constructor AccountException() is undefined for default 
	//constructor. Must define an explicit constructor
	private double overdraftprotection;
	
	public CheckingAccount(double balance) {
		super(balance);
	}
	public CheckingAccount(double balance,double protect) {
		this.balance = balance;
		this.overdraftprotection = protect;
	}
	
	@Override
	public void withdraw(double amt)throws OverdraftException {
		if(amt>(balance+overdraftprotection))
			throw new OverdraftException("you protect deficit has run out",amt-balance-overdraftprotection);
		else if(amt<this.balance) {
			balance = 0;
			this.overdraftprotection -= amt-balance;
		}
		else
			balance -= amt;
	}
	public double getOverdraftprotection() {
		return overdraftprotection;
	}
}
public class AccountException{
	public static void main(String[]arg) {
		Account account = new Account(100);
		try {
			account.withdraw(110);
			System.out.println(account.getBalance());
		}catch(Exception e) {
			//down casting,it's OK in running time, because complier know e is OverdraftException
			System.out.println(e.getMessage()+((OverdraftException)e).getDeficit());
		}
		
		CheckingAccount check = new CheckingAccount(100,20);
		try {
			check.withdraw(110);
			System.out.println(check.getBalance()+" "+check.getOverdraftprotection());
		}catch(Exception e) {
			System.out.println(e.getMessage()+((OverdraftException)e).getDeficit());//downcasting
		}
		
	}
}