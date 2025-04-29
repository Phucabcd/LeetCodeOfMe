import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _637_Average_of_Levels_in_Binary_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.right = right;
        }
    }

    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> res = new ArrayList<>();
            if (root == null)
                return res;

            Queue<TreeNode> queue = new LinkedList();
            queue.add(root);

            while (!queue.isEmpty()) {
                int size = queue.size(), lenght = size;
                double sum = 0;

                while (size > 0) {
                    TreeNode node = queue.poll();
                    size--;
                    sum += node.val;

                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
                res.add(sum / lenght);
            }
            return res;
        }
    }
}
