package Phase1_SW;
public class Donations extends Services {
	public Donations() {
		super.Name = "Donations";
		listproviderservices.add(new CancerHospital());
		listproviderservices.add(new Schools());
		listproviderservices.add(new NGOs());
	}
}
