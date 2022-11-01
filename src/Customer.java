
public class Customer {

	String firstName;
	String middleInitial;
	String lastName;
	String gender;
	String phoneNumber;
	String emailAddress;
	
	public Customer(String firstName, String middleInitial, String lastName, String gender, 
												String phoneNumber, String emailAddress) {
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		
	}
	
	//print customer record
	public void printCustomerRecord() {
		System.out.print("First Name: " + get_firstName() + '\n');
		System.out.print("Middle Initial: " + get_middleInitial() + '\n');
		System.out.print("Last Name: " + get_lastName() + '\n');
		System.out.print("Gender: " + get_gender() + '\n');
		System.out.print("Phone Number: " + get_phoneNumber() + '\n');
		System.out.print("Email Address: " + get_emailAddress() + '\n');
	}
	
	//GETTER METHODS
	public String get_firstName() {
		return firstName;
	}
	
	public String get_middleInitial() {
		return middleInitial;
	}
	
	public String get_lastName() {
		return lastName;
	}
	
	public String get_gender() {
		return gender;
	}
	
	public String get_phoneNumber() {
		return phoneNumber;
	}
	
	public String get_emailAddress() {
		return emailAddress;
	}
	
	
	//SETTER METHODS
	public void set_firstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void set_middleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	
	public void set_lastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void set_gender(String gender) {
		this.gender = gender;
	}
	
	public void set_phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void set_emailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
