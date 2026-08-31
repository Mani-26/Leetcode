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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int res = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                arr[i] = node.val;
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                int min = arr[i];
                int minIdx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (min > arr[j]) {
                        minIdx = j;
                        min=arr[j];
                    }
                }
                if (i != minIdx) {
                    res++;
                    int temp = arr[minIdx];
                    arr[minIdx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return res;
    }
}