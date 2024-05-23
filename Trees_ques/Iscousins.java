
public class Iscousins {
    public boolean isCousins(TreeNode.Node root,int x,int y){
        TreeNode.Node xx=findNode(root,x);
        TreeNode.Node yy=findNode(root,y);

        return(
            (level(root,xx,0)==level(root,yy,0)) && (!isSibling(root,xx,yy))
        );
    }
    TreeNode.Node findNode(TreeNode.Node node,int x){
        if (node ==null){
            return null;
        }
        if(node.val==x){
            return node;
        }
        TreeNode.Node n=findNode(node.left,x);
        if(n!=null){
            return n;
        }
        return findNode(node.right,x);
    }
    boolean isSibling(TreeNode.Node node,TreeNode.Node x,TreeNode.Node y){
        if(node==null){
            return false;
        }
        return (
            (node.left == x && node.right == y) || (node.left==y && node.right==x)
            ||(isSibling(node.left, x, y)) || (isSibling(node.right, x, y))
        );
    }

    int level (TreeNode.Node node, TreeNode.Node x,int lev){
        if(node==null){
            return 0;
        }
        if(node==x){
            return lev;
        }

        int l=level(node.left,x,lev+1);
        if(l!=0){
            return l;
        }
        return level(node.right,x,lev+1);
    }
}
class TreeNode {
    public class Node{
        public int val;
        public Node left;
        public Node right;
        private int height;
        public Node(int val){
            this.val=val;
        }
        public int getValue(){
            return val;
        }
    }
    private Node root;
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
            return root== null;
    }
    public void insert(int value){
        root=insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value < node.val){
            node.left=insert(value,node.left);
        }
        if(value > node.val){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right)) + 1 ;
        return node;
    }
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void display (){
        display(this.root,"Root Node: ");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.val);
        display(node.left,"Left child of"+node.val+" : ");
        display(node.right,"Right child of"+node.val+" : ");
    }

}
