public class Sum_Root_To_Leaf {
    public int sumNumbers(BinaryTree.Node root) {
        return helper(root,0);
    }
    public int helper(BinaryTree.Node node ,int sum){
        if(node==null){
            return 0;
        }

        sum=sum*10+node.val;

        if(node.left==null && node.right==null){
            return sum;
        }
        return helper(node.left,sum)+helper(node.right,sum);
    }
}
