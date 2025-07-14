package Trees.medium;
import java.util.*;
import Trees.TreeNode;
class diameter {
    int ans = 0;

    int maxdepth(TreeNode root) {
        if (root == null)
            return 0;
        int r = maxdepth(root.right);
        int l = maxdepth(root.left);
        ans = Math.max(ans, l + r);
        return Math.max(l, r) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxdepth(root);
        return ans;
    }
}