package Phase1_SW;

import java.util.LinkedList;

public class Services {
    protected static String Name = "No Description";
    protected LinkedList<ProviderServices> listproviderservices = new LinkedList<ProviderServices>();
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}