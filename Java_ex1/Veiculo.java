public class Veiculo {
    String marca;
    int velocidade;
    Veiculo(String marca, int velocidade){
        this.marca = marca;
        this.velocidade = velocidade;
    }

    void acelerar(){
        velocidade += 10;
        System.out.println(velocidade);
    }
}
