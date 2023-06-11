package Phase1_4;

public class SignOutCommand implements Command {
	public Object execute() {
		FawryApplication app = new FawryApplication();
		app.open();
		return null;
	}
}
