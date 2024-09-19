/*
1. Implemente um gerenciador de tarefas onde cada tarefa é um nó em uma lista simplesmente encadeada.
Permita que o usuário adicione, remova, e marque tarefas como concluídas.
*/

public class Main {
  public static void main(String[] args) {
    TaskList listaDeTarefas = new TaskList();

    listaDeTarefas.addTask("Comprar manteiga");
    listaDeTarefas.addTask("Estudar Java");
    listaDeTarefas.addTask("Treinar");

    System.out.println("Lista de Tarefas:");
    listaDeTarefas.showTask();

    listaDeTarefas.taskIsConcluded("Estudar Java");
    System.out.println("\nApós marcar 'Estudar Java' como concluída:");
    listaDeTarefas.showTask();

    listaDeTarefas.removeTask("Comprar manteiga");
    System.out.println("\nApós remover 'Comprar manteiga':");
    listaDeTarefas.showTask();
  }
}