import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Populating_Next_Right {
    public List<List<Integer>>  LevelOrder(BinaryTree.Node root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<BinaryTree.Node> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> currentLevel=new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                BinaryTree.Node currNode=queue.poll();
                currentLevel.add(currNode.val);
                if(currNode.left!=null){
                    queue.offer(currNode.left);
                }if(currNode.right!=null){
                    queue.offer(currNode.right);
                }
            }result.add(currentLevel);
        }
        return result;

    }
    public static void main(String[] args) {
        
    }
}
class BinaryTree {
    public class Node{
        public int val;
        public Node left;
        public Node right;
        public Node next;
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
