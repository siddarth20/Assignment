package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsFunctions {
	
	static ArrayList<String> arrayList = new ArrayList<>();
	static LinkedList<String> countries = new LinkedList<>();
	
	public static void main(String[] args) {
		System.out.println("Array Lists");
		arrayList.add("Siddarth");
		arrayList.add("Thomas");
		arrayList.add("Mary");
		System.out.println("Printing the array list:- "+arrayList);
		  
	    removeNameByposition(0);
	    System.out.println("Removing the first element:- "+arrayList);
	    
	    System.out.println("Getting the first element:- "+arrayList.get(0));
	    
	    removeNameByString("Thomas");
	    System.out.println("Removing String from list "+arrayList);
	    
	    modifyName(0,"Pooja");
	    System.out.println("Modifying the first position "+arrayList);
	    
	    int position = search("Pooja");
	    
	    System.out.println("Finding index of String 'Pooja' :- "+position);
	    
	    arrayList.add("Siddarth");
		arrayList.add("Thomas");
		arrayList.add("Mary");
	    
	    Collections.sort(arrayList);
	    Collections.reverse(arrayList);
	    
	    System.out.println("Sorting the array list using Collections :- "+arrayList);
	    System.out.println("\n");
	    
	    System.out.println("Linked Lists");
	    countries.add("India");
		countries.add("USA");
		countries.add("Brazil");
		countries.add("Aus");
		countries.add("Germany");
		System.out.println(countries);
		
		System.out.println("Printing list using Iterator");
		printList(countries);
		}
		
		static void displayList(ArrayList<String> names) {
			for(String name:names) {
				System.out.println(name);
			}
		}
		
		static void removeNameByposition(int position) {
			arrayList.remove(position);
		}
		
	    static void removeNameByString(String name) {
		arrayList.remove(name);
			
		}
	    
	    static void modifyName(int position,String newName) {
		arrayList.set(position, newName);
	}
	    
	    static int search(String name) {
	return(arrayList.indexOf(name));
	}
	    static void printList(List<String> list) { //Making use of List interface
			Iterator<String> iterator = list.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
				}
		
			}
}


