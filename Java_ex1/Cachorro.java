class Cachorro extends Animal {
    int patas;

    Cachorro(String nome, int idade, String raca, int patas){
        super(nome, idade, raca);
        this.patas = patas;
    }
    @Override
    void emitirSom(){
        System.out.println("Au Au");
    }
}
