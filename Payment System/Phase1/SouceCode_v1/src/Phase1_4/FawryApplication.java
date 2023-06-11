package Phase1_4;

import java.util.LinkedList;

public class FawryApplication implements Subject {
	private static LinkedList<Customer> Consumers = new LinkedList<Customer>();
	private static LinkedList<Request> requests = new LinkedList<Request>();
	private static Admin admin = new Admin();

	public void open() {
		Form form = new InitialForm();
		form.open();
	}

	public static LinkedList<Customer> getConsumers() {
		return Consumers;
	}

	public static void setConsumers(LinkedList<Customer> consumers) {
		Consumers = consumers;
	}

	public static Admin getAdmin() {
		return admin;
	}

	public static void setAdmin(Admin admin) {
		FawryApplication.admin = admin;
	}

	public static LinkedList<Request> getRequests() {
		return requests;
	}

	public static void setRequests(LinkedList<Request> requests) {
		FawryApplication.requests = requests;
	}
}
