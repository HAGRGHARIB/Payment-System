package Phase1_SW;

import java.util.LinkedList;

public class ServicesCommand implements Command {
	public LinkedList<Services> execute() {
		LinkedList<Services> listservices = new LinkedList<Services>();
		listservices.add(new MobileRechatgeServices());
		listservices.add(new InternetPaymentServices());
		listservices.add(new LandlineServices());
		listservices.add(new Donations());
		return listservices;
	}
}
