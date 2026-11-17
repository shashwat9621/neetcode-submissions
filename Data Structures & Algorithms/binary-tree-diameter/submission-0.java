class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // 1. Diameter passing THROUGH the current root node
        int diameterThroughRoot = height(root.left) + height(root.right);

        // 2. Recursively find the max diameter in the left and right subtrees
        int leftSubtreeDiameter = diameterOfBinaryTree(root.left);
        int rightSubtreeDiameter = diameterOfBinaryTree(root.right);

        // Return the largest of the three
        return Math.max(diameterThroughRoot, Math.max(leftSubtreeDiameter, rightSubtreeDiameter));
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        // Use Math.max instead of '+' to find the longest path downward
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
