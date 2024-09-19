public class ActionNode {
  String action;
  ActionNode next;
  ActionNode prev;

  public ActionNode(String action) {
    this.action = action;
    this.next = null;
    this.prev = null;
  }

  @Override
  public String toString() {
    return action;
  }
}
