package Trees.medium;

import java.util.*;

class height {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public int maxDepth(TreeNode root) {
    if (root == null)
      return 0;

    int lh = maxDepth(root.left);
    int rh = maxDepth(root.right);

    return 1 + Math.max(lh, rh);

  }
  public static void main(String[] args) {
    height h = new height();
    TreeNode root = h.new TreeNode(1);
    root.left = h.new TreeNode(2);
    root.right = h.new TreeNode(3);
    root.left.left = h.new TreeNode(4);
    root.left.right = h.new TreeNode(5);

    int depth = h.maxDepth(root);
    System.out.println("The maximum depth of the tree is: " + depth);
  }
}