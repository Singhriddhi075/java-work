package Assignment5;

import java.util.*;

public class treerightview {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree(sc); // Must be made using constructor
        tree.rightView(1);
    }

}

class BinaryTree {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }

    }
    public BinaryTree(Scanner s) {  // Binary tree must be made like this to store the value of root .. Your was poorly made as the value of root was lost
        this.root = this.takeInput(s);
    }

    Node root;
    static int maxLevel = 0;  // Added this for maxLevel as that maxLevel earlier could not retain a value but this one being static can retain value

    public Node takeInput(Scanner s) {  //Modified takeInput method as in your method the program stops taking input after first -1 while that might not always be the case
        // enter the element for the root
        Queue<Node> q = new LinkedList<>();
        int data = s.nextInt();
        Node node = new Node(data);
        q.add(node);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            data = s.nextInt();
            temp.left = new Node(data);
            if (temp.left.data != -1) {
                q.add(temp.left);
            }
            data = s.nextInt();
            temp.right = new Node(data);
            if (temp.right.data != -1) {
                q.add(temp.right);
            }
        }
        return node;
    }

    public void rightView(int level) {
        this.rightView(this.root, level);
    }

    private void rightView(Node node, int level) {
        if (node == null || node.data == -1) {
            return;

        }

        if (maxLevel < level) {
            System.out.print(node.data + " ");
            maxLevel = level;
        }
        if (node.right != null)
            rightView(node.right, level + 1);
        if (node.left != null)
            rightView(node.left, level + 1);

    }

}