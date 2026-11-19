
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;
        
        return search(root, subRoot);
    }

    public boolean search(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        
        if (root.val == subRoot.val && same(root, subRoot)) {
            return true;
        }
        return search(root.left, subRoot) || search(root.right, subRoot);
    }

    public boolean same(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p != null && q == null) || (p == null && q != null)) {
            return false;
        }
    
        return (p.val == q.val) && same(p.left, q.left) && same(p.right, q.right);
    }
}
