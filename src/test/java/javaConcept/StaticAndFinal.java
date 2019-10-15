package javaConcept;
public class StaticAndFinal {
	//static is used for memory efficiency and making the 
	//variable available for entire classes
	//its get memory only once
	// static block is used for initalized static data member 
	protected static  final int roll;
	static {//static block
		roll=10;
	}
	static int er=10;
	static {
		er=20;
	}
	
	static void m2(){
		System.out.println("method");
	}
	public static void main(String[] args) {
		
		System.out.println("sagar");
		System.out.println(roll);
		System.out.println(er);
		
		
		

	}

}
