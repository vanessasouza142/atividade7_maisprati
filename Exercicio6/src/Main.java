//Filas
/*
6. Crie um simulador de fila de atendimento em um banco. Utilize uma fila para gerenciar os clientes que aguardam atendimento
e implemente a lógica para chamar o próximo cliente.
*/
public class Main {
  public static void main(String[] args) {
    CustomerQueue queue = new CustomerQueue();

    // Adicionando clientes à fila
    queue.addCustomer("João");
    queue.addCustomer("Maria");
    queue.addCustomer("Pedro");

    // Chamando clientes para atendimento
    System.out.println("\nPróximo cliente a ser atendido: " + queue.callNextCustomer());
    System.out.println("Próximo cliente a ser atendido: " + queue.callNextCustomer());
    System.out.println("Próximo cliente a ser atendido: " + queue.callNextCustomer());

    // Tentando chamar mais clientes quando a fila está vazia
    System.out.println("Próximo cliente a ser atendido: " + queue.callNextCustomer());
  }
}