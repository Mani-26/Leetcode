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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(p);
        q2.offer(q);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode c1 = q1.poll();
            TreeNode c2 = q2.poll();
            if ((c1 != null && c2 == null) || (c1 == null && c2 != null) || (c1 != null && c2 != null &&c1.val != c2.val)) {
                return false;
            }
            if (c1 != null && c2 != null) {

                q1.offer(c1.left);
                q1.offer(c1.right);
                q2.offer(c2.left);
                q2.offer(c2.right);
            }
        }
        return true;
    }
}