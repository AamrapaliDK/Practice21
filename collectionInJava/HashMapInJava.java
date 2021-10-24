package collectionInJava;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> data = new HashMap<>();
data.put( 1, "Amit");
data.put( 2, "Ajit");
data.put( 3, "Sagar");
data.put( 4, "gita");
data.put( 5, "sita");
data.put( 6, "amar");
System.out.println(data);
System.out.println(data.get(0));
System.out.println(data.get(1));
System.out.println(data.get(3));

HashMap <String,String> dt =new HashMap<>();
dt.put( "F_name", "Aamrapali");
dt.put( "L_name", "Khandagale");
dt.put( "City", "Sangola");
System.out.println(dt);
 System.out.println(dt.get("L_name"));
 dt.put(null, "Mahi");
 dt.put(null, "Ruhi");
 dt.put( "aaa", null);
 dt.put( "bbb", null);
 dt.put( "F_name", "Bhagyashree");
 dt.put( "Khandagale", "Aamruta");
  dt.put(dt.getOrDefault(null, "SASS"), null);
 System.out.println(dt);
 for(Entry<String, String> each : dt.entrySet())
 {
	 System.out.println(each.getKey());
	 System.out.println(each.getValue());
	 
 }
 
	}

}
