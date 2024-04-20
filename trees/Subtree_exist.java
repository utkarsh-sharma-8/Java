public class Subtree_exist {
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
    public static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }
        if(root.value== subRoot.value){
            return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right); 
        }
        return false;
    }
    public static boolean subtree(Node root,Node subRoot){
        if(subRoot==null){
            return true;
        }if(root==null){
            return false;
        }if(root.value==subRoot.value){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return subtree(root.left,subRoot) || subtree(root.right,subRoot);
    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes2[]={1,2,-1-1,3,-1,-1};
        BinaryTree tree=new BinaryTree();
        BinaryTree tree2=new BinaryTree();
        Node root=tree.buildTree(nodes);
        Node root2=tree2.buildTree(nodes2);
        // System.out.println(root.right.value);
        System.out.println(subtree(root,root2));
        
    }
}
