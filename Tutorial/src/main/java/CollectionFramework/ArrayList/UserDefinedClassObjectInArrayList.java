package CollectionFramework.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedClassObjectInArrayList {

	public static void main(String[] args) {
		Stuent s1= new Stuent(101,"Sonoo",23);
		 Stuent s2=new Stuent(102,"Ravi",21);  
		  Stuent s3=new Stuent(103,"Hanumat",25);  
		  ArrayList<Stuent>al =new ArrayList<Stuent>();
		  al.add(s1);
		  al.add(s2);
		  al.add(s3);
		  Iterator itr=al.iterator();
		  while(itr.hasNext())
			  
		  {
			  
		Stuent st=(Stuent)itr.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }
		  
		  

	}

}
