public class FlattenBinaryTree {
    public void flatten(TreeNode.Node root){
        TreeNode.Node current=root;
        while(current != null){
            if(current.left != null){
                TreeNode.Node temp=current.left;
            while(temp.right!=null){
                temp=temp.right;
            }

            temp.right=current.right;
            current.right=current.left;
            current.left=null;
        }
        current=current.right;
        }
    }
}
// class TreeNode {
//     public class Node{
//         public int val;
//         public Node left;
//         public Node right;
//         private int height;
//         public Node(int val){
//             this.val=val;
//         }
//         public int getValue(){
//             return val;
//         }
//     }
//     private Node root;
//     public int height(Node node){
//         if(node==null){
//             return -1;
//         }
//         return node.height;
//     }
//     public boolean isEmpty(){
//             return root== null;
//     }
//     public void insert(int value){
//         root=insert(value,root);
//     }
//     private Node insert(int value,Node node){
//         if(node==null){
//             node=new Node(value);
//             return node;
//         }
//         if(value < node.val){
//             node.left=insert(value,node.left);
//         }
//         if(value > node.val){
//             node.right=insert(value,node.right);
//         }
//         node.height=Math.max(height(node.left),height(node.right)) + 1 ;
//         return node;
//     }
//     public void populate(int[] nums){
//         for(int i=0;i<nums.length;i++){
//             this.insert(nums[i]);
//         }
//     }
//     public boolean balanced(){
//         return balanced(root);
//     }
//     private boolean balanced(Node node){
//         if(node==null){
//             return true;
//         }
//         return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
//     }
//     public void display (){
//         display(this.root,"Root Node: ");
//     }
//     private void display(Node node,String details){
//         if(node==null){
//             return;
//         }
//         System.out.println(details+node.val);
//         display(node.left,"Left child of"+node.val+" : ");
//         display(node.right,"Right child of"+node.val+" : ");
//     }

// }
