package Phase1_4;

import java.util.LinkedList;

public class Services {
	protected Discount discount = null;
	protected String Name = "No Description";
    protected LinkedList<ProviderServices> listproviderservices = new LinkedList<ProviderServices>();
	public void SetDiscount(Discount discount) {
		this.discount = discount;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}