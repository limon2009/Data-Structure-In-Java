package com.monirthought.linkedList;

/**
 * Main class to test the functions of our own linkedList.
 * 
 * @author Moniruzzaman Md
 *
 */
public class Main {

	public static void main(String args[]) {

		MyOwnLinkedList myLinkedList = new MyOwnLinkedList();

		myLinkedList.add(3);
		myLinkedList.add(5);
		myLinkedList.add(100);
		myLinkedList.add(1);

		printListWithSize(myLinkedList);

		System.out.println("The list contains 1 = " + myLinkedList.contain(1));
		System.out.println("The list contains 50 = " + myLinkedList.contain(50));
		System.out.println("Index of 100 is: " + myLinkedList.IndexOf(100));

		myLinkedList.remove(100);
		System.out.println("The list contains 100 = " + myLinkedList.contain(100));
		printListWithSize(myLinkedList);

		myLinkedList.remove(3);
		printListWithSize(myLinkedList);

		myLinkedList.remove(1);
		printListWithSize(myLinkedList);

		try {
			myLinkedList.get(10);
		} catch (IndexOutOfBoundsException indexException) {
			indexException.printStackTrace();
		}
	}

	private static void printListWithSize(MyOwnLinkedList myLinkedList) {

		System.out.println("List Size: " + myLinkedList.size());
		for (int i = 0; i < myLinkedList.size(); i++) {
			System.out.print(myLinkedList.get(i) + " ");
		}
		System.out.println();
	}
}
