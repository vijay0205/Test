package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoClass2 {

	public static void main(String[] args) {
		ArrayList<String>list= new ArrayList<String>();
		 list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  
		  Iterator itr= list.iterator();
		  while(itr.hasNext()) {
			  
			  System.out.println("Stored values are  " +itr.next());
		  }

	}

}