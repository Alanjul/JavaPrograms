//Accounts class that contains instance variable with set and get method
public class Accounts {
	private String name; // instance variable
	private double balance; //instance variable
	//A counstructor receives two paramters
	public Accounts(String name, double balance)
	{
		this.name = name;
		
		//check if the balance is not negative
		if (balance > 0.0)
		{
			this.balance = balance; //assigns to instance variable
		}
	}
	//deposit method to deposit money in the account
	public void deposit(double depositAmount)
	{
		if (depositAmount <= 0.0)
				{
		balance = 0.0; // set balance to zero
				}
		else
		{
			balance = balance + depositAmount;
		}
	}
	
	//get the available balance
	public double getBalance()
	{
		return balance;
	}
	public void setName(String myName)
	{
		this.name= myName;
	}
	//method to retrieve name from object
	public String getName()
	{
		return name;
	}

}
