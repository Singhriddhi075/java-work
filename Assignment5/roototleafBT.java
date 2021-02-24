package Assignment5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class roototleafBT {

static Scanner obj = new Scanner(System.in);
	
	public static void main(String[] args) {
		roototleafBT m = new roototleafBT();
		BinaryTree bt = m.new BinaryTree();
		int target=obj.nextInt();
		bt.find(bt.root,0, target,"");
		bt.print();
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

		ArrayList<String> list=new ArrayList<String>();
		
		public void print()
		{
			list = new ArrayList<String>(new LinkedHashSet<String>(list));
			for(String val:list)
				System.out.println(val);
		}
		
		public void find(Node node, int sum,int target,String ans) {
			// TODO Auto-generated method stub
			
			if(node==null)
			{
				if(sum==target)
				{
					list.add(ans);
				}
				return;
			}
			
			find(node.left, sum+node.data, target, ans+node.data+" ");
			find(node.right, sum+node.data, target, ans+node.data+" ");
		}

		public Node takeInput(Node parent, boolean ilc) {
			
			int cdata = obj.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = obj.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = obj.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}
		
		
		
	}
}