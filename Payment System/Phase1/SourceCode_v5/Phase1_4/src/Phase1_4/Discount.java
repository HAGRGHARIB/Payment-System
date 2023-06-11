package Phase1_4;

import java.util.Scanner;

public interface Discount {
void addDiscount ()
{
	float discountPercentage ;
	int adminChoice ;
	string serviceName ;
	System.out.println("if you want to add overall discount enter 1"); 
	System.out.println("if you want to add specific discount enter 2");
	adminChoice = new Scanner(System.in).hasNextInt(); 
	
	if(adminChoice==1)
	{
		//المفروض يروح يضيف عند ال overall
		
		System.out.println("enter discountPercentage");
	discountPercentage = new Scanner(System.in).nextFloat();
	}
	if (adminChoice==2)
	{
		//المفروض يروح يضيف عند ال specific
		
		System.out.println("enter the service name");
		serviceName = new Scanner(System.in).nextLine();
		System.out.println("enter discountPercentage");
		discountPercentage = new Scanner(System.in).nextFloat();
	}
}
}
