package BinaryTree;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }
}

class SolutionMDBT{
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else
            return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
    }
}
