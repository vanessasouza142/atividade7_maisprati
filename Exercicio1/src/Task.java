public class Task {
  String description;
  boolean concluded;
  Task next;

  public Task(String description) {
    this.description = description;
    this.concluded = false;
    this.next = null;
  }

  public void checkConcluded() {
    this.concluded = true;
  }

  @Override
  public String toString() {
    return description + " (Concluída: " + (concluded ? "Sim" : "Não") + ")";
  }
}
