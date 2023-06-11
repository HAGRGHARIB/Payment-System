package Phase1_4;
import java.util.Scanner;
public class AssignDiscountForm implements Form {

	String ServiceName;
	String discountName;
	@Override
	public void open() {
		// TODO Auto-generated method stub
		Scanner cin =new Scanner(System.in);
		System.out.println("Please,Enter the ServiceName:  ");
		ServiceName=cin.nextLine();
		System.out.println("Please,Enter the discountName:  ");
		discountName=cin.nextLine();
}

}

