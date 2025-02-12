package pack1;

public class Person {
	String firstname;
	String lastname;
	char gender;
	
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	Person(String fname,String lname,char g)
	{
		this.firstname=fname;
		this.lastname=lname;
		this.gender=g;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Person obj=new Person("Silliya","vk",'F');
	System.out.println("Person Details");
	System.out.println("__________________");
	System.out.println("First Name:"+obj.firstname);
	System.out.println("Last Name:"+obj.lastname);
	
	System.out.println("Last Name:"+obj.gender);
	
	
	
	
		

	}

}
