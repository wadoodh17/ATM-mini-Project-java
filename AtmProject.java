import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		
		int pin = 1234;
		int balance = 5000;
		int addamount = 0;
		int debitamount = 0;
		String name;
		
		Scanner scan = new Scanner(System.in);
		//Get pin number from user
		System.out.println("Enter the pin number: ");
		int password = scan.nextInt();
		if(password==pin) {
			System.out.println("Enter Your Name: ");
			name = scan.next();
			System.out.println("welcome"+" " + name);
            while(true) {
				System.out.println("Press 1 to check your balance");
				System.out.println("press 2 to add amount");
				System.out.println("press 3 to withdraw amount");
				System.out.println("press 4 to take recipt");
				System.out.println("press 5 EXIT");
				int option = scan.nextInt();
				
				switch(option) 
				{
				case 1:
					System.out.println("Your current balance is"+ " " + balance);
					break;
						
				case 2:
					System.out.println("Enter Your Amount: ");
					addamount = scan.nextInt();
					System.out.println("Successfully Credited...");
					balance = addamount + balance;
					break;
						
				case 3:
					System.out.println("Enter your amount to debit: ");
					debitamount = scan.nextInt();
					if(debitamount>balance) {
						System.out.println("Insufficient Balance ");
						System.out.println("Enter less amount to debit");
					}
					else {
						System.out.println("Amount debited");
						balance = balance - debitamount;
					}
					break;
				case 4:
					System.out.println("Welcome to ABW bank ATM");
					System.out.println("Current balance is " + balance);
					System.out.println("Amount credited is " + addamount);
					System.out.println("Amount Debited is " + debitamount);
					System.out.println("Thanks for coming");
					break;
				}
				if(option==5) {
					System.out.println("Thankyou");
					break;
				}
   			}
		}else{
			System.out.println("incorrect pin");
		}
	}
}