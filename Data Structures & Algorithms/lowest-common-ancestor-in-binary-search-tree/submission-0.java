class Solution {
    public boolean findPath(TreeNode root, int value, ArrayList<TreeNode> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.val == value)
        {
            return true;
        }
        if(findPath(root.left, value, path)|| findPath(root.right, value, path)){
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();
        TreeNode ans = null;

        findPath(root,p.val,path1);
        findPath(root,q.val,path2);

        int i = 0;
        while(i<path1.size() && i<path2.size()){
            if (path1.get(i).val==path2.get(i).val){
                ans = path1.get(i);
            }
            i+=1;
        }

        return ans;
        
    }
}