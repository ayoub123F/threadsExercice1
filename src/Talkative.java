class Talkative implements Runnable {
    private int value;

    // Constructeur prenant un entier en paramètre
    public Talkative(int value) {
        this.value = value;
    }

    // Redéfinition de la méthode run pour afficher la valeur de l'attribut 100 fois
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Valeur de l'attribut : " + value);
        }
    }
}
