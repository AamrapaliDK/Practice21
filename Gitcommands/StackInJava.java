package collectionInJava;

import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack <String> data =new Stack<>();
data.push(null);
data.push("Amit");
data.push("ajay");
data.push("Sagar");
System.out.println(data);
String str=data.pop();
System.out.println(str);
data.add( "sandy");
System.out.println(data);
	}

}
