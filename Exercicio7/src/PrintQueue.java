import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
  private Queue<PrintJob> queue;

  public PrintQueue() {
    this.queue = new LinkedList<>();
  }

  // Adiciona um trabalho de impressão à fila
  public void addPrintJob(String documentName) {
    PrintJob newJob = new PrintJob(documentName);
    queue.add(newJob);
    System.out.println("Trabalho de impressão '" + documentName + "' adicionado à fila.");
  }

  // Processa o próximo trabalho de impressão
  public void processNextJob() {
    if (queue.isEmpty()) {
      System.out.println("Nenhum trabalho de impressão na fila.");
    } else {
      PrintJob nextJob = queue.poll(); // Remove o primeiro trabalho da fila
      System.out.println("Processando trabalho de impressão: " + nextJob);
    }
  }
}
