package Assignment5;

import java.util.Scanner;
import java.util.Stack;

public class levelorderzigzagBT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		levelorderzigzagBT m = new levelorderzigzagBT();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {
			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void levelOrderZZ() {
			levelOrderZZ(this.root);
		}
		private void levelOrderZZ(Node node) {
			Stack<Node> s1 = new Stack<>();
			Stack<Node> s2 = new Stack<>();
			s1.push(node);
			int count = 0;

			// while (!s1.isEmpty() || !s2.isEmpty()) {
			while (!s1.isEmpty()) {
				Node temp = s1.pop();
				if (temp != null)
					System.out.print(temp.data + " ");

				// if (temp.left != null) {
				// s2.push(temp.left);
				// }
				//
				// if (temp.right != null) {
				// s2.push(temp.right);
				// }

				if (count % 2 == 0) {
					if (temp.left != null)
						s2.push(temp.left);
					if (temp.right != null)
						s2.push(temp.right);
				} else {
					if (temp.right != null)
						s2.push(temp.right);
					if (temp.left != null)
						s2.push(temp.left);
				}

				// while (!s2.isEmpty()) {
				// Node temp = s2.pop();
				// System.out.print(temp.data + " ");
				//
				// if (temp.right != null) {
				// s1.push(temp.right);
				// }
				//
				// if (temp.right != null) {
				// s1.push(temp.left);
				// }
				// }

				if (s1.isEmpty()) {
					// System.out.println();
					s1 = s2;
					s2 = new Stack<>();
					count++;
				}

			}
		}

	}
}