public class HandManager {
  private CardNode first;
  private CardNode last;

  public HandManager() {
    this.first = null;
    this.last = null;
  }

  // Adiciona uma carta no final da mão
  public void addCard(String card) {
    CardNode newCard = new CardNode(card);
    if (first == null) {
      first = last = newCard;
    } else {
      last.next = newCard;
      newCard.prev = last;
      last = newCard;
    }
  }

  // Remove uma carta da mão
  public void removeCard(String card) {
    if (first == null) return;

    CardNode temp = first;
    while (temp != null) {
      if (temp.card.equals(card)) {
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp == first) first = temp.next;
        if (temp == last) last = temp.prev;
        return;
      }
      temp = temp.next;
    }
  }

  // Troca duas cartas de posição
  public void swapCards(String card1, String card2) {
    CardNode node1 = findCard(card1);
    CardNode node2 = findCard(card2);
    if (node1 != null && node2 != null) {
      String tempCard = node1.card;
      node1.card = node2.card;
      node2.card = tempCard;
    }
  }

  // Encontra uma carta na lista
  private CardNode findCard(String card) {
    CardNode temp = first;
    while (temp != null) {
      if (temp.card.equals(card)) return temp;
      temp = temp.next;
    }
    return null;
  }

  // Exibe a mão do jogador
  public void showHand() {
    CardNode temp = first;
    while (temp != null) {
      System.out.println(temp);
      temp = temp.next;
    }
  }
}
