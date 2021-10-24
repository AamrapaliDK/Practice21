package collectionInJava;

import java.util.ArrayList;
 
import java.util.Collections;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> data=new ArrayList<>();
//data.add(null);
//data.add(null);
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
Collections.sort(data);
System.out.println(data);
System.out.println(data.get(5));
for(int i=0;i<data.size();i++)
{
	System.out.println(data.get(i));
}

for(Integer each:data)
{
	System.out.println(each);	
}
	}
}
