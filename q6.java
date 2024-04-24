import java.util.*;

public class q6 {
    static int LH;
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    static int height(Node root){
        if(root==null){
            return 0;
        }

        int left=height(root.left);
        int right=height(root.right);

        return 1+Math.max(left, right);

    }

    static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Node root=null;

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            root=insert(root,sc.nextInt());
        }
        sc.close();
        System.out.println(height(root));
        
    }
}
