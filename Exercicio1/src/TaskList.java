public class TaskList {
  private Task first;

  public void addTask(String description) {
    Task newTask = new Task(description);
    if (first == null) {
      first = newTask;
    } else {
      Task temp = first;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newTask;
    }
  }

  public void removeTask(String description) {
    if (first == null) return;

    if (first.description.equals(description)) {
      first = first.next;
      return;
    }

    Task temp = first;
    while (temp.next != null && !temp.next.description.equals(description)) {
      temp = temp.next;
    }

    if (temp.next != null) {
      temp.next = temp.next.next;
    }
  }

  public void taskIsConcluded(String description) {
    Task temp = first;
    while (temp != null) {
      if (temp.description.equals(description)) {
        temp.checkConcluded();
        return;
      }
      temp = temp.next;
    }
  }

  public void showTask() {
    Task temp = first;
    if (temp == null) {
      System.out.println("Nenhuma tarefa na lista.");
      return;
    }
    while (temp != null) {
      System.out.println(temp);
      temp = temp.next;
    }
  }
}