package collectionInJava;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> readeddata=getData();
for(Entry<String, String> each:readeddata.entrySet())
{
System.out.println(each.getKey());
System.out.println(each.getValue());
}
	}
public static HashMap<String,String> getData()
{
	HashMap <String,String> dt =new HashMap<>();
	dt.put( "F_name", "Aamrapali");
	dt.put( "L_name", "Khandagale");
	dt.put( "City", "Sangola");
	 System.out.println(dt);
	 return dt;
}
}
