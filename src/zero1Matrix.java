public class zero1Matrix {

public class Solution {
    public boolean isValidBST(TreeNode root) {
        // check if the tree is a binary search tree
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long minValue, long maxValue) {
        // if the node is null, the tree is valid
        if (node == null) {
            return true;
        }

        // if the node value is less than or equal to the minValue or greater than or equal to the maxValue
        // then the tree is not valid
        if (node.val <= minValue || node.val >= maxValue) {
            return false;
        }

        // recursively check the left and right subtrees
        return isValidBST(node.left, minValue, node.val) &&
                isValidBST(node.right, node.val, maxValue);
    }
}