
import java.util.ArrayList;
import java.util.List;

public class Leaf implements IBST {


  @Override
  public IBST insert(int n) {
    return new Node(n, new Leaf(), new Leaf());
  }

  @Override
  public boolean contains(int n) {
    return false;
  }




}
