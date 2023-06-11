package Phase1_SW;

public class LandlineServices extends Services {

	public LandlineServices() {
		super.Name = "Landline Services";
		listproviderservices.add(new MonthlyReceipt());
		listproviderservices.add(new QuarterReceipt());
	}
}
