package collectionInJava;

import java.util.HashSet;
import java.util.Iterator;

public class ItratorOnHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> data = new HashSet<>();
		data.add(null);
		data.add(null);
		data.add(234);
		data.add(24);
		data.add(34);
		data.add(554);
		data.add(24);
		System.out.println(data);
		data.remove(24);
		System.out.println(data);
		System.out.println(data.size());
		data.add(56);
		System.out.println(data);
		 Iterator <Integer> itr =data.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	}

}
