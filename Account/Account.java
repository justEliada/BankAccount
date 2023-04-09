
import java.util.Date;
public class Account {
	
	//Attributes
	//static int accountNumber; we should declare int as static variable so this variable is independent from the object, but relates to the class (it is shared among all the objects of the class)
	String owner;
	double balance;
	Date registrationDate;
	String currency;

	//Constructor to create objects.If we don't declare it, JVM will construct the no argument constructor with all attributes set with default values
	public Account()
	{
	registrationDate=new Date();
	currency="Lek";	
	owner="Undefined";
	//accountNumber++;
	}

	//Methods
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0) // if the depositAmount is valid
	         balance = balance + depositAmount; // add it to the balance 
		else  System.out.println("Please enter a valid deposit amount");
	}

	public void withdraw (double withdrawalAmount)
	{
		 if (withdrawalAmount > balance)
	         System.out.println("Withdrawal amount amount exceeded account balance.");

	      if (withdrawalAmount <= balance)  
	         balance = balance - withdrawalAmount; 
		}
	



	
}
