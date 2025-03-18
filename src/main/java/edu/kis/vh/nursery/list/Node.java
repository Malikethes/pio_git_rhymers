package edu.kis.vh.nursery.list;

public class Node {

    private int value;
    private Node prev;
	private Node next;

    public Node(int valueTemp) {
        setValue(valueTemp);
    }

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
