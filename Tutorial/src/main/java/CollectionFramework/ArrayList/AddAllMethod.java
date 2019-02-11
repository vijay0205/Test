package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class AddAllMethod {

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
		arr2.add("DBA");
		for(int i=0;i<arr2.size();i++)
		{
			System.out.println("Before addAll method Value of arr21 is " +arr2.get(i));
		}
		arr2.addAll(arr1);
		for(int i=0;i<arr2.size();i++)
		{
			System.out.println("After addAll method Value of arry1 is " +arr2.get(i));
		}
	}

}
