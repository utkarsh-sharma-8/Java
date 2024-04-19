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
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
    }
}