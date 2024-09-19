public class EditorManager {
  private ActionNode current;

  public EditorManager() {
    this.current = null;
  }

  // Adiciona uma nova ação
  public void addAction(String action) {
    ActionNode newAction = new ActionNode(action);
    if (current == null) {
      current = newAction;
    } else {
      newAction.prev = current;
      current.next = newAction;
      current = newAction;
    }
  }

  // Desfaz a última ação
  public void undo() {
    if (current == null) {
      System.out.println("Nenhuma ação para desfazer.");
      return;
    }
    System.out.println("Desfez: " + current.action);
    current = current.prev; // Vai para o nó anterior
  }

  // Refaz a última ação desfeita
  public void redo() {
    if (current == null || current.next == null) {
      System.out.println("Nenhuma ação para refazer.");
      return;
    }
    current = current.next; // Vai para o nó seguinte
    System.out.println("Refez: " + current.action);
  }

  // Exibe todas as ações
  public void showActions() {
    if (current == null) {
      System.out.println("Nenhuma ação realizada.");
      return;
    }
    ActionNode temp = current;
    while (temp != null) {
      System.out.println(temp);
      temp = temp.prev;
    }
  }
}
