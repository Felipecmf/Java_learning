public class Condicional {
    public static void main() {
        int ano = 2020;
        boolean incluidoNoPlano = true;
        double nota = 9.7;
        String tipoPlano = "plus";

        if (ano >= 2020){
            System.out.println("Lancamento recentemente!");
        }else {
            System.out.println("Filme antigo!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
