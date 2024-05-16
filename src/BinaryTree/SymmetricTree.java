package BinaryTree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return recursiveSymmetric(root , root);
        //return iterativeSymmetric(root, root);
    }
    public boolean recursiveSymmetric(TreeNode currL , TreeNode currR){
        if(currL == null && currR == null) return true;
        if(currL == null || currR == null) return false;
        return (
                currL.val == currR.val &&
                        (recursiveSymmetric(currL.left , currR.right) && recursiveSymmetric(currL.right , currR.left))
        );
    }
}
