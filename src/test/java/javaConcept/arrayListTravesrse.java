package javaConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListTravesrse {

	public static void main(String[] args) {
		
		String array[] = {"sagar","shinde","patil"};
		
		ArrayList<String> ary1 = new ArrayList<String>();
		
		for(int i=0; i<array.length; i++) {
			ary1.add(array[i]);
		}
		System.out.println(ary1);
		
		Iterator <String> it = ary1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
/*out put:
[sagar, shinde, patil]
sagar
shinde
patil*/
