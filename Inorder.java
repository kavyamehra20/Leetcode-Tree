import java.util.*;

class Inorder {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> traversal = new ArrayList<>();
        inorderTraversal(traversal, root);
        return traversal;
    }

    public List<Integer> inorderTraversal(ArrayList<Integer> traversal, TreeNode node) {
        if (node == null) {
            return traversal;
        }
        inorderTraversal(traversal, node.left);
        traversal.add(node.val);
        inorderTraversal(traversal, node.right);
        return traversal;
    }
}