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

    int result = 0;

    public int averageOfSubtree(TreeNode root) {

        if(root == null)
            return 0;

        check(root);

        return result;
    }

    void check(TreeNode root) {

        if(root == null)
            return;

        int sum = sum(root);
        int count = count(root);

        if(sum / count == root.val)
            result++;

        check(root.left);
        check(root.right);
    }

    int sum(TreeNode root) {

        if(root == null)
            return 0;

        return root.val
             + sum(root.left)
             + sum(root.right);
    }

    int count(TreeNode root) {

        if(root == null)
            return 0;

        return 1
             + count(root.left)
             + count(root.right);
    }
}