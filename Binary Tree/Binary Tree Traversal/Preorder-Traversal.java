// Topic: Binary Tree Traversal
// Problem: Preorder Traversal
// Description:Given the root of a binary tree, return the preorder traversal of its nodes' values.
// Order: Root → Left → Right
// Approach: Recursive Depth First Search (DFS)
// Time Complexity: O(n)
// Space Complexity: O(n) due to recursion stack


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

    void preorder(TreeNode root, List<Integer> ans) {
        if (root == null) return;

        ans.add(root.val);          // root at first
        preorder(root.left, ans);   // then left
        preorder(root.right, ans);  // then right
    }
}
