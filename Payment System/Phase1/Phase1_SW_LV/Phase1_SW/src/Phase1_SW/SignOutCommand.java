package Phase1_SW;

public class SignOutCommand implements Command {
	@Override
	public Object execute() {
		FawryApplication app = new FawryApplication();
		app.open();
		return null;
	}
}
