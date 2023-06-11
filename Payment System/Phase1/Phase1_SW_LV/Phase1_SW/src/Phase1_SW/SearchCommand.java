package Phase1_SW;

import java.util.LinkedList;

public class SearchCommand implements Command {
	/*
	 * The user should be able to search for any service in the system. The user can
	 * type the service name and the system will return all services that match the
	 * user query.
	 */
	private String serviceProviderName;

	public SearchCommand(String serviceName) {
		this.serviceProviderName = serviceName;
	}

	public LinkedList<Services> execute() {
		LinkedList<Services> service = new LinkedList<Services>();
		ServicesCommand command = new ServicesCommand();
		LinkedList<Services> services = new LinkedList<Services>();
		services = command.execute();
		for (int i = 0; i < services.size(); i++)
			if (services.get(i).getName().contains(serviceProviderName))
				service.add(services.get(i));
		return service;
	}
}
