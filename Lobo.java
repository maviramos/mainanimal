class Lobo extends Canino {

    public Lobo(double tamanho, double peso, int idade) {
        super(tamanho, peso, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O lobo uiva: Auuuuuu!");
    }

    public void comer() {
        System.out.println("O lobo está comendo carne.");
    }
}