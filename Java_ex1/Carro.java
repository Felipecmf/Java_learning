class Carro extends Veiculo {
    int portas;

    // Construtor usando super()
    Carro(String marca, int velocidade, int portas) {
        super(marca, velocidade); // chama o construtor da classe pai
        this.portas = portas;
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Portas: " + portas);
    }
}