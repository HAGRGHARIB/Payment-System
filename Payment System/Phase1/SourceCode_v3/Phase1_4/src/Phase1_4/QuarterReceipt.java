package Phase1_4;

public class QuarterReceipt extends ProviderServices {
	 int month;
	public QuarterReceipt() {
		super.Name = "Quarter Receipt";
		super.form = new QuarterReceiptForm();
		 this.month=3;
	}
}