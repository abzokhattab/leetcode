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
class Solution {

    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int res = 0;

        while (!q.isEmpty()) {
            int n = q.size();

            res = 0;
            boolean isLeaf = false;
            for (int i = 0; i < n; i++) {
                TreeNode current = q.poll();
                if (current.right == null && current.left == null) {
                    isLeaf = true;
                    res += current.val;
                } else isLeaf = false;
                if (current.right != null) q.add(current.right);
                if (current.left != null) q.add(current.left);
            }
        }
        return res;
    }
}
