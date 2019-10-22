package exceptionPrograms;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class subclassofparentExcetion2 {
															
				
				public static void start() throws IOException, RuntimeException{
				    //throw new RuntimeException("Not able to Start");
					
					int i = 10/0;
					System.out.println("sdf");
				 }
				 public static void main(String args[]) throws IOException, RuntimeException {
				    try {
				          start();
				    }
				    catch (Exception ex) {
				            ex.printStackTrace();
				    } 
				    catch (ArithmeticException re) {
				    	
				    	
				    	
				    	
re.printStackTrace();
				    }
				 }


				

	}


