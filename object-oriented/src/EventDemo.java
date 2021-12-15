
class EventImpl implements Event {

	public void dosomething() {
		System.out.println("class leval implementation");
	}
}
public class EventDemo {
	
	class InnerEventImpl implements Event {
		
		public void dosomething() {
			System.out.println("Inner class implementation");
		}
	}
	public static class staticInnerEventImpl implements Event {
		
		public void dosomething() {
			System.out.println("static inner class implementation");
		}
	}
	
	public void nestedEvent() {
		class NestedEventImpl implements Event {
			
			public void dosomething() {
				System.out.println("Nested event implementation");
				
			}
		}
		new NestedEventImpl().dosomething();
	
	}
	public void oneMoreEvent( ) {
		 Event e = new Event() {
			 
			 public void dosomething( ) {
				 System.out.println("Anonyomus event implementation");
			 }
			
			
		}
		 e.dosomething();
	}
	public void oneLastEvent() {
		Event e = () -> System.out.println("Lambda event implementation");
		e.dosomething();
	}
	
	
	
	public static void main(String[] args) {
		EventImpl e1 = new EventImpl();
		e1.dosomething();
		
		
		EventDemo ed = new EventDemo();
		InnerEventImpl e2 = ed.new InnerEventImpl();
		e2.dosomething();
		
		EventDemo.staticInnerEventImpl e3 = new EventDemo.staticInnerEventImpl();
		e3.dosomething();
		
		ed.nestedEvent();
		ed.oneMoreEvent();
		ed.oneLastEvent();
		
    }

}
