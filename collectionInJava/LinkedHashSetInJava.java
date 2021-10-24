package collectionInJava;

import java.util.LinkedHashSet;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet <Integer> data = new  LinkedHashSet<>();
data.add(null);
data.add(null);
data.add(234);
data.add(24);
data.add(34);
data.add(554);
data.add(24);
System.out.println(data);
data.remove(554);
System.out.println(data);
System.out.println(data.size());
data.add(56);
System.out.println(data);
for(Integer each:data)
{
	System.out.println(each);	
}
	}

}
