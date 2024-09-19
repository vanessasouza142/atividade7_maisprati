/*
2. Crie uma aplicação que simule o histórico de navegação de um navegador utilizando uma lista simplesmente encadeada.
Implemente funcionalidades para adicionar novas URLs e remover URLs antigas quando a lista atingir um certo tamanho.
*/

public class Main {
  public static void main(String[] args) {
    BrowserHistory history = new BrowserHistory(3);

    history.addUrl("https://google.com");
    history.addUrl("https://github.com");
    history.addUrl("https://stackoverflow.com");

    System.out.println("Histórico atual:");
    history.showHistory();

    System.out.println("\nAdicionando nova URL (https://oracle.com), removendo a mais antiga:");
    history.addUrl("https://oracle.com");

    System.out.println("Histórico atualizado:");
    history.showHistory();
  }
}