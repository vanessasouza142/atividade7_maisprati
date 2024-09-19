/*
  3. Implemente um sistema de controle de reversão (undo) para uma aplicação de   edição de texto. Use uma lista simplesmente
  encadeada para armazenar as ações   realizadas e permita que o usuário desfaça as últimas ações.
*/

public class Main {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();

        undoManager.addAction("Escreveu 'Olá Mundo!'");
        undoManager.addAction("Adicionou uma nova linha");
        undoManager.addAction("Apagou a palavra 'Mundo'");

        System.out.println("Histórico de ações:");
        undoManager.showActions();

        System.out.println("\nDesfazendo última ação...");
        undoManager.undo();

        System.out.println("\nHistórico de ações após desfazer:");
        undoManager.showActions();
    }
}