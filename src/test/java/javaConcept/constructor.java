package javaConcept;
import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;


public class constructor {

	 
	String name = "sagar";

	public  void Add() {
		System.out.println("Add Method:"+name);
	}
	
	public  void Subtract() {
		System.out.println("Subtract Method:"+name);
	}
	
	public  void Multiply() {
		System.out.println("Multiply Method:"+name);
	}
	
	public  void Devide() {
		System.out.println("Devide Method:"+name);
	}
	
	
	public  void Modulas() {
		System.out.println("Modulas Method:"+name);
	}
	
	public  String Triangle() {
		System.out.println("Triangle Method:"+name);
		String triangleArea ="2.5";
		return triangleArea;
	}
	
	constructor()
	{
		Add();
		Subtract();
		Multiply();
		Devide();
		Modulas();
		Triangle();
		
	}
	
	
	public static  void main(String args[]){

		constructor obj = new constructor();
		assertEquals(obj.Triangle(), "2.5", "Triangel Area is same");
		
	}

}
