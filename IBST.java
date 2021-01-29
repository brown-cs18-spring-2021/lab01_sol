import java.util.List;

public interface IBST {

  /**
   * Inserts an element into the IBST.
   *
   * @param n - a Comparable to be inserted to the tree
   * @return the IBST resulting from inserting n into the current IBST
   */
  IBST insert(int n);

  /**
   * Checks whether a specific element is contained within the IBST.
   *
   * @param n - The element the user is searching for.
   * @return true if n is in the IBST, false otherwise.
   */
  boolean contains(int n);


}
