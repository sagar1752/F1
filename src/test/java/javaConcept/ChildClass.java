package javaConcept;



public class ChildClass extends ParentClass{

	
	//The method m1() of type ChildClass must override or implement a supertype method
	
	@Override
	public  /*static*/ void m1() {
		System.out.println("Child Method");
	}
	
	public static void main(String[] args) {
	//	System.out.println("Child Class Main Method");
		
		//ParentClass.main(args);
		ChildClass chObj1 = new ChildClass();
		chObj1.m1();
		
		//Child class object with a reference  of parent class
		ParentClass chObj = new ChildClass();
		chObj.m1();
		
		ParentClass paObj = new ParentClass ();
		paObj.m1();
		//ChildClass paObj = new ParentClass ();  
		// compile time error (Type mismatch: cannot convert from ParentClass to ChildClass)
		
	//	ParentClass.main(args);
		
	}

}
