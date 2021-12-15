
public class PersonReflection {
	
	public static void main(String[] args) {
		Person p1 = new Person("hello",24);
		System.out.println(p1);
		
		class pc = p1.getclass();
		system.out.println(pc.getName());
		
		constructor[] constructor = pc.getconstructors();
		system.out.println("--List of constrcutors");
		for (constructor c : constructors)
			system.out.println(c);
		
		Method[] decmethod = pc.getMethod();
		system.out.println("--List of Method");
		for (Method m : decMethods)
			system.out.println(m);
		
		Field[] field = pc.getField();
		system.out.println("--List of field");
		for (Field f : fields)
			system.out.println(f);
		
			
		
		
	}

}
