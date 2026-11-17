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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> level = new ArrayList<>();
        while(q.size()>1){
            TreeNode n=q.poll();
            if(n==null){
                ans.add(level);
                level = new ArrayList<>();
                q.add(null);  

            }
            else{
                level.add(n.val);
                if(n.left !=null){
                    q.add(n.left);
                }
                if(n.right !=null){
                    q.add(n.right);
                }
            }

        }
        ans.add(level);
        return ans;
        
    }
    
}
