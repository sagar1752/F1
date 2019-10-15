package javaConcept;
public class pyramid {
	public static void main(String[] args) {
//		for(int i=1; i<6; i++)
//		{
//			for (int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//		*
//		**
//		***
//		****
//		*****
//	        for (int i = 0; i < 5; i++) {
//	            for (int j = 0; j < 5 - i; j++) {
//	                System.out.print(j);
//	            }
//	            for (int k = 0; k <= i; k++) {
//	                System.out.print("* ");
//	            }
//	            System.out.println();
//	        }
//	        01234* 
//	        0123* * 
//	        012* * * 
//	        01* * * * 
//	        0* * * * * 
	        
		 int i, j, num=1; 
	        for(i=0; i<5; i++) 
	        { 
	            for(j=0; j<=i; j++) 
	            { 
	                System.out.print(num+ " "); 
	                // incrementing num at each column 
	                num = num + 1; 
	            } 
	            System.out.println(); 
	        } 
//	        1 
//	        2 3 
//	        4 5 6 
//	        7 8 9 10 
//	        11 12 13 14 15 
	        
	    }
		
}
