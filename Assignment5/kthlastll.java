package Assignment5;

import java.util.Scanner;

public class kthlastll {

	private class Node {

		public Node(int val) {
			this.data = val;
		}

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(n)
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	// O(1)
		public int size() {
			return this.size;
		}

		public boolean isEmpty() {
			if (this.size == 0) {
				return true;
			}
			return false;
		}

		// O(1)
		public void add_at_Last(int element) {
			Node newnode = new Node(element);
			if (this.size == 0) {
				this.head = this.tail = newnode;
			} else {
				this.tail.next = newnode;
				this.tail = newnode;
			}
			this.size++;
		}
		// O(1)
		public void add_at_First(int element) {
			Node newnode = new Node(element);
			if (this.size == 0) {
				this.head = this.tail = newnode;
			} else {
				newnode.next = this.head;
				this.head = newnode;
			}
			this.size++;
		}

		// O(1)
		public int getFirst() throws Exception {
			if (this.size == 0) {
				throw new Exception("LinkedList Empty");
			}
			return this.head.data;
		}

		// O(1)
		public int getLast() throws Exception {
			if (this.size == 0) {
				throw new Exception("LinkedList Empty");
			}
			return this.tail.data;
		}

		// O(n)
		public int getAt(int index) throws Exception {
			if (this.size == 0) {
				throw new Exception("Linked List is Empty");
			}
			if (index < 0 || index >= this.size) {
				throw new Exception("Invalid Index");
			}

			Node temp = this.head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp.data;
		}

		// O(n)
		private Node getNodeAt(int index) throws Exception {
			if (this.size == 0) {
				throw new Exception("Linked List is Empty");
			}
			if (index < 0 || index >= this.size) {
				throw new Exception("Invalid Index");
			}

			Node temp = this.head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		}

		// O(n)
		public void addAt(int data, int index) throws Exception {
			if (index < 0 || index > this.size) {
				throw new Exception("Invalid Index");
			}
			if (index == 0)
				this.add_at_First(data);
			else if (index == this.size)
				this.add_at_Last(data);
			else {
				Node newnode = new Node(data);
				Node prev = this.getNodeAt(index - 1);
				newnode.next = prev.next;
				prev.next = newnode;
				this.size++;
			}
		}

		// O(1)
		public int removeFirst() throws Exception {
			if (this.size == 0) {
				throw new Exception("Linked List is Empty");
			}
			int rv = this.head.data;
			if (this.size == 1) {
				this.head = this.tail = null;
			} else {
				this.head = this.head.next;
			}
			this.size--;
			return rv;
		}

		// O(n) //can't be O(1)
		public int removeLast() throws Exception {
			if (this.size == 0) {
				throw new Exception("Linked List is Empty");
			}
			int rv = this.tail.data;
			if (this.size == 1) {
				this.head = this.tail = null;
			} else {
				this.tail = this.getNodeAt(this.size - 2);
				this.tail.next = null;
			}
			this.size--;
			return rv;
		}

		// O(n)
		public int removeAt(int index) throws Exception {
			if (this.size == 0) {
				throw new Exception("Linked List is Empty");
			}

			if (index == 0) {
				return this.removeFirst();
			} else if (index == this.size - 1) {
				return this.removeLast();
			}

			int rv = this.getAt(index);
			Node prev = this.getNodeAt(index - 1);
			prev.next = this.getNodeAt(index + 1);

			this.size--;
			return rv;
		}

		// without using size variable or function
		public int get_from_last(int index) {

			Node fwd = this.head, bwd = this.head;
			while (index > 0) {
				fwd = fwd.next;
				index--;
			}

			while (fwd != null) {
				fwd = fwd.next;
				bwd = bwd.next;
			}
			return bwd.data;
		}

	    public static void main(String args[]) {
	        
	            Scanner scn=new Scanner(System.in);
	            kthlastll list = new kthlastll();
	            while(true){
	                int n = scn.nextInt();
	                if(n!=-1){
	                    list.add_at_Last(n);
	                }else{
	                    break;
	                }
	           }
	           System.out.println(list.get_from_last(scn.nextInt()));
	    }
	}
			
