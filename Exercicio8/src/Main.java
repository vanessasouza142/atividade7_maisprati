/*
8. Implemente uma fila que simula a fila de processos prontos para execução em um sistema operacional. Permita que novos processos
sejam adicionados e que o processo mais antigo seja removido para execução.
*/

public class Main {
  public static void main(String[] args) {
    ProcessQueue processQueue = new ProcessQueue();

    // Adicionando processos à fila
    processQueue.addProcess("Processo 1");
    processQueue.addProcess("Processo 2");
    processQueue.addProcess("Processo 3");

    // Executando processos
    System.out.println("\nExecutando processos:");
    processQueue.executeNextProcess();
    processQueue.executeNextProcess();
    processQueue.executeNextProcess();

    // Tentando executar quando a fila está vazia
    processQueue.executeNextProcess();
  }
}