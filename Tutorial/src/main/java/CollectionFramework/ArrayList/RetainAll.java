package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class RetainAll {
	//Gives the common value from two arrays

	public static void main(String[] args) {
		ArrayList <String> arr1=new ArrayList<String>();
		arr1.add("Vijay");
		arr1.add("SC");
		
		ArrayList<String>arr2=new ArrayList<String>();
		arr2.add("Ashima");
		arr2.add("SC");
		arr1.retainAll(arr2);
		for(int i=0;i<arr1.size();i++)
		{
			System.out.println("Retain All method gives the common values of two arrays " +arr1.get(i));
		}
		arr2.retainAll(arr1);
		for(int i=0;i<arr1.size();i++)
		{
			System.out.println("Retain All method gives the common values of two arrays " +arr2.get(i));
		}
		
	}

}
