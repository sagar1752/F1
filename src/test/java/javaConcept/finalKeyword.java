package javaConcept;

public class finalKeyword {

	
	
	 //can we initialized final as blank ?
		//	 ans: yes
	
	//but  we need to assign value in constructor
	final  int s;
	
	
//	static
//    { 
//        s = 1; 
//    } 
	final void m1 () {
		 System.out.println("parent");
		
	 }
	
	finalKeyword(){
		s=1;
	}
}
	

	 

