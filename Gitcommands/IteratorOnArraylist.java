package collectionInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorOnArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> data=new ArrayList<>();
		 
		data.add(234);
		data.add(24);
		data.add(34);
		data.add(554);
		data.add(24);
		System.out.println(data);
		data.remove(3);
		System.out.println(data);
		System.out.println(data.size());
		data.add(56);
		System.out.println(data);
		  
		 Iterator <Integer> itr = data.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		}
		 for(;itr.hasNext();)
		 {
			 System.out.println(itr.next()); 
		 }
	}

}
