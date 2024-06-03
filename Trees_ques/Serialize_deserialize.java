import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Serialize_deserialize{
    public List<String> serialize(BinaryTree.Node node) {
        List<String> list=new ArrayList<>();
        helper(node,list);
        return list;
    }

    void helper(BinaryTree.Node node,List<String> list){
        if(node==null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));

        helper(node.left,list);
        helper(node.right,list);
    }
    // Decodes your encoded data to tree.
    public BinaryTree.Node deserialize(List<String> list) {
        Collections.reverse(list);
        BinaryTree.Node node=helper2(list);
        return node;
    }
    BinaryTree.Node helper2(List<String> list){
        String val=list.remove(list.size()-1);

        if(val.charAt(0=="n")){
            return null;
        }
        BinaryTree.Node node=new BinaryTree.Node(Integer.parseInt(val));

        node.left=helper2(list);
        node.right=helper2(list);

        return node;
        // BinaryTree.Node node1=new BinaryTree.Node(Integer.parseInt(val));
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
