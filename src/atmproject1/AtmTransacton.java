package atmproject1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtmTransacton {

	public static void main(String[] args) {
		
		Map<Double,String> receipt=new HashMap<>();
		int balance = 15000, withdraw = 0, deposit;
try (Scanner sc = new Scanner (System.in)) {
	while(true) 
	{
		
		System.out.println("Automated Teller Machine");
		System.out.println("Choose 1 for Check Balance");
		System.out.println("Choose 2 for withdarw");
		System.out.println("Choose 3 for deposit");
		System.out.println("Choose 4 for Print receipt");
		System.out.println("Choose 5 for exit");
		System.out.println("Choose the operation what you want");
		int n = sc.nextInt();
		
		switch(n)
		{
			case 1:
				System.out.println("Balance : "+balance);
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Enter money to be withdrawan : ");
				withdraw = sc.nextInt(); 
				receipt.put((double) withdraw,"Amount Withdrawn");
				if(balance >= withdraw)
					
				{
					balance = balance - withdraw;
					System.out.println("please collect your money "+withdraw);
					
				}
				else {
					System.out.println("insufficient money");
				}
				System.out.println(" ");
				break;
				
			case 3:
				System.out.print("Enter money to be deposited :");
				deposit = sc.nextInt();
				balance = balance + deposit;
				receipt.put((double) deposit,"Amount Deposited");
				System.out.println("Your money successfully deposited");
				System.out.println("Your money balance is : "+balance);
				System.out.println("");
				break;
				
			case 4:
				Date currentDate1 = new Date();
				System.out.println("Automated Teller Machine");
				SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
				System.out.println(timeFormat.format(currentDate1));
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				System.out.println(dateFormat.format(currentDate1));
				
				SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
				System.out.println(dayOfTheWeekFormat.format(currentDate1));
				
				for(Map.Entry<Double,String> r:receipt.entrySet()) {
					System.out.println(r.getKey()+" "+r.getValue());
				}
				System.out.println("Balance : "+balance);
				System.out.println("");
				break;
				
			case 5:
				System.out.println("Collect your card\n Thank you for using the ATM Machine");
				System.out.println("");
				System.exit(0);
			
		}

	}
}
		
		

	}

}
