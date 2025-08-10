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
    int c=1;
    public int maxDepth(TreeNode root) {
       if (root==null) return 0;
       int mleft=maxDepth(root.left);
       int mright=maxDepth(root.right);
    return 1 + Math.max(mleft, mright);

    }
}