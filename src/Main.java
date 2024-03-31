public class Main {
    public static void main(String[] args) {
        // Création de 10 instances de Thread
        for (int i = 0; i < 10; i++) {
            // Chaque Thread prend une nouvelle instance de Talkative avec un entier unique en paramètre
            Thread thread = new Thread(new Talkative(i));
            // Appel de la méthode start sur chaque Thread
            thread.start();
        }
    }
}