// import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class _112_Path_Sum {
    //  public boolean hasPathSum(TreeNode root, int targetSum) {
    //     if(root == null) return false;
    //     if(root.left == null && root.right == null && root.val == targetSum) return true;
    //     return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    // }
}

/**explanation targetSum - root.val 
 * if you have Sum = 20 and you are at root 4. You will get Sum 20 reduce root now 4, you get 16 and continue.
*/

