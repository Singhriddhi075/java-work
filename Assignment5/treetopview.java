package Assignment5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class treetopview {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		treetopview m = new treetopview();
		BinaryTree tree = m.new BinaryTree(sc);
		tree.topView();

    }

    class BinaryTree {

	    class Node {
	        int data;
	        int hd;
	        Node left;
	        Node right;

	        Node(int data) {
	            this.data = data;
	            this.hd = Integer.MAX_VALUE;
	            this.left = this.right = null;
	        }

	    }

	    public BinaryTree(Scanner s) {  // Binary tree must be made like this to store the value of root .. Your was poorly made as the value of root was lost
	        this.root = this.takeInput(s);
	    }

	    Node root;
	    
	    public Node takeInput(Scanner s) {  //Modified takeInput method as in your method the program stops taking input after first -1 while that might not always be the case
	        // enter the element for the root
	        Queue<Node> q = new LinkedList<>();
	        int data = s.nextInt();
	        Node node = new Node(data);
	        if(data != -1) {
	       
	        q.add(node);
	        }
	        while (!q.isEmpty()) {
	            Node temp = q.poll();
	            data = s.nextInt();
	           
	            if (data != -1) {
	            	 temp.left = new Node(data);
	                q.add(temp.left);
	            }
	            data = s.nextInt();
	            
	            if (data != -1) {
	            	temp.right = new Node(data);
	                q.add(temp.right);
	            }
	        }
	        return node;
	    }
	    
	    public void topView() {
	    	topView(this.root);
	    }
	    
	    private void topView(Node root) {
	    	if(root == null) {
	    		return;
	    		
	    	}
	    	
	    	Queue<Node> q = new LinkedList<>();
	    	root.hd =0;
	    	q.add(root);
	    	TreeMap<Integer,Integer> map = new TreeMap<>();
	    	while(!q.isEmpty()) {
	    		Node rn = q.remove();
	    		if(!map.containsKey(rn.hd)) {
	    			map.put(rn.hd,rn.data);
	    		}
	    		
	    		if(rn.left != null) {
	    			rn.left.hd = rn.hd -1;
	    			q.add(rn.left);
}
	    		
	    		if(rn.right != null) {
	    			rn.right.hd = rn.hd +1;
	    			q.add(rn.right);
	    		}
	    	}
	    	
	    	for(int key : map.keySet()) {
	    		System.out.print(map.get(key)+" ");
	    	}
	    }

}
}
