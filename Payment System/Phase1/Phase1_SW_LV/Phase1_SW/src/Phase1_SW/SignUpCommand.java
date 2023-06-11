package Phase1_SW;

public class SignUpCommand implements Command {

	String Username;
	String Email;
	String Passward;
	String PhoneNumber;

	public SignUpCommand(String Username, String Email, String Passward, String PhoneNumber) {
		this.Username = Username;
		this.Email = Email;
		this.Passward = Passward;
		this.PhoneNumber = PhoneNumber;}
	
	@Override
	public Object execute() {
		FawryApplication.getConsumers().add(new Customer(Username, Email, Passward, PhoneNumber )); 
		return null;
	}


}
