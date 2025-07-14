package Trees.traversal;
import java.util.*;


public class inorder{
    class TreeNode{
        int data;
        TreeNode left,right;
        public TreeNode(int data){
            this.data = data;
            left = right = null;
        }
    }
    public static List<Integer> inordertraverse(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack <TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            res.add(curr.data);
            curr= curr.right;
        }
        return res;
    }
    public static List<Integer> preordertraverse(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack <TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                res.add(curr.data);
                st.push(curr);
                curr =curr.left;
            }
            curr=st.pop();
            curr=curr.right;
        }
        return res;
    }
    public static List<Integer> postordertraverse(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr=root;
        TreeNode lastvisited = null;
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }else{
                TreeNode peek = st.peek();
                if(peek.right!=null && lastvisited != peek.right){
                    curr=peek.right;
                }
                else{
                    res.add(peek.right.data);
                    lastvisited = st.pop();
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        inorder tree = new inorder();
        TreeNode root = tree.new TreeNode(1);
        root.left = tree.new TreeNode(2);
        root.right = tree.new TreeNode(3);
        root.left.left = tree.new TreeNode(4);
        root.left.right = tree.new TreeNode(5);
        root.right.left = tree.new TreeNode(6);
        root.right.right = tree.new TreeNode(7);

        
        List<Integer> result = inordertraverse(root);
        System.out.println("Inorder Traversal: " + result);
        List<Integer> preorderResult = preordertraverse(root);
        System.out.println("Preorder Traversal: " + preorderResult);
        
    }
}

/* Output:                                  1
                                          2   3
                                        4  5  6 7
                                        
                                        inorder : 4 2 5 1 6 3 7
                                        preorder : 1 2 4 5 3 6 7 

                                        */
 