/*
7. Implemente um sistema de gerenciamento de impressões onde os trabalhos de impressão são enfileirados e processados na ordem
em que chegam. Use uma fila para armazenar os trabalhos de impressão.
*/
public class Main {
  public static void main(String[] args) {
    PrintQueue printQueue = new PrintQueue();

    // Adicionando trabalhos de impressão à fila
    printQueue.addPrintJob("Documento 1");
    printQueue.addPrintJob("Documento 2");
    printQueue.addPrintJob("Documento 3");

    // Processando os trabalhos de impressão
    System.out.println("\nProcessando trabalhos de impressão:");
    printQueue.processNextJob();
    printQueue.processNextJob();
    printQueue.processNextJob();

    // Tentando processar quando a fila está vazia
    printQueue.processNextJob();
  }
}