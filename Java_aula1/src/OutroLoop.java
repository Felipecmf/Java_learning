import java.util.Scanner;

public class OutroLoop {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int total = 0;

        while (nota != -1){
            System.out.println("Diga sua avaliacao para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota != -1){
                media += nota;
                total++;
            }
        }
        System.out.println("Media de avaliacoes " + media/total);
    }
}
