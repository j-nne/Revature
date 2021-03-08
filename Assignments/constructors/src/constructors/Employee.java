package constructors;

public class Employee {

	private int id;
	private String name;
	private String email;
	private int age; 

	public Employee(int id, String name, String email, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public Employee(int id, String name, String email, String string, int age) {
		this(id,name,string,age); //constructor chain
		
	}
	

	@Override
	public String toString() {
		return "Employee [id = " + id + ", name = " + name + ", email = " + email + ", age = " + age + "]";
	}
}