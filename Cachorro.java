class Cachorro extends Canino {

    public Cachorro(double tamanho, double peso, int idade) {
        super(tamanho, peso, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O cachorro faz: Au Au!");
    }

    public void comer() {
        System.out.println("O cachorro está comendo ração.");
    }
}