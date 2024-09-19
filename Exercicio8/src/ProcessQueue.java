import java.util.LinkedList;
import java.util.Queue;

public class ProcessQueue {
  private Queue<Process> queue;

  public ProcessQueue() {
    this.queue = new LinkedList<>();
  }

  // Adiciona um novo processo à fila
  public void addProcess(String processName) {
    Process newProcess = new Process(processName);
    queue.add(newProcess);
    System.out.println("Processo '" + processName + "' adicionado à fila.");
  }

  // Executa o próximo processo da fila
  public void executeNextProcess() {
    if (queue.isEmpty()) {
      System.out.println("Nenhum processo na fila.");
    } else {
      Process nextProcess = queue.poll(); // Remove o primeiro processo da fila
      System.out.println("Executando: " + nextProcess);
    }
  }
}

