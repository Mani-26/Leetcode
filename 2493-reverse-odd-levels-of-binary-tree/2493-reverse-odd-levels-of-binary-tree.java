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
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        traverseDFS(root.left, root.right, 0);
        return root;
    }

    private void traverseDFS(TreeNode l, TreeNode r, int count) {
        if (l == null || r == null) {
            return;
        }
        if (count % 2 == 0) {
            int temp = l.val;
            l.val = r.val;
            r.val = temp;
        }
        traverseDFS(l.left, r.right, count + 1);
        traverseDFS(l.right, r.left, count + 1);
    }
}