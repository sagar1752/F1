package javaConcept;

public class CallStaticVariable {

	
	static int ser;
	static {
		 int ser= StaticAndFinal.roll;
		 System.out.println(ser);
		 int ser=5;
		 StaticAndFinal obj = new StaticAndFinal();
		 obj.m2();
	}
	// out side static not able to access static method and variables
	StaticAndFinal obj = new StaticAndFinal();  
	obj.m2();
	public static void main(String[] args) {
		
		System.out.println(StaticAndFinal.roll);
		System.out.println(StaticAndFinal.er);
		System.out.println(ser);
		
		StaticAndFinal obj = new StaticAndFinal();
		//obj.roll=45;
		obj.er=35;
		obj.m2();
		System.out.println(obj.roll);
		System.out.println(obj.er);
		System.out.println(ser);
	}

}
