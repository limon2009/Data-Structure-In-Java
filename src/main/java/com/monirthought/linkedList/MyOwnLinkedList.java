package com.monirthought.linkedList;

/**
 * Doubly-linked list implementation for Integer Type
 * 
 * @author Moniruzzaman Md
 *
 */
public class MyOwnLinkedList {

	/* Reference of the first element */
	private Node root = null;

	/* Reference of the last element */
	private Node top = null;

	/* Keep information of the total element of the list */
	private Integer totalSize = 0;

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * @param value
	 */
	public void add(Integer value) {

		/* This is the very first element of the list */
		if (null == root) {
			root = new Node(value);
			top = root;
			this.totalSize++;
			return;
		}

		Node node = new Node(value);
		top.setNext(node);
		node.setPrevious(top);
		top = node;
		this.totalSize++;
	}

	/**
	 * Removes the first occurrence of the specified element from this list, if it
	 * is present. If this list does not contain the element, it is unchanged
	 * 
	 * @param value
	 */
	public void remove(Integer value) {
		/* List is empty, nothing to remove */
		if (null == root) {
			return;
		}
		/* Value is found at the first position in List */
		if (root.getValue().intValue() == value) {
			/* Only one element in the List */
			if (null == root.getNext()) {
				root = null;
				top = null;
				this.totalSize--;
				return;
			}
			Node next = root.getNext();
			next.setPrevious(null);
			root = next;
			this.totalSize--;
			return;
		}

		Node node = root.getNext();
		Boolean found = false;
		for (int i = 0; i < this.totalSize; i++) {
			if (node.getValue().intValue() == value.intValue()) {
				found = true;
				break;
			}
			node = node.getNext();
		}
		/* Value not available in the list */
		if (!found) {
			return;
		}
		/* Value is the last element of the List */
		if (null == node.getNext()) {
			top = node.getPrevious();
			top.setNext(null);
			this.totalSize--;
			return;
		}
		/* Value available in between two node(element) */
		node.getPrevious().setNext(node.getNext());
		/* Isolate the node */
		node.setPrevious(null);
		node.setNext(null);
		this.totalSize--;
	}

	/**
	 * Returns true if this list contains the specified element
	 * 
	 * @param value
	 * @return
	 */
	public Boolean contain(Integer value) {

		/* There is no element */
		if (0 == this.totalSize) {
			return false;
		}

		Node node = root;
		for (int i = 0; i < this.totalSize; i++) {
			if (node.getValue().intValue() == value.intValue()) {
				return true;
			}
			node = node.getNext();
		}
		return false;
	}

	/**
	 * Returns the index of the first occurrence of the specified element in this
	 * list, or -1 if this list does not contain the element.
	 * 
	 * @param value
	 * @return
	 */
	public Integer IndexOf(Integer value) {

		/* There is no element */
		if (0 == this.totalSize) {
			return -1;
		}
		Node node = root;
		for (int i = 0; i < this.totalSize; i++) {
			if (node.getValue().intValue() == value.intValue()) {
				return i;
			}
			node = node.getNext();
		}
		return -1;
	}

	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param index
	 * @return
	 * @throws IndexOutOfBoundsException
	 *             - if the index is out of range (index < 0 || index >= size())
	 */
	public Integer get(Integer index) throws IndexOutOfBoundsException {

		/* Out of bound */
		if (index < 0 || index >= this.totalSize) {
			throw new IndexOutOfBoundsException();
		}
		/* Return first element */
		if (0 == index) {
			return root.getValue();
		}
		Node node = root;
		for (int i = 0; i < index; i++) {
			node = node.getNext();
		}
		return node.getValue();
	}

	/**
	 * Returns the number of elements in this list.
	 * 
	 * @return
	 */
	public Integer size() {
		return this.totalSize;
	}
}
