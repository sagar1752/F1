package javaConcept;

import java.util.HashMap;

public class uniqueElement {
	//public class UniqueInArray2 { 
		  
	    public static void main(String args[]) 
	  
	    { 
	        int ar[] = { 10, 5, 3, 4, 3, 5, 6 }; 
	        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
	        for (int i = 0; i < ar.length; i++) { 
	            hm.put(ar[i], i); 
	        } 
	        System.out.println(hm.keySet()); 
	  
	    } 
	  
	} 