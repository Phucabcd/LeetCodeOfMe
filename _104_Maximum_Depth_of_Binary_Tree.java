import java.util.LinkedList;
import java.util.Queue;

public class _104_Maximum_Depth_of_Binary_Tree {
     public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
             }
         }
    public int maxDepth(TreeNode root) {
        //solution 1 : DFS recursive stack || chay doc 
        //     if(root == null){
        //         return 0;
        //     }
        //     int left = maxDepth(root.left);
        //     int right = maxDepth(root.right);
    
        //     return Math.max(left, right) + 1;
        // }

        //solution 2 : BFS iterative queue || chay ngang
           if(root == null){
            return 0;
        }
      
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while(!queue.isEmpty()){
            int curSize = queue.size();

            for(int i = 0; i < curSize; i++){
                TreeNode curNode = queue.poll();
                if(curNode.left != null) queue.add(curNode.left);
                if(curNode.right != null) queue.add(curNode.right);
            }
            level++;
        }
        return level;
    }
}
