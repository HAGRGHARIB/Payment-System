package Phase1_4;

import java.util.Scanner;

public class SearchForm implements Form {

	String ServiceName;
	@Override
	public void open() {
		// TODO Auto-generated method stub
		Scanner cin =new Scanner(System.in);
		System.out.println("Please,Enter the ServiceName:  ");
		ServiceName=cin.nextLine();

  }
}

