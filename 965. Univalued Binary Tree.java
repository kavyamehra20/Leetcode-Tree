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
            this.left = left;
            this.right = right;
        }
    }
    public boolean isUnivalTree(TreeNode root) {
        int rootVal = root.val;
        return isUnivalTree(rootVal, root);
    }
    public boolean isUnivalTree(int value, TreeNode root){
        if(root==null)
            return true;
        if(root.left !=null && root.left.val != value){
            return false;
        }
        if(root.right !=null && root.right.val != value){
            return false;
        }
        return isUnivalTree(value,root.left) && isUnivalTree(value, root.right);
    }
}