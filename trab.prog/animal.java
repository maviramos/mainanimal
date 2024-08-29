abstract class Animal {
    private double tamanho;
    private double peso;
    private int idade;

    // Método fazerBarulho
    public void fazerBarulho() {
        System.out.println("Animal fazendo barulho");
    }

    // Método vaguear
    public void vaguear() {
        System.out.println("Animal vagueando");
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