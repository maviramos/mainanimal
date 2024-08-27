public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(0.5, 15, 3);
        Lobo lobo = new Lobo(0.8, 30, 5);

        cachorro.fazerBarulho();
        cachorro.vaguear();
        cachorro.comer();

        System.out.println();

        lobo.fazerBarulho();
        lobo.vaguear();
        lobo.comer();
    }
}