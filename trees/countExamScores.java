package trees;

import java.util.*;

public class countExamScores {

    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            left=right=null;
        } 
    }

    static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }

        if(data < root.data){
            root.left=insert(root.left,data);
        }
        else if(data > root.data){
            root.right=insert(root.right,data);
        }

        return root;
    }


    static int getCount(Node root, int l, int h) {
        if (root == null) 
            return 0;
    
        if (root.data >= l && root.data <= h) {
            return 1 + getCount(root.left, l, h) + getCount(root.right, l, h);
        } else if (root.data < l) {
            return getCount(root.right, l, h);
        } else { // root.data > h
            return getCount(root.left, l, h);
        }
    }    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int l=sc.nextInt();
        int h=sc.nextInt();

        Node root=null;
        

        
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.println(getCount(root,l,h));

    }
}
