package Phase1_4;

public class MonthlyReceipt extends ProviderServices {
	 int month;
	public MonthlyReceipt() {
		super.Name = "Quarter Receipt";
		super.form = new QuarterReceiptForm();
		 this.month=1;
	}
}