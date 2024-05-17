import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Right_side_view{
    public List<Integer> rightSideView(Binary.Node root){
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Binary.Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                Binary.Node currentNode=queue.poll();

                if(i == levelSize-1){
                    result.add(currentNode.val);
                }
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            
        }
        return result;
    }    
}