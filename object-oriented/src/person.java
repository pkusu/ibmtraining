
public class person {
	private String name;
	private int age;
	
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println("Name:" + name + "\tAge: " + age);
		
	}
	public static void main(String[] args) {
		person p1= new person("polp",21);
		p1.print();
		
		person p2 = new person();
		p2.print();
	}
		
	

}
