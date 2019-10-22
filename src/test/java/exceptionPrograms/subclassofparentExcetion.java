package exceptionPrograms;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class subclassofparentExcetion {
																

			public static void main(String[] args) {
					try {
						go();
					} catch (IOException e) {
						e.printStackTrace();
					} catch (FileNotFoundException e) {			//The program won’t compile because FileNotFoundException 
					e.printStackTrace();						//s subclass of IOException, so the catch block of FileNotFoundException
					} catch (JAXBException e) {					//is unreachable and you will get error message as “Unreachable 
					e.printStackTrace();						//catch block for FileNotFoundException. It is already handled by 
																//the catch block for IOException”.
							
					}
			}

			public static void go() throws IOException, JAXBException, FileNotFoundException{
				
			}
		

	}


