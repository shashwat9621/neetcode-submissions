class Solution {
    public int goodNodes(TreeNode root) {
        return pathcheck(root, root.val);
    }

    private int pathcheck(TreeNode node, int maxVal) {
        if (node == null) {
            return 0;
        }

        int count = 0;
        if (node.val >= maxVal) {
            count = 1;
            maxVal = node.val;
        }

        return count + pathcheck(node.left, maxVal) + pathcheck(node.right, maxVal);
    }
}
