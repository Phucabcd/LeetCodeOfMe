public class _94_Binary_Tree_Inorder_Traversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> result = new ArrayList<>();
    //     if (root == null)
    //         return result;

    //     Stack<TreeNode> stack = new Stack<>();
    //     TreeNode cur = root;

    //     while (cur != null || !stack.isEmpty()) {
    //         while (cur != null) {
    //             stack.push(cur);
    //             cur = cur.left;
    //         }

    //         cur = stack.pop();
    //         result.add(cur.val);
    //         cur = cur.right;
    //     }

    //     return result;
    // }
}