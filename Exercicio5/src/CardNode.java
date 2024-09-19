public class CardNode {
  String card;
  CardNode next;
  CardNode prev;

  public CardNode(String card) {
    this.card = card;
    this.next = null;
    this.prev = null;
  }

  @Override
  public String toString() {
    return card;
  }
}
