package com.monirthought.linkedList;

/**
 * Node class - contains information of node (element) of the linked list.
 * 
 * @author Moniruzzaman Md
 *
 */
public class Node {

	/* Content of the node */
	private Integer value;

	/* Hold the reference of the next node */
	private Node next = null;

	/* Hold the reference of the previous node */
	private Node previous = null;

	public Node(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

}
