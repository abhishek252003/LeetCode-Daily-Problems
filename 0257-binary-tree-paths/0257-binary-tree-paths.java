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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            findPaths(root, "", paths);
        }
        return paths;
    }

    private void findPaths(TreeNode node, String path, List<String> paths) {
        path += node.val; // Add current node to path

        if (node.left == null && node.right == null) {
            paths.add(path); // If it's a leaf, save the path
            return;
        }

        if (node.left != null) findPaths(node.left, path + "->", paths);
        if (node.right != null) findPaths(node.right, path + "->", paths);
    }
}
