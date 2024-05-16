package BinaryTree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode tNode = root.left;
        root.left = root.right;
        root.right = tNode;;

        invertTree(root.right);
        invertTree(root.left);

        return root;
    }
}
