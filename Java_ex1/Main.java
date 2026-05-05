public class Main {
    static void main() {
        Carro carro = new Carro("Toyota",100, 4);
        Carro carro1 = new Carro("Fiat", 90, 2);

        carro.mostrarInfo();
        carro.acelerar();
        carro1.mostrarInfo();
        carro1.acelerar();
    }
}
