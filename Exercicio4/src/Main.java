//Lista Duplamente Encadeada
/*
4. Implemente um editor de texto simples onde as operações de desfazer (undo) e   refazer (redo) são gerenciadas por uma
lista duplamente encadeada.
*/

public class Main {
  public static void main(String[] args) {
    EditorManager editor = new EditorManager();

    editor.addAction("Escreveu 'Olá'");
    editor.addAction("Escreveu ' Mundo!'");
    editor.addAction("Apagou a exclamação");

    System.out.println("Histórico de ações:");
    editor.showActions();

    System.out.println("\nDesfazendo última ação...");
    editor.undo();
    editor.showActions();

    System.out.println("\nRefazendo ação...");
    editor.redo();
    editor.showActions();
  }
}