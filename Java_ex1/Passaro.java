class Passaro extends Animal {
    int asas;
    Passaro(String nome, int idade, String raca, int asas){
        super(nome, idade, raca);
        this.asas = asas;
    }
    @Override
    void emitirSom(){
        System.out.println("Piu Piu");
    }
}
