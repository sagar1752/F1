package TestCases;

import java.util.ArrayList;

public class CombineTwoArrayLists {

	public static void main(String[] args) {
		//First ArrayList
        ArrayList<String> arraylist1=new ArrayList<String>();
        arraylist1.add("AL1: E1");
        arraylist1.add("AL1: E2");
        arraylist1.add("AL1: E3");

        //Second ArrayList
        ArrayList<Integer> arraylist2=new ArrayList<Integer>();
        arraylist2.add(1);
        arraylist2.add(2);
        arraylist2.add(3);

        //New ArrayList
        ArrayList<String> al= new ArrayList<String>();
        al.addAll(arraylist1);
        al.add(String.valueOf(arraylist2));

        //Displaying elements of the joined ArrayList
        for(String temp: al){
            System.out.println(temp);
        }
    }

	}


