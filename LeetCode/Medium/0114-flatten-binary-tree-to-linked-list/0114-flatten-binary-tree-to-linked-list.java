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
    ArrayList<TreeNode> a1 = new ArrayList<>();
    
    public void flatten(TreeNode root) {
        // Fix 1: Handle the edge case for an empty tree immediately
        if (root == null) return;
        
        preorder(root);
        
        // Loop through the list to rewire the left and right pointers
        for (int i = 0; i < a1.size() - 1; i++) {
            TreeNode a = a1.get(i);
            TreeNode b = a1.get(i + 1);
            a.right = b;
            a.left = null;
        }
        
        // Explicitly set the last node's children to null
        TreeNode last = a1.get(a1.size() - 1);
        last.left = null;
        last.right = null;
    }
    
    void preorder(TreeNode root) {
        if (root == null) return;
        a1.add(root);
        preorder(root.left);
        preorder(root.right);
    }
}