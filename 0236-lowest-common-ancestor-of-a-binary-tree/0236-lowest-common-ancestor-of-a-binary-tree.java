/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {  

            if (root == null || root == p || root == q) {  
                        return root;  
                                }  

                                        // Recursively search for ancestors in the left and right subtrees  
                                                TreeNode left = lowestCommonAncestor(root.left, p, q);  
                                                        TreeNode right = lowestCommonAncestor(root.right, p, q);  

                                                                // If both left and right return non-null values, then root is the LCA  
                                                                        if (left != null && right != null) {  
                                                                                    return root;  
                                                                                            }  

                                                                                                    // Otherwise, return the non-null child if one exists  
                                                                                                            return left != null ? left : right;  
                                                                                                                }  
}