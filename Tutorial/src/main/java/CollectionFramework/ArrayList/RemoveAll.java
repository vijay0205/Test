package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		ArrayList <String> arr1=new ArrayList<String>();
		arr1.add("Vijay");
		arr1.add("SC");
		for(int i=0;i<arr1.size();i++)
		{
			System.out.println("Value of arry1 is " +arr1.get(i));
		}
		ArrayList<String>arr2=new ArrayList<String>();
		arr2.add("Ashima");
		arr2.add("SC");
		for(int i=0;i<arr2.size();i++)
		{
			System.out.println("Before removeAll method Value of arr21 is " +arr2.get(i));
		}
		arr2.removeAll(arr1);
		for(int i=0;i<arr2.size();i++)
		{
			System.out.println("Before removeAll method Value of arry1 is " +arr2.get(i));
		}
	}

}
