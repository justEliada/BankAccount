

public class TestAccount {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Account account1=new Account();
			//To access  a public attribute of an object we use the dot operator with the standart:
		    //objectName.attribute.In our case: account1.balance 
			System.out.println("Initial default balance is "+account1.balance);
			System.out.println("The owner is "+account1.owner);
			//set the owner of the account1;
			account1.owner="Andrea Tito";
			System.out.println("The owner is "+account1.owner);
			System.out.println("Registration date of the account is "+account1.registrationDate);
			//To invoke a method that applies to an object , we use the dot operator with the standart: 
			//objectName.method.In our case: account1.withdraw(x) 
			account1.deposit(10000);
			System.out.println("Balance after deposit is "+account1.balance);
			account1.withdraw(500);
			System.out.println("Balance after withdraw is "+account1.balance);
		}

}
