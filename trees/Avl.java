public class Avl {
    public class Node{
        private int val;
        private Node left;
        private Node right;
        private int height;
        public Node(int val){
            this.val=val;
        }
        public int getValue(){
            return val;
        }
    }
    private Node root;
    public int height(){
        return height(root);
    }
    private int height(Node node){
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
        return rotate(node);
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

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy case
            if(height(node.left.left)-height(node.left.right)>0){
            //left left case
            return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
            //left right case
            node.left=leftRotate(node.left);
            return rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right)<-1){
            //right heavy case
            if(height(node.right.left)-height(node.right.right)<0){
            //right right case
            return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right) > 0){
            //left right case
            node.left=rightRotate(node.right);
            return leftRotate(node);
            }
        }
        return node;
    }
    public Node rightRotate(Node p){
        Node c=p.left;
        Node t=c.right;
        c.right=p;
        p.left=t;

        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(p.left),height(c.right)+1);

        return c;
    }
    public Node leftRotate(Node c){
        Node p=c.right;
        Node t=p.left;
        p.left=c;
        c.right=t;
        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(p.left),height(c.right)+1);

        return p;
    }
    public static void main(String[] args){
        Avl tree=new Avl();
        for(int i=0;i<1000;i++){
            tree.insert(i);
        }

        System.out.println(tree.height());
    }
    
}
