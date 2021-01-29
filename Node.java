
import java.util.List;

public class Node implements IBST {

  protected int value;
  protected IBST left;
  protected IBST right;

  /**
   * Instantiates a BST
   *
   * @param value - The value to be held in the root node.
   * @param left - The left subtree
   * @param right - The right subtree
   */
  public Node(int value, IBST left, IBST right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }



  @Override
  public IBST insert(int n) {
    if (n < this.value) {
      this.left = this.left.insert(n);
    } else {
      this.right = this.right.insert(n);
    }
    return this;
  }

  @Override
  public boolean contains(int n) {
    if (this.value == n) {
      return true;
    } else if (this.value < n) {
      return this.right.contains(n);
    } else {
      return this.left.contains(n);
    }
  }




}
