package edu.kis.vh.nursery.list;

public class IntLinkedList {

    Node last;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    // TODO: Implementacja pełności - warto dodać kontrolę na rozmiar listy
    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
    
    private class Node {
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

}
