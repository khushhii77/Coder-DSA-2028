// Topic: Binary Tree Traversal
// Problem: Postorder Traversal
// Description:  Given the root of a binary tree, return the postorder traversal of its nodes' values.
// Order: Left → Right → Root
// Approach: Recursive Depth First Search (DFS)
// Time Complexity: O(n)
// Space Complexity: O(n) due to recursion stack


class Solution {
  
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }

    void postorder(TreeNode root, List<Integer> ans) {

        if (root == null) return;

        postorder(root.left, ans);    // Left subtree
        postorder(root.right, ans);   // Right subtree
        ans.add(root.val);            // Root at last
    }
}
