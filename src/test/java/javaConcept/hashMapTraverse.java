package javaConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashMapTraverse {

	public static void main(String[] args) {
		
		String arry [] = {"SAgar","Shinde","Patil"};
		
		HashMap<Integer,String> hMap = new HashMap<Integer,String> ();
			
			for(int i=0; i<arry.length; i++) {
				
				hMap.put(i, arry[i]); // here we are adding
			}

		System.out.println(hMap);
		System.out.println(hMap.get(0));
		
		System.out.println("************Hasp Map Traverse Using For Loop **************");
		for(int j=0;j<arry.length;j++) {
			
			System.out.println(hMap.get(j));
		}
		
	Iterator it = hMap.entrySet().iterator();  //we need to add entrySet()
		
	System.out.println("************Hasp Map Traverse Using Iterator **************");
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	
}
}
