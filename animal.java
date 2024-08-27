abstract class Animal {
    private double tamanho;
    private double peso;
    private int idade;

    public Animal(double tamanho, double peso, int idade) {
        this.tamanho = tamanho;
        this.peso = peso;
        this.idade = idade;
    }

    public abstract void fazerBarulho();

    public void vaguear() {
        System.out.println("O animal está vagando silenciosamente.");
    }

    // Getters e Setters
    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}