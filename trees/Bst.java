public class Bst {
    public class Node{
        private int val;
        private int height;
        private Node right;
        private Node left;
        Node(int val){
           this.val=val; 
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public Bst(){

    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;

        public boolean isEmpty(){
            return root==null;
        }
    }
    public void display(){
        display(root,"Root node: ")
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"Left Child of "+node.getValue()+" : ");
        display(node.right,"Right Child of "+node.getValue()+" : ");

    }
        
}
