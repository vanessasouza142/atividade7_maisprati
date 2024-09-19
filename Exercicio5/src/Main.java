/*
  5. Implemente um jogo simples de cartas onde a mão do jogador é representada por uma lista duplamente encadeada.
  Permita que o jogador adicione, remova, e reorganize as cartas na mão.
*/
public class Main {
  public static void main(String[] args) {
    HandManager hand = new HandManager();

    // Adicionando cartas à mão
    hand.addCard("Ás de Espadas");
    hand.addCard("Rei de Copas");
    hand.addCard("Dama de Ouros");

    System.out.println("Mão do jogador:");
    hand.showHand();

    // Removendo carta da mão
    System.out.println("\nRemovendo 'Rei de Copas' da mão...");
    hand.removeCard("Rei de Copas");
    hand.showHand();

    // Reorganizando cartas (trocando o Ás com a Dama)
    System.out.println("\nTrocando 'Ás de Espadas' com 'Dama de Ouros'...");
    hand.swapCards("Ás de Espadas", "Dama de Ouros");
    hand.showHand();
  }
}