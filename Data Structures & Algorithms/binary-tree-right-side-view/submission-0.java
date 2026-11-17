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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> level = new ArrayList<>();
        q.add(root);
        q.add(null);
        int lastVal = 0;
        while(q.size()>1){
            TreeNode x=q.poll();
            if(x==null){
                ans.add(lastVal);
                if (!q.isEmpty()) {
                    q.add(null);
                }
            }
            else{
                lastVal = x.val;
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);

                }
            }
        }
        ans.add(lastVal);
        return ans;
        
    }
}
