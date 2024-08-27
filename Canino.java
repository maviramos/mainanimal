abstract class Canino extends Animal {

    public Canino(double tamanho, double peso, int idade) {
        super(tamanho, peso, idade);
    }

    @Override
    public void vaguear() {
        System.out.println("O canino está vagueando e farejando o ambiente.");
    }
}