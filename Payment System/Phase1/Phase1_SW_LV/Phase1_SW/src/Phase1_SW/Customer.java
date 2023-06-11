package Phase1_SW;
public class Customer implements Observer {
	private String Username;
	private String Email;
	private String Passward;
	private String PhoneNumber;
	public WalletPayment wallet ;
	Transaction_User_Service2 transaction;
	public Customer(String Username, String Email, String Passward, String PhoneNumber) {
		this.Username = Username;
		this.Email = Email;
		this.Passward = Passward;
		this.setPhoneNumber(PhoneNumber);
	}

	@Override
	public void Update() {
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassward() {
		return Passward;
	}

	public void setPassward(String passward) {
		Passward = passward;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

}