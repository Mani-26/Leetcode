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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();
        int h=0;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            h++;
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                list.add(curr.val);
            }
            if(h%2==0) Collections.reverse(list);
            res.add(list);
        }
        return res;
    }
}