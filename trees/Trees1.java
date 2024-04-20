import java.util.LinkedList;
import java.util.Queue;

/**
 * Trees1
 */
public class Trees1 {
    static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;  
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] ==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    //preorder code
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //inorder code
    public static void  inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    //postorder code
    public static void  postorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.right);
        System.out.print(root.value+" ");
        inorder(root.left);
    }
    public static void level(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.value+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);    
                }
                if (currNode.right!=null) {
                    q.add(currNode.right);                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.value);
        // preorder(root);
        // inorder(root);
        // postorder(root);
        level(root);
    }
}