package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoClass {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		for (String obj : list)

		{
			System.out.println("Values are " + obj);
		}

	}

}