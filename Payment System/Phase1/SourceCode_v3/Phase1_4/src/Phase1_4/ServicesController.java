package Phase1_4;

import java.util.LinkedList;

public class ServicesController {
	public LinkedList<Services> execute() {
		LinkedList<Services> listservices = new LinkedList<Services>();
		listservices.add(new MobileRechatgeServices());
		listservices.add(new InternetPaymentServices());
		listservices.add(new LandlineServices());
		listservices.add(new Donations());
		return listservices;
	}

	public Form getForm(String S) {
		LinkedList<Services> listservices = new LinkedList<Services>();
		listservices = execute();
		for (int i = 0; i < listservices.size(); i++) {
			for (int j = 0; j < listservices.get(i).listproviderservices.size(); j++)
				if (S.equals(listservices.get(i).listproviderservices.get(j).getName())) {
					return listservices.get(i).listproviderservices.get(j).getForm();
				}
		}
		return null;
	}
}
