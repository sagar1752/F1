package javaConcept;

public interface interface1 {
	
	default void m1 (){
		System.out.println("default  method of interface");
	}
	
	static void m2() {
		System.out.println("static method of interface");
	}

	
	public int a=1;
}
