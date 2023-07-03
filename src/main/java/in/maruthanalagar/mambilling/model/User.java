package in.maruthanalagar.mambilling.model;

public class User {

	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isActive() {
		return isActive = true;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	

	@Override
	public String toString() {
		return "User Detils Name : " + firstname +" "+ lastname + ", Email : " + email + ", Password : " + password
				+ ", User id : " + id + ", isActive : " + isActive;
	}
	String firstname;
	String lastname;
	String email;
	String password;
	int id;
	boolean isActive;

	public String fullName() {
		return firstname.concat(" ").concat(lastname);
	}

}
