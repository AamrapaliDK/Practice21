package collectionInJava;

import java.util.ArrayList;

import myfirstpackage.HumanBeing;

public class Hashmap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HumanBeing h1 = new HumanBeing();
h1.name="Sajid";
h1.weight=45.77f;
h1.age=67;
HumanBeing h2 = new HumanBeing();
h2.name="Asad";
h2.weight=67.77f;
h2.age=60;
ArrayList<HumanBeing> data = new ArrayList<>();
data.add(h1);
data.add(h2);
HumanBeing a=data.get(1);
System.out.println(a.age);
System.out.println(a.weight);
System.out.println(a.name);
HumanBeing aa=data.get(0);
System.out.println(aa.age);
System.out.println(aa.weight);
System.out.println(aa.name);
System.out.println(data.get(0).name);
System.out.println(data.get(0).weight);
System.out.println(data.get(0).age);
System.out.println(data.get(1).name);
System.out.println(data.get(1).weight);
System.out.println(data.get(1).age);
	}

}
