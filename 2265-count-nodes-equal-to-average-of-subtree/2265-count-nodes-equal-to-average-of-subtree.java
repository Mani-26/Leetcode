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
    int count = 0;

    int[] postOrder(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = postOrder(node.left);
        int[] right = postOrder(node.right);

        int nodeSum = left[0] + right[0] + node.val;
        int nodeCount = left[1] + right[1] + 1;

        if (nodeSum / nodeCount == node.val) {
            count++;
        }

        return new int[]{nodeSum, nodeCount};
    }

    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return count;
    }
}