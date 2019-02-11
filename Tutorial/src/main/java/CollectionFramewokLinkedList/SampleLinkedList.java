package CollectionFramewokLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class SampleLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list= new LinkedList<String>();
		LinkedList<String> list1= new LinkedList<String>();
//		list1.add("Vijay");
//		list1.add("Ashima");
//		list1.add("Ashimaqq");
		list.add("Vijay");
	list.add("Vijay");
	list.add("Ashima");
	list.addFirst("First");
	list.addLast("Last");
	list.add(1, "At index 1");
//	list.removeLast();
System.out.println(list.removeFirstOccurrence("Vijay"));

//	list.addAll(list1);
//	list.addAll(0, list1);
//	System.out.println( list.contains("Vijay")); 
//	System.out.println( list.containsAll(list1)); 
//	
	
	Iterator<String>iterator=list.iterator();
	System.out.println("List size is " +list.size());
	while(iterator.hasNext())
	{
		
		System.out.println(iterator.next());
	}
	

	}

}
