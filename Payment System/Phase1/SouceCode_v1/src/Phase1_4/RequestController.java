package Phase1_4;

public class RequestController {
	public void execute(String S, double amount) {
		Request request = new Request(S, amount);
		FawryApplication.getRequests().add(request);
	}
}
