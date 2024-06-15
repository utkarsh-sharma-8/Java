public class Max_path_Sum {
    int ans=Integer.MIN_VALUE;
    public int maxSum(BinaryTree.Node root){
        helper(root);
        return ans;
    }
    public int helper(BinaryTree.Node node){
        if(node==null){
            return 0;
        }

        int left=helper(node.left);
        int right=helper(node.right);
        left=Math.max(0,left);
        right=Math.max(0,right);
        int pathSum=left+right+node.val;

        ans=Math.max(ans, pathSum);

        return Math.max(left,right)+node.val;
    }
}
