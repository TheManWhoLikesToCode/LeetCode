public class isSameTree {

public boolean isSameTree(TreeNode p, TreeNode q) {
  // Check if both nodes are null.
  if (p == null && q == null) {
    return true;
  }

  // If one of the nodes is null, but not both, then the trees are not the same.
  if (p == null || q == null) {
    return false;
  }

  // The nodes are not null, so check their values.
  // If the values are the same, then check the subtrees.
  return (
    p.val == q.val &&  // Check the current node
    isSameTree(p.left, q.left) &&  // Check the left subtree
    isSameTree(p.right, q.right)  // Check the right subtree
  );
}
}
