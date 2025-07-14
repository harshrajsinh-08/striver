package Trees.medium;

public class balancedbt {
    class TreeNode {
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

    public static int height(TreeNode root){
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        if(lh==-1 || rh==-1) return -1;
        if(Math.abs(rh-lh)>1) return -1;
        return 1 + Math.max(lh, rh);
    }
    public static void main(String[] args) {
        balancedbt b = new balancedbt();
        TreeNode root = b.new TreeNode(1);
        root.left = b.new TreeNode(2);
        root.right = b.new TreeNode(3);
        root.left.left = b.new TreeNode(4);
        root.left.right = b.new TreeNode(5);
        root.right.right = b.new TreeNode(6);
        root.right.right.right = b.new TreeNode(7);
        int h = height(root);
        if(h==-1) {
            System.out.println("The tree is not balanced");
        } else {
            System.out.println("The tree is balanced");
        }
    }
}