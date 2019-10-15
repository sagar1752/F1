package javaConcept;
public class arraySort {  
    public static void main(String[] args) {      
        //Initialize array   
        int [] arr =  {5, 2, 8, 7, 1};   
        int temp = 0;  
        //Displaying elements of original array  
        System.out.println("Elements of original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
        //Sort the array in ascending order  
        for (int i = 0; i < arr.length; i++) {   
            for (int j = i+1; j < arr.length; j++) {   
            	
            	System.out.println("arr[i]"+arr[i]);
            	System.out.println("arr[J]"+arr[j]);
            	     //5     //2
               if(arr[i] >arr[j]) {
            	   System.out.println("arr[i]"+arr[i]);
            	   System.out.println("arr[j]"+arr[j]);
            	   
            	   //5  <--  //5
                   temp = arr[i]; 
                   System.out.println("temp"+temp);
                   // 2     <--2
                   arr[i] = arr[j];
                   System.out.println(" arr[i] "+  arr[i] );
                   // 5   <-- 5
                   arr[j] = temp;
                   System.out.println(" arr[j] "+  arr[j] );
               }   }   }  
        System.out.println();  
        //Displaying elements of array after sorting  
        System.out.println("Elements of array sorted in ascending order: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }     }  }  