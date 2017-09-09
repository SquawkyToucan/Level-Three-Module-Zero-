package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("macbook");
		array.add("inspiron");
		array.add("chromebook");
		array.add("surface book");
		array.add("diy");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		//4. Print all the Strings using a for-each loop
		System.out.println("");
		for(String i : array) {
			System.out.println(i);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("");
		for(int i = 0; i < array.size(); i = i + 2) {
			System.out.println(array.get(i));
		}
		//6. Print all the Strings in reverse order.
		System.out.println("");
		for(int i = 4; i > -1; i--) {
			System.out.println(array.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("");
		for(String i : array) {
			if(i.contains("e")) {
				System.out.println(i);
			}
		}
	}
}
