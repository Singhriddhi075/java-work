package Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class sumatklevel {

    static Scanner sc = new Scanner(System.in);

    public class Node {

        int data;
        ArrayList<Node> children;

        Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    private Node root;
    private int size;

    sumatklevel() {
        
        this.root = buildtree(null, 0);
    }

    private Node buildtree( Node parent, int ithchild) {
        //root node
    	int d = sc.nextInt();
        Node nn = new Node(d);
        this.size++;

        //children
        int children = sc.nextInt();

        for (int i = 0; i < children; i++) {
            Node child = this.buildtree( nn, i);
            nn.children.add(child);
        }

        return nn;
    }

    public int sum(int k) {
        return sum(this.root, k);
    }

    private int sum(Node node, int k) {
        if (node == null) {
            return 0;
        }

        if (k == 0) {
        	return node.data;
        }
        int sum1 = 0;
        for (int i = 0; i < node.children.size(); i++) {
            sum1 += sum(node.children.get(i), k - 1);
        }

        return sum1;
    }

    public static void main(String[] args) {
        sumatklevel tree = new sumatklevel();
        int m = sc.nextInt();
        System.out.println(tree.sum(m));

    }
}
        
        
