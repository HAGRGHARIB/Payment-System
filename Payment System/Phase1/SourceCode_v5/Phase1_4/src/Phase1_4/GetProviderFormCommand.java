package Phase1_4;

import java.util.LinkedList;

public class GetProviderFormCommand implements Command {
	String S;

	public GetProviderFormCommand(String S) {
		this.S = S;
	}

	@SuppressWarnings("unchecked")
	public Form execute() {
		LinkedList<Services> listservices = new LinkedList<Services>();
		Command command=new ServicesCommand();
		listservices = (LinkedList<Services>) command.execute();
		for (int i = 0; i < listservices.size(); i++) {
			for (int j = 0; j < listservices.get(i).listproviderservices.size(); j++)
				if (S.equals(listservices.get(i).listproviderservices.get(j).getName())) {
					return listservices.get(i).listproviderservices.get(j).getForm();
				}
		}
		return null;
	}
}
