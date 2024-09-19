public class BrowserHistory {
  private HistoryNode first;
  private int maxSize;
  private int currentSize;

  public BrowserHistory(int maxSize) {
    this.maxSize = maxSize;
    this.currentSize = 0;
    this.first = null;
  }

  public void addUrl(String url) {
    HistoryNode newNode = new HistoryNode(url);

    if (first == null) {
      first = newNode;
    } else {
      HistoryNode temp = first;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }

    currentSize++;

    // Se o tamanho do histórico exceder o máximo, remover o mais antigo (primeiro nó)
    if (currentSize > maxSize) {
      removeOldestUrl();
    }
  }

  public void removeOldestUrl() {
    if (first == null) {
      return;
    }

    // Remover o primeiro nó (o mais antigo)
    first = first.next;
    currentSize--;
  }

  public void showHistory() {
    if (first == null) {
      System.out.println("Histórico vazio.");
      return;
    }

    HistoryNode temp = first;
    while (temp != null) {
      System.out.println(temp);
      temp = temp.next;
    }
  }
}
