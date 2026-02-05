//LC - Maximum Depth of Binary Tree

class Solution {
    public int maxDepth(TreeNode root) {
        return height(root);
    }
    int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        int maxDep = Math.max(left , right) + 1 ;
        return maxDep;
    }
}


