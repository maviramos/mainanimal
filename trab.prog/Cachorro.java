class Cachorro extends Canino {
    @Override
    public void fazerBarulho() {
        System.out.println("Cachorro latindo");
    }

    public void comer() {
        System.out.println("Cachorro comendo ração");
    }
}