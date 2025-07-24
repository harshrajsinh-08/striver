package Trees.medium;
import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor to initialize
    // the node with a value
    TreeNode(int val) {
        data = val;
        left = null;
        right = null;
    }
}
public class levelorder {
    public static List<List<Integer>> levelorder(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        boolean ltr = true;
        if(root==null) return list;
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode node = q.poll();
                if(ltr) sublist.add(node.data);
                else sublist.add(0,node.data);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            ltr=!ltr;
            list.add(sublist);
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelorder(root);
        for (List<Integer> level : result) {
            System.out.println(level);
        }
        
    }
}
