//BinaryTree.Node is already existing class//
public class Kth_Smallest_Element {
    int count=0;
    public int kthSmallest(BinaryTree.Node root,int k){
        return helper(root,k).val;
    }
    public BinaryTree.Node helper(BinaryTree.Node root,int k){
        if(root==null){
            return null;
        }
        BinaryTree.Node left=helper(root.left,k);
        if(left!=null){
            return left;
        }
        count++;
        if(count==k){
            return root;
        }
        return helper(root.right,k);
    }
}
