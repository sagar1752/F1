package javaConcept;

public class reverseString {

	public static void main(String[] args) {
		
		String str = "sagar shinde patil";
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev=rev+str.charAt(i);
			
		}
		
		System.out.print("reverse string:"+rev);
	}

}
