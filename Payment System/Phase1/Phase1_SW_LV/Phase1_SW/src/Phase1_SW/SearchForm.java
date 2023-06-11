package Phase1_SW;

import java.util.Scanner;

public class SearchForm implements Form {

	@SuppressWarnings("resource")
	@Override
	public void open() {

		String serviceProvider;
		System.out.print("Enter the name  : ");
		serviceProvider = new Scanner(System.in).nextLine();
		Command command = new SearchCommand(serviceProvider);
		command.execute();
		Form form = new MenueCustomerForm();
		form.open();
	}
}
