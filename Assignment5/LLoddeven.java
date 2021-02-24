package Assignment5;

import java.util.LinkedList;
import java.util.Scanner;

class LinkedListOE {

	private class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return tail.data;
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public int removeFirst() throws Exception {
		Node fn = this.head;

		if (this.size == 0)
			throw new Exception("linked list is empty");

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			Node np1 = this.head.next;
			this.head = np1;
			size--;
		}

		return fn.data;
	}

	public void partition() throws Exception {

		LinkedListOE odd = new LinkedListOE();
		LinkedListOE even = new LinkedListOE();

		while (this.size != 0) {
			int temp = this.removeFirst();
			if (temp % 2 != 0)
				odd.addLast(temp);
			else
				even.addLast(temp);
		}

		if (even.head != null && odd.head != null) {
			odd.tail.next = even.head;
			odd.tail = even.head;
			odd.size += even.size;

			this.head = odd.head;
			this.tail = odd.tail;
			this.size = odd.size;
		}
		
		else if(even.head==null)
		{
			this.head = odd.head;
			this.tail = odd.tail;
			this.size = odd.size;
		}
		
		else if(odd.head==null)
		{
			this.head = even.head;
			this.tail = even.tail;
			this.size = even.size;
		}
			
	}

	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedListOE ll = new LinkedListOE();
		int n = scn.nextInt();

		for (int j = 0; j < n; j++) {
			int item = scn.nextInt();
			ll.addLast(item);
		}

		ll.partition();
		ll.display();

	}
}