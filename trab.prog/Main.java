public class Main {
    public static void main(String[] args) {
        // Criando instâncias de cada classe
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();
        Gato gato = new Gato();
        Leao leao = new Leao();
        Hipopotamo hipopotamo = new Hipopotamo();

        // Usando métodos do Cachorro
        cachorro.setTamanho(60.0);
        cachorro.setPeso(25.0);
        cachorro.setIdade(4);
        cachorro.fazerBarulho();
        cachorro.vaguear();
        cachorro.comer();

        // Usando métodos do Lobo
        lobo.fazerBarulho();
        lobo.vaguear();
        lobo.cacar();

        // Usando métodos do Gato
        gato.fazerBarulho();
        gato.vaguear();
        gato.brincar();

        // Usando métodos do Leão
        leao.fazerBarulho();
        leao.vaguear();
        leao.cacar();

        // Usando métodos do Hipopótamo
        hipopotamo.fazerBarulho();
        hipopotamo.vaguear();
        hipopotamo.nadar();
    }
}


// comentarios
// Classe Animal: Classe abstrata com atributos comuns (tamanho, peso, idade) e métodos abstratos e concretos.
//Classes Felino e Canino: Classes abstratas que definem comportamentos específicos para felinos e caninos, respectivamente. 
//Classes Leão, Gato, Cachorro, e Lobo: Classes concretas que implementam comportamentos específicos para cada tipo de animal. 
//Classe Hipopótamo: Classe concreta que herda diretamente de Animal. 
// Classe Main: Contém o método principal que cria instâncias de cada classe e chama seus métodos para demonstrar comportamento.
