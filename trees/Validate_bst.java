import java.util.Scanner;
public class Validate_bst{
    public boolean isValidBst(BinaryTree.Node root){
       return helper (root,null,null);
    }
    public boolean helper(BinaryTree.Node node,Integer low,Integer high){
        if(node==null){
            return true;
        }
        if(low!=null && node.val<=low){
            return false;
        }if(node!=null && node.val>=high){
            return false;
        }
        boolean leftTree=helper(node.left,low,node.val);
        boolean rightTree=helper(node.right,node.val,high);

        return leftTree&&rightTree;
    }
}


class BinaryTree {
    class Node{
        int val;
        Node right;
        Node left;
        public Node(int val){
            this.val=val;
        }
    }
    private Node root;

    public void populate (Scanner scanner){
        System.out.println("Enter the root Node");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of "+node.val);
        boolean left =scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of"+node.val);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter right of "+node.val);
        boolean right =scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of"+node.val);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.val);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner (System.in);
        BinaryTree tree=new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }
}
