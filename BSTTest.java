import tester.Tester;

public class BSTTest {

  public void testLeaf(Tester t) {
    IBST leaf = new Leaf();
    int nc = 12;
    t.checkExpect(leaf.contains(nc), false);
    leaf = leaf.insert(nc);
    t.checkExpect(leaf, new Node(nc, new Leaf(), new Leaf()));
    t.checkExpect(leaf.contains(nc), true);
  }

  public void testSmallTrees(Tester t) {
    int twelve = 12;
    int thirteen = 13;
    int fourteen = 14;
    IBST small = new Node(thirteen, new Leaf(), new Leaf());
    t.checkExpect(small.contains(twelve), false);
    t.checkExpect(small.contains(thirteen), true);
    t.checkExpect(small.contains(fourteen), false);
    small.insert(twelve);
    small.insert(fourteen);
    t.checkExpect(small, new Node(thirteen, new Node(twelve, new Leaf(),
        new Leaf()), new Node(fourteen, new Leaf(), new Leaf())));
    t.checkExpect(small.contains(twelve), true);
    t.checkExpect(small.contains(thirteen), true);
    t.checkExpect(small.contains(fourteen), true);

    t.checkExpect(small.contains(15), false);
  }

  public void testBadTree(Tester t) {
    int twelve = 12;
    int thirteen = 13;
    IBST bad =
        new Node(twelve, new Node(thirteen, new Leaf(), new Leaf()), new Leaf());
  }

  public static void main(String[] args) {
    Tester.run(new BSTTest());
  }

}
