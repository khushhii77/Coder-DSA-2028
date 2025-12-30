// Topic: Binary Tree Traversal
// Problem: Inorder Traversal
// Description:Given the root of a binary tree, return the inorder traversal of its nodes' values.
// Order: Left → Root → Right
// Approach: Recursive Depth First Search (DFS)
// Time Complexity: O(n)
// Space Complexity: O(n) due to recursion stack


class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    void inorder(TreeNode root, List<Integer> ans) {

        if (root == null) return;

        inorder(root.left, ans);     // Left subtree
        ans.add(root.val);           // Root in middle
        inorder(root.right, ans);    // Right subtree
    }
}
