import java.util.Scanner;

public class q7 {
   static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }

    }
    static int lca(Node root,int n1,int n2){
        if(root==null) return -1;

        if(n1<=root.data && n2>=root.data){
            return root.data;
        }

        else if(n1<root.data && n2<root.data){
            return lca(root.left,n1,n2);
        }

        else if(n1>root.data && n2>root.data){
            return lca(root.right,n1,n2);
        }

        return -1;

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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root=null;
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            root=insert(root,sc.nextInt());
        }
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println(lca(root,n1,n2));
    }
}
