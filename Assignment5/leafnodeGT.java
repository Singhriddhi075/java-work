package Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class leafnodeGT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		leafnodeGT m = new leafnodeGT();
		GenericTree gt = m.new GenericTree();
		System.out.println(gt.countLeafNodes());
	}

	private class GenericTree {
		private class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
		}

		private Node root;

		public GenericTree() {
			this.root = this.takeInput(scn, null, -1);
		}

		private Node takeInput(Scanner scn, Node parent, int i) {

			int childData = scn.nextInt();

			int numGC = scn.nextInt();

			Node child = new Node();
			child.data = childData;

			for (int j = 0; j < numGC; j++) {
				Node gc = this.takeInput(scn, child, j);
				child.children.add(gc);
			}

			return child;
		}

		public int countLeafNodes() {
			return this.countLeafNodes(this.root);
		}

		private int countLeafNodes(Node node) {

			if(node==null)
				return 0;
			
			int t=0;
			
			if(node.children.size()==0)
				t++;
			
			else
			{
				for(Node child:node.children)
				{
					t+=countLeafNodes(child);
				}
			}
			
			return t;
		}
	}

}