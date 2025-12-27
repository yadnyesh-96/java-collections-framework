package org.ArrayList;

import java.util.*;

public class ArrayListApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Case 1: Add New element 
//		Case 2: View all elements
//		Case 3: Search element in ArrayList
//		Case 4: delete element from ArrayList 
//		Case 5: check the size of ArrayList 
//		Case 6: retrieve data from ArrayList 

		ArrayList al = new ArrayList();

		do {
			System.out.println("-----------------------------------");
			System.out.println("1.Add new element ");
			System.out.println("2.View All elements");
			System.out.println("3.Search element in ArrayList");
			System.out.println("4.Delete element from ArrayList");
			System.out.println("5.Check the size of ArrayList");
			System.out.println("6.Exit");
			System.out.println("-----------------------------------");
			System.out.println("\n\nEnter your Choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the value to add in collection:");
				int val = sc.nextInt();
				boolean b = al.add(val);
				if (b) {
					System.out.println("Value is Added");
				} else {
					System.out.println("Value is not added");
				}
				System.out.println("-----------------------------------");
				break;

			case 2:
				Iterator i = al.iterator();
				while (i.hasNext()) {
					Object obj = i.next();
					System.out.println(obj);
				}
				System.out.println("-----------------------------------");
				break;

			case 3:
				System.out.println("Enter the Value to serach in Collection:");
				int data = sc.nextInt();
				boolean c = al.contains(data);
				if (c) {
					System.out.println("Data present in Collection");
				} else {
					System.out.println("Data is not found !");
				}
				System.out.println("-----------------------------------");
				break;

			case 4:
				System.out.println("Enter the value to delete from collection");
				data = sc.nextInt();
				int index = al.indexOf(data);
				if (index != -1) {
					al.remove(index);
					System.out.println("Data removed");
				} else {
					System.out.println("Data not found");
				}
				
				System.out.println("-----------------------------------");
				break;

			case 5:
				System.out.println("Size of collection is: " + al.size());
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Wrong choice !");
			}

		} while (true);

	}

}
