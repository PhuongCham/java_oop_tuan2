package bai2_2;

public class Author {
	String name;
	String email;
	char gender;

	public Author(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return "Author[name="+name+",email="+email+",gender="+gender+"]";
	}
}
