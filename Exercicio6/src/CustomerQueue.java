import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
  private Queue<Customer> queue;

  public CustomerQueue() {
    this.queue = new LinkedList<>();
  }

  // Adiciona um cliente à fila
  public void addCustomer(String name) {
    Customer customer = new Customer(name);
    queue.add(customer);
    System.out.println("Cliente " + name + " entrou na fila.");
  }

  // Chama o próximo cliente para atendimento
  public String callNextCustomer() {
    if (queue.isEmpty()) {
      return "Nenhum cliente na fila.";
    } else {
      Customer next = queue.poll();  // Remove o primeiro cliente da fila
      return next.toString();
    }
  }
}

