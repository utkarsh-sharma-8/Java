public class Count_of_nodes {
    public static int node=0;
    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
        }
    }
    public static int count(Node root){

        if(root==null){
            return 0;
        }
        int leftNodes=count(root.left);
        int rightNodes=count(root.right);

        return leftNodes+rightNodes+1;
    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.right.value);
        System.out.println(count(root));
        
    }
}
