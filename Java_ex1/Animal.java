public class Animal {
    String nome;
    int idade;
    String raca;
    Animal(String nome, int idade, String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    void emitirSom(){
        System.out.println("Som generico");
    }
}

