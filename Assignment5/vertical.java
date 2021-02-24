package Assignment5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 
class Values  
{ 
    int max, min; 
} 
   
public class Main
{ 
    Node root; 
    Values val = new Values(); 
    static Scanner s = new Scanner(System.in);

     void findMinMax(Node node, Values min, Values max, int hd)  
    { 
    	 if (node == null)  
             return; 
    
         if (hd < min.min)  
             min.min = hd; 
         else if (hd > max.max)  
             max.max = hd; 
    
         findMinMax(node.left, min, max, hd - 1); 
         findMinMax(node.right, min, max, hd + 1); 
     } 
     void printVerticalLine(Node node, int line_no, int hd)  
     { 
         if (node == null)  
             return; 
    
         if (hd == line_no)  
             System.out.print(node.data + " ");         
    
       
         printVerticalLine(node.left, line_no, hd - 1); 
         printVerticalLine(node.right, line_no, hd + 1); 
     } 
     void verticalOrder(Node node)  
     { 

         findMinMax(node, val, val, 0); 
    

         for (int line_no = val.min; line_no <= val.max; line_no++)  
         { 
             printVerticalLine(node, line_no, 0); 
             System.out.println(""); 
         } 
     }
     public Main() {
     	this.root=this.takeInput();
     }
 	 private Node takeInput() {
 int level =s.nextInt();
     int rootData = s.nextInt();
     if (rootData == -1) {
     return null;
     }
     Node rootNode = new Node(rootData);
     Queue<Node> pn = new LinkedList<>();
     pn.add(rootNode);
     while (!pn.isEmpty()) {
    	 Node fn = pn.remove();
    	    int lc = s.nextInt();
    	    if (lc != -1) {
    	    Node leftChild = new Node(lc);
    	    fn.left = leftChild;
    	    pn.add(leftChild);
    	    }
    	    int rc = s.nextInt();
    	    if (rc != -1) {
    	    Node rightChild = new Node(rc);
    	    fn.right = rightChild;
    	    pn.add(rightChild);
    	    }
    	    }
    	    return rootNode;
    	    } 
    	    public static void main(String args[])  
    	    { 
    	        
    	        
    	         Main tree = new Main(); 
    	       
    	        tree.verticalOrder(tree.root); 
    	    }
    	} 
