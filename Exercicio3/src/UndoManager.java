public class UndoManager {
  private ActionNode top;

  public UndoManager() {
    this.top = null;
  }

  // Adiciona uma nova ação ao topo da lista
  public void addAction(String action) {
    ActionNode newAction = new ActionNode(action);
    if (top == null) {
      top = newAction;
    } else {
      newAction.next = top;
      top = newAction;
    }
  }

  // Desfaz a última ação (remove o nó do topo)
  public void undo() {
    if (top == null) {
      System.out.println("Nenhuma ação para desfazer.");
      return;
    }
    System.out.println("Desfez: " + top.action);
    top = top.next; // Remover o topo da lista
  }

  // Exibe todas as ações realizadas
  public void showActions() {
    if (top == null) {
      System.out.println("Nenhuma ação realizada.");
      return;
    }
    ActionNode temp = top;
    while (temp != null) {
      System.out.println(temp);
      temp = temp.next;
    }
  }
}
