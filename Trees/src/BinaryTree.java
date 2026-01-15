import java.util.*;

public class BinaryTree {

    public class Node{
        int value;
        Node right;
        Node left;

        public Node(int value){
            this.value = value;
        }
    }

    public Node root;

    public void populate(Scanner sc){
        System.out.println("Enter the root value");
        int value  = sc.nextInt();
        root = new Node(value);
        populate(sc , root);
    }

    public void populate(Scanner sc , Node root){
        System.out.println("Do you want to enter the left of" + " "+ root.value);
        boolean left = sc.nextBoolean();
        if(left){
            int value = sc.nextInt();
            root.left = new Node(value);
            populate(sc , root.left);
        }


        System.out.println("Do you want to enter the right of" + " "+ root.value);
        boolean right = sc.nextBoolean();
        if(right){
            int value =sc.nextInt();
            root.right = new Node(value);
            populate(sc , root.right);
        }
    }

    public void display(){
        display(this.root , " ");
    }

    public void display(Node root , String indent){
        if(root == null){
            return;
        }
        System.out.println(indent + root.value);
        display(root.left , indent + "   " + "\t");
        display(root.right , indent + "   "+ "\t");
    }
}


